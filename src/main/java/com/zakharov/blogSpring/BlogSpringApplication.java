package com.zakharov.blogSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.zakharov.blogSpring.controllers"})
public class BlogSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogSpringApplication.class, args);
	}
	/**
	 * <dependency>
	 * 			<groupId>javax.xml.bind</groupId>
	 * 			<artifactId>jaxb-api</artifactId>
	 * 			<version>2.3.0</version>
	 * 		</dependency>
	 * 		<dependency>
	 * 			<groupId>org.hibernate</groupId>
	 * 			<artifactId>hibernate-core</artifactId>
	 * 			<version>4.1.4.Final</version>
	 * 		</dependency>
	 * 		<dependency>
	 * 			<groupId>org.hibernate</groupId>
	 * 			<artifactId>hibernate-entitymanager</artifactId>
	 * 			<version>5.2.3.Final</version>
	 * 		</dependency>
	 */

}
