package controller.Thread;

public class ThreadVetor extends Thread {
	private int[] vetor;
	private int x;
	
	public ThreadVetor(int x ,int[] vetor) {
		this.x=x;
		this.vetor = vetor;
	}
	@Override
	public void run() {
		Calc();
	}
	private void Calc(){
		if(x % 2 == 0) {
			double timeStart = System.nanoTime();
			for (int y = 0 ; y < vetor.length;y++){
			}
			double timeEnd = System.nanoTime();
			double timeTotal = timeEnd - timeStart;
			timeTotal = timeTotal / Math.pow(10, 9);
			System.out.println("Num = " + x + " Tempo Vetor.lenght = " +timeTotal+ " s.");
		}
		if(x % 2 != 0) {
			double timeStart = System.nanoTime();
			for(int position: vetor) {
			}
			double timeEnd = System.nanoTime();
			double timeTotal = timeEnd - timeStart;
			timeTotal = timeTotal / Math.pow(10, 9);
			System.out.println("Num = " + x + " Tempo Vetor.ForEach = " +timeTotal+ " s.");
		}
	}
}