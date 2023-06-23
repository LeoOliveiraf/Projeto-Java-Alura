package projetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		MedicalClinic listaPacientes = new MedicalClinic();
		Scanner scanner = new Scanner(System.in);
		
		String nome = null;
		String cpf = null;
		int idade = 0;
		Double numeroDeConsultas = 0d;
		Double precoPorConsulta = 0d;
		Integer planoNumero = 0;
		int idadeAlterada = 0;
		Integer number = 0;
		Integer num = 0;
		System.out.println("Escolha uma opção: \n"
				 		 + "1- Entrar \n"
				 		 + "2- Sair \n");
		
		try {
			num = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Opção Invalida!");
			num = 2;
		}
		
		if(num == 2) {
			System.out.println("Obrigado por usar nossos serviços, Até logo!");
		}
		
		while(num == 1) {
			
			System.out.println("\n Escolha a opção que deseja executar: \n"
					 + "1- Adicionar um Paciente.\n"
					 + "2- Alterar um Paciente pelo Cpf.\n"
					 + "3- Buscar um Paciente pelo Nome. \n"
					 + "4- Remover um paciente pelo cpf. \n"
					 + "5- Ver o total de pacientes com plano Basic.\n"
					 + "6- Ver o total de pacientes com plano Premium.\n"
					 + "7- Ver o total de arrecadação da clínica no mês.\n"
					 + "8- Imprimir todos os pacientes da clínica.\n"
					 + "9- Sair");
			try {
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Opção Invalida!");
			}
			
			switch (number) {
			case 1: {
				System.out.println("Escolha o plano que deseja: \n"
		 		 	 	   		 + "1- Basic \n"
		 		 	 	   		 + "2- Premium \n");
				try {
				planoNumero = scanner.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Opção Invalida!");
				}
				scanner.nextLine();
				
				if(planoNumero == 1) {
					
					System.out.println("Adicione um paciente no plano básico. \n");
					
					System.out.println("Digite o nome do paciente: ");
					nome = scanner.nextLine();
					
					try {
						System.out.println("Digite a idade do paciente: ");
						idade = scanner.nextInt();
						if(idade < 18 || idade >= 60) {
							throw new RuntimeException("Desculpe, não possivel consultar sem um acompanhante!");
						}
					}
					catch(RuntimeException err) {
						System.out.println(err.getMessage());
						break;
					}
		
					System.out.println("Digite o número de consultas que o paciente teve no mês: ");
					numeroDeConsultas = scanner.nextDouble();
							
					System.out.println("Digite o preço de cada consulta: ");
					precoPorConsulta = scanner.nextDouble();
					
					PatientBasic pacientePlanoBasico = new PatientBasic(nome, cpf, idade, numeroDeConsultas, precoPorConsulta);
					listaPacientes.adicionarPaciente(pacientePlanoBasico);
					
					
				} else if(planoNumero == 2) {
					
					System.out.println("Adicione um paciente no plano premium. \n");
					
					System.out.println("Digite o nome do paciente: ");
					nome = scanner.nextLine();
					
					System.out.println("Digite o cpf do paciente: ");
					cpf = scanner.next();
					
					try {
						System.out.println("Digite a idade do paciente: ");
						idade = scanner.nextInt();
						if(idade < 18 || idade >= 60) {
							throw new RuntimeException("Desculpe, não possivel consultar sem um acompanhante!");
						}
					}
					catch(RuntimeException err) {
						System.out.println(err.getMessage());
						break;
					}
					
					System.out.println("Digite o número de consultas que o paciente teve no mês: ");
					numeroDeConsultas = scanner.nextDouble();
					
					System.out.println("Digite o preço de cada consulta: ");
					precoPorConsulta = scanner.nextDouble();
					
					PatientPremium pacientePlanoPremium = new PatientPremium(nome, cpf, idade, numeroDeConsultas, precoPorConsulta);
					listaPacientes.adicionarPaciente(pacientePlanoPremium);
				}
				
				break;
			}
			case 2: {
				scanner.nextLine();

				System.out.println("Digite o cpf do paciente que deseja alterar: ");
				cpf = scanner.nextLine();
				
				for(int i = 0; i < listaPacientes.getClinic().size(); i++) {
					if(listaPacientes.getClinic().get(i).getCpf().equals(cpf)) {
						System.out.println("Digite o novo nome do paciente: ");
						String nomeAlterado = scanner.nextLine();
						
						System.out.println("Digite o novo cpf: ");
						String cpfAlterado = scanner.nextLine();
						
						try {
							System.out.println("Digite a nova idade: ");
							idadeAlterada = scanner.nextInt();
							if(idadeAlterada < 18 || idadeAlterada >= 60) {
								throw new RuntimeException("Desculpe, não possivel consultar sem um acompanhante!");
							}
						}
						catch(RuntimeException err) {
							System.out.println(err.getMessage());
							break;
						}
						
						listaPacientes.editarPaciente(cpf, nomeAlterado, cpfAlterado, idadeAlterada);
						break;
					}else {
						System.out.println("CPF não encontrado!");
						break;
					}
				}
				break;
			}
			case 3: {
				System.out.println("Digite um nome para Buscar: ");
				nome = scanner.next();
				listaPacientes.buscarPacientePeloNome(nome);
				break;
			}
			case 4: {
				System.out.println("Digite o cpf do paciente que deseja remover: ");
				cpf = scanner.next();
				listaPacientes.removerPaciente(cpf);
				break;
			}
			case 5:{
				System.out.println("Total de pacientes com plano basic: " + listaPacientes.totalPacientesBasic());
				break;
			}
			case 6:{
				System.out.println("Total de pacientes com plano premium: " + listaPacientes.totalPacientesPremium());
				break;
			}
			case 7:{
				System.out.println("Total de arrecadação da clínica no mês sem desconto: " + listaPacientes.totalArrecadacao());
				break;
			}
			case 8:{
				listaPacientes.imprimir();
				break;
			}
			default:
				num = 2;
				System.out.println("Obrigado por usar nossos serviços, Até logo!");
				}
			}
		}	
	}
