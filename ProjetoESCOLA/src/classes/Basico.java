package classes;
//Estudante é mae da classe basico
public class Basico extends Estudante
{
	//atributo
	private int diaAniversario;

	//construtor
	public Basico(int matricula, String cpf, int diaAniversario) 
	{
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	//sobrecarga de construtor
	public Basico(int matricula, String cpf, boolean status, int diaAniversario) 
	{
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	
	//encapsulamento
	public int getDiaAniversario() 
	{
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) 
	{
		this.diaAniversario = diaAniversario;
	}
	
	//metodos
	public void bonusAniversario(int dia)
	{
		if (diaAniversario == dia)
		{
			super.adicionarNota((super.getPontos()*(0.1))); //super (classe mae)
		}
	}
	

}
