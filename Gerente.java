
public class Gerente extends Funcionario
{
	private String usuario;
	private String senha;
	
	public boolean autenticar(String senha)
	{
		if(this.senha == senha)
		{
			System.out.println("Seja Bem Vindo Ao BANCO SETGET!");
			return true;
		}
		else
		{
			System.out.println("Acesso Negado!!!");
			return false;
		}
	}
	
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}
	public String getUsuario()
	{
		return this.usuario;
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	public String getSenha()
	{
		return this.senha;
	}

	
}

