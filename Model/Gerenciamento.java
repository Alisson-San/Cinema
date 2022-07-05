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

    public ListaComArrayList ListaDeFilmes(){

        ListaComArrayList temp = new ListaComArrayList<>();
        for(int i = 0; i < filmes.tamanho();i++){
            temp.adicionar(filmes.get(i));
        }
        return temp;
    }

    public ListaComArrayList ListaDeExibições(){

        ListaComArrayList temp = new ListaComArrayList<>();
        for(int i = 0; i < exibicoes.tamanho();i++){
            temp.adicionar(exibicoes.get(i));
        }
        return temp;
    }

    public ListaComArrayList ListaDeSalas(){

        ListaComArrayList temp = new ListaComArrayList<>();
        for(int i = 0; i < salas.tamanho();i++){
            temp.adicionar(salas.get(i));
        }
        return temp;
    }

    public ListaComArrayList ListaDeFuncionarios(){

        ListaComArrayList temp = new ListaComArrayList<>();
        for(int i = 0; i < funcionarios.tamanho();i++){
            temp.adicionar(funcionarios.get(i));
        }
        return temp;
    }

    public Filme AtribuirFilme(int id){
        Filme temp = null;

        for(int i = 0; i < filmes.tamanho();i++){
            temp = filmes.get(i);
        }
        return temp;
    }

    public Sala AtribuirSala(int id){
        Sala temp = null;

        for(int i = 0; i < filmes.tamanho();i++){
            temp = salas.get(i);
        }
        return temp;
    }

    public Funcionario AtribuirFunc(int id){
        Funcionario temp = null;

        for(int i = 0; i < filmes.tamanho();i++){
            temp = funcionarios.get(i);
        }
        return temp;
    }

    public int[] OcupacaHoraio(Sala auxSala){
        int[] horarios = null;

        if(exibicoes.tamanho() !=0){
        for(int i = 0; i < exibicoes.tamanho(); i++){
            if(exibicoes.get(i).getSala().getNumeroSala() == auxSala.getNumeroSala()){
                horarios = add_element(exibicoes.get(i).getHora().getCodHorario(), horarios, ele)
            }
        }
    }
        return null;
        
    }

    public static int[] add_element(int n, int myarray[], int ele) 
    { 
         int i; 
 
         int newArray[] = new int[n + 1]; 
        //copy original array into new array
        for (i = 0; i &lt; n; i++) 
              newArray[i] = myarray[i]; 
 
        //add element to the new array
        newArray[n] = ele; 
 
        return newArray; 
    } 
 
}
