package com.registro.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistroUsuariosSpringSecurityApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8083");
		SpringApplication.run(RegistroUsuariosSpringSecurityApplication.class, args);
	}

}
