package atv1;

public class Assistente extends Funcionario{

	@Override
	public int getMatricula() {
		return super.matricula;
	}
	
	
	public void exibeDados() {
		System.out.println(getMatricula());
	}
}
