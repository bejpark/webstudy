package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.or.connect.jdbcexam.dto.Role;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#"; 
	
	public int addRole(Role role) {
		int insertCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbUser, dbpasswd);
			String sql = "INSERT INTO role (role_id, description) VALUES ( ?, ?)";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, role.getRoleId()); //sql 안의 ?부분임(몇번째, 들어가는것) 
			ps.setString(2,  role.getDescription());
			
			insertCount = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	
			if(ps !=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return insertCount;
	}
	
	
	
	public Role getRole(Integer roleId) {
		Role role = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbUser, dbpasswd);
			String sql = "SELECT description, role_id FROM role WHERE role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId); //sql 안의 ?부분임(몇번째, 들어가는것) 
			rs = ps.executeQuery();
			
			if(rs.next()) { //결과가 있다면 첫 번째 record로 커서이동 후 True 리턴. 없다면 False
				String description = rs.getString(1); //
				int id = rs.getInt("role_id"); //rs.getString(2)와 동일 
				role = new Role(id, description);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps !=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return role;
	}
}
