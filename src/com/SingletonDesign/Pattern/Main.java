package com.SingletonDesign.Pattern;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		Connection connection=SingletonConnection.getConnection();
	}
}
