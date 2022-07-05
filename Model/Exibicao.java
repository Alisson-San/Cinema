package Model;

import java.util.ArrayList;
import java.io.Serializable;
import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public class Exibicao{

    private static final long serialVersionUID = 123L;
    
    private Genero filme;
    private Funcionario func;
    private Horario hora;
    private Sala sala;
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Genero getFilme() {
        return filme;
    }

    public void setFilme(Genero filme) {
        this.filme = filme;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Horario getHora() {
        return hora;
    }

    public void setHora(Horario hora) {
        this.hora = hora;
    }
} 
