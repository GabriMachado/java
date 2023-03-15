package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		float n1,n2,n3,n4,n5;
		
		System.out.println("Digite número 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite número 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite número 4: ");
		n4 = leia.nextFloat();
		
		n5 = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferenca entre1/2 e 3/4 é: " + n5);
		n5 = leia.nextFloat();
		
		
	}

}
