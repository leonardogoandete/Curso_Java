package Aula3;

public class app {

	public static void main(String[] args) {
		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.inserir("Leo","987654");
		agenda.inserir("Ana","7897856");
		agenda.inserir("Dog", "7418");
		agenda.inserir(null, null);
		agenda.inserir("", null);
		agenda.inserir("", "515115");
		
		//System.out.println(agenda.buscaNumero("k"));
		//System.out.println(agenda.tamanho());
		agenda.remover("Ana");
		
		System.out.println(agenda.buscaNumero("Ana"));
		
		
	}
}
