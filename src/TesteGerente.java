
public class TesteGerente {
	public static void main(String [] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Carlos");
		g1.setCpf("777.777.777-77");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(7777);
		boolean autenticou = g1.autentica(7777);
		System.out.println(autenticou);
		System.out.println(g1.getComissao());
		
		ControleComissao controle = new ControleComissao();
		controle.registra(g1);
		System.out.println(controle.getSoma());
		
		
	}
}
