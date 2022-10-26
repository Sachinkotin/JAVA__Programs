package com.xworkz.jdbcStart.repository;

import java.sql.*;
import com.xworkz.jdbcStart.dto.HospitalDTO;
import com.xworkz.jdbcStart.enumClass.MySQLDBCredentials;



public class HospitalRepositoryImplementor implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO hdto) {

		System.out.println("Data saved successfully" + hdto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(MySQLDBCredentials.URL.getValues(),
					MySQLDBCredentials.USERNAME.getValues(), MySQLDBCredentials.SECRET.getValues());
			String sql = "INSERT INTO hospital values(" + hdto.getId() + ",'" + hdto.getName() + "','"
					+ hdto.getSpecialist() + "'," + hdto.getOpenTime() + ")";
			Statement statement = conn.createStatement();
			//System.out.println(statement);
			int execute = statement.executeUpdate(sql);
			if (execute > 0) {
				System.out.println(execute);
				System.out.println("Genarated data   :" + sql);
				return true;
			}/*//*('"++"')*/

		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		return true;
	}

}
