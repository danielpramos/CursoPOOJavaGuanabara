package aula3InicioEmcapsulamento;

public class UsuarioBanco {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		p1.setNumConta(12345);
		p1.setDono("Daniel");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.depositar(100);
		p1.info();
		
		p2.setNumConta(2468);
		p2.setDono("Francisca");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		p2.info();
	}

}
