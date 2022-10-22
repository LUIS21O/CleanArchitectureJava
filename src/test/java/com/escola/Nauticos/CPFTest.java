package com.escola.Nauticos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {

    @Test
    void NaoDeveriaCriarCPFInvalido () {

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class, () -> new CPF(""));

        assertThrows(IllegalArgumentException.class, () -> new CPF ("17659845895"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido () {

        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());

    }
}
