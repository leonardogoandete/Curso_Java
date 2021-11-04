package atv3;

public class CamaroteSuperior extends Vip{
	private double x = 20;
	@Override
	public double imprimeValor() {
		x+= super.imprimeValor();
		return x;
	}		
}
