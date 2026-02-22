package com.registerer.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/getStudent")
    public ModelAndView getStudent(@RequestParam("student_id") int studentID){ // information from form getStudent will be used as a parameter for getStudent method
        ModelAndView mav_obj = new ModelAndView();
        // create an object of the model that contains the retrieved data. if it doesnt exist, just create that object as it is

        StudentInfo std = repo.findById(studentID).orElse(new StudentInfo());
        mav_obj.addObject("student", std);
        mav_obj.setViewName("retrieval");
        return mav_obj;
    }

    @RequestMapping("/dropStudent")
    public ModelAndView dropStudent(@RequestParam("student_id") int studentID){
        ModelAndView mav = new ModelAndView("deletedRecord");

        try {
            StudentInfo student = repo.findById(studentID).orElse(new StudentInfo()); // entity made 
            mav.addObject("toDropStudent", student);
            repo.delete(student);
        } catch (Exception e) {
            System.out.println("Couldn't find Student by ID " + studentID);
        }
        
        mav.addObject("StudentID", studentID);
        return mav;
    }

    @RequestMapping("updateStudentRecord")
    public ModelAndView updateStudentRecord(@RequestParam("student_id") int studentID, StudentInfo studentEntity){
        ModelAndView mav = new ModelAndView();
        try {
            StudentInfo student = repo.findById(studentID).orElse(new StudentInfo()); // with the help of student id we are finding the record containign everything in a row. We are not finding just the id but finding the whole record with the help of iD
            mav.addObject("old_st", student);
            repo.delete(student);
        } catch (Exception e) {
            System.out.println("Unable to update. Error at " + studentID);
        }
        repo.save(studentEntity);
        
        mav.addObject("id", studentID);
        mav.addObject("st", studentEntity);
        mav.setViewName("updateChange");
        return mav;
    }
}
