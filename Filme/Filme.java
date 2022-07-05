package Filme;

import java.io.Serializable;
import java.util.Date;

public abstract class Filme implements Serializable,Comparable<Filme>{
    private int id;
    private String nome;
    private Date lancamento;

    public Filme(int id, String nome, Date lancamento) {
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
    
    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }
   
}