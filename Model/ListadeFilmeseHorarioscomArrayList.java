package Model;

import java.util.ArrayList;

import Cinema.Funcionario;
import Cinema.Horario;
import Cinema.Sala;
import Filme.Genero;

public class ListadeFilmeseHorarioscomArrayList implements ILista {
    
    private ArrayList<Genero> _filmesPorGenero = new ArrayList<Genero>();
    private ArrayList<Sala> _salas = new ArrayList<Sala>();
    private ArrayList<Horario> _horarios = new ArrayList<Horario>();
    private ArrayList<Funcionario> _funcionarios = new ArrayList<Funcionario>();
    
    @Override
    public ArrayList<Genero> get_filmesPorGenero() {
        return _filmesPorGenero;
    }

    @Override
    public ArrayList<Sala> get_salas() {
        return _salas;
    }

    @Override
    public ArrayList<Horario> get_horarios() {
        return _horarios;
    }

    @Override
    public ArrayList<Funcionario> get_funcionarios() {
        return _funcionarios;
    }

    @Override
    public void RegistrarFilme(Genero novoFilme) {
        _filmesPorGenero.add(novoFilme);
    }

    @Override
    public void RegistrarFuncionario(Funcionario novoFuncionario) {
        _funcionarios.add(novoFuncionario);        
    }

    @Override
    public void RegistrarHorario(Horario novoHorario) {
        _horarios.add(novoHorario);        
    }

    @Override
    public void RegistrarSala(Sala novaSala) {
        _salas.add(novaSala);        
    }
}
