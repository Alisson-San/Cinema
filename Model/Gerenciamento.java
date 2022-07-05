package Model;

import java.io.Serializable;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Filme;
import Filme.Genero;

public class Gerenciamento implements Serializable{
    
    private static final long serialVersionUID = 234L;
	private ILista<Exibicao> exibicoes = new ListaComArrayList<Exibicao>();
    private ILista<Filme> filmes = new ListaComArrayList<Filme>();
    private ILista<Funcionario> funcionarios = new ListaComArrayList<Funcionario>();
    private ILista<Horario> listaHorarios = new ListaComArrayList<Horario>();
    private ILista<Sala> salas = new ListaComArrayList<Sala>();


    public void RegistraFilme(){
        
    }

}
