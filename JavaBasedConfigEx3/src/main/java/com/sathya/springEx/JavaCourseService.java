package com.sathya.springEx;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService {

	@Override
	public void courseInfo() {
		System.out.println("java full stack spring");
	}

}
