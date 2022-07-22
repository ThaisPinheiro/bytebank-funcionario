
public class TesteReferencia {
	public static void main(String[] args ) {
		Gerente g1 = new Gerente();
		g1.setNome("Carlos");
		g1.setCpf("777.777.777-77");
		g1.setSalario(5000.00);
		
		Funcionario f1 = new Editor();
		f1.setNome("Marco");
		f1.getNome();
		f1.setSalario(2000.0);
		
		Editor e1 = new Editor();
		e1.setSalario(2500.0);
		
		ControleComissao controle = new ControleComissao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
	}
}
