package Filme;

import java.util.Date;

public class Genero extends Filme{
    
    private String genero;
    private int faixaEtaria;

    public Genero(int id, String nome, Date lancamento, String genero, int faixaEtaria) {
        super(id, nome, lancamento);
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}