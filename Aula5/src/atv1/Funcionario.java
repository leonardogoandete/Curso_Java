package atv1;

public class Funcionario {
	protected int matricula;
	
	public void exibeDados() {
		System.out.println(getMatricula());
	}

	public int getMatricula() {
		return matricula;
	}	

}
