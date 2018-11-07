
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTasksWithListId", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTasksWithListId", namespace = "http://todoServer.dfs.com/")
public class GetTasksWithListId {

    @XmlElement(name = "id", namespace = "")
    private String id;

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

}
