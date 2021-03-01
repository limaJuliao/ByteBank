
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	//construtor
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma Conta");
		total++;
	}
	
	// Comportamentos
	public abstract void deposita(double valor);
	
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
	
	
	//Getter
	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	//Setter
	public void setNumero(int numero) {
		this.numero = numero;
	}	

    public int getNumero(){
        return this.numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }
	
}
