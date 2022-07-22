
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario thais = new Gerente();
		thais.setNome("Thais Pinheiro");
		thais.setCpf("888.888.888-88");
		thais.setSalario(3000.00);
		
		System.out.println(thais.getNome());
		System.out.println(thais.getComissao());
		

	}
}
