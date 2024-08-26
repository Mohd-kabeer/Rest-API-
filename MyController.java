package com.example.LCWDAPI.Controller;

import com.example.LCWDAPI.Entities.Course;
import com.example.LCWDAPI.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService CourseService;

    @GetMapping("/allcourses")//saare courses deekhne k liye
    public List<Course> getCourse() {
        return this.CourseService.getCourses();
    }

    @GetMapping("/singlecourse/{courseId}")// single course deekhne k liye
    public Course getCourse(@PathVariable String courseId){
        return this.CourseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/addcourse")//course add karne k liye
    public Course addCourse(@RequestBody Course course){
        return this.CourseService.addCourse(course);
    }

    @PutMapping("/updatecourse/{id}")
    public Course updateCourse(@PathVariable String id,@RequestBody Course course, Course Course){
        return this.CourseService.updateCourse(Course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable String id){
        this.CourseService.deleteCourse(Long.parseLong(id));
    }
}
