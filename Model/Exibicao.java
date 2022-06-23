package Model;

import java.util.Date;

import Filme.Genero;

public class Exibicao{

    private ILista _filme  = new ListadeFilmeseHorarioscomArrayList();

    public void inserirFIlme(int codigo, String nome, Date lancamento,String genero,int faixaEtaria){
        _filme.RegistrarFilme(new Genero(codigo,nome,lancamento,genero,faixaEtaria));
    }

} 
