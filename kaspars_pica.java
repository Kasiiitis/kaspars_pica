package kaspars_pica;

import javax.swing.JOptionPane;

public class kaspars_pica {

	public static void main(String[] args) {
		String adrese;
		String vards;
		String TelefonaNummurs;
		String parbaude;
		vards = JOptionPane.showInputDialog("Ievadiet savu vardu");
		JOptionPane.showMessageDialog(null, "Svecinâti " +vards, "prieks ar jums iepaziities", JOptionPane.WARNING_MESSAGE);
		adrese = JOptionPane.showInputDialog("ievadiet savu pasreizejo adresi");
		JOptionPane.showMessageDialog(null, "Ðî ir jûsu adrese (pârbaude)?  " +adrese, adrese, JOptionPane.WARNING_MESSAGE);
		TelefonaNummurs = JOptionPane.showInputDialog("ievadiet savu telefona nummuru, lai mçs varçtu paziòot sîkâku informaciju par jûsu pasûtijumu");
		JOptionPane.showMessageDialog(null, "Ðis ir jûsu telefona nummurs (pârbaude)?  " +TelefonaNummurs, TelefonaNummurs, JOptionPane.WARNING_MESSAGE);
		parbaude = TelefonaNummurs = JOptionPane.showInputDialog("ievadiet JA vai NE (Ja jûsu telefona nummurs atbilst vai neatbilst) ");
		JOptionPane.showMessageDialog(null, "Jûsu nummurs tika piefiksçts" +parbaude, parbaude, JOptionPane.WARNING_MESSAGE);
		
		int picasIzmer;
		double izmeraCena= 0;
		String[] option2s = new String[] {"10,20,30,50"};
		String picasIzmerStr = (String) JOptionPane.showInputDialog(null, "Izvçlieties cik lielu picu jûs vçlaties! 10 - 4.99, 20 - 9.99, 30 - 13.99, 50 - 17.99 ");
		picasIzmer = Integer.parseInt(picasIzmerStr);
		System.out.println(picasIzmer);
		switch(picasIzmer) {
		case 10: izmeraCena = 4.99; break;
		case 20: izmeraCena = 9.99; break;
		case 30: izmeraCena = 13.99; break;
		case 50: izmeraCena = 17.99; break;
		}
		System.out.println(picasIzmer);
		System.out.println(izmeraCena);
		int picuSkaits;
		picuSkaits = Integer.parseInt(JOptionPane.showInputDialog("Cik daudz picu jus velaties?"));
		System.out.println(picuSkaits);
		
		double piedevasCena = 0;
		double summa = picuSkaits*izmeraCena+piedevasCena;
		JOptionPane.showMessageDialog(null, "Perkot " +picuSkaits+ "  " +picasIzmer+ "cm picas bûs jâmaksâ Eur" +summa, "Info",JOptionPane.WARNING_MESSAGE);
		
		int piedevas;
		String piedevasStr = (String) JOptionPane.showInputDialog(null, "Izvçlieties savas piedevas!(0 - bez piedevâm, 1 - sçnes,2-olîve, 3-ananâs, 4-ðíiníis)");
		piedevas = Integer.parseInt(piedevasStr);
		switch(piedevas) {
		case 1: piedevasCena = 1.99; break;
		case 2: piedevasCena = 2.99; break;
		case 3: piedevasCena = 1.39; break;
		case 4: piedevasCena = 3.49; break;
		}
		summa = picuSkaits*izmeraCena+piedevasCena;
		JOptionPane.showMessageDialog(null, "Perkot " +picuSkaits+ "  " +picasIzmer+ "cm picas ar piedevâm bûs jâmaksâ Eur" +summa, "Info", JOptionPane.WARNING_MESSAGE);
	}

}
