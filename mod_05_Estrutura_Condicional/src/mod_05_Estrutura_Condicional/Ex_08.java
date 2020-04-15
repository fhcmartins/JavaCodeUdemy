package mod_05_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
		 * pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados
		 * em benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo
		 * � o R$. Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb.
		 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a
		 * tabela abaixo.
		 * */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Variaveis
		double salario, novoSalario;
		
		System.out.println("Informe o salario: ");
		salario = sc.nextDouble();
		
		if(salario >= 0.00 && salario <= 2000) {
			System.out.println("Isento");
		}
		else if(salario > 2000 && salario <= 3000) {
			novoSalario = (salario - 2000) * 0.08;
			System.out.printf("%.2f", novoSalario);
		}
		else if(salario > 3000 && salario <= 4500) {
			novoSalario = (1000 * 0.08) + (((salario - 1000) - 2000) * 0.18);
			System.out.printf("%.2f", novoSalario);
		}
		else if(salario >=4500){
			novoSalario = ((1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28));
			System.out.printf("%.2f", novoSalario);
		}
		
		sc.close();
	}

}
