package Model;

import java.util.ArrayList;
import java.util.Date;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public class Exibicao{

    private ILista _registros  = new ListadeFilmeseHorarioscomArrayList();

    public void InserirFilme(int codigo, String nome, Date lancamento,String genero,int faixaEtaria){
        _registros.RegistrarFilme(new Genero(codigo,nome,lancamento,genero,faixaEtaria));
    }

    public void InserirSala(int numeroSala, String nome, int capacidade){
        _registros.RegistrarSala(new Sala(numeroSala, nome, capacidade));
    }

    public void InserirFuncionario(int codFuncionario, String nome) {
        _registros.RegistrarFuncionario(new Funcionario(codFuncionario, nome));
    }

    public void InserirHorario(int horario, int codHorario){
        _registros.RegistrarHorario(new Horario(horario, codHorario));
    }

    public void RegistrarExibicao(){
        ListarFilmes(_registros.get_filmesPorGenero());
        ListarSalas(_registros.get_salas());
    }

    public void ListarSalas(ArrayList<Sala> listaSalas) {
        for (Sala salas : listaSalas) 
        {
            System.out.println("Numero da sala: " +salas.getNumeroSala()+ "\n");
        	System.out.println("Nome da sala: " +salas.getNome()+ "\n");
        	System.out.println("Capacidade da sala: " +salas.getCapacidade()+ "\n");
        }
    }

    public void ListarFilmes(ArrayList<Genero> listaFilmes) {
        for (Genero filme : listaFilmes) 
        {
            System.out.println("Codigo de Registro: " +filme.getId()+"\n");
            System.out.println("Nome do Filme: " +filme.getNome()+"\n");        
            System.out.println("Ano de Lançamento: " +filme.getLancamento()+"\n");    
            System.out.println("Genero: " +filme.getGenero()+"\n");    
            System.out.println("Faixa Etaria Minima: " +filme.getFaixaEtaria()+"\n");    
        }

    }
    
} 
