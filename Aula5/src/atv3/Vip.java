package atv3;

public class Vip extends Ingresso{
	private double x = 12;
	@Override
	public double imprimeValor() {
		x+= super.imprimeValor();
		return x;
	}		
	
}
