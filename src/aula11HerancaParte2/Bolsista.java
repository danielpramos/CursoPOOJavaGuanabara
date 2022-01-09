package aula11HerancaParte2;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa " + this.nome);
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista. Pagamento facilitado, sua bolsa é de " + this.bolsa + "%");
	}
	

	@Override
	public String toString() {
		return "Bolsista [ \nbolsa=" + bolsa + "\n, nome=" + nome + "\n, idade=" + idade + "\n, Matricula=" + getMatricula()
				+ "\n, Curso=" + getCurso() + "\n, Sexo=" + getSexo() + "]";
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	

}
