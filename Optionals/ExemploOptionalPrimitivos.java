package ImplementandoCollectionsEstreamsComJava.Optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {

	public static void main(String[] args) {

		System.out.println("*** Valor inteiro Opcional ***");
		OptionalInt.of(12).ifPresent(System.out::println);
		
		System.out.println("*** Valor decimal Opcional ***");
		OptionalDouble.of(55.2).ifPresent(System.out::println);
		
		System.out.println("*** Valor longo Opcional ***");
		OptionalLong.of(23L).ifPresent(System.out::println);
		
	}

}
