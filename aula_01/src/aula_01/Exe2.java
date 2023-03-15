package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		float nota1,nota2,nota3,nota4;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("Sua média é: " + (nota1 + nota2 + nota3 + nota4)/4 );
		
	}

}
