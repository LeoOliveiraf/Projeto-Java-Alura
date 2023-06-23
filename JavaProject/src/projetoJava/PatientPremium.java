package projetoJava;

public class PatientPremium extends Patient{
	
	//O plano é mais caro, porém o desconto é maior
	//Vale a pena o premium no caso do paciente realizar muitas consultas no mês
	//O desconto é implementado no custo total no mês
	private Double precoPlanoPremium = 200d;
	private Double descontoPremium = 20d;
	private Boolean acessoQuartoPrivado = true;
	private String raioDeAtendimento = "Ilimitado";
	
	
	public PatientPremium() {
	}


	public PatientPremium(String nome, String cpf, int idade, Double numeroDeConsultas, Double precoPorConsulta) {
		super(nome, cpf, idade, numeroDeConsultas, precoPorConsulta);
	}
	
	public Boolean getAcessoQuartoPrivado() {
		return acessoQuartoPrivado;
	}


	public void setAcessoQuartoPrivado(Boolean acessoQuartoPrivado) {
		this.acessoQuartoPrivado = acessoQuartoPrivado;
	}


	public String getRaioDeAtendimento() {
		return raioDeAtendimento;
	}


	public void setRaioDeAtendimento(String raioDeAtendimento) {
		this.raioDeAtendimento = raioDeAtendimento;
	}
	
	
	public Double getPrecoPlanoPremium() {
		return precoPlanoPremium;
	}


	public Double getDescontoPremium() {
		return descontoPremium;
	}


	@Override
	public Double GastoMensalTotalComDesconto() {
		return precoPlanoPremium + ( (getNumeroDeConsultas() * getPrecoPorConsulta())  * (1 - (this.descontoPremium/100)));
	}
	
	@Override
	public Double GastoMensalTotalSemDesconto() {
		return this.precoPlanoPremium + (getNumeroDeConsultas() * getPrecoPorConsulta());
	}
	
	
	
	@Override
	public String toString() {
		return     super.toString() + "\n"
				+ "Preco Plano Premium: " + precoPlanoPremium + "\n"
				+ "Desconto Premium: " + descontoPremium + "\n"
				+ "Quarto Privado: " + acessoQuartoPrivado + "\n"
				+ "Raio de Atendimento: " + raioDeAtendimento + "\n";
	}
}








