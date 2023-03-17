package aula_03;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner leia = new Scanner(System.in);
        
 int numero = 0, soma = 0;


do {
    System.out.println("Digite um número: ");
    numero = leia.nextInt();
    
 if (numero > 0)
	soma += numero;

}while (numero != 0);
   
   System.out.println("Soma dos números posistivos: " + soma);

leia.close();
	}
}