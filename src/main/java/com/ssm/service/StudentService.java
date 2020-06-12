package com.ssm.service;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student get(String id) {
        return studentDao.get(id);
    }
}
