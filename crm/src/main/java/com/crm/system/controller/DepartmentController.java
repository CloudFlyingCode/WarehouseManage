package com.crm.system.controller;

import com.crm.common.PageUtils;
import com.crm.system.domain.DepartmentDo;
import com.crm.system.service.DepartmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.crm.common.PageUtils;
import com.crm.common.Query;
import com.crm.common.R;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/department")

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping()
    String departmentList() {
        return "sys/department/department";
    }


    @GetMapping("/list")
    @ResponseBody
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<DepartmentDo> departmentList = departmentService.list(query);
        int total = departmentService.count(query);
        PageUtils pageUtils = new PageUtils(departmentList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    String add() {
        return "sys/department/add";

    }

    @GetMapping("/edit/{id}")
    String edit(@PathVariable("id") Integer id, Model model) {

        DepartmentDo departmentDo = departmentService.get(id);
        model.addAttribute("department", departmentDo);
        return "sys/department/edit";
    }


    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    public R save(DepartmentDo departmentDo) {
        if (departmentService.save(departmentDo) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    public R update(DepartmentDo departmentDo) {
        departmentService.update(departmentDo);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    public R remove(Integer id) {
        if (departmentService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }
}
