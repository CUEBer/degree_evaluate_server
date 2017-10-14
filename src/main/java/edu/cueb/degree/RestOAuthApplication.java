package edu.cueb.degree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer 
@EnableAuthorizationServer 
@SpringBootApplication
public class RestOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestOAuthApplication.class, args);
	}
}