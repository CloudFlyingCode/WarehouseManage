package com.crm.system.domain;

import java.io.Serializable;

public class DepartmentDo implements Serializable {
    private static final long serialVersionUID = 1L;
    //部门编号
    private Integer id;
    //部门名称
    private String departmentname;
    //联系人
    private String contacts;

    //部门主管
    private String manager;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
