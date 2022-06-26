package ImplementandoCollectionsEstreamsComJava.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFinal {

	public static void main(String[] args) {

		// CRIE UMA LISTA E EXECUTE AS SEGUINTES OPERAÇÕES
		System.out.println("// CRIE UMA LISTA E EXECUTE AS SEGUINTES OPERAÇÕES");
		Queue<String> fila = new LinkedList<String>();
		
		// ADICIONE 5 NOME: JULIANA, PEDRO, CARLOS, LARISSA E JOÃO
		System.out.println("// ADICIONE 5 NOME: JULIANA, PEDRO, CARLOS, LARISSA E JOÃO");
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		System.out.println("-----------------------------------");
		
		// NAVEGUE NA FILA EXIBINDO CADA NOME NO CONSOLE
		System.out.println("// NAVEGUE NA FILA EXIBINDO CADA NOME NO CONSOLE");
		System.out.println(fila);
		
		for (String f : fila) {
			System.out.println("-> " + f);
		}
		
		Iterator<String> iteratorFila = fila.iterator();
		while (iteratorFila.hasNext()) {
			System.out.println("--> " + iteratorFila.next());
		}
		System.out.println("-----------------------------------");
		
		// RETORNE O PRIMEIRO ITEM DA FILA, SEM REMOVE-LO
		System.out.println("// RETORNE O PRIMEIRO ITEM DA FILA, SEM REMOVE-LO");
		System.out.println(fila.peek());
		System.out.println(fila);
		System.out.println("-----------------------------------");
		
		// RETORNE O PRIMEIRO ITEM DA FILA, REMOVENDO O MESMO.
		System.out.println("// RETORNE O PRIMEIRO ITEM DA FILA, REMOVENDO O MESMO.");
		System.out.println(fila.poll());
		System.out.println(fila);
		System.out.println("-----------------------------------");
		
		// ADICIONE UM NOVO NOME: DANIEL
		System.out.println("// ADICIONE UM NOVO NOME: DANIEL");
		fila.add("Daniel");
		System.out.println(fila);
		System.out.println("Daniel foi adicionado: " + fila.contains("Daniel"));
		System.out.println("-----------------------------------");
		
		// VERIFIQUE A POSIÇÃO QUE DANIEL ASSUMIU NA FILA
		System.out.println("// VERIFIQUE A POSIÇÃO QUE DANIEL ASSUMIU NA FILA");
		System.out.println(fila);
		System.out.println("-----------------------------------");
		
		// RETORNE O TAMANHO DA FILA
		System.out.println("// RETORNE O TAMANHO DA FILA: " + fila.size());
		System.out.println("-----------------------------------");
		
		// VERIFIQUE SE A FILA ESTÁ VAZIA
		System.out.println("// VERIFIQUE SE A FILA ESTÁ VAZIA: " + fila.isEmpty());
		System.out.println("-----------------------------------");
		
		// VERIFIQUE SE O NOME CARLOS ESTÁ NA FILA
		System.out.println("// VERIFIQUE SE O NOME CARLOS ESTÁ NA FILA: " + fila.contains("Carlos"));
		System.out.println("-----------------------------------");
		
	}

}
