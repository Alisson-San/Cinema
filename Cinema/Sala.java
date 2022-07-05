package Cinema;

import java.io.Serializable;

public class Sala implements Serializable,Comparable<Sala>{
    private int numeroSala;
    private String nome;
    private int capacidade;
    
    public Sala(int numeroSala, String nome, int capacidade) {
        this.numeroSala = numeroSala;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    @Override
    public int compareTo(Sala o) {
        int codigoReceptor = this.getNumeroSala();
		int codigoParametro = o.getNumeroSala();
		if(codigoReceptor < codigoParametro) {
			return -1;
		}
		else {
			if(codigoReceptor > codigoParametro) {
				return 1;
			}
		}
		return 0;
    }
    
}
