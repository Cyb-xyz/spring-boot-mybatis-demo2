package com.xyz.service;

import com.xyz.dao.StudentMapper;
import com.xyz.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 小宇宙
 * @Date: 2021-04-26 17:06
 */
@Service
public class StudentService {

    @Autowired
    public StudentMapper studentMapper;

    public Student selectOne(Integer id) {
        return studentMapper.selectById(id);
    }

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    public int save(Student student) {
        return studentMapper.save(student);
    }
}
