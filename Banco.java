
public class Banco {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSenha("joseane@unifametro.com");
		gerente1.setSenha("Un1F@3Etr0");
		gerente1.autenticar("Un1F@3Etr0");
		gerente1.setId(1);
		gerente1.setNome("Joseane Alves");
		gerente1.setSalario(45.550);
		System.out.println(gerente1.getAumento());
		
		
		Telefonista telefonista1 = new Telefonista();
		telefonista1.setId(2);
		telefonista1.setNome("Joseane Alves");
		telefonista1.setSalario(1000);
		telefonista1.setRamal(1);
		
		Secretaria secretaria1 = new Secretaria();
		secretaria1.setId(3);
		secretaria1.setNome("Joseane Alves");
		secretaria1.setSalario(1000);
		secretaria1.setCodDeEstacao(1);
	}

}
