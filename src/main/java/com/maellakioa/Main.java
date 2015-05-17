package com.maellakioa;

import org.springframework.boot.SpringApplication;

public class Main {
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(MyConfiguration.class);
		app.setShowBanner(false);
		app.run(args);
	}
}