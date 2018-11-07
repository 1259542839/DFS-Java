package com.dfs.todoServer;

import java.util.ArrayList; 
import java.util.UUID; 

public class TodoList {

    private String id; 
    private String name; 
    private String desc;
    private ArrayList<Task> tasks; 
  
    /**
     * Constructor for creating a TodoList
     * @param name 
     * @param desc 
     * @param tasks 
     */ 
    public TodoList(String name, String desc, ArrayList<Task> tasks) { 
        this.id = UUID.randomUUID().toString(); 
        this.name = name; 
        this.desc = desc;
        this.tasks = tasks; 
    }

    /**
     * Constructor for creating a TodoList
     * @param id
     * @param name 
     * @param desc 
     * @param tasks 
     */ 
    public TodoList(String id, String name, String desc, ArrayList<Task> tasks) { 
        this.id = id; 
        this.name = name; 
        this.desc = desc;
        this.tasks = tasks; 
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	} 
	
	/*
	 * add one new tasks
	 */
	public void addTasks(Task task) {
		if (this.tasks == null)
			this.tasks = new ArrayList<Task>();
		this.tasks.add(task);
	}

}
