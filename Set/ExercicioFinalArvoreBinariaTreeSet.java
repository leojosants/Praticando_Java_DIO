package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioFinalArvoreBinariaTreeSet {

	public static void main(String[] args) {

	// APLICANDO EM TREESET //
		System.out.println("// APLICANDO EM TREESET //");
		
		// CRIE UM SET E EXECUTE AS SEGUINTES OPERACOES
		System.out.println("// CRIE UM SET E EXECUTE AS SEGUINTES OPERACOES");
		TreeSet<Integer> numerosTreeSet = new TreeSet<Integer>();
		System.out.println(numerosTreeSet);
		System.out.println("1----------------------------------\n");
		
		// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3
		System.out.println("// ADICIONE 5 NUMEROS INTEIROS: 3, 88, 20, 44, 3");
		System.out.println(numerosTreeSet);
		numerosTreeSet.add(3);
		numerosTreeSet.add(88);
		numerosTreeSet.add(20);
		numerosTreeSet.add(44);
		numerosTreeSet.add(3);
		System.out.println(numerosTreeSet);
		System.out.println("2----------------------------------\n");
		
		// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE
		System.out.println("// NAVEGUE NO SET EXIBINDO CADA NUMERO NO CONSOLE");
		System.out.println("-> " + numerosTreeSet);
		
		Iterator<Integer> numerosTreeSetIerator = numerosTreeSet.iterator();
		
		while (numerosTreeSetIerator.hasNext()) {
			System.out.println("--> " +numerosTreeSetIerator.next());
		}
		
		for (Integer numero : numerosTreeSet) {
			System.out.println("---> " + numero);
		}
		System.out.println("3----------------------------------\n");
		
		// REMOVA O PRIMEIRO ITEM DO SET
		System.out.println("// REMOVA O PRIMEIRO ITEM DO SET");
		System.out.println(numerosTreeSet);
		System.out.println(numerosTreeSet.pollFirst());
		System.out.println(numerosTreeSet);
		System.out.println("4----------------------------------\n");
		
		// ADICIONE UM NOVO NUMERO NO SET: 23
		System.out.println("// ADICIONE UM NOVO NUMERO NO SET: 23");
		System.out.println(numerosTreeSet);
		System.out.println(numerosTreeSet.add(23));
		System.out.println(numerosTreeSet);
		System.out.println("5----------------------------------\n");

		// VERIFIQUE O TAMANHO DO SET
		System.out.println("// VERIFIQUE O TAMANHO DO SET");
		System.out.println(numerosTreeSet);
		System.out.println("tamanho: " + numerosTreeSet.size());
		System.out.println("6----------------------------------\n");

		// VERIFIQUE SE O SET ESTÁ VAZIO
		System.out.println("// VERIFIQUE SE O SET ESTÁ VAZIO");
		System.out.println(numerosTreeSet);
		System.out.println("numerosTreeSet vazio: " + numerosTreeSet.isEmpty());
		System.out.println("7----------------------------------\n");

		

	}

}
