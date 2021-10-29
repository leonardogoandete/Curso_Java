public class metodos {
	public static int[] nums;
	public static int[] nums2;
	public static void main(String[] args) {
		nums = new int [20];
		nums2 = new int [20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums2[i] *= 10;
			 System.out.println(nums[i]);
		}
		for (int j = nums.length - 1; j >= 0; j--) {
			System.out.println(nums[j]);
			nums2[j] = nums[j];
		}		
		System.out.println("Numero de ocorrencias: "+ nOcorrencias(nums,180));
		System.out.println("Repetiu? "+ hasRepeat(nums));
		System.out.println("Elementos repetidos: "+ nroRepeat(nums));
		//System.out.println(listRepeat(nums));
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
/*
	// Exercicio 2 questao D.
	public static int[] listRepeat(int[] l) {
	//public static void listRepeat(int[] l) {
		int v[] = new int [l.length];
		for(int i = 0; i < l.length; i++) {
			if(l[i] == l.length) {
				v = l[i];
			}
		}
		return v;
	}	


// #########################################################
	// Exercicio 2 questao E.
	public static int[] union(int[] nums, int[] nums2) {
		int [] voltaUniao = new int [50];
		int contAux = 0;
			 for (int i = 0; i < voltaUniao.length; i++) {
				if(i == 20) {
					contAux = 0;
				}
				if (contAux < 20) {
				//	voltaUniao[i] = nums;
				}
				if (contAux > 20) {
				//	voltaUniao[i] = nums2;
				}
				contAux++;
			}
			 return voltaUniao;
	}
/*
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
