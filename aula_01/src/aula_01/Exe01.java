package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
	
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		float salario,abono,novo_salario;
		
		System.out.println("Digite salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite abono: ");
		abono = leia.nextFloat();
		
		System.out.println("Novo salário: " + df.format((salario + abono)));
		
		
		
	}

}
