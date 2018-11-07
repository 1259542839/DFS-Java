
package com.dfs.todoServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "searchListWithKeyword", namespace = "http://todoServer.dfs.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchListWithKeyword", namespace = "http://todoServer.dfs.com/")
public class SearchListWithKeyword {

    @XmlElement(name = "keyword", namespace = "")
    private String keyword;

    /**
     * 
     * @return
     *     returns String
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * 
     * @param keyword
     *     the value for the keyword property
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

}
