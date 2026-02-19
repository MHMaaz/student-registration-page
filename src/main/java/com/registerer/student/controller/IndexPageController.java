package com.registerer.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registerer.student.dao.StudentDataEntryRepository;
import com.registerer.student.model.StudentInfo;

@Controller
public class IndexPageController {

    @Autowired
    StudentDataEntryRepository repo; // repository

    @RequestMapping("main")
    public String IndexPage(){
        return "main"; // page request controller
    }
    @RequestMapping("/infoContainer")
    public String ContainerHandler(StudentInfo studentInfo){ // arguments consists of all data obtained from container
        repo.save(studentInfo);
        return "main2";
    }
}
