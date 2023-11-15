package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    private String ddd;
    private String numero;

    @BeforeEach
    void setup() {
        ddd = "11";
        numero = "99999-9999";
    }

    @Test
    void deveriaCriarTelefoneQuandoDDDeNumeroValidos() {
        Telefone telefone = new Telefone(ddd, numero);

        assertEquals(telefone.getDdd(), ddd);
        assertEquals(telefone.getNumero(), numero);
    }

    @Test
    void naoDeveriaCriarTelefoneQuandoDDDInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, numero));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", numero));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("dddinvalido", numero));
    }

    @Test
    void naoDeveriaCriarTelefoneQuandoNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(ddd, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(ddd, ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(ddd, "numeroinvalido"));
    }
}
