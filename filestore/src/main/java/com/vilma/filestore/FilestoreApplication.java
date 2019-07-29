package com.vilma.filestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FilestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilestoreApplication.class, args);
	}
}
