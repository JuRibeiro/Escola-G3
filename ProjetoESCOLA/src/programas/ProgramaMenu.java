package programas;

import java.util.Scanner;

public class ProgramaMenu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char ensino;
		boolean ativo;
		char auxAtivo;
		//int matricula, String cpf, double pontos, boolean status CONSTRUTOR ESTUDANTE

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
						int diaAniversario = leia.nextInt();
						System.out.println("Digite que dia é hoje: ");
						int dia = leia.nextInt();
					}
			
			System.out.println("\n\n\n");
			System.out.println("ESCOLA GERAÇÃO G3\nAssista, Aprenda, Execute\n");
			
			
			
			
	}

}