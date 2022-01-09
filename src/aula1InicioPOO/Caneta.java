package aula1InicioPOO;

public class Caneta 
{
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	
	
	public Caneta(String modelo, String cor, float ponta, int carga) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
	}



	public void status() 
	{
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Caneta cor: " + this.cor);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Carga: " + this.carga);
			System.out.println("Tampada?: " + this.tampada);
	}
	
	
	
	public void rabiscar() 
	{
		if(tampada == true)
		{
			System.out.println("ERRO: Não posso rabiscar");
		}
		else
		{
			System.out.println("Rabiscando");
		}
	}
	
	public void tampada()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
}
