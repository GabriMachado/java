package cliente_exe;

import java.time.LocalDate;

public class Exe_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LocalDate data = LocalDate.of(2024,9,20);
		  Cliente g1 = new Cliente ("Anitta Machado", 30 , "123.456.789-10" , data , 1.50 );
		  g1.visualizar();
			
		  Cliente g2 = new Cliente ("Gabriel Machado", 22 , "123.456.789-11" , data , 1.80 );
		  g2.visualizar();
	
	}

}
