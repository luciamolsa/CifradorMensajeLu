package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Cifrado {
    public StringBuilder textoCifrado(int n, String clave, String texto){
        StringBuilder resultado = new StringBuilder();

        for (int i=0; i < texto.length(); i++) {

            char letra = texto.charAt(i);
            int desplazamiento = Integer.parseInt(clave.charAt(i % n)+"");
            char letraCifrada = cifrarLetra(letra, desplazamiento);

            resultado.append(letraCifrada);
        }
        return resultado;
    }

    private char cifrarLetra(char letra, int desplazamiento) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int posicionOriginal = abecedario.indexOf(letra);
        int posicionCifrada = (posicionOriginal + desplazamiento) % 26;
        return abecedario.charAt(posicionCifrada);
    }
}
