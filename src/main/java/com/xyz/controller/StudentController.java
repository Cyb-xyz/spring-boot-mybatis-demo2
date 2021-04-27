package com.xyz.controller;

import com.xyz.entity.Student;
import com.xyz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 小宇宙
 * @Date: 2021-04-26 15:55
 */
@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/getOneStudent")
    public Map<String, Object> getOneStudent(@RequestParam Integer id) {
        Map<String, Object> map = new HashMap<>();

        Student student = studentService.selectOne(id);
        map.put("data", student);

        return map;
    }

    @GetMapping("/selectAll")
    public Map<String, Object> selectAll() {
        Map<String, Object> map = new HashMap<>();

        List<Student> studentList = studentService.selectAll();
        map.put("data", studentList);

        return map;
    }
    @PostMapping("/save")
    public Map<String, Object> save(@RequestParam String name,
                                    @RequestParam Integer age,
                                    @RequestParam String sex,
                                    @RequestParam String address,
                                    @RequestParam Integer math,
                                    @RequestParam Integer english,
                                    @RequestParam String data_date) {
        Map<String, Object> map = new HashMap<>();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setAddress(address);
        student.setMath(math);
        student.setEnglish(english);
        student.setData_date(data_date);

        int num = studentService.save(student);
        map.put("data", num);

        return map;
    }

}
