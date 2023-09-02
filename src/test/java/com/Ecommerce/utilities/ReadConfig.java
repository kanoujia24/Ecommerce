package com.Ecommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("exception is" + e.getMessage());
		}
	}

	public String getApplicatinUrl() {
		String url = pro.getProperty("baseUrl");
		return url;
	}

	public String getUsername() {
		String userName = pro.getProperty("userName");
		return userName;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}

	public String getGeckoPth() {
		String gecko = pro.getProperty("firefoxpath");
		return gecko;
	}

}
