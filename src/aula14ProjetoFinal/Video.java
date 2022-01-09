package aula14ProjetoFinal;

public class Video implements AcoesVideos{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int media;
		media = (this.getAvaliacao() + avaliacao)/ this.getViews();
		this.avaliacao = media;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		if(this.reproduzindo == false) {
			
			this.setReproduzindo(true);
		//s	this.setViews(this.getViews() + 1);
			System.out.println("Reproduzindo");
		}else {
			System.out.println("Já está reproduzindo");
		}
		
	}
	@Override
	public void pause() {
		if(this.reproduzindo == true){
			
			this.setReproduzindo(false);
			System.out.println("Pausado");
		}
		
	}
	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
		
	}


	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + "\n, curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
	

}
