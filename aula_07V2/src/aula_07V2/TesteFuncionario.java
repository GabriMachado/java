package aula_07V2;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario ("Nicole Balhs" , "Influencer" , "M010203" , 1.9000f , 30);
		f1.visualizar();
		
		 Funcionario f2 = new Funcionario ("Larissa Machado" , "Contora" , "M010203" , 2.00000f , 30);
		 f2.visualizar();
		
		Gerente g1 = new Gerente ("Nicole Balhs" , "Influencer" , "M00506" , 1.9000f , 30, "Manhã" , 2);
		g1.visualizar();	
		
		Vendedor v1 = new Vendedor ("Larissa Machado" , "Vendedora" , "M0102" , 2.0000f , 30, "Interno" );
		v1.visualizar(); 
	}

}
