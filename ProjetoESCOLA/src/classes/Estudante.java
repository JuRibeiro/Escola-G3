package classes;

public abstract class Estudante 
{
	//atributos - sempre definir se é publico (segurança - private)
	private int matricula;
	private String cpf;
	protected double pontos;
	private boolean status;
	private String nome;
	
	//construtores
	public Estudante(int matricula, String cpf) //2 atributos
	{
		super(); //superclasse - herança
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//sobrecarga de construtor
	public Estudante(int matricula, String cpf, boolean status) //3 atributos
	{
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}

	//sobrecarga de construtor
	public Estudante(int matricula, String cpf, double pontos, boolean status) //4 atributos
	{
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	//encapsulamento - getters and setters -apenas quando os atributos são private

	public int getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public double getPontos() 
	{
		return pontos;
	}

	/*public void setPontos(double pontos) 
	{
		this.pontos = pontos;
	}*/ //não serão alterados os pontos

	public boolean isStatus() // boolean é true ou false
	{
		return status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	//metodos
	//adicionar nota
	public void adicionarNota(double pontos)
	{
		this.pontos = this.pontos + pontos; //totalizador
	}
	//tirar nota
	public void tirarNota (double pontos)
	{
		if(this.pontos>=pontos) {
		this.pontos = this.pontos - pontos;
		} else {
			System.out.println("Movimentação impossível");
		}
	}

}
