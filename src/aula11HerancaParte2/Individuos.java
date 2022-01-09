package aula11HerancaParte2;

public class Individuos {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		
		v1.setNome("João");
		v1.setIdade(25);
		v1.setSexo("Masculino");
		
		System.out.println("\n"+v1.toString());
	
		Aluno a1 = new Aluno();
		
		a1.setNome("Felipe");
		a1.setIdade(27);
		a1.fazerAniversario();
		a1.setSexo("Masculino");
		a1.setMatricula(12345);
		a1.setCurso("Java");
		
		System.out.println("\n"+a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 =  new Bolsista();
		
		b1.setNome("Gisele");
		b1.setIdade(20);
		b1.setSexo("Feminino");
		b1.setMatricula(24681);
		b1.setCurso("Design");
		b1.setBolsa(30.5f);
		b1.fazerAniversario();
		
		System.out.println("\n" + b1.toString());
		b1.pagarMensalidade();
		

	}

}
