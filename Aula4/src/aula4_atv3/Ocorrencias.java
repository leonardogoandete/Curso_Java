package aula4_atv3;

public class Ocorrencias {
	public String p_texto[];
	public String s_texto[];
	public int count = 0;
	
	
	
	public void numOcorrencia(String p_texto) {
		for (int i = 0; i < p_texto.length(); i++) {
			if(p_texto.contains("aa") == true) {
				System.out.println(p_texto.contains(p_texto));
				count++;
			}
		}
		/*
		for (int i = 0; i < p_texto.length(); i++) {
			if (p_texto.equals(s_texto)) {
				count++;
			}		
		}
		*/
		System.out.println(count);
	}
}
