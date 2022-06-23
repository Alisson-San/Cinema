package Model;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public interface ILista {
    
    public void RegistrarFilme(Genero novoFilme);

    public void RegistrarFuncionario(Funcionario novoFuncionario);

    public void RegistrarHorario(Horario novoHorario);

    public void RegistrarSala(Sala novaSala);

}
