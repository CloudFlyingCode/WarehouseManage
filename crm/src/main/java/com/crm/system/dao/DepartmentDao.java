package com.crm.system.dao;

import com.crm.system.domain.DepartmentDo;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {
    DepartmentDo get(Integer id);

    List<DepartmentDo> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(DepartmentDo departmentDo);

    int update(DepartmentDo departmentDo);

    int remove(Integer id);
}
