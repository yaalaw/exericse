package com.mime.exercise.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysUserServiceTest {
	
	private static BeanFactory beanFactory;

	public static void main(String[] args) {
		beanFactory = new ClassPathXmlApplicationContext("config/applicationContext-construction.xml");
		//2.spring�����л�ȡsysUserService����
		SysUserService sysUserService = (SysUserService)beanFactory.getBean("sysUserService");
		//����sysUserService�еĲ��Է���
		sysUserService.selectUser();
		
	}
}
