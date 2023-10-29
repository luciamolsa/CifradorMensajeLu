package com.example.demo.controller;

import com.example.demo.service.Cifrado;
import com.example.demo.service.Validaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerCodificacion {

    @Autowired
    Validaciones validaciones;
    @Autowired
    Cifrado cifrado;

    @PostMapping("/encriptar")
    public StringBuilder encriptar(
            @RequestParam int n,
            @RequestParam String clave,
            @RequestBody String texto
    ){
        texto = texto.replaceAll("\\s","");
        texto = texto.toUpperCase();


        if (!validaciones.isNValid(n) || !validaciones.isClaveValid(clave, n) || !validaciones.isTextoValid(texto)){
            return new StringBuilder(("Error en datos ingresados"));
        }


        return cifrado.textoCifrado(n, clave, texto);
    }

}