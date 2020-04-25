package org.studyeasy.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.studyeasy.spring.model.User;

public class AppDAOImpl implements AppDAO {
	
	private DataSource dataSource;
	
	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		
		List<User> listUsers = new ArrayList<User>();
		Connection conn = null;		
		String query = "select * from user";
		
		try {

			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {

				User tempUser = new User(rs.getInt("user_id"), rs.getString("name"), rs.getString("email")
				);
				listUsers.add(tempUser);
			}
			
			rs.close();
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {

		}

		return listUsers;
	}

}
