package com.wuqian.ark.rpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {
	public static void main(String[] args) {
		System.out.println("准备启动DemoSpringBootApplication Classloader:" + DemoSpringBootApplication.class.getClassLoader());
		SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("DemoSpringBootApplication启动完成");
	}
}
