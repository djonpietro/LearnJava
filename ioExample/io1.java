package ioExample;

import javax.swing.JOptionPane;

public class io1 {

	public static void main(String[] args) {
		int a;
		String data;
		
		data = JOptionPane.showInputDialog("Enter bitch: ");
		a = Integer.parseInt(data);
		
		JOptionPane.showMessageDialog(null, "Value: " + a);
	}

}
