package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			
			String poengtxt = showInputDialog("Skriv inn poengsum");
			int poengsum = parseInt(poengtxt);
			
			String karakter = "Ugyldig poengsum";
			
			
					
				if (poengsum >= 90 && poengsum <= 100) 
				 karakter = "Karakteren din ble: A";
				
				
				if  ((poengsum >= 80) && (poengsum <= 89))
					karakter = "Karakteren din ble: B";
				
				
				if ((poengsum >= 60) && (poengsum <= 79))
					karakter = "Karakteren din ble: C";
				
				
				if ((poengsum >= 50) && (poengsum <= 59)) 
					karakter = "Karakteren din ble: D";
				
				
				if ((poengsum >= 40) && (poengsum <= 49))
					karakter = "Karakteren din ble: E";
				
				 
				if ((poengsum <= 39) && (poengsum >= 0))
					karakter = "Karakteren din ble: F";
				
				if((karakter).equals("Ugyldig poengsum"))
					i = i - 1;
				
				
				showMessageDialog(null,karakter);
				
				
		
				
				
				
				
				
					}
			
			
			
			

		
		 
			
		
		}
	}

		
		
			

			

		


		