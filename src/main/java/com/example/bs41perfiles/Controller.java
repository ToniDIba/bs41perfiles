package com.example.bs41perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired LecturaProperties lecturaProperties;
    @Autowired Iperfiles perfiles;

    @GetMapping("/parametros/")
    public String recogerValoresProperties() {

       return "Url: " + lecturaProperties.getUrl() + ". Password: " + lecturaProperties.getPassword();

    }

    @GetMapping("/perfil/")
    public void dependiendoPerfilArranque() {

        System.out.println("Contenido variable de sistema 'SPRING_PROFILES_ACTIVE': " + System.getenv("SPRING_PROFILES_ACTIVE"));
        perfiles.miFuncion();

    }

}
