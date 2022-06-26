package ImplementandoCollectionsEstreamsComJava.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("João");
		System.out.println(nomes);
		System.out.println("---------------------------------------");

		nomes.set(2, "Larissa");
		System.out.println(nomes);
		System.out.println("-----------------------------");

		// ORDENA POR ORDEM ALFABETIA
		Collections.sort(nomes);
		System.out.println(nomes);
		System.out.println("-----------------------------");

		// SETAR E ALTERAR
		nomes.set(2, "Wesley");
		System.out.println(nomes);
		System.out.println("-----------------------------");

		// REMOÇÃO POR INDEX
		nomes.remove(4);
		System.out.println(nomes);
		System.out.println("-----------------------------");

		// REMOÇÃO POR ELEMENTO
		nomes.remove("Wesley");
		System.out.println(nomes);
		System.out.println("-----------------------------");

		// RETORNA O ELEMENTO DADO O INDEX
		String nomeNaPosicaoUm = nomes.get(1);
		System.out.println("nomeNaPosicaoUm: " + nomeNaPosicaoUm);
		System.out.println("-----------------------------");

		// 
		System.out.println("tamanho: " + nomes.size());
		System.out.println("-----------------------------");
		
		//
		boolean existeNome = nomes.contains("Anderson");
		System.out.println("existeNome: " + existeNome);
		System.out.println("-----------------------------");
		
		//
		boolean listaVazia = nomes.isEmpty();
		System.out.println("listaVaziaOuNao: " + listaVazia);
		System.out.println("-----------------------------");
		
		//
		int posicaoDoElemento = nomes.indexOf("Carlos");
		System.out.println("posicaoDoElemento: " + posicaoDoElemento);
		System.out.println("-----------------------------");
		
		// PERCORRENDO POR FOR
		for (String nomeDoElemento : nomes) {
			System.out.println(nomeDoElemento);
		}
		System.out.println("-----------------------------");
		
		// PERCORRENDO POR WHILE
		Iterator<String> iterator = nomes.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------------------");

		// LIMPANDO A LISTA
		nomes.clear();
		System.out.println(nomes);
		System.out.println("-----------------------------");
		
	}

}
