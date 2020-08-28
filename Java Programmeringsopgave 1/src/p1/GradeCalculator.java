package p1;

import javax.swing.JOptionPane;

public class GradeCalculator {

	public static void main(String[] args) {
		
		final String[] GRADE_NAMES = {"A", "B", "C", "D", "E", "F"};
		final int[] GRADE_REQUIREMENTS = {90, 80, 60, 50, 40, 0};
		final int STUDENT_COUNT = 10;
		final int MAX_POINTS = 100;
		
		int[] pointTotals = new int[STUDENT_COUNT];
		String[] grades = new String[STUDENT_COUNT];
		String resultsMessage = "Test results:\n";
		
		for (int i = 0; i < STUDENT_COUNT;) {
			try {
				pointTotals[i] = Integer.parseInt(JOptionPane.showInputDialog(
						"Student " + (i + 1) + " point total:"));
				if (pointTotals[i] >= 0 && pointTotals[i] <= MAX_POINTS) {
					for (int j = 0; j < GRADE_NAMES.length; j++)
						if (pointTotals[i] >= GRADE_REQUIREMENTS[j]) {
							grades[i] = GRADE_NAMES[j];
							j = GRADE_NAMES.length;
						}
					resultsMessage += "\nStudent " + (i + 1) + ": " + pointTotals[i] + " points, " + grades[i];
					
					JOptionPane.showMessageDialog(null, "Student " + (i + 1) + 
							" test result:\n\nPoints: " + pointTotals[i] +
							"\nGrade: " + grades[i]);
					
					i++;
				}
				else
					JOptionPane.showMessageDialog(null, "Input an integer within the range of 0 - 100.");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Input an integer, smartass.");
			}
		}
		
		JOptionPane.showMessageDialog(null, resultsMessage);
	}
}
