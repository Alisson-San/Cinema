package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Cinema.Funcionario;
import Cinema.Sala;
import Filme.Filme;

public class Persistencia {
	int i, j;
	
	public void salvarExibicao(ILista <Exibicao> Exibi) {
		try{
			ObjectOutputStream escreve = new ObjectOutputStream(new FileOutputStream("cinemas.obj"));
			escreve.writeObject(Exibi);
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
	}
	
	public ILista<Exibicao> CarregarExibicao() {
		ILista<Exibicao> cinemas = new ListaComArrayList<>();
		try{
			ObjectInputStream le = new ObjectInputStream(new FileInputStream("cinemas.obj"));
			cinemas = (ILista<Exibicao>) le.readObject();
			return cinemas;
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
		catch(ClassNotFoundException error) {
			System.out.println(error);
		}
		return cinemas;
	}
	
	/*----------------------------------------------------------------------------------------------*/
	public void salvarSalas(ILista <Sala> salas) {
		try{
			ObjectOutputStream escreve = new ObjectOutputStream(new FileOutputStream("salas.obj"));
			escreve.writeObject(salas);
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
	}
	
	public ILista<Sala> carregaSalas() {
		ILista<Sala> salas = new ListaComArrayList<>();
		try{
			ObjectInputStream le = new ObjectInputStream(new FileInputStream("salas.obj"));
			salas = (ILista<Sala>) le.readObject();
			return salas;
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
		catch(ClassNotFoundException error) {
			System.out.println(error);
		}
		return salas;
	}
	/*----------------------------------------------------------------------------------------------*/
	public void salvarFuncionarios(ILista <Funcionario> funcionarios) {
		try{
			ObjectOutputStream escreve = new ObjectOutputStream(new FileOutputStream("funcionarios.obj"));
			escreve.writeObject(funcionarios);
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
	}
	
	public ILista<Funcionario> carregaFuncionarios() {
		ILista<Funcionario> funcionarios = new ListaComArrayList<>();
		try{
			ObjectInputStream le = new ObjectInputStream(new FileInputStream("funcionarios.obj"));
			funcionarios = (ILista<Funcionario>) le.readObject();
			return funcionarios;
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
		catch(ClassNotFoundException error) {
			System.out.println(error);
		}
		return funcionarios;
	}
	/*----------------------------------------------------------------------------------------------*/
	public void salvarFilme(ILista <Filme> filmes) {
		try{
			ObjectOutputStream escreve = new ObjectOutputStream(new FileOutputStream("filmes.obj"));
			escreve.writeObject(filmes);
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
	}
	
	public ILista<Filme> carregaFilmes() {
		ILista<Filme> filmes = new ListaComArrayList<>();
		try{
			ObjectInputStream le = new ObjectInputStream(new FileInputStream("filmes.obj"));
			filmes = (ILista<Filme>) le.readObject();
			return filmes;
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}
		catch(IOException error) {
			System.out.println(error);
		}
		catch(ClassNotFoundException error) {
			System.out.println(error);
		}
		return filmes;
	}
}