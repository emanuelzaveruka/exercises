package bancoBitV3;
/**
 * @author Emanuel Zaveruka
 *
 */
public class Conta {
	
	//attributes
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//method that deposits in the object
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	//method that pulls the object
	public boolean
	saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
	}
	//method that transfers the object
	public boolean transfere(double valor, Conta destino) {
		  if(this.saldo >= valor) {
			  this.saldo -= valor;
			  destino.deposita(valor);
			  return true;
		  }
		  return false;
	}
	
	//Getters and Setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
