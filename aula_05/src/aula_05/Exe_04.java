package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
			Queue<String> fila = new LinkedList<String>();
			int opcao = 0;
			String nome = "";

			do {
				System.out.println("************************************\n");
				System.out.println("1 - Adicionar um novo cliente na fila");
				System.out.println("2 - Listar todos os Clientes na fila");
				System.out.println("3 - Retirar uma pessoa da fila ");
				System.out.println("0 - Finalizar programa\n");
				System.out.println("*************************************\n");
				System.out.println("Entre com a opção desejada: ");
				

				opcao = leia.nextInt();

				switch (opcao) {

				case 1:
					System.out.println("***** Adicionar um novo cliente ***** ");
					System.out.println("Digite o nome do cliente: ");

					nome = leia.next();
					fila.add(nome);

					System.out.println("Cliente Adicionado! \n");
					break;

				case 2:
					System.out.println("***** Listagem de clientes ***** ");

					for (var elemento : fila)
						System.out.println(elemento);

					break;

				case 3:
					if (fila.isEmpty()) {
						System.out.println("A fila está vazia!");
					}
					else {
						fila.poll();
						System.out.println("Cliente chamado com sucesso!\n\n");
					}


					
					break;
					

				default:
					if (opcao > 3)
						System.out.println("Opção invalida \n");
					break;
				}

			} while (opcao != 0);

			System.out.println("Programa finalizado! ");

			leia.close();
		

	
	}

}