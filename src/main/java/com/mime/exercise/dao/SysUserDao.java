package com.mime.exercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mime.exercise.model.SysUser;

public class SysUserDao {
	public void userLogin() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from sys_user where username=? and password=?";
		try {
			//1.注册JDBC驱动程序
			Class.forName(BaseDao.DRIVER);
			//2.得到连接对象Connection
			conn=DriverManager.getConnection(BaseDao.URL, BaseDao.USERNAME, BaseDao.PASSWORD);
			//3.创建Statement对象
			pstmt = conn.prepareStatement(sql);
			//4.执行SQL语句
			rs = pstmt.executeQuery();
			//5.处理结果集
			SysUser sysUser = new SysUser();
			while(rs.next()) {
				sysUser.setId(rs.getInt("id"));  
				sysUser.setUsername(rs.getString(1)); //此方法比较高效  
				sysUser.setPassword(rs.getString(2));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6.释放资源
			BaseDao.closeAll(rs, pstmt, conn);
		}
	}
}
