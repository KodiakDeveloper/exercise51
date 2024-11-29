package bookExercises;

import javax.swing.JOptionPane;

public class Ex51 {

	public static void main(String[] args) {

		int userInput, sum = 0, arithmeticMean;

		String userAnswer;

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input array length: "));

			if (userInput <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value and greater than zero!!");
			}

			else {

				JOptionPane.showMessageDialog(null, "Array length: " + userInput);

				int[] numbers = new int[userInput];

				for (int i = 0; i < numbers.length; i++) {

					numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index: " + i));

				}

				for (int i = 0; i < numbers.length; i++) {

					sum += numbers[i];

				}

				arithmeticMean = sum / numbers.length;

				JOptionPane.showMessageDialog(null, "Arithmetic Mean: " + arithmeticMean);
				
				

			}
			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

	}

}
