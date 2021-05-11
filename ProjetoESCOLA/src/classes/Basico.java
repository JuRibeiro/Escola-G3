package classes;

public class Basico extends Estudante {
	
	private int diaAniversario;

	public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
	super(matricula, cpf, status);
	this.diaAniversario = diaAniversario;
}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(int dia) {
		if(diaAniversario == dia) {
			super.adicionarNota(super.getPontos()*0.1);
		} else {
			System.out.println("Bônus indisponível");
		}
	}
	

}
