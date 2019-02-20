package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultCellEditor;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.CardLayout;

import javax.swing.BoxLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.LayoutStyle.ComponentPlacement;

public class OsobaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTable table;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private String rok;
	private JTable table_1;
	private JTable table_2;

	
	/**
	 * Create the frame.
	 */
	public OsobaGUI(JPanel contentPane, Okresy zasilkowe) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Dane osoby", null, panel, null);

		JLabel label = new JLabel("PESEL:");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel label_38 = new JLabel("");

		JLabel label_1 = new JLabel("Imie:");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("Nazwisko:");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel label_3 = new JLabel("P³eæ:");

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Kobieta",
				"Mê¿czyzna" }));

		JLabel label_4 = new JLabel("Data urodzenia:");

		JDateChooser dateChooser = new JDateChooser();

		JLabel label_5 = new JLabel("Stan cywilny:");

		JComboBox comboBox_1 = new JComboBox();

		PeselCheck pesel = new PeselCheck(textField, label_38, comboBox,
				comboBox_1, dateChooser);

		JLabel label_6 = new JLabel("Obywatelstwo:");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane_1.addTab("Adres zamieszkania", null, panel_1, null);

		JLabel label_7 = new JLabel("Nr telefonu:");
		label_7.setBounds(10, 11, 80, 20);
		panel_1.add(label_7);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(90, 11, 90, 20);
		panel_1.add(textField_4);

		JLabel label_8 = new JLabel("e-mail:");
		label_8.setBounds(190, 11, 50, 20);
		panel_1.add(label_8);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(240, 11, 200, 20);
		panel_1.add(textField_5);

		JLabel label_9 = new JLabel("Miejscowoœæ:");
		label_9.setBounds(10, 36, 80, 20);
		panel_1.add(label_9);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(90, 36, 200, 20);
		panel_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(90, 61, 200, 20);
		panel_1.add(textField_7);

		JLabel label_10 = new JLabel("Ulica:");
		label_10.setBounds(10, 61, 108, 20);
		panel_1.add(label_10);

		JLabel label_11 = new JLabel("Nr:");
		label_11.setBounds(300, 61, 40, 20);
		panel_1.add(label_11);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(320, 61, 40, 20);
		panel_1.add(textField_8);

		JLabel label_12 = new JLabel("/");
		label_12.setBounds(365, 61, 20, 20);
		panel_1.add(label_12);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(375, 61, 40, 20);
		panel_1.add(textField_9);

		JLabel label_13 = new JLabel("Kod Pocztowy:");
		label_13.setBounds(10, 86, 90, 20);
		panel_1.add(label_13);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(100, 86, 25, 20);
		panel_1.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(140, 86, 30, 20);
		panel_1.add(textField_11);

		JLabel label_14 = new JLabel("-");
		label_14.setBounds(130, 86, 25, 20);
		panel_1.add(label_14);

		JLabel label_15 = new JLabel("Poczta:");
		label_15.setBounds(190, 86, 50, 20);
		panel_1.add(label_15);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(240, 86, 200, 20);
		panel_1.add(textField_12);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane_1.addTab("Adres zameldowania", null, panel_2, null);

		JLabel label_16 = new JLabel("Nr telefonu:");
		label_16.setBounds(10, 11, 80, 20);
		panel_2.add(label_16);

		JLabel label_17 = new JLabel("Miejscowoœæ:");
		label_17.setBounds(10, 36, 80, 20);
		panel_2.add(label_17);

		JLabel label_18 = new JLabel("Kod Pocztowy:");
		label_18.setBounds(10, 86, 90, 20);
		panel_2.add(label_18);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(100, 86, 25, 20);
		panel_2.add(textField_13);

		JLabel label_19 = new JLabel("-");
		label_19.setBounds(130, 86, 25, 20);
		panel_2.add(label_19);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(140, 86, 30, 20);
		panel_2.add(textField_14);

		JLabel label_20 = new JLabel("Poczta:");
		label_20.setBounds(190, 86, 50, 20);
		panel_2.add(label_20);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(240, 86, 200, 20);
		panel_2.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(90, 36, 200, 20);
		panel_2.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(90, 11, 90, 20);
		panel_2.add(textField_17);

		JLabel label_21 = new JLabel("e-mail:");
		label_21.setBounds(190, 11, 50, 20);
		panel_2.add(label_21);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(240, 11, 200, 20);
		panel_2.add(textField_18);

		JLabel label_22 = new JLabel("Ulica:");
		label_22.setBounds(10, 61, 108, 20);
		panel_2.add(label_22);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(90, 61, 200, 20);
		panel_2.add(textField_19);

		JLabel label_23 = new JLabel("Nr:");
		label_23.setBounds(300, 61, 40, 20);
		panel_2.add(label_23);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(320, 61, 40, 20);
		panel_2.add(textField_20);

		JLabel label_24 = new JLabel("/");
		label_24.setBounds(365, 61, 20, 20);
		panel_2.add(label_24);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(375, 61, 40, 20);
		panel_2.add(textField_21);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane_1.addTab("Adres do korespondencji", null, panel_3, null);

		JLabel label_25 = new JLabel("Nr telefonu:");
		label_25.setBounds(10, 11, 80, 20);
		panel_3.add(label_25);

		JLabel label_26 = new JLabel("Miejscowoœæ:");
		label_26.setBounds(10, 36, 80, 20);
		panel_3.add(label_26);

		JLabel label_27 = new JLabel("Ulica:");
		label_27.setBounds(10, 61, 108, 20);
		panel_3.add(label_27);

		JLabel label_28 = new JLabel("Kod Pocztowy:");
		label_28.setBounds(10, 86, 90, 20);
		panel_3.add(label_28);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(100, 86, 25, 20);
		panel_3.add(textField_22);

		JLabel label_29 = new JLabel("-");
		label_29.setBounds(130, 86, 25, 20);
		panel_3.add(label_29);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(140, 86, 30, 20);
		panel_3.add(textField_23);

		JLabel label_30 = new JLabel("Poczta:");
		label_30.setBounds(190, 86, 50, 20);
		panel_3.add(label_30);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(240, 86, 200, 20);
		panel_3.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(90, 61, 200, 20);
		panel_3.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(90, 36, 200, 20);
		panel_3.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(90, 11, 90, 20);
		panel_3.add(textField_27);

		JLabel label_31 = new JLabel("e-mail:");
		label_31.setBounds(190, 11, 50, 20);
		panel_3.add(label_31);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(240, 11, 200, 20);
		panel_3.add(textField_28);

		JLabel label_32 = new JLabel("Nr:");
		label_32.setBounds(300, 61, 40, 20);
		panel_3.add(label_32);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(320, 61, 40, 20);
		panel_3.add(textField_29);

		JLabel label_33 = new JLabel("/");
		label_33.setBounds(365, 61, 20, 20);
		panel_3.add(label_33);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(375, 61, 40, 20);
		panel_3.add(textField_30);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(23)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		label_1,
																		GroupLayout.PREFERRED_SIZE,
																		40,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(5)
																.addComponent(
																		textField_1,
																		GroupLayout.PREFERRED_SIZE,
																		150,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(5)
																.addComponent(
																		label_2,
																		GroupLayout.PREFERRED_SIZE,
																		70,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		textField_2,
																		GroupLayout.PREFERRED_SIZE,
																		150,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addGap(45)
																								.addComponent(
																										comboBox,
																										GroupLayout.PREFERRED_SIZE,
																										90,
																										GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						label_3,
																						GroupLayout.PREFERRED_SIZE,
																						46,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(65)
																.addComponent(
																		label_4,
																		GroupLayout.PREFERRED_SIZE,
																		90,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(
																		dateChooser,
																		GroupLayout.PREFERRED_SIZE,
																		100,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		label_5,
																		GroupLayout.PREFERRED_SIZE,
																		80,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		comboBox_1,
																		GroupLayout.PREFERRED_SIZE,
																		100,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(20)
																.addComponent(
																		label_6,
																		GroupLayout.PREFERRED_SIZE,
																		90,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(
																		textField_3,
																		GroupLayout.PREFERRED_SIZE,
																		120,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(
														tabbedPane_1,
														GroupLayout.PREFERRED_SIZE,
														559,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addGap(45)
																								.addComponent(
																										textField,
																										GroupLayout.PREFERRED_SIZE,
																										90,
																										GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						label,
																						GroupLayout.PREFERRED_SIZE,
																						60,
																						GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		label_38,
																		GroupLayout.PREFERRED_SIZE,
																		200,
																		GroupLayout.PREFERRED_SIZE)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addGap(21)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_38,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_1,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_2,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(5)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_3,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_4,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(dateChooser,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(5)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_5,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_1,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_6,
												GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(99)
						.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE,
								146, GroupLayout.PREFERRED_SIZE)));
		panel.setLayout(gl_panel);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Wnioskowane œwiadczenia", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblZaznaczWbioskowane = new JLabel("Zaznacz wnioskowane:");
		lblZaznaczWbioskowane.setBounds(10, 11, 150, 20);
		panel_4.add(lblZaznaczWbioskowane);

		JCheckBox chckbxZasiekRodzinny = new JCheckBox("zasi³ek rodzinny");
		chckbxZasiekRodzinny.setBounds(10, 31, 140, 20);
		panel_4.add(chckbxZasiekRodzinny);

		JLabel lblDodatkiDoZasiku = new JLabel(
				"Dodatki do zasi³ku rodzinnego z tytu³u:");
		lblDodatkiDoZasiku.setBounds(10, 51, 225, 20);
		panel_4.add(lblDodatkiDoZasiku);

		JCheckBox chckbxUrodzeniaDziecka = new JCheckBox("urodzenia dziecka");
		chckbxUrodzeniaDziecka.setBounds(10, 71, 166, 20);
		panel_4.add(chckbxUrodzeniaDziecka);

		JCheckBox chckbxOpiekiNadDzieckiem = new JCheckBox(
				"opieki nad dzieckiem w okresie korzystania z urlopu wychowawczego");
		chckbxOpiekiNadDzieckiem.setBounds(10, 91, 443, 20);
		panel_4.add(chckbxOpiekiNadDzieckiem);

		JCheckBox chckbxSamotnegoWychowywaniaDziecka = new JCheckBox(
				"samotnego wychowywania dziecka");
		chckbxSamotnegoWychowywaniaDziecka.setBounds(10, 111, 268, 20);
		panel_4.add(chckbxSamotnegoWychowywaniaDziecka);

		JCheckBox chckbxWychowywaniaDzieckaW = new JCheckBox(
				"wychowywania dziecka w rodzine wielodzietnej");
		chckbxWychowywaniaDzieckaW.setBounds(10, 131, 308, 20);
		panel_4.add(chckbxWychowywaniaDzieckaW);

		JCheckBox chckbxKsztaceniaIRehabilitacji = new JCheckBox(
				"kszta³cenia i rehabilitacji dziecka niepe³nosprawnego");
		chckbxKsztaceniaIRehabilitacji.setBounds(10, 151, 368, 20);
		panel_4.add(chckbxKsztaceniaIRehabilitacji);

		JCheckBox chckbxRozpoczcieRokuSzkolnego = new JCheckBox(
				"rozpoczêcie roku szkolnego");
		chckbxRozpoczcieRokuSzkolnego.setBounds(10, 171, 189, 20);
		panel_4.add(chckbxRozpoczcieRokuSzkolnego);

		JLabel lblPodjciaPrzezDziecko = new JLabel(
				"podjêcia przez dziecko nauki w szkole poza miejscem zamieszkania:");
		lblPodjciaPrzezDziecko.setBounds(10, 191, 466, 20);
		panel_4.add(lblPodjciaPrzezDziecko);

		JCheckBox chckbxNaCzciowePokrycie = new JCheckBox(
				"<html>na czêœciowe pokrycie wydatków zwi¹zanych z zamieszkiwaniem w miejscowoœci, w której znajduje siê siedziba szko³y</html>");
		chckbxNaCzciowePokrycie.setVerticalTextPosition(SwingConstants.TOP);
		chckbxNaCzciowePokrycie.setAutoscrolls(true);
		chckbxNaCzciowePokrycie.setVerticalAlignment(SwingConstants.TOP);
		chckbxNaCzciowePokrycie.setIgnoreRepaint(true);
		chckbxNaCzciowePokrycie.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNaCzciowePokrycie.setBounds(10, 211, 569, 35);
		panel_4.add(chckbxNaCzciowePokrycie);

		JCheckBox chckbxNaCzciowePokrycie_1 = new JCheckBox(
				"<html>na czêœciowe pokrycie wydatków zwi¹zanych z dojazdem do miejscowoœci, w której znajduje siê siedziba szko³y</html>");
		chckbxNaCzciowePokrycie_1.setVerticalTextPosition(SwingConstants.TOP);
		chckbxNaCzciowePokrycie_1.setVerticalAlignment(SwingConstants.TOP);
		chckbxNaCzciowePokrycie_1.setBounds(10, 246, 569, 40);
		panel_4.add(chckbxNaCzciowePokrycie_1);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Dodatkowe informacje", null, panel_5, null);
		panel_5.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 10, 580, 30);
		panel_5.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblKobietaZnajdowaaSi = new JLabel(
				"Kobieta pozostawa³a pod opiek¹ medyczna od");
		lblKobietaZnajdowaaSi.setBounds(0, 5, 277, 20);
		panel_6.add(lblKobietaZnajdowaaSi);

		textField_31 = new JTextField();
		textField_31.setBounds(265, 5, 25, 20);
		panel_6.add(textField_31);
		textField_31.setColumns(10);

		JLabel lblTygodniaCiy = new JLabel("tygodnia ci¹¿y.");
		lblTygodniaCiy.setBounds(295, 5, 200, 20);
		panel_6.add(lblTygodniaCiy);

		JPanel panel_7 = new JPanel();
		panel_7.setAutoscrolls(true);
		panel_7.setBounds(10, 40, 580, 30);
		panel_5.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblOkresPrzyznanegoUrlopu = new JLabel(
				"Pracodawca przyzna³ urlop wychowawczy od");
		lblOkresPrzyznanegoUrlopu.setBounds(0, 5, 280, 20);
		panel_7.add(lblOkresPrzyznanegoUrlopu);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(260, 5, 100, 20);
		panel_7.add(dateChooser_1);

		JLabel lblDo = new JLabel("do");
		lblDo.setBounds(365, 5, 25, 20);
		panel_7.add(lblDo);

		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(385, 5, 100, 20);
		panel_7.add(dateChooser_2);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 70, 580, 50);
		panel_5.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblDodatekDoZasiku = new JLabel(
				"Dodatek z tytu³u samotnego wychowywania dziecka przys³uguje poniewa¿:");

		lblDodatekDoZasiku.setBounds(0, 5, 580, 20);
		panel_8.add(lblDodatekDoZasiku);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(0, 25, 580, 20);
		comboBox_2
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"ojciec dziecka jest nieznany",
								"drugi z rodziców dziecka nie ¿yje",
								"powództwo o ustalenie œwiadczenia alimentacyjnego od drugiego z rodziców zosta³o oddalone" }));
		panel_8.add(comboBox_2);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 120, 580, 80);
		panel_5.add(panel_9);
		panel_9.setLayout(null);

		JCheckBox chckbxDzieckoPosiadaOrzeczenie = new JCheckBox(
				"Dziecko posiada orzeczenie o niepe³nosprawnoœci:");
		chckbxDzieckoPosiadaOrzeczenie.setBounds(0, 5, 315, 20);
		panel_9.add(chckbxDzieckoPosiadaOrzeczenie);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {
				"bez okreœlonego stopnia", "o stopniu lekkim",
				"o stopniu umiarkowanym", "o stopniu znacznym" }));
		comboBox_3.setBounds(315, 5, 170, 20);
		panel_9.add(comboBox_3);

		JLabel lblDataOrzeczenia = new JLabel("Data orzeczenia:");
		lblDataOrzeczenia.setBounds(0, 30, 100, 20);
		panel_9.add(lblDataOrzeczenia);

		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(100, 30, 100, 20);
		panel_9.add(dateChooser_3);

		JLabel lblDataZoeniaWniosku = new JLabel(
				"Data z³o¿enia wniosku o orzeczenie:");
		lblDataZoeniaWniosku.setBounds(0, 55, 214, 20);
		panel_9.add(lblDataZoeniaWniosku);

		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(210, 55, 100, 20);
		panel_9.add(dateChooser_4);

		JLabel lblDataDoKiedy = new JLabel(
				"Data do kiedy przyznano orzeczenie:");
		lblDataDoKiedy.setBounds(210, 30, 214, 20);
		panel_9.add(lblDataDoKiedy);

		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(420, 30, 100, 20);
		panel_9.add(dateChooser_5);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.addTab("Dochody", null, tabbedPane_2, null);

		JPanel panel_10 = new JPanel();
		tabbedPane_2.addTab("Dochód opodatkowany", null, panel_10, null);

		JLabel lblZawiadczeniaZUrzdu = new JLabel(
				"<html>Dochody z zaœwiadczenia z urzêdu skarbowego albo oœwiadczenia o dochodzie podlegaj¹cym opodatkowaniu na zasadach okreœlonych w art. 27, 30b, 30c i 30e ustawy z dnia 26 lipca 1991 r. o podatku dochodowym od osób fizycznych osi¹gniêtym w roku "
						+ zasilkowe.getRokBazowy() + ":</html>");
		lblZawiadczeniaZUrzdu.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblDochd = new JLabel("Dochód:");

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		formattedTextField.setText("0");
		formattedTextField.setColumns(2);

		JLabel lblPodatekNaleny = new JLabel("Podatek nale¿ny:");

		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setHorizontalAlignment(SwingConstants.TRAILING);
		formattedTextField_1.setText("0");
		formattedTextField_1.setColumns(2);

		JLabel lblSkadkaNaUbezpieczenie = new JLabel(
				"Sk³adki na ubezpieczenia spo³eczne odliczone od dochodu:");

		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setHorizontalAlignment(SwingConstants.TRAILING);
		formattedTextField_2.setText("0");

		JLabel lblWysokociSkadekNa = new JLabel(
				"<html>Wysokoœci sk³adek na ubezpieczenie zdrowotne w roku "
						+ zasilkowe.getRokBazowy()
						+ " pochodz¹ca z zaœwiadczenia lub oœwiadczenia:</html>");

		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setHorizontalAlignment(SwingConstants.TRAILING);
		formattedTextField_3.setText("0");

		JLabel lblZ = new JLabel("z³");

		JLabel label_34 = new JLabel("z³");

		JLabel label_35 = new JLabel("z³");

		JLabel label_36 = new JLabel("z³");
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(10)
					.addComponent(lblZawiadczeniaZUrzdu, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDochd, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblZ, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(lblPodatekNaleny, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(10)
					.addComponent(lblSkadkaNaUbezpieczenie, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(lblWysokociSkadekNa, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(450)
							.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(11)
					.addComponent(lblZawiadczeniaZUrzdu, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDochd, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblZ, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPodatekNaleny, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSkadkaNaUbezpieczenie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(lblWysokociSkadekNa, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(15)
							.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(15)
							.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
		);
		panel_10.setLayout(gl_panel_10);

		JPanel panel_11 = new JPanel();
		tabbedPane_2.addTab("Dochód nieopodatkowany", null, panel_11, null);

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ new Integer(1), null, null }, { new Integer(2), null, null },
				{ new Integer(3), null, null }, { new Integer(4), null, null },
				{ new Integer(5), null, null }, { new Integer(6), null, null },
				{ new Integer(7), null, null }, { new Integer(8), null, null },
				{ new Integer(9), null, null },
				{ new Integer(10), null, null }, }, new String[] { "Lp.",
				"Rodzaj dochodu", "Kwota" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class,
					Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(542);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		scrollPane.setViewportView(table);

		JLabel lblDochdZGospodarstwa = new JLabel(
				"Wyliczenie dochodu z gospodarstwa rolnego");

		JLabel lblNaleyPodaDochd = new JLabel(
				"Nale¿y podaæ dochód osi¹gniêty tylko w roku "
						+ zasilkowe.getRokBazowy() + ":");

		JLabel lblPodajIloHa = new JLabel("Podaj iloœæ ha przeliczeniowych:");

		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_32.setText("0");
		textField_32.setColumns(10);

		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_33.setText("0");
		textField_33.setColumns(10);

		JLabel lblPrzezIleMiesiecy = new JLabel("przez ile miesiecy:");

		JLabel label_37 = new JLabel("przez ile miesiecy:");

		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setText("12");
		textField_34.setColumns(10);

		textField_35 = new JTextField();
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setText("12");
		textField_35.setColumns(10);
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNaleyPodaDochd, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDochdZGospodarstwa, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPodajIloHa, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(188)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPrzezIleMiesiecy, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(110)
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(198)
					.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(110)
							.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNaleyPodaDochd, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(lblDochdZGospodarstwa, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPodajIloHa, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrzezIleMiesiecy, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_11.setLayout(gl_panel_11);

		JPanel panel_12 = new JPanel();
		tabbedPane_2.addTab("Dochód zrycza³towany", null, panel_12, null);

		JLabel lblNaleyPodaKwot = new JLabel(
				"<html>Nale¿y podaæ kwotê dochodu po odliczeniu sk³adek i podatku z "
						+ "dzia³anoœci opodatkowanej na podstawie podatku zrycza³towango lub karty podatkowej osi¹gniêtego w roku "
						+ zasilkowe.getRokBazowy() + ":</html>");

		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_36.setColumns(10);
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNaleyPodaKwot, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(461)
					.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNaleyPodaKwot, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(61)
					.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_14 = new JPanel();
		tabbedPane_2.addTab("Dochód utracony", null, panel_14, null);
		
		JLabel lblNaleyPodaDochody = new JLabel("Nale\u017Cy poda\u0107 dochody utracone po 01.01."+zasilkowe.getRokBazowy()+" roku:");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Lp.", "rodzaj dochodu", "uzyskany od ", "uzyskany do", "kwota"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNaleyPodaDochody, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNaleyPodaDochody, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGap(32)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
		);
		panel_14.setLayout(gl_panel_14);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(250);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(80);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_2.addTab("Dochód uzyskany", null, panel_15, null);
		
		JLabel lblNaleyPodaDochody_1 = new JLabel("Nale\u017Cy poda\u0107 dochody uzyskane po 01.01."+zasilkowe.getRokBazowy()+" roku:");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Lp.", "rodzaj dochodu", "uzyskany od ", "uzyskany do", "kwota"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(80);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(80);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(80);
		table_2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrollPane_2.setViewportView(table_2);
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNaleyPodaDochody_1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGap(32)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblNaleyPodaDochody_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
		);
		panel_15.setLayout(gl_panel_15);

		JPanel panel_13 = new JPanel();
		panel_13.setLayout(new GridLayout(0, 4, 0, 0));

		JButton button = new JButton("Zapisz");
		panel_13.add(button);

		JButton button_1 = new JButton("<html>Zak\u0142adka wstecz</html>");
		panel_13.add(button_1);

		JButton button_2 = new JButton("Nast\u0119pna zak\u0142adka");
		panel_13.add(button_2);

		JButton button_3 = new JButton("Odrzu\u0107");
		panel_13.add(button_3);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 613,
						Short.MAX_VALUE)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 613,
						Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_contentPane
						.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								403, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 39,
								GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox_4
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"",
								"<html>renty okreœlone w przepisach o zaopatrzeniu inwalidów wojennych i wojskowych oraz ich rodzin</html>",
								"<html>renty wyp³acone osobom represjonowanym i cz³onkom ich rodzin, przyznane na zasadach "
										+ "<br>okreœlonych w przepisach o zaopatrzeniu inwalidów wojennych i wojskowych oraz ich rodzin</html>",
								"<html>œwiadczenia pieniê¿ne oraz rycza³t energetyczny okreœlone w przepisach o œwiadczeniu pieniê¿nym i "
										+ "<br>uprawnieniach przys³uguj¹cych ¿o³nierzom zastêpczej s³u¿by wojskowej przymusowo zatrudnianym w "
										+ "<br>kopalniach wêgla, kamienio³omach, zak³adach rud uranu i batalionach budowlanych</html>",
								"<html>dodatek kombatancki, rycza³t energetyczny i dodatek kompensacyjny okreœlone w przepisach o "
										+ "<br>kombatantach oraz niektórych osobach bêd¹cych ofiarami represji wojennych i okresu powojennego</html>",
								"<html>œwiadczenie pieniê¿ne okreœlone w przepisach o œwiadczeniu pieniê¿nym przys³uguj¹cym osobom "
										+ "<br>deportowanym do pracy przymusowej oraz osadzonym w obozach pracy przez III Rzeszê Niemieck¹ "
										+ "<br>lub Zwi¹zek Socjalistycznych Republik Radzieckich</html>",
								"<html>emerytury i renty otrzymywane przez osoby, które utraci³y wzrok w wyniku dzia³añ wojennych w "
										+ "<br>latach 1939-1945 lub eksplozji pozosta³ych po tej wojnie niewypa³ów i niewybuchów</html>",
								"<html>renty inwalidzkie z tytu³u inwalidztwa wojennego, kwoty zaopatrzenia otrzymywane przez ofiary "
										+ "<br>wojny oraz cz³onków ich rodzin, renty wypadkowe osób, których inwalidztwo powsta³o w zwi¹zku z "
										+ "<br>przymusowym pobytem na robotach w III Rzeszy Niemieckiej w latach 1939-1945, otrzymywane z "
										+ "<br>zagranicy</html>",
								"<html>zasi³ki chorobowe okreœlone w przepisach o ubezpieczeniu spo³ecznym rolników oraz w przepisach o "
										+ "<br>systemie ubezpieczeñ spo³ecznych</html>",
								"<html>œrodki bezzwrotnej pomocy zagranicznej otrzymywane od rz¹dów pañstw obcych, organizacji "
										+ "<br>miêdzynarodowych lub miêdzynarodowych instytucji finansowych, pochodz¹ce ze œrodków "
										+ "<br>bezzwrotnej pomocy przyznanych na podstawie jednostronnej deklaracji lub umów zawartych z "
										+ "<br>tymi pañstwami, organizacjami lub instytucjami przez Radê Ministrów, w³aœciwego ministra lub "
										+ "<br>agencje rz¹dowe, w tym równie¿ w przypadkach, gdy przekazanie tych œrodków jest dokonywane za "
										+ "<br>poœrednictwem podmiotu upowa¿nionego do rozdzielania œrodków bezzwrotnej pomocy zagranicznej "
										+ "<br>na rzecz podmiotów, którym s³u¿yæ ma ta pomoc</html>",
								"<html>nale¿noœci ze stosunku pracy lub z tytu³u stypendium osób fizycznych maj¹cych miejsce zamieszkania "
										+ "<br>na terytorium Rzeczypospolitej Polskiej, przebywaj¹cych czasowo za granic¹ - w wysokoœci "
										+ "<br>odpowiadaj¹cej równowartoœci diet z tytu³u podró¿y s³u¿bowej poza granicami kraju ustalonych dla "
										+ "<br>pracowników zatrudnionych w pañstwowych lub samorz¹dowych jednostkach sfery bud¿etowej na "
										+ "<br>podstawie ustawy z dnia 26 czerwca 1974 r. - Kodeks pracy (Dz. U. z 2014 r. poz. 1502 i 1662)</html>",
								"<html>nale¿noœci pieniê¿ne wyp³acone policjantom, ¿o³nierzom, celnikom i pracownikom jednostek "
										+ "<br>wojskowych i jednostek policyjnych u¿ytych poza granicami pañstwa w celu udzia³u w konflikcie "
										+ "<br>zbrojnym lub wzmocnienia si³ pañstwa albo pañstw sojuszniczych, misji pokojowej, akcji "
										+ "<br>zapobie¿enia aktom terroryzmu lub ich skutkom, a tak¿e nale¿noœci pieniê¿ne wyp³acone "
										+ "<br>¿o³nierzom, policjantom, celnikom i pracownikom pe³ni¹cym funkcje obserwatorów w misjach "
										+ "<br>pokojowych organizacji miêdzynarodowych i si³ wielonarodowych</html>",
								"<html>nale¿noœci pieniê¿ne ze stosunku s³u¿bowego otrzymywane w czasie s³u¿by kandydackiej przez "
										+ "<br>funkcjonariuszy Policji, Pañstwowej Stra¿y Po¿arnej, Stra¿y Granicznej i Biura Ochrony Rz¹du, "
										+ "<br>obliczone za okres, w którym osoby te uzyska³y dochód</html>",
								"<html>dochody cz³onków rolniczych spó³dzielni produkcyjnych z tytu³u cz³onkostwa w rolniczej spó³dzielni "
										+ "<br>produkcyjnej, pomniejszone o sk³adki na ubezpieczenia spo³eczne</html>",
								"alimenty na rzecz dzieci",
								"<html>stypendia doktoranckie i habilitacyjne przyznane na podstawie ustawy z dnia 14 marca 2003 r. o "
										+ "<br>stopniach naukowych i tytule naukowym oraz o stopniach i tytule w zakresie sztuki (Dz. U. z 2014 r. "
										+ "<br>poz. 1852), stypendia doktoranckie okreœlone w art. 200 ustawy z dnia 27 lipca 2005 r. - Prawo o "
										+ "<br>szkolnictwie wy¿szym (Dz. U. z 2012 r. poz. 572, z póŸn. zm.), stypendia sportowe przyznane na "
										+ "<br>podstawie ustawy z dnia 25 czerwca 2010 r. o sporcie (Dz. U. z 2014 r. poz. 715) oraz inne stypendia "
										+ "<br>o charakterze socjalnym przyznane uczniom lub studentom</html>",
								"<html>kwoty diet nieopodatkowane podatkiem dochodowym od osób fizycznych, otrzymywane przez osoby "
										+ "<br>wykonuj¹ce czynnoœci zwi¹zane z pe³nieniem obowi¹zków spo³ecznych i obywatelskich</html>",
								"<html>nale¿noœci pieniê¿ne otrzymywane z tytu³u wynajmu pokoi goœcinnych w budynkach mieszkalnych "
										+ "<br>po³o¿onych na terenach wiejskich w gospodarstwie rolnym osobom przebywaj¹cym na wypoczynku "
										+ "<br>oraz uzyskane z tytu³u wy¿ywienia tych osób</html>",
								"<html>dodatki za tajne nauczanie okreœlone w ustawie z dnia 26 stycznia 1982 r. - Karta Nauczyciela "
										+ "<br>(Dz. U. z 2014 r. poz. 191 i 1198)</html>",
								"<html>dochody uzyskane z dzia³alnoœci gospodarczej prowadzonej na podstawie zezwolenia na terenie "
										+ "<br>specjalnej strefy ekonomicznej okreœlonej w przepisach o specjalnych strefach ekonomicznych</html>",
								"<html>ekwiwalenty pieniê¿ne za deputaty wêglowe okreœlone w przepisach o komercjalizacji, restrukturyzacji i "
										+ "<br>prywatyzacji przedsiêbiorstwa pañstwowego \"Polskie Koleje Pañstwowe\"</html>",
								"<html>ekwiwalenty z tytu³u prawa do bezp³atnego wêgla okreœlone w przepisach o restrukturyzacji "
										+ "<br>górnictwa wêgla kamiennego w latach 2003-2006</html>",
								"<html>œwiadczenia okreœlone w przepisach o wykonywaniu mandatu pos³a i senatora</html>",
								"dochody uzyskane z gospodarstwa rolnego",
								"<html>dochody uzyskiwane za granic¹ Rzeczypospolitej Polskiej, pomniejszone odpowiednio o zap³acone za "
										+ "<br>granic¹ Rzeczypospolitej Polskiej: podatek dochodowy oraz sk³adki na obowi¹zkowe ubezpieczenie "
										+ "<br>spo³eczne i obowi¹zkowe ubezpieczenie zdrowotne</html>",
								"<html>renty okreœlone w przepisach o wspieraniu rozwoju obszarów wiejskich ze œrodków pochodz¹cych z "
										+ "<br>Sekcji Gwarancji Europejskiego Funduszu Orientacji i Gwarancji Rolnej oraz w przepisach o "
										+ "<br>wspieraniu rozwoju obszarów wiejskich z udzia³em œrodków Europejskiego Funduszu Rolnego na "
										+ "<br>rzecz Rozwoju Obszarów Wiejskich</html>",
								"<html>zaliczkê alimentacyjn¹ okreœlon¹ w przepisach o postêpowaniu wobec d³u¿ników alimentacyjnych oraz "
										+ "<br>zaliczce alimentacyjnej</html>",
								"<html>œwiadczenia pieniê¿ne wyp³acane w przypadku bezskutecznoœci egzekucji alimentów</html>",
								"<html>pomoc materialn¹ o charakterze socjalnym okreœlon¹ w art. 90c ust. 2 ustawy z dnia 7 wrzeœnia 1991 r. "
										+ "<br>o systemie oœwiaty (Dz. U. z 2004 r. nr 256, poz. 2572, z póŸn. zm.) oraz pomoc materialn¹ okreœlon¹ "
										+ "<br>w art. 173 ust. 1 pkt 1, 2 i 8, art. 173a, art. 199 ust. 1 pkt 1, 2 i 4 i art. 199a ustawy z "
										+ "<br>dnia 27 lipca 2005 r. - Prawo o szkolnictwie wy¿szym</html>",
								"<html>kwoty otrzymane na podstawie art. 27f ust. 8-10 ustawy z dnia 26 lipca 1991 r. o podatku dochodowym "
										+ "<br>od osób fizycznych</html>" }));
		TableColumn rodzajDochodu = table.getColumnModel().getColumn(1);
		rodzajDochodu.setCellEditor(new DefaultCellEditor(comboBox_4));
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateRowHeights(table);

			}
		});

	}

	private static void updateRowHeights(JTable table) {
		try {
			for (int row = 0; row < table.getRowCount(); row++) {
				int rowHeight = table.getRowHeight();

				for (int column = 0; column < table.getColumnCount(); column++) {
					Component comp = table.prepareRenderer(
							table.getCellRenderer(row, column), row, column);
					rowHeight = Math.max(rowHeight,
							comp.getPreferredSize().height);
				}

				table.setRowHeight(row, rowHeight);
			}
		} catch (ClassCastException e) {
			System.out.println("B³¹d: " + e);
		}
	}
}
