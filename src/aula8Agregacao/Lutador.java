package aula8Agregacao;

public class Lutador implements InterfaceLutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
	//	this.categoria = ca;
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}


	public String getCategoria() {
		return categoria;
	}


	private void setCategoria() {
		if(this.getPeso() < 52.2 ) {
			System.out.println("Inválido");
		}else if(this.getPeso() <= 70.3){
			this.categoria = "Leve";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else {
			System.out.println("Inválido");
		}
	}


	public int getVitorias() {
		return vitorias;
	}


	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getDerrotas() {
		return derrotas;
	}


	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}


	public int getEmpates() {
		return empates;
	}


	public void setEmpates(int empates) {
		this.empates = empates;
	}


	@Override
	public void apresentar() {
		System.out.println("-----------------------------------------");
		System.out.print("Hora de apresentar o lutador: " + getNome() );
		System.out.print(" nascido em " + getNacionalidade());
		System.out.println(" com " + getIdade() + " anos, ");
		System.out.print("tem " + getAltura() + "m de altura");
		System.out.print(", Pesando " + getPeso());
		System.out.println(" e ganhou " + getVitorias());
		System.out.print(", empatou " + getEmpates());
		System.out.print(" e perdeu " + getDerrotas());
		System.out.println("\n");
		
	}


	@Override
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Peso: " + getPeso() + "Kg ");
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Empatou: " + getEmpates());
		System.out.println("Perdeu: " + getDerrotas());
		
	}


	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);		
	}


	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);		
	}


	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
		

}
