package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import com.ssm.utils.Result;
import com.ssm.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("student/")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("get")
    public Result<?> get(String id, HttpServletRequest request) {
        if (StringUtils.isEmpty(id)) {
            return Result.fail("参数缺失");
        }
        Student student=studentService.get(id);
        if(student==null){
            return Result.success("用户不存在");
        }
        return Result.success(student);
    }
}
