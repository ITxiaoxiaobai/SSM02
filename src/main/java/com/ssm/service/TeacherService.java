package com.ssm.service;

import com.ssm.dao.TeacherDao;
import com.ssm.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;
    public Teacher get(String id){
        return teacherDao.get(id);
    }
    public int add(Teacher teacher){
        return teacherDao.insert(teacher);
    }
}
