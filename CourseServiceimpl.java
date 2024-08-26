package com.example.LCWDAPI.Services;

import com.example.LCWDAPI.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceimpl implements CourseService{

    List<Course> list;

    public CourseServiceimpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"SpringBoot","SpringBoot Rest API"));
        list.add(new Course(2,"SpringBoot","SpringBoot Rest API"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e -> {
            if (e.getId() == course.getId())
            {
                e.setTitle(course.getTitle());
                e.setDiscription(course.getDiscription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
    }
}
