package Day2;

import javax.swing.JOptionPane;

public class Temperature_Conversion {
	
	public static double FtoC(double F){
		double C = 5.0 / 9 * (F - 32);
		return C;
	}
	
	public static double CtoF(double C){
		double F = 9.0 / 5 * (C+32);
		return F;
	}

	public static void main(String[] args) {
		int reply = JOptionPane.YES_OPTION;
		while (reply == JOptionPane.YES_OPTION){
			
			Object[] options = { "F to C", "C to F"};
			int type = JOptionPane.showOptionDialog(null,"Convert from F to C or from C to F?", "type",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
			
			if (type == 0){

				double F = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter degree in F"));
				while( (F<-100) || (F>100)){
					F = Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid Input. Enter a number between -100 and 100:"));
					
				}
				JOptionPane.showMessageDialog(null, "Degree in Celsius is: "+ FtoC(F) );
			}
			else {
				double C = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter degree in C: "));
				while ( (C<-100) || (C>100)) {
					C = Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid Input. Enter a number between -100 and 100:"));
				}
				JOptionPane.showMessageDialog(null, "Degree in Fahrenheit is: " + CtoF(C));
			}
			reply = JOptionPane.showConfirmDialog(null,"Run program again?","Run",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		}
	}
}

