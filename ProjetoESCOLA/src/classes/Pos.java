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
		if (this.credito >= credito) {
			super.adicionarNota(credito);
		} else {
			System.out.println("Valor de créditos incorreto.");
			System.out.printf("Você possui %.2f\n", this.credito);
		}
	}

	@Override
	public void adicionarNota(double pontos) {
		super.adicionarNota(pontos);
	}

	@Override
	public void tirarNota(double pontos) {
		super.tirarNota(pontos);
	}

}
