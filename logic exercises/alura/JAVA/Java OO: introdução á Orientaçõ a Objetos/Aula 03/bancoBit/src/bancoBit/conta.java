package bancoBit;

public class conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// a palavra void serve também quando não queremos
	//retornar nada 
	
	//Metodo que deposita na variavel saldo
	//a palavra this. em qual conta vai ser alterado
	//o atributo
	
	//o uso da palavra this é opcional

	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	//A palavra boolean define que o metodo
	//deve retornar um valor verdadeiro ou falso
	
	//A palavra return retorna o valor boolean do metodo
	public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
	}
}
