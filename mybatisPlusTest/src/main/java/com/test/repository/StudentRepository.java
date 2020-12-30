package com.test.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


/**
 * @Description: 该类的功能描述
 * @version:
 * @author: ma.hy
 * @date: 1996年10月27日
 */
@Repository
public interface StudentRepository extends BaseMapper<Student> {
    @Select("findAll")
    List<Student> findAll();


}
