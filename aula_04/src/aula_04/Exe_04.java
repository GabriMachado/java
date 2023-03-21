package aula_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,#00.00");
		
		double [] [] matrizInteiros = new double [10][4];
		
		Scanner leia = new Scanner(System.in);
		
		double soma = 0, media = 0;
		
		double [] mediaAlunos = new double [10];

		for (int iLinha = 0; iLinha < matrizInteiros.length; iLinha ++) {
			for (int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna ++) {
				System.out.println("Digite uma nota: ");
				matrizInteiros[iLinha][iColuna] = leia.nextDouble();
			}									
		}	
		
		for (int iLinha = 0; iLinha < matrizInteiros.length; iLinha ++) {
			for (int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna ++) {
				soma = soma + matrizInteiros[iLinha][iColuna];
			}	
			media = soma /4;
			mediaAlunos[iLinha] = media;
			soma = 0;
			media = 0;
					
		}	
		System.out.println("Média dos alunos: ");
		for (int indice = 0; indice < mediaAlunos.length; indice ++) {
			System.out.println("Aluno " + (indice + 1) + ": " + mediaAlunos[indice]);
		}
		
		
	}
					
}
