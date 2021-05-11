package OrdenacaoRecursao;
//Recursividade
public class Recursividade {
	public static void main(String[] args) {
		System.out.println(fatorial(5));
		//System.out.println(fatorialNaoRecursivo(5));
	}
	public static int fatorial(int num) {
		if(num ==0) { //ponto de parada//
			return 1;
		}
		return num * fatorial(num-1);}
	
	public static int fatorialNaoRecursivo(int num){
		if(num ==0) { //ponto de parada//
			return 1;
		}
		int total = 1;
		for (int i = num; i>1; i--) {
			total *=i;
		}
		return total;
	}
	
	
}
