package com.mime.exercise.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDao {
	// 数据库连接驱动
	public static String DRIVER = null;
	// 数据库连接路径
	public static String URL = null;
	// 数据库用户名
	public static String USERNAME = null;
	// 数据库密码
	public static String PASSWORD = null;

	static {
		Properties properties = new Properties();
		// 使用ClassLoader加载properties配置文件生成对应的输入流
		InputStream in = BaseDao.class.getClassLoader().getResourceAsStream("data/datasource.properties");
		// 使用properties对象加载输入流
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("data/datasource.properties文件找不到");
		}
		// 获取key对应的value值
		URL = properties.getProperty("url");
		DRIVER = properties.getProperty("driver");
		USERNAME = properties.getProperty("username");
		PASSWORD = properties.getProperty("password");
	}

	/**
	 * closeAll 关闭所有连接
	 * 
	 * @param ResultSet         结果集对象
	 * @param PreparedStatement 数据库操作对象
	 * @param Connection        数据库连接对象
	 * @return 没有返回值
	 */
	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		closeAll(rs, stmt);
		if (conn != null) { // 关闭数据库连接对象
			try {
				if (!conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * closeAll 关闭所有连接
	 * 
	 * @param ResultSet         结果集对象
	 * @param PreparedStatement 数据库操作对象
	 * @return 没有返回值
	 */
	public static void closeAll(ResultSet rs, PreparedStatement stmt) {
		// 7、关闭对象，回收数据库资源
		if (rs != null) { // 关闭结果集对象
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) { // 关闭数据库操作对象
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
