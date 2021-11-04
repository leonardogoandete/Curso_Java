package atv4;

public class Novo extends Imovel{
	private static final int adicional = 10;
	
	public String Endereco() {
		return super.getEndereco();
	}
	public double getValor() {
		return super.getPreco() + ((super.getPreco()*adicional)/100);
	}
	
	@Override
	public String toString() {
		return "Novo [Endereco= " + Endereco() + ", Valor= " + getValor() + "]";
	}
	
	
}
