package aula10HerancaParte1;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Pedro");
		p2.setNome("João");
		p3.setNome("Jennifer");
		p4.setNome("Cibele");
		
		p2.setCurso("Informática");
		p3.setSalario(550.50);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		

	}

}
