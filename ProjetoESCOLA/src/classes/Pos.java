package classes;

public class Pos extends Estudante {
	private double credito;

	public Pos(int matricula, String cpf) {
		super(matricula, cpf);
		credito = 5f;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public void pedirCreditoPos(double credito) {
		if (this.credito >= credito) {
			System.out.printf("Você usou %.2f créditos.\n", (credito));
			super.adicionarNota(credito);
			this.credito -= credito;
			System.out.printf("Você possui %.2f créditos.\n", this.credito);
		} else {
			System.out.println("Valor de créditos incorreto.\n");
			System.out.printf("Você possui %.2f créditos.\n", this.credito);
		}
	}

	@Override
	public void adicionarNota(double pontos) {
		super.adicionarNota(pontos);
	}

	@Override
	public void tirarNota(double pontos) {
		if(super.getPontos()>= pontos) {
			super.tirarNota(pontos);
		}else if ((super.getPontos() + getCredito())>= pontos) {
			pedirCreditoPos((pontos - super.getPontos()));
			super.tirarNota(pontos);
		}else {
			System.out.println("Você não tem pontos e creditos o suficiente.");
		}
	}

}
