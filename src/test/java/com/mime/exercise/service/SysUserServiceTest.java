package com.mime.exercise.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysUserServiceTest {
	
	private static BeanFactory beanFactory;

	public static void main(String[] args) {
		beanFactory = new ClassPathXmlApplicationContext("config/applicationContext-construction.xml");
		//2.spring容器中获取sysUserService对象
		SysUserService sysUserService = (SysUserService)beanFactory.getBean("sysUserService");
		//调用sysUserService中的测试方法
		sysUserService.selectUser();
		
	}
}
