package projetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public abstract class Patient {
	
	private String nome;
	private String cpf;
	private int idade;
	private Double numeroDeConsultas;
	private Double precoPorConsulta;
	
	
	public Patient() {
	}
	

	public Patient(String nome, String cpf, int idade, Double numeroDeConsultas, Double precoPorConsulta) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.numeroDeConsultas = numeroDeConsultas;
		this.precoPorConsulta = precoPorConsulta;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Double getNumeroDeConsultas() {
		return numeroDeConsultas;
	}


	public void setNumeroDeConsultas(Double numeroDeConsultas) {
		this.numeroDeConsultas = numeroDeConsultas;
	}


	public Double getPrecoPorConsulta() {
		return precoPorConsulta;
	}


	public void setPrecoPorConsulta(Double precoPorConsulta) {
		this.precoPorConsulta = precoPorConsulta;
	}


	public String toString() {
		return 	 "\n" + "Nome: " + nome + "\n"
				+ "CPF: " + cpf + "\n"
				+ "Idade: " + idade + "\n"
				+ "Número de consultas no mês: " + numeroDeConsultas + "\n"
				+ "Preço de cada consulta: " + precoPorConsulta;
	}
	
	
	
	public Double GastoMensalTotalComDesconto() {
		return 0d;
	}
	
	public Double GastoMensalTotalSemDesconto() {
		return 0d;
	}

}













