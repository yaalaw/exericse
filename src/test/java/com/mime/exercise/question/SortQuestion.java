package com.mime.exercise.question;

import java.util.Random;

import com.mime.exercise.util.ExportUtils;

public class SortQuestion {
	Random random = new Random();

	public static void main(String[] args) {
		SortQuestion sortQuestion = new SortQuestion();
		sortQuestion.BubbleSort(sortQuestion.randomArray(10,101));
		sortQuestion.SelectionSort(sortQuestion.randomArray(10,101));
	}
	
	/**
	 * @param length 返回数组长度
	 * @param scope  取值空间-1
	 * @return 返回随机生成数组
	 */
	public int[] randomArray(int length,int scope) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(scope);
		}
		return arr;
	}
	
	// 冒泡排序
	void BubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		ExportUtils.arrayExport(arr);
	}

	// 选择排序
	void SelectionSort(int[] arr) {
		// 选择排序的优化
		for (int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
			int k = i;
			for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
				if (arr[j] < arr[k]) {
					k = j; // 记下目前找到的最小值所在的位置
				}
			}
			// 在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
			if (i != k) { // 交换a[i]和a[k]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		ExportUtils.arrayExport(arr);
	}
	
}
