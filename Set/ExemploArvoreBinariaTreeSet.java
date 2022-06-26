package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploArvoreBinariaTreeSet {

	public static void main(String[] args) {

		TreeSet<String> treeCapitais = new TreeSet<String>();
		
		// Adiciona ordenando em �rdem alfab�tica
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florian�polis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		System.out.println("1--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Primeiro elemento da �rvore: " + treeCapitais.first());
		System.out.println("2--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("�ltimo elemento da �rvore: " + treeCapitais.last());
		System.out.println("3--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("Elemento acima de 'Florian�polis': " + treeCapitais.lower("Florian�polis"));
		System.out.println("4--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("Elemento abaixo � 'Florian�polis': " + treeCapitais.higher("Florian�polis"));
		System.out.println("5--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Primeiro elemento da �rvore que ser� removido: " + treeCapitais.pollFirst());
		System.out.println(treeCapitais);
		System.out.println("6--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Ultimo elemento da �rvore que ser� removido: " + treeCapitais.pollLast());
		System.out.println(treeCapitais);
		System.out.println("7--------------------------------------\n");
		
		Iterator<String> iterator = treeCapitais.iterator();
		while (iterator.hasNext()) {
			System.out.println("-> " + iterator.next());
		}
		System.out.println("8--------------------------------------\n");
		
		for (String capital : treeCapitais) {
			System.out.println("--> " + capital);
		}
		System.out.println("9--------------------------------------\n");
		
		System.out.println("treeCapitais vazia: " + treeCapitais.isEmpty());
		System.out.println("10--------------------------------------\n");
		
		treeCapitais.clear();
		System.out.println(treeCapitais);
		System.out.println("treeCapitais vazia: " + treeCapitais.isEmpty());
		System.out.println("11--------------------------------------\n");
		System.out.println("9--------------------------------------\n");
		
	}

}
