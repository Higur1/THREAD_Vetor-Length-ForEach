package view;
import controller.Thread.ThreadVetor;
public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int [100];
		for (int x = 0; x < vetor.length ;x++ ) {
			vetor[x] = (int)(Math.random()*101);
		}
		for(int x = 0;  x < 2; x++) {
			Thread T = new ThreadVetor(x, vetor);
			T.start();
		}
	}
}
