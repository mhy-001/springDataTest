package com.test.repository;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 该类的功能描述
 * @version:
 * @author: ma.hy
 * @date: 1996年10月27日
 */
/*@Mapper*/
//@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>{
//    public List<Student> findAll();
//    public Student findById(int id);
//    public void saveStudent(Student student);
//    public void deleteById(int id);
}
