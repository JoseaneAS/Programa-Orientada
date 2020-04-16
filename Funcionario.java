
public class Funcionario 
{
	private String nome;
	private double salario;
	private int id;
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	} 
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	public double getSalario() 
	{
		return salario;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	public double getAumento() 
	{
	System.out.println("Saldo: ");
		return this.salario * 0.15;
		
	}
}
