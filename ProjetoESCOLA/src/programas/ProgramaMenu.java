package programas;

import java.util.Scanner;

public class ProgramaMenu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char ensino;
		boolean ativo;
		char auxAtivo;
		//int matricula, String cpf, double pontos, boolean status CONSTRUTOR ESTUDANTE

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
						int diaAniversario = leia.nextInt();
						System.out.println("Digite que dia � hoje: ");
						int dia = leia.nextInt();
					}
			
			System.out.println("\n\n\n");
			System.out.println("ESCOLA GERA��O G3\nAssista, Aprenda, Execute\n");
			
			
			
			
	}

}