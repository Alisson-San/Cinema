package Model;


import Cinema.Funcionario;
import Cinema.Sala;
import Filme.Filme;

public class Ordenador {
	int i, j;
	
	
	public ILista<Sala> ordenaSala(ILista<Sala> salas) {
		Sala receptorSala, parametroSala;
		int tamanhoSala = salas.tamanho();

		for(i=0; i<tamanhoSala; i++) {
			for(j=0; j<tamanhoSala; j++) {
				receptorSala = salas.get(i);
				parametroSala = salas.get(j);
				if(receptorSala.compareTo(parametroSala) > 0) {
					salas.set(i, parametroSala);
					salas.set(j, receptorSala);
				}
			}
		}
		return salas;
	}
	
	public ILista<Filme> ordenaFilme(ILista<Filme> filmes) {
		Filme receptorFilme, parametroFilme;
		int tamanhoFilme = filmes.tamanho();

		for(i=0; i<tamanhoFilme; i++) {
			for(j=0; j<tamanhoFilme; j++) {
				receptorFilme = filmes.get(i);
				parametroFilme = filmes.get(j);
				if(receptorFilme.compareTo(parametroFilme) > 0) {
					filmes.set(i, parametroFilme);
					filmes.set(j, receptorFilme);
				}
			}
		}
		return filmes;
	}
	
	public ILista<Funcionario> ordenaFuncionario(ILista<Funcionario> osFuncionarios) {
		Funcionario receptorFuncionario, parametroFuncionario;
		int tamanhoFuncionario = osFuncionarios.tamanho();

		for(i=0; i<tamanhoFuncionario; i++) {
			for(j=0; j<tamanhoFuncionario; j++) {
				receptorFuncionario = osFuncionarios.get(i);
				parametroFuncionario = osFuncionarios.get(j);
				if(receptorFuncionario.compareTo(parametroFuncionario) > 0) {
					osFuncionarios.set(i, parametroFuncionario);
					osFuncionarios.set(j, receptorFuncionario);
				}
			}
		}
		return osFuncionarios;
	}

	public ILista<Exibicao> ordenaExibicao(ILista<Exibicao> exibicao) {
		Exibicao receptorFuncionario, parametroFuncionario;
		int tamanhoFuncionario = exibicao.tamanho();

		for(i=0; i<tamanhoFuncionario; i++) {
			for(j=0; j<tamanhoFuncionario; j++) {
				receptorFuncionario = exibicao.get(i);
				parametroFuncionario = exibicao.get(j);
				if(receptorFuncionario.compareTo(parametroFuncionario) > 0) {
					exibicao.set(i, parametroFuncionario);
					exibicao.set(j, receptorFuncionario);
				}
			}
		}
		return exibicao;
	}

}
