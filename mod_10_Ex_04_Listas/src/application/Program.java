package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		/* Reovento - removeIF
		 * remocao por predicado - função lambda (x -> x.charAt(0) == 'M')
		 * remova qualquer elemento x (tipo String) e me retorna x.charAt(0) é = a zero,
		 * me retornando True or False.
		 */
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		/*
		 * Encontrar a posição do elemento - Função indexOf
		 */
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("------------------------");
		/*
		 * Filtrando uma lista.
		 */
		//pego minha lista, converto para stream, filtro para buscar nomes com que iniciam com 'A' e converto para lista novamente.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);		
		
	}

}
