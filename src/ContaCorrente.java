
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		valor += 0.2;
		return super.saca(valor);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
}
