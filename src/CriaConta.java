
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo +=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda Conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
	}
}