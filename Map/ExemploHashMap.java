package ImplementandoCollectionsEstreamsComJava.Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		Map<String, Integer> campeoesMundiaisFifa = new HashMap<String, Integer>();
		
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Itália", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("França", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundiaisFifa);
		System.out.println("1-------------------------------------\n");
		
		// atualiza
		campeoesMundiaisFifa.put("Brasil", 6);
		System.out.println(campeoesMundiaisFifa);
		System.out.println("2-------------------------------------\n");
		
		System.out.println(campeoesMundiaisFifa);
		System.out.println("index de 'Argentina': " + campeoesMundiaisFifa.get("Argentina"));
		System.out.println("3-------------------------------------\n");
		
		// verifica se existe ou não
		System.out.println(campeoesMundiaisFifa);
		System.out.println("contém 'França'? " + campeoesMundiaisFifa.containsKey("França"));
		System.out.println("4-------------------------------------\n");
		
		// remove
		System.out.println(campeoesMundiaisFifa);
		System.out.println("removido 'França': " + campeoesMundiaisFifa.remove("França"));
		System.out.println(campeoesMundiaisFifa);
		System.out.println("5-------------------------------------\n");
		
		// verifica se existe ou não
		System.out.println(campeoesMundiaisFifa);
		System.out.println("contém 'França'? " + campeoesMundiaisFifa.containsKey("França"));
		System.out.println("6-------------------------------------\n");
		
		System.out.println(campeoesMundiaisFifa);
		System.out.println("contem chave 6? " + campeoesMundiaisFifa.containsValue(6));
		System.out.println("7-------------------------------------\n");
		
		System.out.println(campeoesMundiaisFifa);
		System.out.println("tamanho: " + campeoesMundiaisFifa.size());
		System.out.println("8-------------------------------------\n");

		// navegar
		System.out.println("->" + campeoesMundiaisFifa);
		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry.getKey() + "-" + entry.getValue());
			
		}
		System.out.println("9-------------------------------------\n");
		
		// navegar
		for (String key : campeoesMundiaisFifa.keySet()) {
			System.out.println(key + "-" + campeoesMundiaisFifa.get(key));
		}
		
		System.out.println("10-------------------------------------\n");
		
		System.out.println("tamanho: " + campeoesMundiaisFifa.size());
		System.out.println("11-------------------------------------\n");
		
		System.out.println(campeoesMundiaisFifa);
		campeoesMundiaisFifa.clear();
		System.out.println(campeoesMundiaisFifa);
		System.out.println("campeoesMundiaisFifa vazio? " + campeoesMundiaisFifa.isEmpty());
		System.out.println("12-------------------------------------\n");
		
	}

}
