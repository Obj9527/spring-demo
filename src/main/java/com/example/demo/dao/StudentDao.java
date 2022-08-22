package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.form.Student;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-16
 */
public interface StudentDao {
    @Insert(value = "insert into student(name, gender, email) values(#{name}, #{gender}, #{email})")
    void save(Student student);

    @Delete(value = "delete from student where id = #{id}")
    void delete(Integer id);

    @Update(value = "update student set name = #{name}, gender = #{gender}, email = #{email} where id = #{id}")
    void update(Student student);

    @Select("select id, name, gender, email from student where 1=1")
    List<Student> findAll();

    @Select("select id, name, gender, email from student where id = #{id}")
    Student findById(Integer id);
}
