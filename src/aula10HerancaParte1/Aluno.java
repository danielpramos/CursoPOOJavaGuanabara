package aula10HerancaParte1;

public class Aluno extends Pessoa{

	private int matri;
	private String curso;
	
	public void cancelarMatricula() {
		System.out.println("Matricula Cancelada");
	}

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

}
