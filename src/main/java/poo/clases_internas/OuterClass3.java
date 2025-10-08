package poo.clases_internas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OuterClass3 extends JFrame {
	public static void main(String[] args) {
		OuterClass3 outer = new OuterClass3();
		JButton button = new JButton("Cliqueame!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Ouch!");
				// System.out.println(button.getClass()); // class javax.swing.JButton
			}
		});
		outer.setDefaultCloseOperation(EXIT_ON_CLOSE); // liberar el recurso
		outer.add(button);
		outer.pack(); // adapta el tam del boton al contenido
		outer.setVisible(true); // mostrar el boton
	}
}