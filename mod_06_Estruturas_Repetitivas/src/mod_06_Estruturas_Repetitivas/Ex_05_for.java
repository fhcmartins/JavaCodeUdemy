package mod_06_Estruturas_Repetitivas;

import java.util.Scanner;

public class Ex_05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //numero de valores a serem lidos
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.printf("%d in \n", in);
		System.out.printf("%d out \n", out);
		
		sc.close();
	}

}
