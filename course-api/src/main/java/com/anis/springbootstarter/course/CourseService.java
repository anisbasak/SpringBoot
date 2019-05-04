package com.anis.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> course = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).forEach(course::add);
		return course;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}
}
