package aula12PolimorfismoSobreposicao;

public class Cachorro extends Mamifero {
	
	public void enterrarOsso() {
		System.out.println("Enterrei um osso");
	}
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo ra��o");
	}
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
	

}
