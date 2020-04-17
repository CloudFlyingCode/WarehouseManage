package com.crm.system.service;

import com.crm.system.domain.DepartmentDo;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    DepartmentDo get(Integer id);

    List<DepartmentDo> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(DepartmentDo xdkind);

    int update(DepartmentDo xdkind);

    int remove(Integer id);
}
