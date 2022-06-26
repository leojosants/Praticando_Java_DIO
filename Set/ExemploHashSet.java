package ImplementandoCollectionsEstreamsComJava.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double> notasAlunos = new HashSet<Double>();
		
		notasAlunos.add(5.0);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		System.out.println("1--------------------------------------");
		
		notasAlunos.remove(3.8);
		System.out.println(notasAlunos);
		System.out.println("2--------------------------------------");
		
		System.out.println(notasAlunos.size());
		System.out.println("3--------------------------------------");
		
		Iterator<Double> iterator = notasAlunos.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("-> " + iterator.next());
		}
		System.out.println("4--------------------------------------");
		
		for (Double nota : notasAlunos) {
			System.out.println("--> " + nota);
		}
		System.out.println("5--------------------------------------");
		
		System.out.println(notasAlunos.isEmpty());
		System.out.println("6--------------------------------------");
		
		notasAlunos.clear();
		System.out.println(notasAlunos);
		System.out.println("7--------------------------------------");
		
		System.out.println(notasAlunos.isEmpty());
		System.out.println("8--------------------------------------");
		
	}

}
