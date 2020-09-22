package p1;

public class Tabeller {

	public static void skrivUt(int[] tabell) {
		String output = "";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0)
				output += ", ";
			output += tabell[i] + "";
		}
		
		System.out.println(output);
	}

	public static String tilStreng(int[] tabell) {
		String output = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0)
				output += ",";
			output += tabell[i] + "";
		}
		output += "]";
		
		return output;
	}
	
	public static int summer(int[] tabell) {
		int MODE = 0;
		int sum = 0;
		
		switch (MODE) {
		
		case 0:
			for (int i = 0; i < tabell.length; i++)
				sum += tabell[i];
			break;
			
		case 1:
			int left = tabell.length;
			while (left > 0) {
				sum += tabell[left - 1];
				left--;
			}
			break;
			
		case 2:
			for (int data : tabell)
				sum += data;
			break;
		}
		
		return sum;
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean result = false;
		
		for (int i = 0; i < tabell.length && !result; i++)
			if (tabell[i] == tall)
				result = true;
		
		return result;
	}
	
	public static int posisjonTall(int[] tabell, int tall) {
		int targetIndex = -1;

		for (int i = 0; i < tabell.length && targetIndex == -1; i++)
			if (tabell[i] == tall)
				targetIndex = i;
		
		return targetIndex;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] newArray = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			newArray[i] = tabell[tabell.length - i - 1];
		}
		
		return newArray;
	}
	
	public static boolean erSortert(int[] tabell) {
		boolean sorted = true;
		for (int i = 0; i < tabell.length - 1 && sorted; i++)
			if (tabell[i] > tabell[i + 1])
				sorted = false;
		
		return sorted;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] newArray = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++)
			newArray[i] = tabell1[i];
		
		for (int i = 0; i < tabell2.length; i++)
			newArray[i + tabell1.length] = tabell2[i];
		
		return newArray;
	}
}
