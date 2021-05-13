package classes;

import java.util.ArrayList;
import java.util.List;

public class Medio extends Estudante 
{
	List<Double> lista = new ArrayList<>();
	
	//atributos
	private char pedirBoletim;
	private int quantidadeImpressao=3;

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
	
	public int getQuantidadeImpressao() {
		return quantidadeImpressao;
	}

	public void setQuantidadeImpressao(int quantidadeImpressao) {
		this.quantidadeImpressao = quantidadeImpressao;
	}

	//metodos 
	public void impressaoBoletim()
	{
		System.out.println();
		System.out.println("BOLETIM MENSAL");

		for (int i=0; i< lista.size(); i++  )
		{
			System.out.printf("Atividade %d, Nota: %.2f \n", (i+1) , lista.get(i) );
		}
		quantidadeImpressao = quantidadeImpressao - 1;
		System.out.printf("Você tem mais %d impressões de boletim", quantidadeImpressao);
	}
	

	@Override
	public void adicionarNota(double pontos)
	{
		lista.add(pontos);
	}
	//tirar nota
	public void tirarNota (double pontos)
	{
		lista.add(pontos*(-1));
	}
	
	public double totalNota ()
	{
		double total=0;
		for(int x=0; x<lista.size(); x++)
		{
			total=total+lista.get(x);
		}
		return total;
	}
	
	

}
