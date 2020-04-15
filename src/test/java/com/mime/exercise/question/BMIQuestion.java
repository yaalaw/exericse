package com.mime.exercise.question;

import java.util.Scanner;

public class BMIQuestion {
	//体重(kg) / (身高*身高)
	//	使用Scanner收集你的身高体重，并计算出你的BMI值是多少
	//	BMI的计算公式是 体重(kg) / (身高*身高)
	//	比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
	//	72 / (1.69*1.69) = ?
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
	        System.out.println("请输入你的身高（cm）");
	        float height = s.nextFloat()/100;
	        if(height ==0) break;
	        System.out.println("请输入你的体重（kg）");
	        float weight = s.nextFloat();
	        float bmi = weight/(height*height);
	        System.out.println("你的BMI值是"+bmi);
	        if(bmi<18.5) {
	        	System.out.println("体重过轻");
	        }else if(bmi<24) {
	        	System.out.println("正常范围");
	        }else if(bmi<27) {
	        	System.out.println("体重过重");
	        }else if(bmi<30) {
	        	System.out.println("轻度肥胖");
	        }else if(bmi<35) {
	        	System.out.println("中度肥胖");
	        }else if(35<bmi) {
	        	System.out.println("重度肥胖");
	        }
		}
		s.close();
    }
}
