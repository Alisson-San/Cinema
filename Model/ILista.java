package Model;

import java.util.ArrayList;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public interface ILista {
    
    public void RegistrarFilme(Genero novoFilme);

    public void RegistrarFuncionario(Funcionario novoFuncionario);

    public void RegistrarHorario(Horario novoHorario);

    public void RegistrarSala(Sala novaSala);

    public ArrayList<Funcionario> get_funcionarios();

    public ArrayList<Horario> get_horarios();

    public ArrayList<Sala> get_salas();

    public ArrayList<Genero> get_filmesPorGenero();
}
