package programas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Basico;
import classes.Estudante;
import classes.Medio;
import classes.Pos;

public class ProgramaTeste {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		char ensino;
		boolean ativo;
		char auxAtivo;
		char tipoMovimento;
		int MOVIMENTACOES = 3; 
		int diaAniversario = 0;
		int dia =  0;
		double nota = 0;
		char op;
		
		
//<<<<<<< HEAD
		/*System.out.println("Digite o nome do aluno");
		String nome = leia.next();
		System.out.println("Informe a matricula");
		int matricula = leia.nextInt();
		System.out.println("Informe o CPF");
		String cpf = leia.next();
		System.out.println("dia do niver:");
		int dia = leia.nextInt();
		System.out.println("Nota inicial: ");
		double nota = leia.nextDouble();*/
		
		System.out.println("ESCOLA GERAÇÃO G3\nAssista, Aprenda, Execute\n");
		System.out.println("1-BÁSICO\n2-MÉDIO\n3-GRADUAÇÃO\n4-PÓS\n5-MESTRADO\n6-SAIR");
		System.out.println("Digite o código da opção selecionada: ");
		ensino = leia.next().charAt(0);
		System.out.println("Digite o número da matrícula: ");
		int matricula = leia.nextInt();
		System.out.println("Digite o CPF: ");
		String cpf = leia.next();
		System.out.println("A conta está ativa? 1-Sim 2-Não ");
		auxAtivo = leia.next().charAt(0); 
		ativo = (auxAtivo == '1') ? true : false;
				if(ensino =='1') {
					System.out.println("Digite o dia do seu aniversário: ");
					diaAniversario = leia.nextInt();
					System.out.println("Digite que dia é hoje: ");
					dia = leia.nextInt();
				}
		
		System.out.println("\n\n\n");
		System.out.println("ESCOLA GERAÇÃO G3\nAssista, Aprenda, Execute\n");
		
	/*	Basico aluno1 = new Basico (matricula, cpf, status, dia); //instanciando o objeto
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
*/
		char pedirBoletim = ' ';
		
		if(ensino == '2') {
			
			Medio aluno1 = new Medio (matricula, cpf, ativo, pedirBoletim);
			//nt matricula, String cpf, boolean status, char pedirBoletim
			
			for(int x = 0; x <MOVIMENTACOES; x++) {
				
				System.out.println("Nota do aluno: "+aluno1.totalNota());
				System.out.println("Mov."+(x+1)+" - Digite 1 para adicionar e 2 para retirar nota: ");
				tipoMovimento = leia.next().charAt(0);
					if(tipoMovimento == '1') {
						System.out.println("Valor a ser adicionado: ");
						nota = leia.nextDouble();
						aluno1.adicionarNota(nota);
					} else {
						System.out.println("Valor a ser retirado: ");
						nota = leia.nextDouble();
						aluno1.tirarNota(nota);
					}
					
					
					System.out.println("Continuar? 1-Sim 2-Não");
					op = leia.next().charAt(0); 
					x = (op == '1') ? x : 10;
					
					
			}	System.out.println("Nota do aluno total: "+aluno1.totalNota());
			
			do
			{
				System.out.println("\nDeseja solicitar o boletim? S-sim, N-Nao ");
				op = leia.next().toUpperCase().charAt(0);
				
				if (op == 'S') 
				{
					
				aluno1.impressaoBoletim();
				
				}
				else
				{
					break;
				}
			}
			while (aluno1.getQuantidadeImpressao()!=0 );
			
	
		
		}
}
}

