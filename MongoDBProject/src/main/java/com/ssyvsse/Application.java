package com.ssyvsse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.ssyvsse.dao.CustomerRepository;
import com.ssyvsse.pojo.Customer;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
@SpringBootApplication(/*
						 * exclude = { DataSourceAutoConfiguration.class,
						 * HibernateJpaAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class }
						 */)
@Configuration
public class Application implements CommandLineRunner {

	public static ApplicationContext context;

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Application.context = ctx;
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
	}

}
