package aula9ContPOO;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		
		p[0] = new Pessoa("Daniel", 30, "M");
		p[1] = new Pessoa("Douglas", 34, "M");
		p[2] = new Pessoa("Nadja", 63, "F");
		
		l[0] = new Livro("Aprendendo Java", "José Francisco", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Pedro Pereira", 500, p[1]);
		l[2] = new Livro("java Avançado", "João Bonifácio", 500, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(400);
		System.out.println(l[0].detalhes());
		
		l[1].folhear(300);
		System.out.println(l[1].detalhes());
		

	}

}
