package ImplementandoCollectionsEstreamsComJava.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {

	public static void main(String[] args) {

		// CRIE UMA LISTA E EXECUTE AS OPERAÇÕES:
		List<String> nomes = new ArrayList<String>();

		// ADICIONE 5 NOMES: JULIANA, PEDRO CARLOS, LARISSA E JOÃO
		System.out.println("// ADICIONE 5 NOMES: JULIANA, PEDRO CARLOS, LARISSA E JOÃO");
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		System.out.println("-------------------------------");

		// NAVEGUE NA LISTA EXIBINDO CADA NOME NO CONSOLE
		System.out.println("// NAVEGUE NA LISTA EXIBINDO CADA NOME NO CONSOLE");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// SUBSTITUA O NOME CARLOS POR ROBERTO
		System.out.println("// SUBSTITUA O NOME CARLOS POR ROBERTO");
		nomes.set(2, "Roberto");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// RETORNE O NOME DA PRIMEIRA POSIÇÃO
		System.out.println("// RETORNE O NOME DA PRIMEIRA POSIÇÃO");
		String nomeDaPrimeiraPosicao = nomes.get(0);
		System.out.println("nomeDaPrimeiraPosicao: " + nomeDaPrimeiraPosicao);
		System.out.println("-------------------------------");

		// REMOVA O NOME DA POSIÇÃO 4
		System.out.println("// REMOVA O NOME DA POSIÇÃO 4");
		nomes.remove(3);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// REMOVA O NOME JOÃO
		System.out.println("// REMOVA O NOME JOÃO");
		nomes.remove("João");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// RETORNE A QUANTIDADE DE ITENS DA LISTA
		System.out.println("// RETORNE A QUANTIDADE DE ITENS DA LISTA");
		System.out.println("Tamanho da lista: " + nomes.size());
		System.out.println("-------------------------------");

		// VERIFIQUE SE O NOME JULIANO EXISTE NA LISTA
		System.out.println("// VERIFIQUE SE O NOME JULIANO EXISTE NA LISTA");
		boolean existenomeJuliano = nomes.contains("Juliano");
		System.out.println("existenomeJuliano: " + existenomeJuliano);
		System.out.println("-------------------------------");

		// CRIE UMA NOVA LISTA COM OS NOMES: ISMAEL E RODRIGO
		System.out.println("// CRIE UMA NOVA LISTA COM OS NOMES: ISMAEL E RODRIGO");
		List<String> novosNomes = new ArrayList<String>();
		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");
		for (String nome : novosNomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// ADICIONE TODOS OS ITENS DA NOVA LISTA NA PRIMEIRA LISTA CRIADA
		System.out.println("// ADICIONE TODOS OS ITENS DA NOVA LISTA NA PRIMEIRA LISTA CRIADA");
		nomes.addAll(novosNomes);
		for (String nomesAdicionados : nomes) {
			System.out.println(nomesAdicionados);
		}
		System.out.println("-------------------------------");

		// ORDENE POR ORDEM ALFABÉTICA
		System.out.println("// ORDENE POR ORDEM ALFABÉTICA");
		Collections.sort(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-------------------------------");

		// VERIFIQUE SE A LISTA ESTÁ VAZIA
		System.out.println("// VERIFIQUE SE A LISTA ESTÁ VAZIA");
		boolean listaNomesVazia = nomes.isEmpty();
		System.out.println("listaNomesVazia: " + listaNomesVazia);
		System.out.println("-------------------------------");

		// VERIFIQUE SE A LISTA ESTÁ VAZIA
		System.out.println("// VERIFIQUE SE A LISTA ESTÁ VAZIA");
		boolean listaNovosNomesVazia = novosNomes.isEmpty();
		System.out.println("listaNovosNomesVazia: " + listaNovosNomesVazia);
		System.out.println("-------------------------------");

	}

}
