package atv1;

public class Assistente extends Funcionario{
	@Override
	public int getMatricula() {
		return matricula = 999;
	}
	
	public double bonus() {
		int turno = 2; 
		double adicional = 300;
		
		return turno*adicional; 
	}
	
	@Override
	public void exibeDados() {
		System.out.println("Matricula: " + getMatricula());
		System.out.println(bonus());
	}
}
