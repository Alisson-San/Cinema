package Model;

import java.util.ArrayList;
import java.io.Serializable;
import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public class Exibicao implements Serializable,Comparable<Exibicao>{

    private static final long serialVersionUID = 123L;
    
    private int codigo;
    private Genero filme;
    private Funcionario func;
    private Sala sala;
    private Horario hora;

    public Exibicao(int codigo, Genero filme, Funcionario listaDeFuncionarios, Sala sala, Horario hora) {
        this.codigo = codigo;
        this.filme = filme;
        this.func = listaDeFuncionarios;
        this.sala = sala;
        this.hora = hora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }


    public Horario getHora() {
        return hora;
    }

    public void setHora(Horario hora) {
        this.hora = hora;
    }

    public Funcionario getListaDeFuncionarios() {
        return func;
    }

    public void setListaDeFuncionarios(Funcionario listaDeFuncionarios) {
        this.func = listaDeFuncionarios;
    }

    public Genero getFilme() {
        return filme;
    }

    public void setFilme(Genero filme) {
        this.filme = filme;
    }

    @Override
    public int compareTo(Exibicao o) {
        int codigoReceptor = this.getCodigo();
		int codigoParametro = o.getCodigo();
		if(codigoReceptor < codigoParametro) {
			return -1;
		}
		else {
			if(codigoReceptor > codigoParametro) {
				return 1;
			}
		}
		return 0;
    }

    

    
} 
