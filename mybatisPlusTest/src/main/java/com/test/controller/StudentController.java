package com.test.controller;


import com.test.entity.Student;
import com.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Description: 该类的功能描述
 * @version:
 * @author: ma.hy
 * @date: 1996年10月27日
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired StudentRepository studentRepository;
    @GetMapping("/findAll")
    public ModelAndView findAll() {
//       List<Student> list = studentRepository.selectList(null);
//       return list;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",studentRepository.findAll());
       return  modelAndView;
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") int id) {
        return studentRepository.selectById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.insert(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.updateById(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }
}
