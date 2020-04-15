 package mod_07_Outros_Topicos_Basicos;

import java.util.Scanner;

public class Ex_02_Funcoes_Sintexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		sc.close();
	}
	
	// Funcao Max
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	// Funcao showResult
	/* Simplesmente irá fazer uma açao, não irá
	 * retornar nada.
	 * Neste caso criaremos uma funcao void
	 */
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	 

}
