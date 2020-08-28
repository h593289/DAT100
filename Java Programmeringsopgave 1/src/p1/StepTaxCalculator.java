package p1;

import javax.swing.JOptionPane;

public class StepTaxCalculator {

	public static void main(String[] args) {
		
		final int STEP_COUNT = 4;
		final int[] STEP_REQUIREMENTS = {0, 164101, 230951, 580651, 934051};
		final double[] STEP_PERCENTS = {0.00, 0.93, 2.41, 11.52, 14.52};
		final int DISPLAY_DECIMAL_COUNT = 2;
		
		double currentStepTaxPercent = 0.0;
		double stepTaxTotal = 0.0;
		double grossIncome = 0.0;
		int currentStep = 0;
		
		while (grossIncome <= 0.0)
			try {
				grossIncome = Double.parseDouble(JOptionPane.showInputDialog("Gross income NOK:"));
				if (grossIncome < 0.0)
					JOptionPane.showMessageDialog(null, "I refuse to accept that being your gross income."
							+ "\nInput a non-negative number.");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Input a number, you moron.");
			}
		
		for (int i = STEP_COUNT; i > -1; i--)
			if (grossIncome >= STEP_REQUIREMENTS[i]) {
				currentStepTaxPercent = STEP_PERCENTS[i];
				currentStep = i;
				i = -1;
			}
		stepTaxTotal = currentStepTaxPercent / 100 * grossIncome;
		
		JOptionPane.showMessageDialog(null, "Gross income: " + setDecimalCount(grossIncome, DISPLAY_DECIMAL_COUNT) +
				"NOK\n\nStep: " + currentStep +
				"\nStep tax rate: " + currentStepTaxPercent +
				"%\n\nStep tax: " + setDecimalCount(stepTaxTotal, DISPLAY_DECIMAL_COUNT) +
				"NOK\nGross income - step tax: " + setDecimalCount(grossIncome - stepTaxTotal, DISPLAY_DECIMAL_COUNT) + "NOK");
	}
	
	private static double setDecimalCount(double num, int decimalCount) {
		return (int)(Math.pow(10, decimalCount) * num + 0.5)/Math.pow(10, decimalCount);
	}
	
}
