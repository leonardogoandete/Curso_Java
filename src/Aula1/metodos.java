package Aula1;

public class metodos {
	public static int[] nums;
	public static int[] nums2;
	public static void main(String[] args) {
		nums = new int [20];
		nums2 = new int [20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums2[i] = nums[i] *= 10;
			 System.out.print(nums[i] + "-");
		}
		System.out.print("\n");
		for (int j = nums2.length - 1; j >= 0; j--) {
			System.out.print(nums2[j] + "-");
			//listRepeat(nums2);
		}	
		System.out.println("\nNumero de ocorrencias: "+ nOcorrencias(nums,180));
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
	public static void listRepeat(int[] l) {
		nums = new int [20];
		for (int i = 0; i < l.length; i++) {
			System.out.println("teste D:"+ l[i]);
		}	
	}
/*
// #########################################################
	// Exercicio 2 questao E.
	public static void union(int[] l1, int[] l2) {
		int [] voltaUniao = new int [20];
		int contAux = 0;
			 for (int i = 0; i < l1.length; i++) {
				if(i == 20) {
					contAux = 0;
				}
				if (contAux < 20) {
					voltaUniao[i] = l1[i];
				}
				if (contAux > 20) {
					voltaUniao[i] = l2[i];
				}
				contAux++;
			}
			 //return voltaUniao;
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
