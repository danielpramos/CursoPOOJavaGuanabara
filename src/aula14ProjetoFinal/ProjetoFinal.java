package aula14ProjetoFinal;

public class ProjetoFinal {

	public static void main(String[] args) {
		Video[] v = new Video[3];
		
		v[0] = new Video("Aulas de POO");
		v[1] = new Video("Heranças");
		v[2] = new Video("Polimorfismo");
		
		Gafanhoto[] g = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("David", 28, "M", "logar" );
		g[1] = new Gafanhoto("Diogo", 25, "M", "logar1" );
		
		Visualizacao[] vis = new Visualizacao[2];
		
		vis[0] = new Visualizacao(g[1],v[2]);
		vis[1] = new Visualizacao(g[1], v[1]);
		vis[0] = new Visualizacao(g[1],v[1]);
		
	//	v[0].play();
		vis[0].getFilme().play();
		vis[1].getFilme().play();
	//	vd.avaliar();
	//	vd.avaliar(10);
		vis[0].avaliar(60.5f);
		vis[1].avaliar();
	
		System.out.println(vis[0].toString());
		System.out.println(vis[1].toString());
		
		
		/*System.out.println(g[0].toString());
		System.out.println(vd.toString());
		v[0].play();
		v[0].pause();
		v[0].like();
		System.out.println(v[0].toString());*/
		
		
		
		
		

	}

}
