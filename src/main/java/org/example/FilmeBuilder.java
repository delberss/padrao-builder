package org.example;

import java.util.Date;
import java.util.List;

public class FilmeBuilder {
    private Filme filme;

    public FilmeBuilder() {
        filme = new Filme();
    }

    public Filme build() {
        if (filme.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (filme.getDuracao() == 0) {
            throw new IllegalArgumentException("Duração inválida");
        }
        return filme;
    }

    public FilmeBuilder setNome(String nome) {
        filme.setNome(nome);
        return this;
    }

    public FilmeBuilder setDataLancamento(Date dataLancamento) {
        filme.setDataLancamento(dataLancamento);
        return this;
    }

    public FilmeBuilder setCategoria(String categoria) {
        filme.setCategoria(categoria);
        return this;
    }

    public FilmeBuilder setNotaAvaliacao(int notaAvaliacao) {
        filme.setNotaAvaliacao(notaAvaliacao);
        return this;
    }

    public FilmeBuilder setQuantidadePremios(int quantidadePremios) {
        filme.setQuantidadePremios(quantidadePremios);
        return this;
    }

    public FilmeBuilder setDiretor(String diretor) {
        filme.setDiretor(diretor);
        return this;
    }

    public FilmeBuilder setSinopse(String sinopse) {
        filme.setSinopse(sinopse);
        return this;
    }

    public FilmeBuilder setIdiomaOriginal(String idiomaOriginal) {
        filme.setIdiomaOriginal(idiomaOriginal);
        return this;
    }

    public FilmeBuilder setDuracao(int duracao) {
        filme.setDuracao(duracao);
        return this;
    }

    public FilmeBuilder setElenco(List<String> elenco) {
        filme.setElenco(elenco);
        return this;
    }

    public FilmeBuilder setEstudio(String estudio) {
        filme.setEstudio(estudio);
        return this;
    }

    public FilmeBuilder setDisponivelEmBluRay(boolean disponivelEmBluRay) {
        filme.setDisponivelEmBluRay(disponivelEmBluRay);
        return this;
    }

    public FilmeBuilder setIndicadoAoOscar(boolean indicadoAoOscar) {
        filme.setIndicadoAoOscar(indicadoAoOscar);
        return this;
    }

    public FilmeBuilder setVencedorDoOscar(boolean vencedorDoOscar) {
        filme.setVencedorDoOscar(vencedorDoOscar);
        return this;
    }
}
