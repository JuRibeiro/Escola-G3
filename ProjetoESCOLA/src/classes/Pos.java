package classes;

public class Pos extends Estudante {
	private double credito;

	public Pos(int matricula, String cpf) {
		super(matricula, cpf);
		credito = 10f;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public void pedirCreditoPos(double credito) {
		do {
			if (this.credito >= credito) {
				super.adicionarNota(credito);
				break;
			} else {
				System.out.println("Valor de créditos incorreto.");
				System.out.printf("Você possui %.2f", this.credito);
			}
		} while (this.credito != 0f);
	}

}
