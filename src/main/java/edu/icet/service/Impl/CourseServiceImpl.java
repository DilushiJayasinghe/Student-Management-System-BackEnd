package edu.icet.service.Impl;

import edu.icet.dto.Course;
import edu.icet.service.CourseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Primary ---> if have many sub classes use this annotation to identify the priority.
public class CourseServiceImpl implements CourseService {

    @Value("${application.institute}")
    String institute;

    public List<Course> getCourse(){

        ArrayList<Course> courseList = new ArrayList();

        courseList.add(new Course(
                "ICET Java Master",
                "ICM",
                "100000",
                "8 ",institute));

        courseList.add(new Course(
                "ICET Java Beginner",
                "ICD",
                "80000",
                "10",institute));

        return courseList;

    }
}
