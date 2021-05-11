package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;
import classes.Pos;

public class ProgramaTeste {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
<<<<<<< HEAD
		System.out.println("Digite o nome do aluno");
		String nome = leia.next();
		System.out.println("Informe a matricula");
		int matricula = leia.nextInt();
		System.out.println("Informe o CPF");
		String cpf = leia.next();
		System.out.println("dia do niver:");
		int dia = leia.nextInt();
		System.out.println("Nota inicial: ");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico (matricula, cpf, status, dia); //instanciando o objeto
		aluno1.setNome(nome);
		aluno1.adicionarNota(10);
		System.out.println("PONTOS ATUAIS: "+aluno1.getPontos());
		System.out.println("Dia atual");
		int diaAtual = leia.nextInt();
		
		aluno1.bonusAniversario(diaAtual);
		System.out.println("PONTOS após metodo: "+aluno1.getPontos());
=======
		Pos aluno1 = new Pos(123,"111.222.333.444-11");
		aluno1.adicionarNota(5);
		System.out.printf("nota %.2f: \n", aluno1.getPontos());
		aluno1.tirarNota(11);
		System.out.printf("nota %.2f: ", aluno1.getPontos());
>>>>>>> da75bfef52c6ada2e7bfa46bd79c60af9999124d
	}

}
