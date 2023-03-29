package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	private ArrayList<Conta> listaConta = new ArrayList <Conta>();
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
		// TODO Auto-generated method stub
		for (var conta : listaConta) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		listaConta.add(conta);
		System.out.println("A Conta número: " + conta.getNumero() + "foi criada com sucesso.");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposito(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	
	}

	/* Métodos auxiliares*/
	public int gerarNumero() {
		return ++ numero;

	}
	
            public Conta buscarNaCollection (int numero) {
	 for (var conta : listaConta) {
		 if (conta.getNumero() == numero) {
			 return conta;
		 }
	 }
	 return null;
}
	
	
	
	
	
	
}