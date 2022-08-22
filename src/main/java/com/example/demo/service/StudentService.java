package com.example.demo.service;

import java.util.List;

import com.example.demo.form.Student;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-16
 */
public interface StudentService {
    void save(Student student);

    void delete(Integer id);

    void update(Student student);

    List<Student> findAll();

    Student findById(Integer id);
}
