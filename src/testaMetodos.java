
public class testaMetodos {
	public static void main(String[] args) {
		primeirosTestes();
		testaStatic();
	}
	
	public static void testaStatic() {
		System.out.println(Conta.getTotal());
		
	}
	
	public static void primeirosTestes() {
		Conta primeiraConta = new Conta(333, 555);
		
//		primeiraConta.saldo = 200;
		primeiraConta.deposita(200);
//		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Primeira conta: " + primeiraConta.getSaldo());
		System.out.println("Segunda Conta: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta);
		
		System.out.println("---------------------------");
		
		Conta terceiraConta = new Conta(111, 222);

		System.out.println("Primeira Conta: " + primeiraConta.getSaldo());
		primeiraConta.deposita(100);
		System.out.println("Primeira conta apos deposito: " + primeiraConta.getSaldo());
		
		primeiraConta.saca(100);
		System.out.println("Primeira conta apos saque: " + primeiraConta.getSaldo());
		
		System.out.println("Terceira conta: " + terceiraConta.getSaldo());

		boolean sucessoTransferencia = primeiraConta.transfere(300, terceiraConta);
		System.out.println(sucessoTransferencia);
		System.out.println("Primeira Conta apos transferencia: " + primeiraConta.getSaldo());
		System.out.println("Terceira Conta apos transferencia: " + terceiraConta.getSaldo());
		
		// Testando composição de objetos
		Cliente cliente = new Cliente();
		Conta conta = new Conta(123, 456);
		
		cliente.setNome("marcela");		
		
		// Forma mais direta
		Conta contaDaMarcela = new Conta(456, 789);
		contaDaMarcela.setTitular(cliente);	
		
		
//		contaDaMarcela.titular = new Cliente();
//		
//		contaDaMarcela.titular.nome = "Marcela";
	}
} 