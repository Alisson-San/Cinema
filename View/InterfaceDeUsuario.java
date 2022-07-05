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
import Filme.Genero;
import Model.Exibicao;
import Model.Gerenciamento;

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
		System.out.println("2.Listagem de Cadastros");
		System.out.println("3.Listar Todas as Exibições");
        System.out.println("4.Verificar Horarios de Exibição de um Filme");
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
			case 2://cadastrar uma sala
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
