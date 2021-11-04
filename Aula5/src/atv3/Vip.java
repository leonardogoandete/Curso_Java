package atv3;

public class Vip extends Ingresso{
	private double x = 12;
	public double imprimeValor() {
		x+= super.imprimeValor();
		return x;
	}		
	
}
