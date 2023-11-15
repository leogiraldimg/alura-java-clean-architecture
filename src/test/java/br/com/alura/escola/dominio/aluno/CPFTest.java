package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    private String numero;

    @BeforeEach
    void setup() {
        numero = "123.456.789-10";
    }

    @Test
    void deveriaCriarCPFQuandoNumeroValido() {
        CPF cpf = new CPF(numero);

        assertEquals(cpf.getNumero(), numero);
    }

    @Test
    void naoDeveriaCriarCPFQuandoNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("cpfinvalido"));
    }
}
