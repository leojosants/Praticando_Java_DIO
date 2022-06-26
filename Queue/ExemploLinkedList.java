package ImplementandoCollectionsEstreamsComJava.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {

		Queue<String> filaDeBanco = new LinkedList<String>();
		
		filaDeBanco.add("Pâmela");
		filaDeBanco.add("Patricia");
		filaDeBanco.add("Roberto");
		filaDeBanco.add("Flávio");
		filaDeBanco.add("Anderson");
		
		System.out.println(filaDeBanco);
		System.out.println("1------------------------------------------");
		
		String clienteAserAtendido = filaDeBanco.poll();
		System.out.println("clienteAserAtendido: " + clienteAserAtendido);
		System.out.println(filaDeBanco);
		System.out.println("2------------------------------------------");
		
		String primeiroCliente = filaDeBanco.peek();
		System.out.println("primeiroCliente: " + primeiroCliente);
		System.out.println(filaDeBanco);
		System.out.println("3------------------------------------------");
		
		// PARA TESTAR DESCOMENTAR A LINHA ABAIXO
//		filaDeBanco.clear(); 
		String primeiroClienteOuErro = filaDeBanco.element();
		System.out.println("primeiroClienteOuErro: " + primeiroClienteOuErro);
		System.out.println(filaDeBanco);
		System.out.println("4------------------------------------------");
		
		for (String clientes : filaDeBanco) {
			System.out.println(clientes);
		}
		System.out.println("5------------------------------------------");
		
		Iterator<String> iteratorFilaDeBancoIterator = filaDeBanco.iterator();
		while (iteratorFilaDeBancoIterator.hasNext()) {
			System.out.println(iteratorFilaDeBancoIterator.next());
		}
		System.out.println("6------------------------------------------");
		
		System.out.println("tamanho: " + filaDeBanco.size());
		System.out.println("7------------------------------------------");
		
		System.out.println("filaDeBanco vazia: " + filaDeBanco.isEmpty());
		System.out.println("8------------------------------------------");
		
		filaDeBanco.clear();
		System.out.println(filaDeBanco);
		System.out.println("9------------------------------------------");
		
		System.out.println("------------------------------------------");
		
	}

}
