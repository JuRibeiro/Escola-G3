package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Medio;

public class ProgramaMenu {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		char ensino;
		boolean ativo;
		char auxAtivo;
		char tipoMovimento;
		int MOVIMENTACOES = 3; 
		int diaAniversario = 0;
		int dia =  0;
		double nota = 0;
		char op;
		
		//int matricula, String cpf, boolean status CONSTRUTOR ESTUDANTE

			System.out.println("ESCOLA GERA��O G3\nAssista, Aprenda, Execute\n");
			System.out.println("1-B�SICO\n2-M�DIO\n3-GRADUA��O\n4-P�S\n5-MESTRADO\n6-SAIR");
			System.out.println("Digite o c�digo da op��o selecionada: ");
			ensino = leia.next().charAt(0);
			System.out.println("Digite o n�mero da matr�cula: ");
			int matricula = leia.nextInt();
			System.out.println("Digite o CPF: ");
			String cpf = leia.next();
			System.out.println("A conta est� ativa? 1-Sim 2-N�o ");
			auxAtivo = leia.next().charAt(0); 
			ativo = (auxAtivo == '1') ? true : false;
					if(ensino =='1') {
						System.out.println("Digite o dia do seu anivers�rio: ");
						diaAniversario = leia.nextInt();
						System.out.println("Digite que dia � hoje: ");
						dia = leia.nextInt();
					}
			
			System.out.println("\n\n\n");
			System.out.println("ESCOLA GERA��O G3\nAssista, Aprenda, Execute\n");
			
			
			//instanciando conforme atributos
				if(ensino == '1') {
					
					Basico aluno1 = new Basico(matricula, cpf, ativo, diaAniversario);
					
					for(int x = 0; x <MOVIMENTACOES; x++) {
						
						System.out.println("Nota do aluno: "+aluno1.getPontos());
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
							System.out.println("Continuar? 1-Sim 2-N�o");
							op = leia.next().charAt(0); 
							x = (op == '1') ? x : 10;
							
							
					}	System.out.println("Nota do aluno total: "+aluno1.getPontos());
					
					System.out.println("Verificar b�nus de anivers�rio de 10%? 1-Sim 2-N�o");
					op = leia.next().charAt(0);
					if (op == '1') {
						aluno1.bonusAniversario(dia);
						System.out.println("B�nus adicionado! Nota final: "+aluno1.getPontos());
					} else {
						System.out.println("Nota final: "+aluno1.getPontos());
					}
				}
			
				
				char pedirBoletim = ' ';
				
				if(ensino == '2') 
				{
					
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
							
							
							System.out.println("Continuar? 1-Sim 2-N�o");
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

				
				
				
		leia.close();
	}
}