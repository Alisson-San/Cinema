package Filme;

import java.io.Serializable;

public abstract class Filme implements Serializable,Comparable<Filme>{
    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String lancamento;

    public Filme(int id, String nome, String lancamento) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }
   
    public String toString(){
        return "ID:" +this.getId()+ "\n Nome:"+ this.getNome();
    };
}