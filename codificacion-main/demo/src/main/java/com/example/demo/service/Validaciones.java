package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Validaciones {

    public boolean isNValid(int n) {
        if ( n > 0 && n < 10 ) {
            return true;
        }
        return false;
    }
    public boolean isClaveValid(String clave, int n) {
        var regex = "[0-9]+";
        if (clave.length() == n && clave.matches(regex)) {
            return true;
        }
        return false;
    }

    public boolean isTextoValid(String mensaje) {
        var regex = "[A-Z]+";
        if (!mensaje.isEmpty() && mensaje.length() < 10000 && mensaje.matches(regex)) {
            return true;
        }
        return false;
    }

}
