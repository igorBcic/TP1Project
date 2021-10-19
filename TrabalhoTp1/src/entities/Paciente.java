package entities;

public class Paciente extends Pessoa{
	private String cadastroUnico;

	public String getCadastroUnico() {
		return cadastroUnico;
	}

	public Paciente(String cadastroUnico) {
		super();
		this.cadastroUnico = cadastroUnico;
	}
	
	public Paciente() {

	}

	public void setCadastroUnico(String cadastroUnico) {
		this.cadastroUnico = cadastroUnico;
	}
	@Override
	public void HistoricoSistema() {
		System.out.println("Ficha Paciente");
		System.out.printf("Nome Paciente: %s", getNome());
		System.out.printf("Data de Nascimento %s", getDataNacimento());
		System.out.printf("Cadastro Unico %s", cadastroUnico);
		
	}

}
