package com.example.bs41perfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


/*
* Dependiendo del contenido de la variable de Sistema "SPRING_PROFILES_ACTIVE" (contenido="perfil1" o bien "perfil2"),
* se acabará ejecutando el método "miFuncion()" de las clases "Perfil1"/"Perfil2".
*
* * */

@SpringBootApplication
public class Bs41perfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs41perfilesApplication.class, args);
	}

	@Bean
	@Profile("perfil1")
	Perfil1 pf1() { return new Perfil1(); }

	@Bean
	@Profile("perfil2")
	Perfil2 pf2() { return new Perfil2(); }

}
