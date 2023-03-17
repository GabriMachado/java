package aula_02;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		float n1, n2;
		int operacao;
		
		System.out.println("   Operação");
		System.out.println("1\tSoma");
		System.out.println("2\tSubtração");
		System.out.println("3\tMultiplação");
		System.out.println("4\tDivisão");
		
				 
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a operação:");
		 operacao= leia.nextInt();
		 
		 switch(operacao) {
		 case 1 :
			 System.out.println("A soma é: " + (n1 + n2));
			break; 
			 
		 case 2 :
			 System.out.println("A subtração é: " + (n1 - n2));
			 break; 
			 
		 case 3 :
			 System.out.println("A multiplicação é: " + (n1 * n2));
			 break; 
			 
		 case 4 :
			 System.out.println("A divisão é: " + (n1 / n2));
			 break; 
			 
		 }
		 
		 
		
		
		
		
		
		
		
		
	
	
		
	}

}
