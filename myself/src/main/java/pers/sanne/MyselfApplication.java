package pers.sanne;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.sanne.model.Student;

/**
 * @ClassName MyselfApplication
 * @Description
 * @Author sanne
 * @Date 2022/5/21 11:35
 * @Version 1.0.0
 */
public class MyselfApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getName());
	}
}
