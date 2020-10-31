package mod_05_Estrutura_Condicional;

import java.util.Scanner;

public class Ex_11_Expressao_Condicional_Ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		//double desconto;
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;		
		
		/*
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		*/
		
		System.out.println(desconto);
		
		sc.close();
	}

}
