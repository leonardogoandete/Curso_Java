package aula4_atv2;

public class ExibeString {
private String texto;
private int numero;
	public void setTexto(String frase, int vezes) {
		this.texto = frase;
		this.numero = vezes;
	}
	
	private String getTexto() {
		return this.texto;
	}
	
	public void exibeTela() {
		System.out.println("Numero fornecido:"+numero);
		for (int i = 0; i < numero; i++) {
			System.out.println(i+"-"+getTexto());
		}
	}
}

