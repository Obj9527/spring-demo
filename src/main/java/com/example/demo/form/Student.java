package com.example.demo.form;

import org.springframework.context.annotation.Bean;

import lombok.Getter;
import lombok.Setter;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-16
 */

@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private String gender;
    private String email;

    public Student() {
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
