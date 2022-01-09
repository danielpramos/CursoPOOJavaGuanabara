package aula11HerancaParte2;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno " + this.nome);
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [ \nmatricula=" + matricula + "\n, curso=" + curso + "\n, Nome=" + getNome() + "\n, Idade="
				+ getIdade() + "\n, Sexo=" + getSexo() + " ]";
	}
	
	

}
