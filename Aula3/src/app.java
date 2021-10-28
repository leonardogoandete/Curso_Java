
public class app {

	public static void main(String[] args) {
		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.inserir("Leo","987654");
		
		System.out.println(agenda.buscaNumero("Leo"));
	}
}
