
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getLists", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLists", namespace = "http://todoServer.dfs.com/", propOrder = {
    "skip",
    "limit"
})
public class GetLists {

    @XmlElement(name = "skip", namespace = "")
    private int skip;
    @XmlElement(name = "limit", namespace = "")
    private int limit;

    /**
     * 
     * @return
     *     returns int
     */
    public int getSkip() {
        return this.skip;
    }

    /**
     * 
     * @param skip
     *     the value for the skip property
     */
    public void setSkip(int skip) {
        this.skip = skip;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getLimit() {
        return this.limit;
    }

    /**
     * 
     * @param limit
     *     the value for the limit property
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

}
