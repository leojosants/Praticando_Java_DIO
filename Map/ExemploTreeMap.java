package ImplementandoCollectionsEstreamsComJava.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> treeCapitais = new TreeMap<String, String>();
		
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianópolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("MG", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		System.out.println("1-------------------------------\n");
		
		System.out.println("Capital no topo da árvore: " + treeCapitais.firstKey());
		System.out.println("2-------------------------------\n");
		
		System.out.println("Capital na base da árvore: " + treeCapitais.lastKey());
		System.out.println("3-------------------------------\n");
		
		System.out.println("Capital acima de 'SC': " + treeCapitais.lowerKey("SC"));
		System.out.println("4-------------------------------\n");
		
		System.out.println("Capital abaixo de 'SC': " + treeCapitais.higherKey("SC"));
		System.out.println("5-------------------------------\n");
		
		System.out.println("Capital no topo da árvore: " + treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());
		System.out.println("6-------------------------------\n");
		
		System.out.println("Capital acima de 'SC': " + treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());
		System.out.println("7-------------------------------\n");
		
		System.out.println("Capital abaixo de 'SC': " + treeCapitais.higherEntry("SC").getKey()+ " - " + treeCapitais.higherEntry("SC").getValue());
		System.out.println("8-------------------------------\n");
		
		System.out.println(treeCapitais);
		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		System.out.println("Retorna e elimina o elemento do topo: " + firstEntry); 
		System.out.println(treeCapitais);
		System.out.println("9-------------------------------\n");
		
		System.out.println(treeCapitais);
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		System.out.println("Retorna e elimina o elemento da base: " + lastEntry); 
		System.out.println(treeCapitais);
		System.out.println("10-------------------------------\n");
		
		Iterator<String> treeCapitaisIterator = treeCapitais.keySet().iterator();
		while (treeCapitaisIterator.hasNext()) {
			String key = treeCapitaisIterator.next();
			System.out.println("-> " + key + " " + treeCapitais.get(key));
		}
		System.out.println("11-------------------------------\n");
		
		for (String capital : treeCapitais.keySet()) {
			System.out.println("--> " + capital + " " + treeCapitais.get(capital));
		}
		System.out.println("12-------------------------------\n");
		
		for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			String key = capital.getKey();
			String val = capital.getValue();
			System.out.println("---> " + key + " " + val);
			
		}
		System.out.println("13-------------------------------\n");
		
		
	}

}
