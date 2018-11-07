
package com.dfs.todoServer.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getListsResponse", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListsResponse", namespace = "http://todoServer.dfs.com/")
public class GetListsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.dfs.todoServer.TodoList> _return;

    /**
     * 
     * @return
     *     returns List<TodoList>
     */
    public List<com.dfs.todoServer.TodoList> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.dfs.todoServer.TodoList> _return) {
        this._return = _return;
    }

}
