package Cinema;

import java.io.Serializable;

public class Funcionario implements Serializable,Comparable<Funcionario> {
    private int codFuncionario;
    private String nome;

    public Funcionario(int codFuncionario, String nome) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    @Override
    public int compareTo(Funcionario o) {
        int codigoReceptor = this.getCodFuncionario();
		int codigoParametro = o.getCodFuncionario();
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
