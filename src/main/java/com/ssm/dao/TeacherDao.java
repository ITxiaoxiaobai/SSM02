package com.ssm.dao;

import com.ssm.entity.Teacher;

public interface TeacherDao {
    Teacher get(String id);
    int insert(Teacher teacher);
}
