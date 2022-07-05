package Model;

import java.io.Serializable;
import java.util.ArrayList;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Exception.ExceptionFilmeJaCadastrado;
import Exception.ExceptionFuncionarioJaCadastrado;
import Exception.ExceptionSalaJaCadastrada;
import Filme.Filme;
import Filme.Genero;

public class Gerenciamento implements Serializable{
    
    private transient Persistencia persist = new Persistencia();
	private transient Ordenador ordenador = new Ordenador();

    private static final long serialVersionUID = 234L;
	private ILista<Exibicao> exibicoes = new ListaComArrayList<Exibicao>();
    private ILista<Filme> filmes = new ListaComArrayList<Filme>();
    private ILista<Funcionario> funcionarios = new ListaComArrayList<Funcionario>();
    private ILista<Sala> salas = new ListaComArrayList<Sala>();


	public void carregarDados() {
		exibicoes = persist.CarregarExibicao();
		salas = persist.carregaSalas();
		filmes = persist.carregaFilmes();
		funcionarios = persist.carregaFuncionarios();
	}

    public void salvarDados() {
		persist.salvarExibicao(exibicoes);
		persist.salvarSalas(salas);
		persist.salvarFilme(filmes);
		persist.salvarFuncionarios(funcionarios);
	}

    public void RegistraFilme(Genero filme) throws ExceptionFilmeJaCadastrado{
        
        for(int i = 0; i < filmes.tamanho(); i++ ){
            
            if(filmes.get(i).getNome().equals(filme.getNome()) || filmes.get(i).getId() == filme.getId()){
            throw new ExceptionFilmeJaCadastrado();
            }
        }

        filmes.adicionar(filme);
    }

    public void RegistraExibicao(Exibicao exibi){
        

        exibicoes.adicionar(exibi);
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

    public Genero AtribuirFilme(int id){
        Genero temp = null;

        for(int i = 0; i < filmes.tamanho();i++){
            temp = (Genero) filmes.get(i);
        }
        return temp;
    }

    public Sala AtribuirSala(int id){
        Sala temp = null;

        for(int i = 0; i < salas.tamanho();i++){
            temp = salas.get(i);
        }
        return temp;
    }

    public Funcionario AtribuirFunc(int id){
        Funcionario temp = null;

        for(int i = 0; i < funcionarios.tamanho();i++){
            temp = funcionarios.get(i);
        }
        return temp;
    }

    public ArrayList<Integer> OcupacaHoraio(Sala auxSala){
        ArrayList<Integer> horarios =new ArrayList<>();

        if(exibicoes.tamanho() !=0){
        for(int i = 0; i < exibicoes.tamanho(); i++){
            if(exibicoes.get(i).getSala().getNumeroSala() == auxSala.getNumeroSala()){
                horarios.add(exibicoes.get(i).getSala().getNumeroSala());
            }
        }
    }
        return horarios;
        
    } 

    private void mostrarTodasExibicoes() { 
		for(int i=0; i<filmes.tamanho(); i++) {
			System.out.println(filmes.get(i).toString());
		}
	}
    
    public void ordenar() {
		System.out.println("Antes:");
		mostrarTodasExibicoes(); //Usado apenas para mostrar a ordenacao
		System.out.println("");
		filmes = (ILista<Filme>) ordenador.ordenaFilme(filmes);
		System.out.println("Depois:");
		mostrarTodasExibicoes(); //Usado apenas para mostrar a ordenacao
	}
}
