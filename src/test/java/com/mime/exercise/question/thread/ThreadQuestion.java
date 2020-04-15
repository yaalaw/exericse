package com.mime.exercise.question.thread;

public class ThreadQuestion extends Thread{
	
	public void run() {
		//线程保存的内容地址指向的线程是“线程对象”
		Thread thread = currentThread();
		System.out.println(thread.getName()+" ThreadQuestion.run()  调用了run方法");
	}
	
}
