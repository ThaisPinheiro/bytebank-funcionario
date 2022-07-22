
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(3333);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(cliente);
	}
}
