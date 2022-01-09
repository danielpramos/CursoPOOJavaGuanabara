package aula12PolimorfismoSobreposicao;

public class Reptil extends Animal{
	protected String corEscama;
	
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhas");
	}


	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}


	@Override
	public void alimentar() {
		System.out.println("Comendo folhas");
		
	}


	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil"); 
		
	}


	public String getCorEscama() {
		return corEscama;
	}


	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

	
	
}
