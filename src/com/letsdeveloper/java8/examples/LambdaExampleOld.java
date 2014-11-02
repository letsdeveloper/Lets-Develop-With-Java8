package com.letsdeveloper.java8.examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class LambdaExampleOld extends JDialog {

	public LambdaExampleOld() {
		
		JButton okButton = new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		    	setVisible(false);
		    	dispose();
		    }
		});
		add(okButton);
	}
}
