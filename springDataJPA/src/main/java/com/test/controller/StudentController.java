package com.test.controller;


import com.test.entity.Student;
import com.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @Description: 该类的功能描述
 * @version:
 * @author: ma.hy
 * @date: 1996年10月27日
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

//    @GetMapping("/findById/{id}")
//    public Student findById(@PathVariable("id") int id) {
//        return studentRepository.findById(id);
//    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }
}
