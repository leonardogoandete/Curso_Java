package atv2_2;

public class Rica extends Pessoa {
	private double dinheiro;
	
	public void fazCompras() {
		if(dinheiro > 0 ) System.out.println(" Gastando dinheiro R$" + dinheiro);
		if(dinheiro <= 0 )System.out.println(" Sem dinheiro!");
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
