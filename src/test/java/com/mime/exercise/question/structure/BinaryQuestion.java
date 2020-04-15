package com.mime.exercise.question.structure;

public class BinaryQuestion {
	public static void main(String[] args) {
		intConversionByte();
	}
	
	/**
	 * int类型转byte
	 * byte的数值范围是-128~127
	 * 当byte数值范围超过127时会出现补位6
	 */
	public static void intConversionByte() {
		int number = 1;
		for (int i = 121; i < 200; i++) {
			//将int值转换成byte
			byte b = (byte)(number+i);
			int a = number+i ;
			if(i>=127) {
				a=-128+(a%128);
			}
			System.out.print("int："+ a +"  byte：" + b+" | ");
			if(i%5==0) {
				System.out.println();
			}
		}
	}
}
