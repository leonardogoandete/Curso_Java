package atv1;

public class Tecnico extends Assistente{
	private int bonus = 300;

	public double getBonus() {
		return bonus;
	}
	
	@Override
	public void exibeDados() {
		System.out.println("Mat Tec: "+ getMatricula());
		System.out.println(getBonus());
	}
}
