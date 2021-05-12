package classes;

public class Mestrado extends Estudante{
	private double usarCreditoMestrado;

	public Mestrado(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getUsarCreditoMestrado() {
		return usarCreditoMestrado;
	}

	
}
