
public class testaMetodos {
	public static void main(String[] args) {
//		primeirosTestes();
		
//		testaStatic();
		
//		TestaFuncionario();
		
//		TesteGerente();
		
//		testeReferencias();
		
//		testeConta();
		
		testeSistema();
	}
	
	public static void testeSistema() {
		Gerente gerente = new Gerente();
		gerente.setSenha("2222");
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(gerente);
	}
	
	public static void testeConta() {
		ContaCorrente cc = new  ContaCorrente(123, 123);
		ContaPoupanca cp = new ContaPoupanca(456, 789);
		
		cc.deposita(1000);
		cc.transfere(500, cp);
		
		System.out.println("Corrente: " + cc.getSaldo() +
				"\nPoupança: " + cp.getSaldo());
	}
	
	public static void testeReferencias() {
		Gerente g = new Gerente();
		g.setNome("Manuel");
		g.setSalario(5000);
		
		EditorVideo ed = new EditorVideo();
		ed.setNome("Gilson");
		ed.setSalario(2000);
		
		Designer d = new Designer();
		d.setNome("Elaine");
		d.setSalario(1000);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g);
		cb.registra(ed);
		cb.registra(d);
		
		System.out.println("Total em bonificações: " + cb.getSoma());
	}	
	
	public static void TesteGerente() {

		Gerente gerente = new Gerente();
		gerente.setNome("Julio Cesar");
		gerente.setCpf("11122233344");
		gerente.setSalario(5000);
		gerente.setSenha("12345");
		
		boolean autenticou = gerente.autenticaSenha("12345");
		
		System.out.println("Nome: " + gerente.getNome() + 
				"\nCPF: " + gerente.getCpf() +
				"\nSalário: " + gerente.getSalario() +
				"\nBonificação: " + gerente.getBonificacao() +
				"\nAutentica Senha: " + autenticou);
	}
	
	public static void TestaFuncionario() {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Julio Cesar");
		funcionario.setCpf("11122233344");
		funcionario.setSalario(1700);
		
		System.out.println("Nome: " + funcionario.getNome() + 
				"\nCPF: " + funcionario.getCpf() +
				"\nSalário: " + funcionario.getSalario() +
				"\nBonificação: " + funcionario.getBonificacao());
	}
	
	public static void testaStatic() {
		System.out.println(Conta.getTotal());
		
	}
	
	public static void primeirosTestes() {
		ContaCorrente primeiraConta = new ContaCorrente(333, 555);
		
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
		
		ContaCorrente terceiraConta = new ContaCorrente(111, 222);

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
		ContaCorrente conta = new ContaCorrente(123, 456);
		
		cliente.setNome("marcela");		
		
		// Forma mais direta
		ContaCorrente contaDaMarcela = new ContaCorrente(456, 789);
		contaDaMarcela.setTitular(cliente);	
		
		
//		contaDaMarcela.titular = new Cliente();
//		
//		contaDaMarcela.titular.nome = "Marcela";
	}
} 