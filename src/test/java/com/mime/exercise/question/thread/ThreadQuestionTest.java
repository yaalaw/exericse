package com.mime.exercise.question.thread;

public class ThreadQuestionTest{
	public static void main(String[] args) {
		ThreadQuestion threadQuestion = new ThreadQuestion();
		threadQuestion.setName("第一条线程");
		threadQuestion.start();
		
	}
	
}
