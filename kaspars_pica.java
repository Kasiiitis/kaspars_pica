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
	}

}
