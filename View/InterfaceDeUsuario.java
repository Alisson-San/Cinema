package View;


import java.util.Scanner;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Exception.ExceptionFilmeJaCadastrado;
import Exception.ExceptionFuncionarioJaCadastrado;
import Exception.ExceptionHorarioJaCadastrado;
import Exception.ExceptionOpcaoNaoReconhecida;
import Exception.ExceptionSalaJaCadastrada;
import Exception.ExceptionSemHorarioDisponivel;
import Exception.ExceptionSemNadaCadastrado;
import Filme.Filme;
import Filme.Genero;
import Model.Exibicao;
import Model.Gerenciamento;
import Model.ILista;
import Model.ListaComArrayList;

public class InterfaceDeUsuario {
	
	private Scanner entrada = new Scanner(System.in);
	
	private Gerenciamento _gerencia = new Gerenciamento();

	private int escolherCadastro() {
        System.out.println("0.voltar");
		System.out.println("1.Cadastrar Filme");
		System.out.println("2.Cadastrar informações de Sala");
        System.out.println("3.Cadastrar Funcionario");
        System.out.println("4.Cadastrar uma Exibição"); 
		return entrada.nextInt();
    }

    private int escolherOpcao() {
		System.out.println("0.Sair");
		System.out.println("1.Cadastros");
		System.out.println("2.Listagem de Informações");
		System.out.println("3.Listar Todas as Exibições");
        System.out.println("4.Verificar Horarios de Exibição de um Filme");
		return entrada.nextInt();
	}
	
	private int escolherListagem() {
		System.out.println("0.Sair");
		System.out.println("1.Exibições");
		System.out.println("2.Filmes");
		System.out.println("3.Funcionarios");
        System.out.println("4.Salas");
		return entrada.nextInt();
	}

