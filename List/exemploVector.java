package ImplementandoCollectionsEstreamsComJava.List;

import java.util.List;
import java.util.Vector;

public class exemploVector {

	public static void main(String[] args) {

		//
		List<String> esportes = new Vector<String>();
		
		//
		esportes.add("Futebol");
		esportes.add("Basquete");
		esportes.add("Tenis de mesa");
		esportes.add("Handbol");
		System.out.println(esportes);
		System.out.println("-----------------------------");
		
		//
		esportes.set(2, "Ping Pong");
		System.out.println(esportes);
		System.out.println("-----------------------------");
		
		//
		esportes.remove(2);
		System.out.println(esportes);
		System.out.println("-----------------------------");
		
		//
		esportes.remove("Handbol");
		System.out.println(esportes);
		System.out.println("-----------------------------");
		
		//
		System.out.println("elemento na posição: " + esportes.get(0));
		System.out.println("-----------------------------");
		
		//
		for (String esporte : esportes) {
			System.out.println(esporte);
		}
		System.out.println("-----------------------------");
		
		//
		esportes.clear();
		System.out.println(esportes);
		System.out.println("-----------------------------");
		
	}

}
