package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploArvoreBinariaTreeSet {

	public static void main(String[] args) {

		TreeSet<String> treeCapitais = new TreeSet<String>();
		
		// Adiciona ordenando em órdem alfabética
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		System.out.println("1--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Primeiro elemento da árvore: " + treeCapitais.first());
		System.out.println("2--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("Último elemento da árvore: " + treeCapitais.last());
		System.out.println("3--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("Elemento acima de 'Florianópolis': " + treeCapitais.lower("Florianópolis"));
		System.out.println("4--------------------------------------\n");

		System.out.println(treeCapitais);
		System.out.println("Elemento abaixo à 'Florianópolis': " + treeCapitais.higher("Florianópolis"));
		System.out.println("5--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Primeiro elemento da árvore que será removido: " + treeCapitais.pollFirst());
		System.out.println(treeCapitais);
		System.out.println("6--------------------------------------\n");
		
		System.out.println(treeCapitais);
		System.out.println("Ultimo elemento da árvore que será removido: " + treeCapitais.pollLast());
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
