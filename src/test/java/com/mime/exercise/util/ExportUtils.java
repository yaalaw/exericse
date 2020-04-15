package com.mime.exercise.util;

public class ExportUtils {
	public static void arrayExport(int[] arr){
		System.out.print("数组值为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	}
}
