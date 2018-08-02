package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		//NEED HELP

		String a = JOptionPane.showInputDialog("Please enter any number...");
		
		int n = Integer.parseInt(a);
		
		if(n > 1) {
			
			double c = n / 2;
			if(c % 1 == 0) {
				System.out.println(c);
				JOptionPane.showMessageDialog(null, "your number is not prime!");
			}
			
			else {
				double d = n / 3;
				if(d % 1 != 0) {
				JOptionPane.showMessageDialog(null, "your number is prime!");
			}
				
		}
		 if(n <= 1){
			JOptionPane.showMessageDialog(null, "Your number must be greater than one to be prime!");
		}
		
	}
}
}