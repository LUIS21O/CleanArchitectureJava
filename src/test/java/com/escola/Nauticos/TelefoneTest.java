package com.escola.Nauticos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void ShouldNotCreatePhoneWithInvalidDDD () {

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }


    @Test
    void ShouldNotCreatePhoneWithInvalidNumber () {

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("21", null));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("21", ""));

        assertThrows(IllegalArgumentException.class, () -> new Telefone( "21", "123"));
    }

    @Test
    void deveriaCriarTelefoneComDDDValido () {

        String ddd = "34";
        String numero = "935659845";
        Telefone telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());

    }
    }