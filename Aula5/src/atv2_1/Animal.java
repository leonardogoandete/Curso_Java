package atv2_1;

public class Animal {
	private String nome, raca;
	
	public Animal() {
		
	}
	
	public Animal(String nome) {
		this.setNome(nome);
	}
	
	public String caminha() {
		return "caminha";		
	}
	
// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Nome= " + nome +
				"\nRaca= " + raca + 
				"\nCaminha= " + caminha();
	}
	
}
