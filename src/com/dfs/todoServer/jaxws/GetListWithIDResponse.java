
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getListWithIDResponse", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListWithIDResponse", namespace = "http://todoServer.dfs.com/")
public class GetListWithIDResponse {

    @XmlElement(name = "return", namespace = "")
    private com.dfs.todoServer.TodoList _return;

    /**
     * 
     * @return
     *     returns TodoList
     */
    public com.dfs.todoServer.TodoList getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.dfs.todoServer.TodoList _return) {
        this._return = _return;
    }

}
