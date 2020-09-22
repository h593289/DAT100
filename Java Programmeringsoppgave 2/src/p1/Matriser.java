package p1;

public class Matriser {
	
	public static void skrivUt(int[][] matrise) {
		
		for (int[] row : matrise) {
			for (int item : row)
				System.out.print(item + "\t");
			System.out.println("\n");
		}
	}
	
	public static String tilStreng(int[][] matrise) {
		
		String output = "";
		
		for (int[] row : matrise) {
			for (int item : row)
				output += item + " ";
			output += "\n";
		}
		
		return output;
	}
	
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] newMatrix = new int[matrise.length][matrise[0].length];
		
		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				newMatrix[y][x] = matrise[y][x] * tall;
		
		return newMatrix;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean areEqual = true;
		
		if (mat1.length != mat2.length)
			areEqual = false;
		
		if (mat1.length > 0 && mat2.length > 0 && areEqual)
			if (mat1[0].length != mat2[0].length)
				areEqual = false;
		
		for (int y = 0; y < mat1.length && areEqual; y++)
			for (int x = 0; x < mat1[y].length && areEqual; x++)
				if (mat1[y][x] != mat2[y][x])
					areEqual = false;
		
		return areEqual;
	}
	
	public static int[][] speile(int[][] matrise) {
		
		int[][] newMatrix = new int[matrise[0].length][matrise.length];
		
		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				newMatrix[x][y] = matrise[y][x];
		
		return newMatrix;
	}
	
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] newMatrix = new int[a.length][b[0].length];
		
		for (int y = 0; y < newMatrix.length; y++)
			for (int x = 0; x < newMatrix[y].length; x++) {
				
				int sum = 0;
				
				for (int i = 0; i < a[y].length; i++)
					sum += a[y][i] * b[i][x];
				
				newMatrix[y][x] = sum;
			}
		
		return newMatrix;
	}

}
