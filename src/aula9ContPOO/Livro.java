package aula9ContPOO;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalP;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	 
	
	
	public Livro(String titulo, String autor, int totalP, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalP = totalP;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}


	public String detalhes() {
		return "Livro \n[titulo= " + titulo + "\n, autor= " + autor + "\n, totalP= " + totalP + "\n, pagAtual= " + pagAtual
				+ "\n, aberto= " + aberto + "\n, leitor= " + leitor.getNome() + "\n, idade= " + leitor.getIdade() + "\n, sexo= " + leitor.getSexo() + " ]";
	}





	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotalP() {
		return totalP;
	}


	public void setTotalP(int totalP) {
		this.totalP = totalP;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean getAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoa getLeitor() {
		return leitor;
	}


	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.setAberto(true);
		
	}


	@Override
	public void fechar() {
		this.setAberto(false);
		
	}


	@Override
	public void folhear(int p) {
		if(p > this.getTotalP()) {
			this.setPagAtual(0);
		}else {
			this.setPagAtual(p);		
		}
		
	}


	@Override
	public void avancarPag() {
		this.setPagAtual(this.getPagAtual() + 1);
		
	}


	@Override
	public void voltarPag() {
		this.setPagAtual(this.getPagAtual() - 1);
		
	}
	
	

}
