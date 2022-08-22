package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.form.Student;
import com.example.demo.service.StudentService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-17
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public StudentServiceImpl() {
        System.out.println("执行无参构造方法");
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentDao.delete(id);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }
}
