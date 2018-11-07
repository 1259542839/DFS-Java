package com.dfs.todoServer;

import java.util.UUID;

public class Task {
    private String id; 
    private String listId;
    private String name; 
    private boolean completed = false; 
 
    /**
     * Creates a task
     * @param listId 
     * @param name 
     */ 
    public Task(String listId, String name) { 
        this.id = UUID.randomUUID().toString(); 
        this.listId = listId;
        this.name = name; 
    } 

    /**
     * Creates a task
     * @param id
     * @param listId 
     * @param name 
     * @param completed
     */ 
    public Task(String id, String listId, String name, String completed) { 
        this.id = id; 
        this.listId = listId;
        this.name = name; 
        this.completed = Boolean.valueOf(completed);
    } 

    public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
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
}
