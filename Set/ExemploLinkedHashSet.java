package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		System.out.println("1--------------------------------------");
		
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica);
		System.out.println("2--------------------------------------");
		
		System.out.println("Tamanho: " + sequenciaNumerica.size());
		System.out.println("3--------------------------------------");
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		while (iterator.hasNext()) {
			System.out.println("-> " + iterator.next());
		}
		System.out.println("4--------------------------------------");
		
		for (Integer numero : sequenciaNumerica) {
			System.out.println("--> " + numero);
		}
		System.out.println("5--------------------------------------");
		
		System.out.println("sequenciaNumericaVazia: " + sequenciaNumerica.isEmpty());
		System.out.println("6--------------------------------------");
		
		sequenciaNumerica.clear();
		System.out.println(sequenciaNumerica);
		System.out.println("sequenciaNumericaVazia: " + sequenciaNumerica.isEmpty());
		System.out.println("7--------------------------------------");
		
		System.out.println("8--------------------------------------");
		
	}

}
