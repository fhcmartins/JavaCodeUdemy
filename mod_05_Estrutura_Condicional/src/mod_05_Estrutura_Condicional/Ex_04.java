package mod_05_Estrutura_Condicional;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, totJogado;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			totJogado = horaFinal - horaInicial;
		}
		else {
			totJogado = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + totJogado + " horas.");
		
		sc.close();
	}

}
