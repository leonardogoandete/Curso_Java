package atv1;

public class Assistente extends Funcionario{
	private int matricula;
	
	@Override
	public int getMatricula() {
		matricula = 001;
		return matricula;
	}
	
	@Override
	public void exibeDados() {
		System.out.println(this.getMatricula());
	}
}
