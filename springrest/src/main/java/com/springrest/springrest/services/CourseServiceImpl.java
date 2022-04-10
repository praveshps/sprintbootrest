package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
//	List<Course> list;
	
	@Autowired
	CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(245,"Java Core Course","this course contains basics of java."));
//		list.add(new Course(1402,"SpringBoot Rest API Course","this course contains basics of springboot Rest API."));
		
	}
	
	@Override
	public List<Course> getCourses() {
//		return list;
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {	
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int courseId) {
//		list = this.list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toList());
		courseDao.deleteById(courseId);
	}

}
