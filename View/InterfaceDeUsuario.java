package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
import Model.Exibicao;

public class InterfaceDeUsuario {
	
	private Scanner entrada = new Scanner(System.in);
	
	private Exibicao exibir;
	
	int i;
	public void menu(){
		
		int opcao = this.escolherOpcao();
		while(opcao != 0) {
			switch(opcao) {
			case 1://cadastrar um filme
				try {
					this.cadastroDeFilme();
				} catch (ParseException erro) {
					System.out.println(erro.getMessage());
				}
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
			opcao = this.escolherOpcao();
		}
	}
	
	private int escolherOpcao() {
		System.out.println("0.Sair");
		System.out.println("1.Cadastrar filme");
		System.out.println("2.Cadastrar funcionario");
		System.out.println("3.Cadastras sala");
		System.out.println("4.Apresentar filmes");
		System.out.println("5.Apresentar funcionarios");
		System.out.println("6.Consultar filmes e salas");
		return entrada.nextInt();
	}
	
	private void cadastroDeFilme() throws ParseException {
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
