package org.example;

import java.util.Date;
import java.util.List;

public class Filme {
    private String nome;
    private Date dataLancamento;
    private String categoria;
    private int notaAvaliacao;
    private int quantidadePremios;
    private String diretor;
    private String sinopse;
    private String idiomaOriginal;
    private int duracao;
    private List<String> elenco;
    private String estudio;
    private boolean disponivelEmBluRay;
    private boolean indicadoAoOscar;
    private boolean vencedorDoOscar;

    public Filme(){
        this.nome = "";
        this.duracao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public int getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(int quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public boolean isDisponivelEmBluRay() {
        return disponivelEmBluRay;
    }

    public void setDisponivelEmBluRay(boolean disponivelEmBluRay) {
        this.disponivelEmBluRay = disponivelEmBluRay;
    }

    public boolean isIndicadoAoOscar() {
        return indicadoAoOscar;
    }

    public void setIndicadoAoOscar(boolean indicadoAoOscar) {
        this.indicadoAoOscar = indicadoAoOscar;
    }

    public boolean isVencedorDoOscar() {
        return vencedorDoOscar;
    }

    public void setVencedorDoOscar(boolean vencedorDoOscar) {
        this.vencedorDoOscar = vencedorDoOscar;
    }
}
