public class metodos {

	public static void main(String[] args) {

		int[] nums = new int[20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums[i] *= 10;
			 //System.out.println(nums[i]);
		}
		for (int j = nums.length - 1; j >= 0; j--) {
			//System.out.println(nums[j]);
		}		
		System.out.println("Numero de ocorrencias: "+ nOcorrencias(nums,180));
		System.out.println("Repetiu? "+ hasRepeat(nums));
		System.out.println("Elementos repetidos: "+ nroRepeat(nums));
	} // fim metodo principal main()

// #########################################################
	// Exercicio 2 questao A.
	public static int nOcorrencias(int[] l, Integer el) {
		int cont = 0;
		for (int i = 0; i < l.length; i++) {
			if (l[i] == el) {
				cont++;
			} // if
		}
		return cont;	
	} // nOcorrencias
	
// #########################################################
	// Exercicio 2 questao B.
	public static boolean hasRepeat(int[] l) {
		for(int i = 0; i < l.length; i++) {
			if(l[i] == l.length) return true;
		}	
		return false;
	} //fim hasRepeat


// #########################################################
	// Exercicio 2 questao C.
	public static int nroRepeat(int[] l) {
		int cont = 0;
		for(int i = 0; i < l.length; i++) {
			if(l[i] == l.length) {
				cont++;
			}
		}
		return cont;
	} //fim nroRepeat	

// #########################################################
	// Exercicio 2 questao D.
//	public static int[] listRepeat(int[] l) {
	public static void listRepeat(int[] l) {
		int v[] = new int [l.length];
		for(int i = 0; i < l.length; i++) {
			if(l[i] == l.length) {
				v[i] = l.length;
			}
		}
		
		//for(int i = 0; i < l.length; i++) {
			//System.out.println("==" + v[i]);
		//}
	}	
	
/*
// #########################################################
	// Exercicio 2 questao E.
	public static int[] union(int[] l1, int[] l2) {
		
	}

// #########################################################
	// Exercicio 2 questao F.
	public static int[] intersect(int[] l1, int[] l2) {
		
	}
// #########################################################
	// Exercicio 2 questao G.
	public static int[] difference(int[] l1, int[] l2) {
		
	}
	*/
} // public class metodos
