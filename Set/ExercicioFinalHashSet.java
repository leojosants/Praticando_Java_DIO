package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioFinalHashSet {

	public static void main(String[] args) {

		// APLICANDO EM HASHSET //
		System.out.println("// APLICANDO EM HASHSET //");
		
		// CRIE UM SET EXECUTE AS SEGUINTES OPERACOES
		System.out.println("// CRIE UM SET EXECUTE AS SEGUINTES OPERACOES");
		HashSet<Integer> numerosHashSet = new HashSet<Integer>();
		System.out.println(numerosHashSet);
		System.out.println("1----------------------------------\n");
		
		// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3
		System.out.println("// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3");
		numerosHashSet.add(3);
		numerosHashSet.add(88);
		numerosHashSet.add(20);
		numerosHashSet.add(44);
		numerosHashSet.add(3);
		System.out.println(numerosHashSet);
		System.out.println("2----------------------------------\n");

		// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE
		System.out.println("// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE");
		System.out.println("-> " + numerosHashSet);
		
		Iterator<Integer> numerosHashSetIterator = numerosHashSet.iterator();
		
		while (numerosHashSetIterator.hasNext()) {
			System.out.println("--> " + numerosHashSetIterator.next());
		}
		
		for (Integer numero : numerosHashSet) {
			System.out.println("---> " + numero);
		}
		
		System.out.println("3----------------------------------\n");
		
		// REMOVA O PRIMEIRO ITEM DO SET
		System.out.println("// REMOVA O PRIMEIRO ITEM DO SET");
		System.out.println(numerosHashSet);
		System.out.println(numerosHashSet.remove(3));
		System.out.println(numerosHashSet);
		System.out.println("4----------------------------------\n");
		
		// ADICIONE UM NOVO NUMERO NO SET: 23
		System.out.println("// ADICIONE UM NOVO NUMERO NO SET: 23");
		System.out.println(numerosHashSet);
		System.out.println(numerosHashSet.add(23));
		System.out.println(numerosHashSet);
		System.out.println("5----------------------------------\n");
		
		// VERIFIQUE O TAMANHO DO SET
		System.out.println("// VERIFIQUE O TAMANHO DO SET");
		System.out.println(numerosHashSet);
		System.out.println("tamanho: " + numerosHashSet.size());
		System.out.println("6----------------------------------\n");
		
		// VERIFIQUE SE O SET ESTÁ VAZIO
		System.out.println(numerosHashSet);
		System.out.println("numerosHashSet vazio: " + numerosHashSet.isEmpty());
		System.out.println("7----------------------------------\n");
		

	}

}
