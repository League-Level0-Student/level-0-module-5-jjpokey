package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
	

		String a = JOptionPane.showInputDialog("Please enter any number...");
		
		int n = Integer.parseInt(a);
		
		for(int i = 2; i<n;i++) {
			if(n%i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is composite!");
				System.exit(0);
			}
		}
				JOptionPane.showMessageDialog(null, "Your number is prime!");
			}
		
	}
