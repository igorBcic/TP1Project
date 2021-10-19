package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Recepcionista extends Pessoa{
	private boolean laboratorio, triagem;
	ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
	Triagem triagemPaciente = new Triagem();

	String nome,data,CadUnico;
	Scanner sc = new Scanner(System.in);

	public boolean isLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(boolean laboratorio) {
		this.laboratorio = laboratorio;
	}

	public boolean isTriagem() {
		return triagem;
	}

	public void setTriagem(boolean triagem) {
		this.triagem = triagem;
	}
	
	public void CadastroPaciente(Paciente paciente) {	
		listaPaciente.add(paciente);
	}
	
	@Override
	public void HistoricoSistema() {
		System.out.println("Registros do Recepcionista");
		System.out.println("Pacientes Cadastrados");
		System.out.printf("Nome do Paciente: %s\n",listaPaciente .get(0).getNome());
		System.out.printf("Data do Paciente: %s\n",listaPaciente .get(0).getDataNacimento());
		System.out.printf("Cadastro Unico do Paciente: %s\n",listaPaciente .get(0).getCadastroUnico());
		
		
		
	}
	

}
