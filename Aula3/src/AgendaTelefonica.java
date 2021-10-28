import java.util.HashMap;

public class AgendaTelefonica {
	
	HashMap <String, String> agenda = new HashMap<String, String>();
	
	public void inserir(String nome, String numero) {
		agenda.put(nome,numero);
		System.out.println("Usuario inserido: "+ nome);
	}
	
	public String buscaNumero(String nome) {
		return agenda.get(nome);
	}
	
	public void remover(String nome) {
		
	}
	
	public int tamanho() {
		return agenda.size();
	}
	
}
