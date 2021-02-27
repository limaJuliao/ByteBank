
public class testaMetodos {
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
		
		System.out.println("---------------------------");
		
		Conta terceiraConta = new Conta();

		System.out.println("Primeira Conta: " + primeiraConta.saldo);
		primeiraConta.deposita(100);
		System.out.println("Primeira conta apos deposito: " + primeiraConta.saldo);
		
		primeiraConta.saca(100);
		System.out.println("Primeira conta apos saque: " + primeiraConta.saldo);
		
		System.out.println("Terceira conta: " + terceiraConta.saldo);

		boolean sucessoTransferencia = primeiraConta.transfere(300, terceiraConta);
		System.out.println(sucessoTransferencia);
		System.out.println("Primeira Conta apos transferencia: " + primeiraConta.saldo);
		System.out.println("Terceira Conta apos transferencia: " + terceiraConta.saldo);
		
		// Testando composi��o de objetos
		Cliente cliete = new Cliente();
		Conta conta = new Conta();
		
		// Forma mais direta
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";		
	}
} 