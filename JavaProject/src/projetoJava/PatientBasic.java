package projetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientBasic extends Patient{
	
	private Double precoPlanoBasic = 100d;
	private Double descontoBasic = 10d;
	private String raioDeAtendimento = "Somente Local";

	public PatientBasic() {
	}

	
	public String getRaioDeAtendimento() {
		return raioDeAtendimento;
	}


	public void setRaioDeAtendimento(String raioDeAtendimento) {
		this.raioDeAtendimento = raioDeAtendimento;
	}


	public Double getPrecoPlanoBasic() {
		return precoPlanoBasic;
	}


	public Double getDescontoBasic() {
		return descontoBasic;
	}


	public PatientBasic(String nome, String cpf, int idade, Double numeroDeConsultas, Double precoPorConsulta) {
		super(nome, cpf, idade, numeroDeConsultas, precoPorConsulta);
	}
	
	@Override
	public Double GastoMensalTotalComDesconto() {
		return this.precoPlanoBasic + ((getNumeroDeConsultas() * getPrecoPorConsulta())  * (1 - (this.descontoBasic/100d)));
	}
	
	@Override
	public Double GastoMensalTotalSemDesconto() {
		return this.precoPlanoBasic + (getNumeroDeConsultas() * getPrecoPorConsulta());
	}

	@Override
	public String toString() {
		return     super.toString() + "\n"
				+ "Preco Plano Basic: " + precoPlanoBasic + "\n"
				+ "Desconto Basic: " + descontoBasic + "\n"
				+ "Raio de Atendimento: " + raioDeAtendimento + "\n";
	}
}