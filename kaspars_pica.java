package kaspars_pica;

import javax.swing.JOptionPane;

public class kaspars_pica {

	public static void main(String[] args) {
		String adrese;
		String vards;
		String TelefonaNummurs;
		String parbaude;
		vards = JOptionPane.showInputDialog("Ievadiet savu vardu");
		JOptionPane.showMessageDialog(null, "Svecin�ti " +vards, "prieks ar jums iepaziities", JOptionPane.WARNING_MESSAGE);
		adrese = JOptionPane.showInputDialog("ievadiet savu pasreizejo adresi");
		JOptionPane.showMessageDialog(null, "�� ir j�su adrese (p�rbaude)?  " +adrese, adrese, JOptionPane.WARNING_MESSAGE);
		TelefonaNummurs = JOptionPane.showInputDialog("ievadiet savu telefona nummuru, lai m�s var�tu pazi�ot s�k�ku informaciju par j�su pas�tijumu");
	}

}
