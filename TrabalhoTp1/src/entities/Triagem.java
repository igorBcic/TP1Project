package entities;



public class Triagem {
	
	private float temperatura, pressao, oxigenio;
	public boolean paladar,oufato;
	private int nivelGravidade;
	
	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getOxigenio() {
		return oxigenio;
	}

	public void setOxigenio(float oxigenio) {
		this.oxigenio = oxigenio;
	}

	public int getNivelGravidade() {
		return nivelGravidade;
	}

	public void setNivelGravidade(int nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
	
	public void relatorioSaude() {
		
	}
	
	public void statusAtual() {
		
	}

	

}
