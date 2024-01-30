package arraysBidimensionales;

public class Ejercicio04 {

	public static void main(String[] args) {
		int[][] mul = new int[10][10];

		for (int i=0 ; i<mul.length ; i++){
			for (int j=0 ; j<mul[0].length ; j++ ) {
				mul [i][j] = (j+1)*(i+1);
			}
		}
		
		for (int i=0 ; i<mul.length ; i++) {
			for (int j=0 ; j<mul[0].length ; j++ ) {
				System.out.print(mul[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
