package edu.icet.controller;


import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/student")
    StudentEntity createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }


    @GetMapping("/student")
    List<Student> getStudent() {
        return service.retriveStudent();
    }

}