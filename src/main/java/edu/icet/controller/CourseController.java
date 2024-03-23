package edu.icet.controller;

import edu.icet.dto.Course;
import edu.icet.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//(marker annotation=identify the network request)
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses/list")
    public List<Course> getCourse() {


       return courseService.getCourse();

    }

}
