package com.mime.exercise.util;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	public static File createFile(String url) throws IOException {
		//获取resources的绝对路径
		File file = new File(url);
		//判断该文件存不存在
		if(!file.exists()) {
			//如果文件不存在则创建
			// 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
			file.createNewFile();
		}
		return file;
	}
}
