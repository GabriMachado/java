package cliente_exe;

import java.time.LocalDate;

public class PessoaFisica extends Cliente{

	private String TipoLegal;

	public PessoaFisica(String nomeCompleto, int idade, String cPF, LocalDate dataNascimento, double altura,
			String tipoLegal) {
		super(nomeCompleto, idade, cPF, dataNascimento, altura);
		TipoLegal = tipoLegal;
	}

	public String getTipoLegal() {
		return TipoLegal;
	}

	public void setTipoLegal(String tipoLegal) {
		TipoLegal = tipoLegal;
	} 
	
	public void visualizar() {
	super.visualizar();
	
	System.out.println("* Tipo Legal: " + this.TipoLegal);
	System.out.println("**********************************" );
	
	}
	
}
