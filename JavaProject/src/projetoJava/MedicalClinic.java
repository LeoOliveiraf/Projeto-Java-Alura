package projetoJava;

import java.util.ArrayList;
import java.util.List;

public class MedicalClinic {
	
	
	private List<Patient> clinic = new ArrayList<Patient>();
	
	
	public MedicalClinic() {
		
	}
	
	public MedicalClinic(List<Patient> clinic) {
		this.clinic = clinic;
	}


	public List<Patient> getClinic() {
		return clinic;
	}


	public void setClinic(List<Patient> clinic) {
		this.clinic = clinic;
	}

	
	
	//CREATE
	public void adicionarPaciente(Patient patient) {
		
		boolean system = false;
			
		for(int i = 0; i < clinic.size(); i++) {
			if(clinic.get(i).getCpf().equals(patient.getCpf())) {
				system = true;
			}else {
			if(clinic.get(i) instanceof PatientBasic && patient instanceof PatientBasic) {
				PatientBasic patientBasic1 = (PatientBasic) clinic.get(i);
				PatientBasic patientBasic2 = (PatientBasic) patient;
				if(patientBasic1.getCpf().equals(patientBasic2.getCpf())) {
					system = true;
					break;
				}
				
			}
			if(clinic.get(i) instanceof PatientPremium && patient instanceof PatientPremium) {
				PatientPremium patientPremium1 = (PatientPremium) clinic.get(i);
				PatientPremium patientPremium2 = (PatientPremium) patient;
				if(patientPremium1.getCpf().equals(patientPremium2.getCpf())) {
					system = true;
					break;
				}
			}
		}
	}
		
		if(!system) {
			System.out.println("Paciente adicionado com sucesso");
			clinic.add(patient);
		} else {
			System.out.println("Paciente já está na lista!!!");
		}
	}
	
	//UPDATE
	public void editarPaciente(String cpf, String nomeAlterado, String cpfAlterado, int idadeAlterada) {
        for(int i = 0; i < clinic.size(); i++) {
            if(clinic.get(i).getCpf().equals(cpf)) {
                clinic.get(i).setNome(nomeAlterado);
                clinic.get(i).setCpf(cpfAlterado);
                clinic.get(i).setIdade(idadeAlterada);
                System.out.println("Paciente Alterado!");
            }
        }
        
    }
	
	
	//BUSCAR PELO NOME
    public void buscarPacientePeloNome(String nome) {
    	boolean achou  = false;
		for(int i=0; i < clinic.size(); i++) {
			if(clinic.get(i).getNome().equalsIgnoreCase(nome)) {
				System.out.println(clinic.get(i).toString());
				achou = true;
				break;
			}
		}
		if(!achou) {
			System.out.println("Paciente não Encontrado!");
		}
	}
    
	
	//DELETE
	public void removerPaciente(String cpf) {
        boolean achou = false;
        for(int i = 0; i < clinic.size(); i++) {
            if(clinic.get(i).getCpf().equals(cpf)) {
                clinic.remove(i);
                achou = true;
            }
        }
        if(!achou) {
        	System.out.println("Paciente não Encontrado");
            
        }else {
        	System.out.println("Paciente removido!!");
        }
    }
	
	
	//TOTAL PACIENTES BASIC
	public int totalPacientesBasic() {
        int contador = 0;
        for(int i = 0; i < clinic.size(); i++) {
            if(clinic.get(i) instanceof PatientBasic) {
                contador++;
                System.out.println(clinic.get(i).toString());
            }
            
        }
        return contador;
    }
	
	//TOTAL PACIENTES PREMIUM
    public int totalPacientesPremium() {
        int contador = 0;
        for(int i = 0; i < clinic.size(); i++) {
            if(clinic.get(i) instanceof PatientPremium) {
                contador++;
                System.out.println(clinic.get(i).toString());
            }
        }
        return contador;
    }
    
    
    //ARRECADAÇÃO TOTAL DA CLINICA
    public Double totalArrecadacao() {
    	Double soma = 0d;
    	for(int i = 0; i < clinic.size(); i++) {
            soma += clinic.get(i).GastoMensalTotalSemDesconto();
        }
    	return soma;
    }
    
    
    //TO STRING
    public void imprimir() {
        System.out.println(clinic);
    }
    
    
}



