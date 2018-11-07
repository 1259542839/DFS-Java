
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addTodoList", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTodoList", namespace = "http://todoServer.dfs.com/", propOrder = {
    "name",
    "desc"
})
public class AddTodoList {

    @XmlElement(name = "name", namespace = "")
    private String name;
    @XmlElement(name = "desc", namespace = "")
    private String desc;

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
     *     returns String
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * 
     * @param desc
     *     the value for the desc property
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
