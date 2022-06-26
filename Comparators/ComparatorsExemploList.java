package ImplementandoCollectionsEstreamsComJava.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {

	public static void main(String[] args) {

		List<Estudante> estudantes = new ArrayList<Estudante>();

		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("Jo�o", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));

		System.out.println("\n--- Ordem de inser��o ---");
		System.out.println(estudantes);

		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

		System.out.println("\n--- ordem natural dos numeros - idade ---");
		System.out.println(estudantes);

		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

		System.out.println("\n--- ordem reversa dos numeros - idade ---");
		System.out.println(estudantes);

		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

		System.out.println("\n--- Ordem natural dos numeros - idade (metodo referencia) ---");
		System.out.println(estudantes);

		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

		System.out.println("\n--- Ordem reversa dos numeros - idade (metodo referencia) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		
		System.out.println("\n--- Ordem natural dos numeros - idade (interface Comparable) ---");
		System.out.println(estudantes);

		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaCoparator());
		
		System.out.println("\n--- Ordem reversa dos numeros - idade (interface Comparator) ---");
		System.out.println(estudantes);
		
	}

}
