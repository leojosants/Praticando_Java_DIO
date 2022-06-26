package ImplementandoCollectionsEstreamsComJava.Map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioFinalTreeMap {

	public static void main(String[] args) {

		// CRIE UM MAP E EXECUTE AS SEGUINTES OPERAÇÕES //
		System.out.println("// CRIE UM MAP E EXECUTE AS SEGUINTES OPERAÇÕES //");
		Map<String, String> capitais = new HashMap<String, String>();
		System.out.println(capitais);
		System.out.println("1-------------------------------------\n");

		// ADICIONE OS 26 ESTAODS BRASILEIROS NO MAP, ONDE A SIGLA SERA A CHAVE E O NOME
		// DO ESTADO O VALOR
		System.out.println(
				"// ADICIONE OS 26 ESTAODS BRASILEIROS NO MAP, ONDE A SIGLA SERA A CHAVE E O NOME DO ESTADO O VALOR");
		capitais.put("AC", "Acre");
		capitais.put("AL", "Alagoas");
		capitais.put("AP", "Amapá");
		capitais.put("AM", "Amazonas");
		capitais.put("BA", "BAHIA");
		capitais.put("CE", "Ceará");
		capitais.put("ES", "Espírito Santos");
		capitais.put("GO", "Goiás");
		capitais.put("MA", "Maranhão");
		capitais.put("MT", "Mato Grosso");
		capitais.put("MS", "Mato Grosso do Sul");
		capitais.put("MG", "Minas Gerais");
		capitais.put("PA", "Pará");
		capitais.put("PB", "Paraíba");
		capitais.put("PR", "Paraná");
		capitais.put("PE", "Pernambuco");
		capitais.put("PI", "Piauí");
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("RN", "Rio Grande do Norte");
		capitais.put("RS", "Rio Grande do Sul");
		capitais.put("RO", "Rondônia");
		capitais.put("RR", "Roraima");
		capitais.put("SC", "Santa Catarina");
		capitais.put("SP", "São Paulo");
		capitais.put("SE", "Sergipe");
		capitais.put("TO", "Tocantins");
		capitais.put("DF", "Distrito Federal");

		System.out.println(capitais);
		System.out.println("2-------------------------------------\n");

		// REMOVA O ESTADO DE MINAS GERAIS
		System.out.println("// REMOVA O ESTADO DE MINAS GERAIS");
		capitais.remove("MG");
		System.out.println(capitais.containsKey("MG"));
		System.out.println(capitais);
		System.out.println("3-------------------------------------\n");

		// ADICIONE O DISTRITO FEDERAL
		System.out.println("// ADICIONE O DISTRITO FEDERAL");
		capitais.put("DF", "Distrito Federal");
		System.out.println(capitais.containsKey("DF"));
		System.out.println(capitais);
		System.out.println("4-------------------------------------\n");

		// VERIFIQUE O TAMANHO DO MAPA
		System.out.println("// VERIFIQUE O TAMANHO DO MAPA");
		System.out.println("tamanho: " + capitais.size());
		System.out.println("5-------------------------------------\n");

		// REMOVA O ESTADO DE MATO GROSSO DO SUL USANDO O NOME
		System.out.println("// REMOVA O ESTADO DE MATO GROSSO DO SUL USANDO O NOME");
		capitais.remove("MS", "Mato Grosso do Sul");
		System.out.println(capitais);
		System.out.println(capitais.containsKey("MS"));
		System.out.println("6-------------------------------------\n");

		// NAVEGUE EM TODOS OS REGISTRO DO MAP, MOSTRANDO NO CONSOLE NO SEGUINTE FORMATO:
		// NOME(SIGLA)
		System.out.println(
				"// NAVEGUE EM TODOS OS REGISTRO DO MAP, MOSTRANDO NO CONSOLE NO SEGUINTE FORMATO: NOME(SIGLA)");
		for (Map.Entry<String, String> entry : capitais.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val + " (" + key + ")");	
		}
		System.out.println("7-------------------------------------\n");

		// VERIFIQUE SE O ESTADO DE SANTA CATARINA EXISTE NO MAP BUSCANDO POR SUA SIGULA
		// (SC)
		System.out.println("// VERIFIQUE SE O ESTADO DE SANTA CATARINA EXISTE NO MAP BUSCANDO POR SUA SIGULA (SC)");
		System.out.println(capitais.containsKey("SC"));
		System.out.println("8-------------------------------------\n");

		// VERIFIQUE SE O ESTADO DE MARANHÃO EXISTE NO MAP BUSCANDO POR SEU NOME
		System.out.println("// VERIFIQUE SE O ESTADO DE MARANHÃO EXISTE NO MAP BUSCANDO POR SEU NOME");
		System.out.println(capitais.containsValue("Maranhão"));
		System.out.println("8-------------------------------------\n");

	}

}
