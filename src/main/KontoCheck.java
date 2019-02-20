package main;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class KontoCheck {

	private String kontoStr, sprKontoPLStr;
	private BigInteger sprKonto;
	private int modSprKonto;

	KontoCheck(JTextField tf0, JTextField tf1, JTextField tf2, JTextField tf3,
			JTextField tf4, JTextField tf5, JTextField tf6, JTextField tf7,
			JLabel lb) {

		ustKontP(tf0);
		ustKont(tf1, 1);
		ustKont(tf2, 3);
		ustKont(tf3, 3);
		ustKont(tf4, 3);
		ustKont(tf5, 3);
		ustKont(tf6, 3);
		ustKontK(tf7);

		tf0.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf1.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf2.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf3.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf4.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf5.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf6.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});
		tf7.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				lb.setText("");
			}

			public void focusLost(FocusEvent e) {
				sprPL(tf0, tf1, tf2, tf3, tf4, tf5, tf6, tf7, lb);

			}
		});

	}

	private void ustKontP(JTextField tf) {

		tf.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if (tf.getCaretPosition() == 1) {
					tf.transferFocus();

				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void ustKont(JTextField tf, int ile) {
		tylkoCyfry(tf);
		tf.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				if (tf.getCaretPosition() == ile) {
					tf.transferFocus();

				}
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				if (tf.getCaretPosition() == 1) {
					tf.transferFocusBackward();

				}

			}

		});
	}

	private void ustKontK(JTextField tf) {
		tylkoCyfry(tf);
		tf.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				if (tf.getCaretPosition() == 1) {
					tf.transferFocusBackward();

				}
			}

		});
	}

	private void tylkoCyfry(JTextField tf) {
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == '-' && tf.getText().indexOf('-') > -1) {
					e.consume();
					return;
				}
				if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
					e.consume();
				}
			}

		});
	}

	private void sprPL(JTextField tf0, JTextField tf1, JTextField tf2,
			JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6,
			JTextField tf7, JLabel lb) {

		sprKontoPLStr = new String(tf2.getText() + tf3.getText()
				+ tf4.getText() + tf5.getText() + tf6.getText() + tf7.getText()
				+ "2521" + tf1.getText());

		kontoStr = new String(tf0.getText() + tf1.getText() + tf2.getText()
				+ tf3.getText() + tf4.getText() + tf5.getText() + tf6.getText()
				+ tf7.getText());

		if (kontoStr.length() == 28 && tf0.getText().equals("PL")) {
			
				sprKonto = new BigInteger(sprKontoPLStr);
				modSprKonto = sprKonto.mod(BigInteger.valueOf(97)).intValue();

				if (modSprKonto == 1) {
					lb.setText("");
				} else {
					lb.setText("<html>Nieprawid這wa suma kontrolna nr konta<html>");
					lb.setForeground(Color.RED);
				}
			
		} else {
			if (kontoStr.length() < 28 && kontoStr.length() > 2 && tf0.getText().equals("PL")) {
				lb.setText("Za ma這 cyfr w nr konta");
				lb.setForeground(Color.RED);
			}

		}

	}

	/*
	 * private void addFocusL(JTextField tf, JLabel lb) {
	 * tf.addFocusListener(new FocusAdapter() {
	 * 
	 * public void focusGained(FocusEvent e) { lb.setText(""); }
	 * 
	 * public void focusLost(FocusEvent e) { if (!chkKonto) { if
	 * (kontoStr.length() < 28) { lb.setText("za ma這 cyfr w nr konta"); } else
	 * { lb.setText("<html>nieprawid這wa suma kontrolna nr konta<html>"); } } }
	 * }); }
	 */
}
