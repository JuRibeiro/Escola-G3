package classes;

public class Medio extends Estudante 
{
	//atributos
	private char pedirBoletim;

	//construtores
	public Medio(int matricula, String cpf, char pedirBoletim) 
	{
		super(matricula, cpf);
		this.pedirBoletim = pedirBoletim;
	}

	//sobrecarga de construtores
	public Medio(int matricula, String cpf, boolean status, char pedirBoletim) 
	{
		super(matricula, cpf, status);
		this.pedirBoletim = pedirBoletim;
	}
	
	//encapsulamento
	public char getPedirBoletim() 
	{
	
		return pedirBoletim;
	}

	public void setPedirBoletim(char pedirBoletim) 
	{
		this.pedirBoletim = pedirBoletim;
	}
	
	//metodos 
	public void impressaoBoletim(char resposta)
	{
		if (pedirBoletim == 'S')
		{
			for (pedirBoletim =0; pedirBoletim<3;pedirBoletim++)
			{
				System.out.printf("Voce tem ", (pedirBoletim-1), " solicitação(ões) para impressão do boletim este mês\n");
				System.out.printf("\n---BOLETIM MENSAL---\n\n");
				
				for (int i=0; i<10; i++)
				{
				//	System.out.println("Atividade: " , (pedirBoletim+1) , " Pontuação: " ,  chamar os pontos da classe mae , "\n");
				}
				
			    if (pedirBoletim>1)
			    {
			    	System.out.println("Deseja solicitar o boletim novamente? S-sim, N-não");
			    	//fazer um leia aqui ???
			    	if(pedirBoletim == 'N')
			    	{
			    		pedirBoletim = 0;
			    	}
			    }
			}
		}
		
		//else()
		//{
			
		//}
	}
	

}
