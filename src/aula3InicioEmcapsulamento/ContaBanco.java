package aula3InicioEmcapsulamento;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco(/*int numConta, String tipo, String dono, float saldo, boolean status*/) {
	//	this.numConta = numConta;
	//	this.tipo = tipo;
	//	this.dono = dono;
		this.setSaldo(0);
		this.setStatus(false);

	}
	
	public void info() {
		
		System.out.println("---------------------------------------");
		System.out.println("Numero da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("\n");
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(tipo == "CC")
		{
			//this.saldo = 50;
			this.setSaldo(50);
		}
		else if(tipo == "CP")
		{
			//this.saldo = 150;
			this.setSaldo(150);
		}
		else
		{
			System.out.println("Tipo de conta inválido");
		}
		
		System.out.println("Conta aberta com sucesso ");
	}
	
	public void fecharConta() {
		if(this.getSaldo() < 0)
		{
			System.out.println("Saldo negativo de "+getSaldo());
		}
		if(this.getSaldo() == 0)
		{
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
		else
		{
			System.out.println("Saldo positivo de "+getSaldo()+ "zere o saldo antes de finalizar conta" );
		}
	}
	
	public void depositar(float v) {
		
		if(this.getStatus())
		{
		  // this.saldo = this.saldo + v;
		   this.setSaldo(this.getSaldo() + v);	
		}
		else
		{
			System.out.println("Impossivel depositar" );
		}
	}
	
	public void sacar(float v) {
		if(this.getStatus())
		{
			if(this.getSaldo() >= v)
			{
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Fois sacado "+v+". Saldo de "+getSaldo());
			}
			else
			{
				System.out.println("Saldo insuficiente");
			}
		}
		else
		{
			System.out.println("Conta não existe");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		
	if(this.getTipo() == "CC")
	{
		v = 12;
	}
	else if(this.getTipo() == "CP")
	{
		v = 20;
	}
	
	if(this.getStatus())
	{
		if(saldo > v)
		{
			saldo = saldo - 12;
			
		}
		else
		{
			System.out.println("Saldo Insuficiente");
		}
	}
	else
	{
		System.out.println("Impossivel sacar.");
	}
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
