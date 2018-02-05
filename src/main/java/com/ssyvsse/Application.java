package com.ssyvsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
@SpringBootApplication(/*
						 * exclude = { DataSourceAutoConfiguration.class,
						 * HibernateJpaAutoConfiguration.class,
						 * JpaRepositoriesAutoConfiguration.class }
						 */)
@Configuration
public class Application {

	public static ApplicationContext context;

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Application.context = ctx;
	}

}
