package com.dfs.todoServer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@WebService
public class Todos {
    private static List<TodoList> todoLists = new ArrayList<TodoList>(); 

    public Todos() {  
        todoLists = DBConn.getTodoLists();   	
    }
    
    @WebMethod
    @GET
    @Produces("application/json")
    public boolean addTodoList(@WebParam(name="name") String name, @WebParam(name="desc") String desc){ 
    	TodoList newTodo = new TodoList(name, desc, null);
        todoLists.add(newTodo);
        // TODO: update DB
        return true;
    } 

    @WebMethod
    @GET
    @Produces("application/json")
    public boolean updateTask(@WebParam(name="id") String id, @WebParam(name="listId") String listId, @WebParam(name="name") String name, @WebParam(name="completed") boolean completed){
    	if (id == null || id.length() != UUID.randomUUID().toString().length())
    	{
    		// insert a new task
    		Task newTask = new Task(listId, name);
    		getListWithID(listId).addTasks(newTask);
    		// TODO: update DB
    		return true;
    	}
    	
    	// update the current task
    	for (Task task: getListWithID(listId).getTasks())
    	{
    		if (task.getId() == id) {
    			if (name != null)
    				task.setName(name);
   				task.setCompleted(completed);
   				// TODO: update DB
   				return true;
    		}
    	}
    	
    	return false;
    } 

    @WebMethod
    @GET
    @Produces("application/json")
    public TodoList getListWithID(@WebParam(name="id") String id) { 
        for (TodoList list : todoLists) { 
            if (list.getId()==id) { 
                return list; 
            } 
        } 
        return null;
    } 

    @WebMethod
    @GET
    @Produces("application/json")
    public List<TodoList> searchListWithKeyword(@WebParam(name="keyword") String keyword) {
    	List<TodoList> list = new ArrayList<TodoList>();
        for (TodoList l : todoLists) { 
            if (l.getName().contains(keyword) || l.getDesc().contains(keyword)) { 
                list.add(l);
            } 
        } 
        return list;
    } 

    @WebMethod
    @GET
    @Produces("application/json")
    public List<TodoList> getLists(@WebParam(name="skip") int skip, @WebParam(name="limit") int limit) {
    	int endIndex = skip+limit>todoLists.size()?todoLists.size():skip+limit;
    	return todoLists.subList(skip, endIndex);
    } 

    @WebMethod
    @GET
    @Produces("application/json")
    public List<Task> getTasksWithListId(@WebParam(name="id") String id) { 
        for (TodoList list : todoLists) { 
            if (list.getId()==id) { 
                return list.getTasks(); 
            } 
        } 
        return null;
    } 

	 public static void main(String[] args) {
		 Todos todos = new Todos();
		 String url = "http://localhost:8090/todos"; // end point of webservice.
		 System.out.println(url+"?wsdl");
		 Endpoint.publish(url, todos);  // publishing the webservice
	}
}
