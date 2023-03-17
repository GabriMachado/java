package aula_03;

import java.util.Scanner;

public class Pesquisa_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		int idade, sexo, esporte, contador = 0, futebolfem = 0, maiores18Volei = 0; 
		char continua = 'S';
		
		while(continua == 'S') { 
		System.out.println("Digite sua idade");
		idade = leia.nextInt();
		
		
		System.out.println("Digite o sexo (1- Masc/2- Fem/3- Trans/4 -NB): ");
		sexo = leia.nextInt();
		
		
		System.out.println("Digite seu esporte favorito (1- Futebol/ 2- Vôlei/ 3- Basquete/ 4- Games)): ");
		esporte = leia.nextInt();
		
		contador ++;
		
		if(sexo == 2 && esporte == 1)
		futebolfem ++;
		
		if(idade>=18 && esporte == 2)
		maiores18Volei ++;
		
		System.out.println("Deseja continuar (S/N)? ");
		continua = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Total de fichas preenchidas:" + contador);
		
		
		
		
		
	}

}
