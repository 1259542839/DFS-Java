package com.dfs.todoServer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;  

public class DBConn {
	public static List<TodoList> getTodoLists() {  
		try{  
			// here todo is database name, root is username 
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/todo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM lists");
			List<TodoList> todoLists = new ArrayList<TodoList>();
			TodoList newTodo = null;
			Task newTask = null;
			while(rs.next()) 
			{
		    	newTodo = new TodoList(rs.getString(1), rs.getString(2), rs.getString(3), null);
		    	ResultSet rs2=stmt.executeQuery("SELECT * FROM tasks WHERE `listId`='" + rs.getString(1) + "'");
		    	while (rs2.next())
		    	{
		    		newTask = new Task(rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getString(4));
		    		newTodo.addTasks(newTask);
		    	}
		        todoLists.add(newTodo);     					
			} 
			
			con.close(); 
			return todoLists;
		} catch(Exception e) { 
			return null;
		}  
	}  
}
