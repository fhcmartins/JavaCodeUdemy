import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Olá, tudo bem?");
		
		int y = 32;
		System.out.println(y + "\n");
		
		double x = 10.54553;
		System.out.printf("%.2f \n", x);
		System.out.printf("%.4f \n", x);
		
		//Configurando a pontuação no programa (retirando a virgula)
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f \n", x);
		
		int z = 23;
		int soma = y+z;
		System.out.println("A soma de " + z + " + " + y + " é " + soma);
		
		System.out.println("\n*********************************************\n");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais. \n", nome, idade, renda);
	}

}
