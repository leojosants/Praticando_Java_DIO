package ImplementandoCollectionsEstreamsComJava.Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {

		Hashtable<String, Integer> estudantes = new Hashtable<String, Integer>();
		
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		System.out.println("1----------------------------------\n");
		
		System.out.println(estudantes);
		System.out.println(estudantes.put("Pedro", 55));
		System.out.println(estudantes);
		System.out.println("2----------------------------------\n");
		
		System.out.println(estudantes);
		System.out.println(estudantes.get("Mariana"));
		System.out.println("3----------------------------------\n");
		
		System.out.println("tamanho: " + estudantes.size());
		System.out.println("4----------------------------------\n");
		
		for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("-> " + key + " " + val);
		}
		System.out.println("5----------------------------------\n");
		
		for (String key : estudantes.keySet()) {
			System.out.println("--> " + key + " " + estudantes.get(key));
		}
		System.out.println("6----------------------------------\n");
		
	}

}
