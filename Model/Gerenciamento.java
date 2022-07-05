package Model;

import java.io.Serializable;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Exception.ExceptionFilmeJaCadastrado;
import Exception.ExceptionFuncionarioJaCadastrado;
import Exception.ExceptionSalaJaCadastrada;
import Filme.Filme;
import Filme.Genero;

public class Gerenciamento implements Serializable{
    
    private static final long serialVersionUID = 234L;
	private ILista<Exibicao> exibicoes = new ListaComArrayList<Exibicao>();
    private ILista<Filme> filmes = new ListaComArrayList<Filme>();
    private ILista<Funcionario> funcionarios = new ListaComArrayList<Funcionario>();
    private ILista<Sala> salas = new ListaComArrayList<Sala>();


    public void RegistraFilme(Genero filme) throws ExceptionFilmeJaCadastrado{
        
        for(int i = 0; i < filmes.tamanho(); i++ ){
            
            if(filmes.get(i).getNome().equals(filme.getNome()) || filmes.get(i).getId() == filme.getId()){
            throw new ExceptionFilmeJaCadastrado();
            }
        }

        filmes.adicionar(filme);
    }

    public void RegistraFuncionario(Funcionario func) throws ExceptionFuncionarioJaCadastrado{
        
        for(int i = 0; i < funcionarios.tamanho(); i++ ){
            
            if(funcionarios.get(i).getNome().equals(func.getNome()) || funcionarios.get(i).getCodFuncionario() == func.getCodFuncionario()){
            throw new ExceptionFuncionarioJaCadastrado();
            }
        }

        funcionarios.adicionar(func);
    }

    public void RegistraSala(Sala sala) throws ExceptionSalaJaCadastrada{
        
        for(int i = 0; i < salas.tamanho(); i++ ){
            
            if(salas.get(i).getNome().equals(sala.getNome()) || salas.get(i).getNumeroSala() == sala.getNumeroSala()){
            throw new ExceptionSalaJaCadastrada();
            }
        }

        salas.adicionar(sala);
    }

}
