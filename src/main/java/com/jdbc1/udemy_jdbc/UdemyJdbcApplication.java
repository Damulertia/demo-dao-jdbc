package com.jdbc1.udemy_jdbc;

import com.jdbc1.udemy_jdbc.db.DB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class UdemyJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyJdbcApplication.class, args);

		Connection conn = DB.getConnection();
		DB.closeConnection();
	}



}
