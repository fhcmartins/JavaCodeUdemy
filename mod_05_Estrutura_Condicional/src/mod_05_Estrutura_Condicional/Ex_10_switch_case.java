package mod_05_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_10_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		/* Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		if(x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terça";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "Valor invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
		*/
		
		//Switch case
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terca";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
