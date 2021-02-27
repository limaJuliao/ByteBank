
public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;		
	}
	
	public boolean
	transfere(double valor, Conta destino) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
