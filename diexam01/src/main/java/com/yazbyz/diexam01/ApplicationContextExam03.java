package com.yazbyz.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {

	public static void main(String[] args) {
//		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		
		Car car = (Car)ac.getBean(Car.class); // Car car = (Car)ac.getBean("car");
		car.run();
	}
}
