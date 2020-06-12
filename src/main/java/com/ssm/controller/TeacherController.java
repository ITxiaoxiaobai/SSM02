package com.ssm.controller;

import com.ssm.entity.Subject;
import com.ssm.entity.Teacher;
import com.ssm.entity.User;
import com.ssm.service.TeacherService;
import com.ssm.utils.Result;
import com.ssm.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("teacher/")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("get")
    public Result<?> get(String id) {
        if (StringUtils.isEmpty(id)) {
            return Result.fail("参数缺失");
        }
        Teacher teacher = teacherService.get(id);
        if (teacher == null) {
            return Result.success("用户不存在");
        }
        return Result.success(teacher);
    }

    @PostMapping("add")
    public Result<?> add(String name) {
        if (StringUtils.isEmpty(name)) {
            return Result.fail("参数缺失");
        }
        System.out.println("陈雪");
        System.out.println(name);
        Teacher teacher = new Teacher();
        teacher.setId(UUIDUtil.get());
        teacher.setName(name);
        teacher.setAge(30);
        teacher.setSex(1);
        Subject subject = new Subject();
        subject.setId(UUIDUtil.get());
        teacher.setSubject(subject);
        teacher.setAccount("15919161945");
        teacher.setPassword("123456");
        User user = new User();
        user.setId(UUIDUtil.get());
        teacher.setCreateUser(user);
        teacher.setCreateTime(new Date());
        int count = teacherService.add(teacher);
        return Result.success(count);
    }
}
