package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		float salario,noturno,extra,desc;
		
		System.out.println("Digite salário bruto: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite Adcional noturno: ");
		noturno = leia.nextFloat();
		
		System.out.println("Digite horas extras: ");
		extra = leia.nextFloat();
		
		System.out.println("Digite Descontos: ");
		desc = leia.nextFloat();
		
		System.out.println("Salário liquido é: " + df.format((salario + noturno + extra * 5 - desc)));
	}

}
