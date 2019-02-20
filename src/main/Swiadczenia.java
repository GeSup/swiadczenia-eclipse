package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Swiadczenia extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private Object opcja[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swiadczenia frame = new Swiadczenia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Swiadczenia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Œwidczenia Rodzinne");
		setBounds(100, 100, 515, 362);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnPlik = new JMenu("Plik");
		menuBar.add(mnPlik);

		JMenuItem mntmOtwrz = new JMenuItem("Otwórz");
		mnPlik.add(mntmOtwrz);

		JMenuItem mntmZamknij = new JMenuItem("Zamknij");
		mntmZamknij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				wyjscie();
			}
		});
		mnPlik.add(mntmZamknij);

		JMenu mnNarzdzia = new JMenu("Narzêdzia");
		menuBar.add(mnNarzdzia);

		JMenuItem mntmOpcje = new JMenuItem("Opcje");
		mnNarzdzia.add(mntmOpcje);

		JMenu mnOProgramie = new JMenu("O programie");
		menuBar.add(mnOProgramie);

		JMenuItem mntmWersja = new JMenuItem("wersja");
		mnOProgramie.add(mntmWersja);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		Czas czsCzas = new Czas();
		czsCzas.setHorizontalAlignment(SwingConstants.RIGHT);

		JButton btnWyjcie = new JButton("Wyjœcie");
		btnWyjcie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyjscie();
			}
		});

		JButton btnNowyWniosek = new JButton("Nowy wniosek o zasi³ek rodzinny");
		btnNowyWniosek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				NowyWniosek wniosek = new NowyWniosek();
				wniosek.setVisible(true);

			}
		});

		JLabel lblwiadczeniaRodzinne = new JLabel("Œwiadczenia Rodzinne");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(221)
					.addComponent(lblwiadczeniaRodzinne))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnNowyWniosek))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(btnWyjcie, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addGap(296)
					.addComponent(czsCzas, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblwiadczeniaRodzinne)
					.addGap(18)
					.addComponent(btnNowyWniosek)
					.addGap(192)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnWyjcie)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(czsCzas, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
		czsCzas.start();
		pack();
        setLocationRelativeTo(null);
	}
	
	private void wyjscie(){
		opcja = new Object[] { "Tak", "Nie" };
		int o = JOptionPane.showOptionDialog(frame,
				"Czy napewno chcesz zakoñczyæ program?",
				"Wyjœcie z programu", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE, null, opcja, opcja[0]);
		if (o == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
