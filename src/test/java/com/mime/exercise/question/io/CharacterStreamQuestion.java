package com.mime.exercise.question.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.mime.exercise.constant.FileConstant;
import com.mime.exercise.util.FileUtils;

public class CharacterStreamQuestion {
	public static void main(String[] args)  {
		String url = FileConstant.dataFile+"/stream.txt";
		
		FileWriter fileWriter = null;
		//创建基于文件的wrier
		try{
			File file = FileUtils.createFile(url);
			fileWriter = new FileWriter(file);
			
			//以字符流的形式把数据写入到文件中
			String data = "adasd1245";
			char[] cbuf = data.toCharArray();
			fileWriter.write(cbuf);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fileWriter!=null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
