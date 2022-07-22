
public class ControleComissao {
	private double soma;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getComissao();
		this.soma = this.soma + bonificacao;
	}

	public double getSoma() {
		return soma;
	}
}
