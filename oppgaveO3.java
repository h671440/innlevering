package oppgaver;

import static java.lang.Integer.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;


public class oppgaveO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = parseInt(showInputDialog("skriv inn ett heltall:"));
		
		int fakulitet = n;
		System.out.println(n +"! ="+n);
		
		do {
			fakulitet--; // fakulitet mister en i verdi for hver loop som utføres
			n = n*fakulitet; // fakulitetet regnes ut: ganger n med (fakultet-1)
			System.out.println("* " + fakulitet);
		}
		while (fakulitet != 1);
		System.out.println("= "+ n);
	}
			
		
		
		
				
		
		
	}
