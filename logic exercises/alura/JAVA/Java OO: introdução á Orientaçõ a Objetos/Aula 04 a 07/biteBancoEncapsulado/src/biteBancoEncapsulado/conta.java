package biteBancoEncapsulado;

public class conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public conta(int agencia) {
		if(agencia <= 0) {
			
			System.out.println("agencia invalida");
		}
		total++;
	}
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean
	saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
	}
	
	public boolean transfere(double valor, conta destino) {
		  if(this.saldo >= valor) {
			  this.saldo -= valor;
			  destino.deposita(valor);
			  return true;
		  }
		  return false;
	}
	public static int getTotal() {
		return conta.total;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
