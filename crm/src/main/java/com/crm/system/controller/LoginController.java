package com.crm.system.controller;


import com.crm.common.PageUtils;
import com.crm.common.Query;
import com.crm.system.domain.DepartmentDo;
import com.crm.system.service.DepartmentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class LoginController   {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping({"/", ""})
    String welcome(Model model) {
        return "redirect:/login";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }



    @GetMapping({"/index"})
    String index(Model model) {
        model.addAttribute("username", "管理员");
        return "index";
    }
    @PostMapping("/login")
    @ResponseBody
    int  ajaxLogin(String username, String password) {
        try {
            return 0;
        } catch (AuthenticationException e) {
            return 1;
        }
    }

    @GetMapping("/logout")
    String logout() {
        return "redirect:/login";
    }

//    @GetMapping("/sys/department")
//    String department() {
//        return "sys/department/department";
//    }

    @GetMapping("/sys/user")
    String user() {
        return "sys/user/user";
    }

    @GetMapping("/main")
    String main() {
        return "main";
    }
}
