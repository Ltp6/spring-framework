package com.ltp;

import com.ltp.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/1/21 7:06 下午
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-test.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
