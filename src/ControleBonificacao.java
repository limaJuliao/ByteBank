
public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}

}
