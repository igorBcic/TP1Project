package entities;

import java.util.ArrayList;

public class Recepcionista extends Pessoa{
	private boolean laboratorio, triagem;
	ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
	Triagem triagemPaciente = new Triagem();
	Paciente paciente = new Paciente();

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
	
	public void criarPaciente() {
		
	}
	

}
