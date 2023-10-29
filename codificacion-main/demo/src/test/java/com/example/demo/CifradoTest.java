package com.example.demo;

import com.example.demo.service.Cifrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CifradoTest {
    @Test
    public void testCifrado() {
        Cifrado cifrado = new Cifrado();
        StringBuilder result = cifrado.textoCifrado(2, "23", "HOLA");
        Assertions.assertEquals("JRND", result.toString());
    }
    @Test
    public void testCifradoNotValid() {
        Cifrado cifrado = new Cifrado();
        StringBuilder result = cifrado.textoCifrado(2, "23", "HOLA");
        assert !result.equals("IPMB");
    }

}