	int i;
	public void menu() throws ExceptionHorarioJaCadastrado{
		
		int opcao = this.escolherOpcao();
		while(opcao != 0) {
            try{
			switch(opcao) {
			case 1://Cadastros
                cadastros();
			break;
			case 2://Listagem de Informações
				Listagem();
			break;
			case 3://cadastrar um funcionario
			break;
			case 4://apresentar informa��es de um filme
			break;
			case 5://apresentar informa��es de um funcionario
			break;
			case 6://consultar qual sala e horario passar� um filme
			break;
			default:
			 
			}
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

			opcao = this.escolherOpcao();
		}
	}
	
	private void cadastros(){
        int opcadastro = escolherCadastro();
        while(opcadastro != 0 ){
			try {
            switch(opcadastro){
                case 1: //Cadastro Filme
				CadastroFilme();
                    break;
                case 2: // Cadastro Sala
				CadastroDeSala();
                    break;
                case 3://Cadastro Funcionario
				CadastroDeFuncionario();
                    break;
                case 4:// cadastro Exibição
				CadastroDeExibicao();
                    break;
                default:
                    throw new ExceptionOpcaoNaoReconhecida();
			}
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
            opcadastro = escolherCadastro();
        }
    }

	private void CadastroDeExibicao() throws ExceptionSemNadaCadastrado{
		System.out.println("ID de Registro para a Exibição:");
		int id = entrada.nextInt();
		System.out.println("ID de Registro do Filme que ira Exibir:");
		int idFlme = entrada.nextInt();
		Filme filmeTemp = _gerencia.AtribuirFilme(idFlme);
		System.out.println("ID de Registro da Sala:");
		int idSala = entrada.nextInt();
		Sala tempSala = _gerencia.AtribuirSala(idSala);
		System.out.println("ID de Registro do Funcionario:");
		int idFunc = entrada.nextInt();
		Funcionario tempFunc = _gerencia.AtribuirFunc(idFunc);
		
	}

	private void HorariosDisponiveis(int[] horas) throws ExceptionSemHorarioDisponivel{
		int disp = 0;

		boolean horario1 =true;
		boolean horario2 =true;
		boolean horario3 =true;
		boolean horario4 =true;
		boolean horario5 =true;
		for (int i : horas) {
			switch(i){
				case 1:
				horario1 = false;
				break;
				case 2:
				horario2 = false;
				break;
				case 3:
				horario3 = false;
				case 4:
				horario4 = false;
				case 5:
				horario5 = false;
			}
		}
		if(horario1){
		System.out.println("1. 16:00");
		disp++;
		}
		if(horario2){
		System.out.println("2. 18:00");
		disp++;
		}
		if(horario3){
		System.out.println("3. 20:00");
		disp++;
		}
		if(horario4){
		System.out.println("4. 22:00");
		disp++;
		}
		if(horario5){
		System.out.println("5. 24:00");
		disp++;
		}

		if(disp == 0)
		{
			throw new ExceptionSemHorarioDisponivel();
		}
	}
	
	private void Listagem(){
        int opcadastro = escolherListagem();
        while(opcadastro != 0 ){
			try {
            switch(opcadastro){
                case 1: // Exibição
				ListarExibicoes();
                    break;
                case 2: //  Filme
				ListarFilmes();
                    break;
                case 3:// Funcionario
				ListarFuncionarios();
                    break;
                case 4:// Sala
				ListarSalas();
                    break;
                default:
                    throw new ExceptionOpcaoNaoReconhecida();
			}
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
            opcadastro = escolherListagem();
        }
    }

	private void ListarFilmes() throws ExceptionSemNadaCadastrado {

		ListaComArrayList listaFilmes = new ListaComArrayList<>();
		listaFilmes = _gerencia.ListaDeFilmes();

		if(listaFilmes.tamanho() == 0){
		throw new ExceptionSemNadaCadastrado();
		}
		else{
		for(int i = 0 ; i < listaFilmes.tamanho();i++){
			System.out.println(listaFilmes.get(i).toString());
		}
	}
	}

	private void ListarSalas() throws ExceptionSemNadaCadastrado {

		ListaComArrayList listaSalas = new ListaComArrayList<>();
		listaSalas = _gerencia.ListaDeSalas();

		if(listaSalas.tamanho() == 0){
		throw new ExceptionSemNadaCadastrado();
		}
		else{
		for(int i = 0 ; i < listaSalas.tamanho();i++){
			System.out.println(listaSalas.get(i).toString());
		}
	}
	}

	private void ListarFuncionarios() throws ExceptionSemNadaCadastrado {

		ListaComArrayList listarFuncionarios = new ListaComArrayList<>();
		listarFuncionarios = _gerencia.ListaDeFuncionarios();

		if(listarFuncionarios.tamanho() == 0){
		throw new ExceptionSemNadaCadastrado();
		}
		else{
		for(int i = 0 ; i < listarFuncionarios.tamanho();i++){
			System.out.println(listarFuncionarios.get(i).toString());
		}
	}
	}

	private void ListarExibicoes() throws ExceptionSemNadaCadastrado {

		ListaComArrayList listaExibicoes = new ListaComArrayList<>();
		listaExibicoes = _gerencia.ListaDeExibições();

		if(listaExibicoes.tamanho() == 0){
		throw new ExceptionSemNadaCadastrado();
		}
		else{
		for(int i = 0 ; i < listaExibicoes.tamanho();i++){
			System.out.println(listaExibicoes.get(i).toString());
		}
	}
	}

	private void CadastroDeFuncionario() throws ExceptionFuncionarioJaCadastrado {
		System.out.println("Codigo de Registro de Funcionario no Cinema:");
		int codFuncionario = entrada.nextInt();
		System.out.println("Nome do Funcionario");
		entrada.nextLine();
		String nome = entrada.nextLine();

		Funcionario novoFunc = new Funcionario(codFuncionario, nome);
		_gerencia.RegistraFuncionario(novoFunc);
	}

	private void CadastroDeSala()throws ExceptionSalaJaCadastrada {
		System.out.println("Numero de Registro da Sala no Cinema");
		int numeroSala = entrada.nextInt();
		System.out.println("Nome da Sala");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println("Capacidade da Sala:");
		int capacidade = entrada.nextInt();

		Sala novaSala = new Sala(numeroSala, nome, capacidade);
		novaSala.setNome(nome);

		_gerencia.RegistraSala(novaSala);
	}

	private void CadastroFilme() throws ExceptionFilmeJaCadastrado
	{	
		System.out.println("Id de Registro do Filme no Catalogo do Cinema:");
		int id = entrada.nextInt();
		System.out.println("Nome do Filme:");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println("Data de lançamento:");
		String lancamento = entrada.nextLine();
		System.out.println("Genero:");
		String genero = entrada.nextLine();
		System.out.println("Classificação de Idade filme:");
		int faixaEtaria = entrada.nextInt();

		Genero novoFilme = new Genero(id, nome, lancamento, genero, faixaEtaria);
		_gerencia.RegistraFilme(novoFilme);
	}



	
	
}
