package aula13PolimorfismoSobrecarga;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("Au, Au, Au!!");
	}
	
	public void reagir(String frase) {
		if(frase == "Olá" || frase == "Tudo Bem") {
			System.out.println("Abanando rabo e latindo");
		}else {
			System.out.println("Rosnando");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora <12) {
			System.out.println("Abanando rabo");
		}else if(hora >= 18) {
			System.out.println("Ignorando");
		}else {
			System.out.println("Abanando rabo e latindo");
		}
	}
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("Abanando rabo");
		}else {
			System.out.println("Rosnando");
		}
	}
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso <10) {
				System.out.println("Abanando rabo");
			}else {
				System.out.println("latindo");
			}
		}else {
			if(peso < 10) {
				System.out.println("Rosnando");
			}else {
				System.out.println("Ignorando");
			}
		}
	
	}
	
	

}
