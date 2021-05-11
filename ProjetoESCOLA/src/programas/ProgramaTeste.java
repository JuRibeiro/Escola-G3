package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;
import classes.Pos;

public class ProgramaTeste {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		Pos aluno1 = new Pos(123,"111.222.333.444-11");
		aluno1.adicionarNota(5);
		System.out.printf("nota %.2f: \n", aluno1.getPontos());
		aluno1.tirarNota(11);
		System.out.printf("nota %.2f: ", aluno1.getPontos());
	}

}
