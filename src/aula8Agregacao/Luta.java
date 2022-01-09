package aula8Agregacao;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
		
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	 
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() ) {
			if(l1 != l2) {
				this.setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);
			}else {
				System.out.println("Impossivel lutas com lutadores iguais");
			}
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("IMPOSSIVEL LUTA COM CATEGORIA DIFERENTE. NÃO MARCADO!");
		}
	}
	
	public void lutar() {
		if(this.getAprovada()) {
			
			desafiado.apresentar();
			desafiante.apresentar();
			
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3) ;
			System.out.println(vencedor);
			 switch(vencedor) {
			 case 0:
				 this.desafiado.ganharLuta();
				 this.desafiante.perderLuta();
				 System.out.println(this.desafiado.getNome() + " ganhou a luta!");
				 break;
			 case 1:
				 this.desafiado.perderLuta();
				 this.desafiante.ganharLuta();
				 System.out.println(this.desafiado.getNome() + " perdeu a luta!");
				 break;
			 case 2:
				 this.desafiado.empatarLuta();
				 this.desafiante.empatarLuta();
				 System.out.println(this.desafiado.getNome() + " empatou a luta com " + this.desafiante.getNome());
				 break;
			 default:
				 break;
			 }
			
		}else {
			System.out.println("LUTA NÃO APROVADA!");
		}
	}
	
	
}
