package Model;

import java.io.Serializable;


public interface ILista<T extends Comparable<T>> extends Serializable{
    
	public void adicionar(T objeto);
	// adiciona um objeto Produto incluindo-o no final da Lista 

	public int tamanho();
	// retorna o "tamanho" da Lista, ou seja, a quantidade de produtos presentes na Lista

	public T get(int indice);
	// retorna o Produto que est� na posi��o indicada pelo �ndice na Lista

	public void ordena();

    public void set(int j, T Object);

}
