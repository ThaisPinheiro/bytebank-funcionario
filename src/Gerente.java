//Gerente herda de funcionário e assina contrato com Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	public double getComissao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
}
