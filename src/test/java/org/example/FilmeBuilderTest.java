package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeBuilderTest {


    @Test
    void deveRetornarExcecaoParaFilmeSemNome() {
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            Filme filme = filmeBuilder
                    .setDuracao(169)
                    .setCategoria("Ficção científica")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFilmeSemDuracao() {
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            Filme filme = filmeBuilder
                    .setNome("Interstellar")
                    .setCategoria("Ficção científica")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Duração inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarFilmeValido() {
        FilmeBuilder filmeBuilder = new FilmeBuilder();
        Filme filme = filmeBuilder
                .setNome("Interstellar")
                .setDuracao(169)
                .setCategoria("Ficção científica")
                .build();

        assertNotNull(filme);
    }
}