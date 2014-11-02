package com.letsdeveloper.java8.examples;

import javax.swing.JButton;
import javax.swing.JDialog;

public class LambdaExampleNew extends JDialog {

	public LambdaExampleNew() {
		
		JButton okButton = new JButton("Ok");
		okButton.addActionListener(event -> {
			setVisible(false);
			dispose();
		});
		add(okButton);
	}
}
