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
import Model.Gerenciamento;

public class InterfaceDeUsuario {
	
	private Scanner entrada = new Scanner(System.in);
	
	private Gerenciamento exibir = new Gerenciamento();
	
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
	
	private void cadastros() throws ExceptionHorarioJaCadastrado, ParseException, ExceptionFilmeJaCadastrado {
        int opcadastro = escolherCadastro();
        while(opcadastro != 0 ){
          
            switch(opcadastro){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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

	
	
}
