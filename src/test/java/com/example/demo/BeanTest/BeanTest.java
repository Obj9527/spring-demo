package com.example.demo.BeanTest;

import java.util.Date;

import javax.mail.MessagingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.config.SpringConfig;
import com.example.demo.form.Sale;
import com.example.demo.form.Student;
import com.example.demo.service.MailService;
import com.example.demo.service.ResourceService;
import com.example.demo.service.SaleService;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-17
 */
@SpringBootTest
@ContextConfiguration(classes = SpringConfig.class)
public class BeanTest {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ResourceService resourceService;
    @Autowired
    private SaleService saleService;
    @Autowired
    private MailService mailService;

    @Test
    public void test01() {
        StudentService studentService = (StudentService) applicationContext.getBean(StudentServiceImpl.class);
        studentService.save(new Student("小明", "男", "xiaoming@qq.com"));
    }

    @Test
    public void test02() {
        // 1.指定spring配置文件
        String path = "beans.xml";
        // 2.创建容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        StudentService studentService = (StudentService) ctx.getBean(StudentServiceImpl.class);
        studentService.save(new Student());
    }

    @Test
    public void test03() {
        // 1.指定spring配置文件
        String path = "beans.xml";
        // 2.创建容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        System.out.println("数量==" + ctx.getBeanDefinitionCount());
        for (String name: ctx.getBeanDefinitionNames()) {
            System.out.println("名称==" + name);
        }
    }

    @Test
    public void test05() {
        // 1.指定spring配置文件
        String path = "beans.xml";
        // 2.创建容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        Date date = (Date) ctx.getBean(Date.class);
        System.out.println(date.getTime());
    }

    @Test
    public void test06() {
        studentService.save(new Student("小明", "男", "xiaoming@qq.com"));
    }

    @Test
    public void test07() {
        System.out.println(studentService.findById(1).toString());
    }

    @Test
    public void test08() {
        System.out.println(studentService.findAll());
    }

    @Test
    public void test09() {
        System.out.println(resourceService.openUrl("www.baidu.com", "123456  "));
    }

    @Test
    public void test10() {
        Sale sale = new Sale();
        sale.setId(12);
        sale.setGid(235235325);
        sale.setNum(1);
        saleService.save(sale);
        System.out.println(saleService.findById(1));
    }

    @Test
    public void test11() throws MessagingException {
        mailService.send();
    }
}
