package oppgaver;

import static java.lang.Integer.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class oppgaveO1 {

	public static void main(String[] args) {
		// trinsberegning av skatt

		String inntekt = showInputDialog("skriv inn bruttoinntekt:");

		double intk = Double.parseDouble(inntekt);

		double sk_sats1 = 0.0170;
		double sk_sats2 = 0.0400;
		double sk_sats3 = 0.1340;
		double sk_sats4 = 0.1640;
		double sk_sats5 = 0.1740;

		if ((intk <= 190350) && (intk > 0)) {
			showMessageDialog(null, "du har ingen trinnsskatt");
		} else if ((intk >= 190350) && (intk <= 267889)) {
			showMessageDialog(null, "trinnskatten din er:" + (intk)*(sk_sats1));
			
		} else if ((intk >= 267900) && (intk <= 643799)) {
			showMessageDialog(null, "trinnskatten din er:" + (intk)*(sk_sats2));
			
		} else if ((intk >= 643800) && (intk <= 969199)) {
			showMessageDialog(null, "trinnskatten din er:" + (intk)*(sk_sats3));
			
		} else if ((intk >= 969200) && (intk <= 1999999)) {
			showMessageDialog(null, "trinnskatten din er:" + (intk)*(sk_sats4));
			
		} else if ((intk >= 2000000)) {
			showMessageDialog(null, "trinnskatten din er:" + (intk)*(sk_sats5));

		} else {
			showMessageDialog(null, "skriv inn en positiv inntekt");

		}

	}

}