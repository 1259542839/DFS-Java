
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateTask", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTask", namespace = "http://todoServer.dfs.com/", propOrder = {
    "id",
    "listId",
    "name",
    "completed"
})
public class UpdateTask {

    @XmlElement(name = "id", namespace = "")
    private String id;
    @XmlElement(name = "listId", namespace = "")
    private String listId;
    @XmlElement(name = "name", namespace = "")
    private String name;
    @XmlElement(name = "completed", namespace = "")
    private boolean completed;

    /**
     * 
     * @return
     *     returns String
     */
    public String getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getListId() {
        return this.listId;
    }

    /**
     * 
     * @param listId
     *     the value for the listId property
     */
    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isCompleted() {
        return this.completed;
    }

    /**
     * 
     * @param completed
     *     the value for the completed property
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
