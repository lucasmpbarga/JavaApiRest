package com.javaapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.javaapirest.repositories.ProdutoRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.javaapirest.repositories", entityManagerFactoryRef="emf")
public class JavaApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiRestApplication.class, args);
	}
}
