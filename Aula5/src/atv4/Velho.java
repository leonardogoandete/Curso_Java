package atv4;

public class Velho extends Imovel{
	private static final int desconto = 10;
	public double getValor() {
		return super.getPreco() - ((super.getPreco()*desconto)/100);
	}

	@Override
	public String toString() {
		return "Velho [Endereco= " + super.getEndereco() + ", Valor= " + getValor() + "]";
	}
	
	
}
