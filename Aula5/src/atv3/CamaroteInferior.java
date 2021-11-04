package atv3;

public class CamaroteInferior extends Vip{
	private double x = 0;
	@Override
	public double imprimeValor() {
		x+= super.imprimeValor();
		return x;
	}
}
