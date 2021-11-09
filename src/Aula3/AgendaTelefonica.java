package Aula3;

import java.util.HashMap;
public class AgendaTelefonica {
	
	HashMap <String, String> agenda = new HashMap<String, String>();
	
	public void inserir(String nome, String numero) {
		if(nome == "" || nome == null) { //testa se o nome e nulo ou vazio, se for exibe a mensagem da linha 8
			System.out.println("Nome invalido para cadastro!");
		} else {			
		agenda.put(nome,numero);
		System.out.println("Nome inserido: "+ nome + "\nNumero: "+numero+"\nInserido com sucesso!");
		System.out.println("=========================");
		}
	}
	
	public String buscaNumero(String nome) {
		String x; // utilizado para guardar o numero consultado pelo nome;
			if(nome == "" || nome == null) {  //testa se o nome e nulo ou vazio, se for exibe a mensagem da linha 19
				return "Nome consultado invalido!";
			} else {
				x = agenda.get(nome);  // guarda o numero na variavel X
				if(x == null) { // testa se o numero consultado e nulo, se for retorna a mensagem da linha 23
					return "Numero consultado inexistente";
				} else {
					System.out.print("Numero consultado: "); 
					return agenda.get(nome);
				}	
			}
	}
	
	public void remover(String nome) {
		if(nome == "" || nome == null) { //testa se o nome e nulo ou vazio, se for exibe a mensagem da linha 33
			System.out.println("Nome para remocao invalido!"); 
		} else {
		agenda.remove(nome); 
		System.out.println("Numero removido: " + nome); 
		}
	}
	
	public int tamanho() {
		System.out.print("Contatos existente: ");
		return agenda.size();
	}
	
}
