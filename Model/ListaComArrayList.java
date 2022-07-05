package Model;

import java.util.ArrayList;


public class ListaComArrayList<T extends Comparable<T>> implements ILista<T>{

    private static final long serialVersionUID = 1765L;
    private ArrayList<T> objetos = new ArrayList<>();

    @Override
    public void adicionar(T objeto) {
        objetos.add(objeto);
        
    }

    @Override
    public int tamanho() {
        return objetos.size();
    }

    @Override
    public T get(int indice) {
        return objetos.get(indice);
    }

    public void set(int indice, T object){
        objetos.set(indice, object);
    }

    @Override
    public void ordena() {
        T receptor, parametro;
		int tamanho = objetos.size();
		for(int i=1 ; i<tamanho ; i++) {
			int j=i;
			receptor = objetos.get(j);
			parametro = objetos.get(j-1);
			while(j>0 && (receptor.compareTo(parametro))<0) {
				objetos.set(j, parametro);
				objetos.set(j-1, receptor);				
				j--;
			}
		}
        
    }

}
