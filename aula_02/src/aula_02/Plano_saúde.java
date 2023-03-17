package aula_02;

import java.util.Scanner;

public class Plano_saúde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner leia = new Scanner (System.in);
          int idade;
	      
	      System.out.println("Digite sua idade");
        	idade = leia.nextInt();	
        	
        	if(idade >= 0 && idade<= 10) 
          System.out.println("O valor de seu plano é 100,00. ");
          
          else if (idade > 10 && idade <= 29)
         System.out.println("O valor de seu plano é 200,00. ");
        	
          else if (idade > 29 && idade <= 45)
              System.out.println("O valor de seu plano é 300,00. ");
        	
          else if (idade > 45 && idade <= 59)
              System.out.println("O valor de seu plano é 400,00. ");
        	
          else if (idade > 59 && idade <= 65)
              System.out.println("O valor de seu plano é 500,00. ");
        	
          else if (idade > 65 )
              System.out.println("O valor de seu plano é 1.000,00. ");
        	
          else
        	  System.out.println("Idade inválida!");
        	
	}
}
