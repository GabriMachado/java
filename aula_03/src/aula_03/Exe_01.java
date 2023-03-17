package aula_03;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Informe o número inicial: ");
		numero1 = leia.nextInt();
		
		
		System.out.println("Informe o número final: ");
		numero2 = leia.nextInt();
		
		if (numero1 > numero2) {
		System.out.println("Intervaldo inválido!");
		System.exit(0);
		}
		
		for (int contador = numero1; contador <= numero2; contador ++) {
			
			if (contador%3 == 0 && contador%5 == 0)
				System.out.println(contador + " é múltiplo de 5 e 3");
		}
		
	}

}
