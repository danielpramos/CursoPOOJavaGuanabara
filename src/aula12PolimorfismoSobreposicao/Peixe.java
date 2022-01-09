package aula12PolimorfismoSobreposicao;

public class Peixe extends Animal{
	protected String corEscama;
	
	public void fazerBolhas() {
		System.out.println("Fazendo Bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Plancton");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Não emite som");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
