package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Cinema.Horario;
import Exception.ExceptionFilmeJaCadastrado;
import Exception.ExceptionHorarioJaCadastrado;
import Filme.Genero;
import Model.Exibicao;

public class InterfaceDeUsuario {
	
	private Scanner entrada = new Scanner(System.in);
	
	private Exibicao exibir = new Exibicao();
	
	int i;
	public void menu() throws ExceptionHorarioJaCadastrado{
		
		int opcao = this.escolherOpcao();
		while(opcao != 0) {
            try{
			switch(opcao) {
			case 1://cadastrar um filme
                cadastros();
			break;
			case 2://cadastrar uma sala
				this.cadastroDeSala();
			break;
			case 3://cadastrar um funcionario
				this.cadastroDeFuncionario();
			break;
			case 4://apresentar informa��es de um filme
				this.apresentarFilmes();
			break;
			case 5://apresentar informa��es de um funcionario
				this.apresentarFuncionario();
			break;
			case 6://consultar qual sala e horario passar� um filme
				this.consultarSalas();
			break;
			}
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

			opcao = this.escolherOpcao();
		}
	}
	
	private void cadastros() throws ExceptionHorarioJaCadastrado, ParseException, ExceptionFilmeJaCadastrado {
        int opcadastro = escolherCadastro();
        while(opcadastro != 0 ){
          
            switch(opcadastro){
                case 1:
                    cadastroDeFilme();
                    break;
                case 2:
                    cadastroDeSala();
                    break;
                case 3:
                    cadastroDeHorario();
                    break;
                case 4:
                    cadastroDeFuncionario();
                    break;
                case 5:
                    cadastroDeExibicao();
                    break;
                default:
                    System.out.println("Opção não Reconhecida\n Escolha novamente \n");
            }

            opcadastro = escolherCadastro();
        }
    }

	private int escolherCadastro() {
        System.out.println("0.Sair");
		System.out.println("1.Cadastrar Filme");
		System.out.println("2.Cadastrar informações de Sala");
		System.out.println("3.Cadastrar Horario");
        System.out.println("4.Cadastrar Funcionario");
        System.out.println("5.Cadastrar uma Exibição"); 
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

    private void cadastroDeExibicao() {
    }

    private void cadastroDeHorario() throws ExceptionHorarioJaCadastrado {
        System.out.println("Digite um codigo de horario de exibição: ");
        int codHorario = entrada.nextInt();
        System.out.println("Digite um horario: ");
        int novoHorario = entrada.nextInt();
        while(novoHorario < 0 || novoHorario > 24){
            System.out.println("O horario deve ser entre 0 e 23, Digite novamente o horario: ");
            novoHorario = entrada.nextInt();
        }

        ArrayList<Horario> Horarios = exibir.listaDeHorarios();
    
        for (Horario horario : Horarios) {
            if(horario.getCodHorario() == codHorario || novoHorario == horario.getHorario()){
                throw new ExceptionHorarioJaCadastrado();
            }
        }

        exibir.InserirHorario(novoHorario, codHorario);

    }
	
	private void cadastroDeFilme() throws ParseException, ExceptionFilmeJaCadastrado {
		entrada.nextLine();
		System.out.println("ID do Filme (apenas digitos)");
		int id = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Nome do Filme");
		String nomeFime = entrada.nextLine();
		System.out.println("Digite a data no formato: dd/MM/yyyy");
		String data = entrada.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(data);
		System.out.println("Digite o genero do filme");
		String genero = entrada.nextLine();
		System.out.println("Digite a faixa etaria do filme");
		int faixaEtaria = entrada.nextInt();
		
		ArrayList<Genero> Filmes = exibir.getFilmes();

		for (Genero filme : Filmes) {
			if(filme.getId() == id || filme.getNome() == nomeFime){
				throw new ExceptionFilmeJaCadastrado();
			}
		}
		
		exibir.InserirFilme(id, nomeFime, date, genero, faixaEtaria);
		
	}
	
	private void cadastroDeSala() {
		entrada.nextLine();
		System.out.println("Digite o nome da sala");
		String nome = entrada.nextLine();
		System.out.println("Digite o numero da sala");
		int numeroSala = entrada.nextInt();
		System.out.println("Digite a capacidade da sala");
		int capacidade = entrada.nextInt();
		
		exibir.InserirSala(numeroSala, nome, capacidade);
	}
	
	private void cadastroDeFuncionario() {
		entrada.nextLine();
		System.out.println("Digite o nome do funcionario");
		String nome = entrada.nextLine();
		System.out.println("Digite o codigo de funcionario");
		int codFuncionario = entrada.nextInt();
		
		exibir.InserirFuncionario(codFuncionario, nome);
	}

	private void apresentarFilmes() {
		exibir.ListarFilmes(null);
		
	}

	private void apresentarFuncionario() {
	
	}

	
	private void consultarSalas() {
		
	}
	
}
