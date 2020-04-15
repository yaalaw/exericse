package com.mime.exercise.question.exception;
/**
 * 自定义异常继承Exception类
 * 并重写构造方法
 */
public class CustomExceptionQuestion extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CustomExceptionQuestion() {
		System.out.println("出现了异常");
	}
	
	public CustomExceptionQuestion(String message) {
		super(message);
	}
	
}
