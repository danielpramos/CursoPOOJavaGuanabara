package aula1InicioPOO;

public class TesteCaneta {

	public static void main(String[] args) 
	{
		Caneta c1 = new Caneta("Bic", "Azul", 0.5f, 70);
		
		//c1.modelo = "Bic";
		//c1.cor = "Azul";
		//c1.ponta = 0.5f;
		//c1.carga = 70;
		//c1.tampada = false;
		
		
		c1.status();
		c1.tampada();
		c1.rabiscar();
		c1.destampar();
		c1.rabiscar();

	}

}
