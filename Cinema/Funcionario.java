package Cinema;

public class Funcionario {
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
}
