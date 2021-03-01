
public class AutenticacaoUtil {
	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senha) {
		return this.senha == senha;
	}
}
