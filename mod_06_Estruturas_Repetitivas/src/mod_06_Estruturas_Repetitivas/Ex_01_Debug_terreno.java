package mod_06_Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01_Debug_terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);

		sc.close();
	}

}
