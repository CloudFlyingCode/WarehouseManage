package com.crm.system.service.impl;

import com.crm.system.dao.DepartmentDao;
import com.crm.system.domain.DepartmentDo;
import com.crm.system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public DepartmentDo get(Integer id){
        return departmentDao.get(id);
    }

    @Override
    public List<DepartmentDo> list(Map<String, Object> map){
        return departmentDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return departmentDao.count(map);
    }

    @Override
    public int save(DepartmentDo departmentDo){

        return departmentDao.save(departmentDo);
    }

    @Override
    public int update(DepartmentDo departmentDo){

        return departmentDao.update(departmentDo);
    }

    @Override
    public int remove(Integer id){
        return departmentDao.remove(id);
    }
}
