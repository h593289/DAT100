package p1;

import static javax.swing.JOptionPane.*;

public class FactorialCalculator {

	  public static void main(String[] args) {
		  
		  int n = 0;
		  long result = 1;
		  
		  while (n == 0) {
			  try {
				  n = Integer.parseInt(showInputDialog("Input a positive integer to factorialize:"));
				  if (n <= 0) {
					  n = 0;
					  showMessageDialog(null, "No. Don't do that.\nP o s i t i v e integer, you hear me?");
				  }
				  else if (n > 20) {
					  n = 0;
					  showMessageDialog(null, "Oh god. Could you go a bit smaller for me?\nPlease?");
				  }
			  }
			  catch (Exception e) {
				  showMessageDialog(null, "Why do you do this to me?");
			  }
		  }
		  
		  for (int i = n; i > 0; i--) {
			  result *= i;
		  }

		  showMessageDialog(null, n + "! = " + result);
	  }
}
