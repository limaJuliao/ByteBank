
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return + super.getSalario();
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}
