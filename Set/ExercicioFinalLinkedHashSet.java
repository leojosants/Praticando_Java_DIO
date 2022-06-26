package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioFinalLinkedHashSet {

	public static void main(String[] args) {

	// APLICANDO EM LINKEDHASHSET //
		System.out.println("// APLICANDO EM LINKEDHASHSET //");
		
		// CRIE UM SET E EXECUTE AS SEGUINTES OPERACOES
		System.out.println("// CRIE UM SET E EXECUTE AS SEGUINTES OPERACOES");
		TreeSet<Integer> numerosLinkedHashSet = new TreeSet<Integer>();
		System.out.println(numerosLinkedHashSet);
		System.out.println("1----------------------------------\n");
		
		// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3
		System.out.println("// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3");
		numerosLinkedHashSet.add(3);
		numerosLinkedHashSet.add(88);
		numerosLinkedHashSet.add(20);
		numerosLinkedHashSet.add(44);
		numerosLinkedHashSet.add(3);
		System.out.println(numerosLinkedHashSet);
		System.out.println("2----------------------------------\n");
		
		// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE
		System.out.println("// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE");
		System.out.println("-> " + numerosLinkedHashSet);
	
		Iterator<Integer> numerosLinkedHashSetIterator = numerosLinkedHashSet.iterator();
		while (numerosLinkedHashSetIterator.hasNext()) {
			System.out.println("--> " + numerosLinkedHashSetIterator.next());
		}
		
		for (Integer numero : numerosLinkedHashSet) {
			System.out.println("---> " + numero);
		}
		System.out.println("3----------------------------------\n");
		
		// REMOVA O PRIMEIRO ITEM DO SET
		System.out.println("// REMOVA O PRIMEIRO ITEM DO SET");
		System.out.println(numerosLinkedHashSet);
		System.out.println(numerosLinkedHashSet.pollFirst());
		System.out.println(numerosLinkedHashSet);
		System.out.println("4----------------------------------\n");
		
		// ADICIONE UM NOVO NUMERO NO SET: 23
		System.out.println("// ADICIONE UM NOVO NUMERO NO SET: 23");
		System.out.println(numerosLinkedHashSet);
		System.out.println("numero 23 adicionado? " + numerosLinkedHashSet.add(23));
		System.out.println(numerosLinkedHashSet);
		System.out.println("5----------------------------------\n");

		// VERIFIQUE O TAMANHO DO SET
		System.out.println("// VERIFIQUE O TAMANHO DO SET");
		System.out.println("tamanhos: " + numerosLinkedHashSet.size());
		System.out.println("6----------------------------------\n");

		// VERIFIQUE SE O SET ESTÁ VAZIO
		System.out.println("// VERIFIQUE SE O SET ESTÁ VAZIO");
		System.out.println(numerosLinkedHashSet);
		System.out.println("numerosLinkedHashSet vazio? " + numerosLinkedHashSet.isEmpty());
		System.out.println("7----------------------------------\n");


	}

}
