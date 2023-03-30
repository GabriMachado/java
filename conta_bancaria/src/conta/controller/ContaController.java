package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaConta = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("Conta não foi encotrada!");

	}

	@Override
	public void listarTodas() {

		for (var conta : listaConta) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {

		listaConta.add(conta);
		System.out.println("A Conta número: " + conta.getNumero() + "foi criada com sucesso.");
	}

	@Override
	public void atualizar(Conta conta) {

		var buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta != null) {
			conta.visualizar();
			listaConta.set(listaConta.indexOf(buscaConta), conta);
			System.out.println("Os dados da Conta foram atualizados com sucesso!");

		} else
			System.out.println("Conta não foi encotrada!");
	}

	@Override
	public void deletar(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaConta.remove(conta) == true)
				;
			System.out.println("Conta foi excluída!");
		} else
			System.out.println(" A Conta não foi encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if(conta.sacar(valor) == true)
				System.out.println("O Saque foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");
		
	}

	@Override
	public void deposito(int numero, float valor) {
		
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
				System.out.println("O Depósito foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A trasnferencia foi efetuada com sucesso!");
			}
	
		} else 
			System.out.println("A conta não foi encotrada!");	

	}

	/* Métodos auxiliares */
	public int gerarNumero() {
		return ++numero;

	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaConta) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaConta) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}

}