package ImplementandoCollectionsEstreamsComJava.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		List<String> estudantes = new ArrayList<String>();
		
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		
		System.out.println("\nContagem de elementos: " + estudantes.stream().count());
		
		System.out.println("\nElemento com maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		System.out.println("\nElemento com menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		System.out.println("\nElementos que possui a letra 'r': " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList())); 
		
		System.out.println("\nEmentos com seu respectivo total de letras: " + estudantes.stream().map(estudante-> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("\nTres primeiros elementos da lista: " + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("\nRetorna antes cada elementos e depois a lista: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("\nRetorna a lista: ");
		estudantes.forEach(System.out::println);
		
		System.out.println("\nTodos os elementos da lista possuem a letra 'w' no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("w")));
		
		System.out.println("\nAlgum elemento possui a letra 'a'? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
	
		System.out.println("\nNenhum elemento possui a letra 'a'? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		System.out.print("\nPrimeiro elemento da coleção: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("\nOperação encadeada");
		System.out.println(estudantes.stream()
				.peek(System.out::println).map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
//				.collect(Collectors.toList()));
//				.collect(Collectors.joining(",")));
//		.collect(Collectors.toSet()));
				.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
		
	}

}
