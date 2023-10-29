package com.example.demo;

import com.example.demo.service.Validaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidacionesTest {

    @Test
    public void testIsNValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isNValid(5);
        Assertions.assertTrue(result);
    }
    @Test
    public void testIsClaveValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isClaveValid("12345", 5);
        Assertions.assertTrue(result);
    }
    @Test
    public void testIsTextoValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isTextoValid("HOLA");
        Assertions.assertTrue(result);
    }
    @Test
    public void testIsNNotValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isNValid(0);
        Assertions.assertFalse(result);
    }
    @Test
    public void testIsClaveNotValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isClaveValid("12345", 0);
        Assertions.assertFalse(result);
    }
    @Test
    public void testIsTextoNotValid() {
        Validaciones validaciones = new Validaciones();
        boolean result = validaciones.isTextoValid("HOLA123");
        Assertions.assertFalse(result);
    }
}
