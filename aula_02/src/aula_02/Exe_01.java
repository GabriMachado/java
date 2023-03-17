package aula_02;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner leia = new Scanner (System.in);
      
      int Na, Nb, Nc, Result;
      
      System.out.println("Digite o valor de A: ");
      Na = leia.nextInt(); 
      
      System.out.println("Digite o valor de B ");
      Nb = leia.nextInt();
      
      System.out.println("Digite o valor de C ");
      Nc = leia.nextInt();
      
      Result = (Na + Nb);
      
      if (Result == Nc)
			System.out.println("A soma de A e B é igual ao valor de C!");
		else if(Result < Nc)			
			System.out.println("A soma de A e B é menor que C!");
		else if(Result > Nc)			
			System.out.println("A soma de A e B é maior que C!");

	}

}
