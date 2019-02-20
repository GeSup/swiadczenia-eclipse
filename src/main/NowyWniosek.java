package main;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NowyWniosek extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_9;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField txtPl;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JTextField textField_35;
    private JTextField textField_36;
    private JTextField textField_37;
    private JTextField textField_38;
    private JTextField textField_39;
    private JTextField textField_40;
    private JTextField textField_16;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTable table;
    private JTable table_1;
    private JTextField textField_31;
    private Osoba wnioskdawca;
    private Okresy zasilkowe;
    private Rodzina rodzina;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NowyWniosek frame = new NowyWniosek();
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
    public NowyWniosek() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 630, 460);
        contentPane = new JPanel();
        contentPane.setBorder(null);
        setContentPane(contentPane);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        tabDaneWnioskodawcy(tabbedPane);
        tabWnioskowaneSwiadczenia(tabbedPane);
        tabWyliczenieDochodu(tabbedPane);
        tabInformacjeKoncowe(tabbedPane);

        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent arg0) {
                if (tabbedPane.getSelectedIndex() == 2) {
//                    fireTableStructureChanged();
                }
            }
        });

        JPanel panel_9 = new JPanel();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane
                .setHorizontalGroup(gl_contentPane
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_contentPane
                                        .createSequentialGroup()
                                        .addGroup(
                                                gl_contentPane
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addComponent(
                                                                panel_9,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                604,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                tabbedPane,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(
                                                GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
                Alignment.LEADING).addGroup(
                Alignment.TRAILING,
                gl_contentPane
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
                                354, Short.MAX_VALUE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 39,
                                GroupLayout.PREFERRED_SIZE).addContainerGap()));
        panel_9.setLayout(new GridLayout(0, 4, 0, 0));

        JButton btnZapisz = new JButton("Zapisz");
        panel_9.add(btnZapisz);

        JButton btnPoprzedniaZakadka = new JButton(
                "<html>Zak³adka wstecz</html>");
        btnPoprzedniaZakadka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (tabbedPane.getSelectedIndex() > 0) {
                    tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() - 1);
                }

            }
        });
        panel_9.add(btnPoprzedniaZakadka);

        JButton btnNastpnaZakadka = new JButton("Nastêpna zak³adka");
        btnNastpnaZakadka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tabbedPane.getSelectedIndex() < 3) {
                    tabbedPane.setSelectedIndex(tabbedPane.getSelectedIndex() + 1);
                }
            }
        });
        panel_9.add(btnNastpnaZakadka);

        JButton btnOdrzu = new JButton("Odrzuæ");
        panel_9.add(btnOdrzu);
        contentPane.setLayout(gl_contentPane);
    }

    //zak³adka dane wnioskodawcy
    private void tabDaneWnioskodawcy(JTabbedPane tabbedPane) {

        JPanel panel = new JPanel();
        tabbedPane.addTab("Dane wnioskodawcy", null, panel, null);
        tabbedPane.setEnabledAt(0, true);

        JLabel label = new JLabel("PESEL:");

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("");

        JLabel label_1 = new JLabel("Imie:");

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JLabel label_2 = new JLabel("Nazwisko:");

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        JLabel lblPe = new JLabel("P³eæ:");

        JComboBox comboBox = new JComboBox();

        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Kobieta",
                "Mê¿czyzna"}));

        JLabel lblDataUrodzenia = new JLabel("Data urodzenia:");

        JDateChooser dateChooser = new JDateChooser();

        JLabel lblStanCywilny = new JLabel("Stan cywilny:");

        JComboBox comboBox_1 = new JComboBox();

        PeselCheck pesel = new PeselCheck(textField, lblNewLabel, comboBox,
                comboBox_1, dateChooser);
        JLabel lblObywatelstwo = new JLabel("Obywatelstwo:");

        textField_9 = new JTextField();
        textField_9.setColumns(10);

        JLabel lblOkresZasikowy = new JLabel("Okres zasi³kowy: ");

        zasilkowe = new Okresy();

        JComboBox comboBox_2 = new JComboBox();

        comboBox_2.setModel(new DefaultComboBoxModel(new String[]{
                zasilkowe.getAktulanyOkres(), zasilkowe.getNastepnyOkres()}));
        comboBox_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String okresWybrany = (String) comboBox_2.getSelectedItem();
                int rokBazowy = Integer.parseInt(okresWybrany.substring(0, 4)) - 1;
                zasilkowe.setRokBazowy(rokBazowy);

            }
        });

        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);

        JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane_1.setBounds(0, 0, 559, 146);
        panel_4.add(tabbedPane_1);

        JPanel panel_2 = new JPanel();
        tabbedPane_1.addTab("Adres zamieszkania", null, panel_2, null);

        JLabel lblUlica = new JLabel("Ulica:");

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        JLabel label_4 = new JLabel("Nr:");

        textField_4 = new JTextField();
        textField_4.setColumns(10);

        JLabel label_5 = new JLabel("/");

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        JLabel label_6 = new JLabel("Kod Pocztowy:");

        textField_6 = new JTextField();
        textField_6.setColumns(10);

        JLabel label_7 = new JLabel("-");

        textField_7 = new JTextField();
        textField_7.setColumns(10);

        JLabel label_8 = new JLabel("Poczta:");

        textField_8 = new JTextField();
        textField_8.setColumns(10);

        JLabel label_21 = new JLabel("Nr telefonu:");

        textField_10 = new JTextField();
        textField_10.setColumns(10);

        JLabel lblEmail = new JLabel("e-mail:");

        textField_11 = new JTextField();
        textField_11.setColumns(10);

        JLabel lblMiejscowo = new JLabel("Miejscowoœæ:");

        textField_12 = new JTextField();
        textField_12.setColumns(10);
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2
                .setHorizontalGroup(gl_panel_2
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_2
                                        .createSequentialGroup()
                                        .addGap(10)
                                        .addGroup(
                                                gl_panel_2
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_2
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_21,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_10,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(10)
                                                                        .addComponent(
                                                                                lblEmail,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_11,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_2
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                lblMiejscowo,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_12,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_2
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_2
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_2
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(80)
                                                                                                        .addComponent(
                                                                                                                textField_3,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                200,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                lblUlica,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                108,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(10)
                                                                        .addGroup(
                                                                                gl_panel_2
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_2
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(20)
                                                                                                        .addComponent(
                                                                                                                textField_4,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_2
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_2
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_5,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(
                                                                gl_panel_2
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_6,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_6,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_2
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                label_7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(
                                                                                                gl_panel_2
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_7,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(20)
                                                                        .addComponent(
                                                                                label_8,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_8,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE)))));
        gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_2
                        .createSequentialGroup()
                        .addGap(11)
                        .addGroup(
                                gl_panel_2
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_21,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_10,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmail,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_11,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_2
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblMiejscowo,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_12,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_2
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(textField_3,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUlica,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_4,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_4,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_5,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_5,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_2
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_6,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_6,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_7,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_7,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_8,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_8,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))));
        panel_2.setLayout(gl_panel_2);

        JPanel panel_3 = new JPanel();
        tabbedPane_1.addTab("Adres zameldowania", null, panel_3, null);

        JLabel label_9 = new JLabel("Nr telefonu:");

        JLabel label_10 = new JLabel("Miejscowoœæ:");

        JLabel label_12 = new JLabel("Kod Pocztowy:");

        textField_13 = new JTextField();
        textField_13.setColumns(10);

        JLabel label_13 = new JLabel("-");

        textField_14 = new JTextField();
        textField_14.setColumns(10);

        JLabel label_14 = new JLabel("Poczta:");

        textField_15 = new JTextField();
        textField_15.setColumns(10);

        textField_17 = new JTextField();
        textField_17.setColumns(10);

        textField_18 = new JTextField();
        textField_18.setColumns(10);

        JLabel label_15 = new JLabel("e-mail:");

        textField_19 = new JTextField();
        textField_19.setColumns(10);

        JLabel label_3 = new JLabel("Ulica:");

        textField_16 = new JTextField();
        textField_16.setColumns(10);

        JLabel label_11 = new JLabel("Nr:");

        textField_20 = new JTextField();
        textField_20.setColumns(10);

        JLabel label_16 = new JLabel("/");

        textField_21 = new JTextField();
        textField_21.setColumns(10);
        GroupLayout gl_panel_3 = new GroupLayout(panel_3);
        gl_panel_3
                .setHorizontalGroup(gl_panel_3
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_3
                                        .createSequentialGroup()
                                        .addGap(10)
                                        .addGroup(
                                                gl_panel_3
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_3
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_9,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_18,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(10)
                                                                        .addComponent(
                                                                                label_15,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_19,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_3
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_10,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_17,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_3
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_3
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_3
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(80)
                                                                                                        .addComponent(
                                                                                                                textField_16,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                200,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                108,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(10)
                                                                        .addGroup(
                                                                                gl_panel_3
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_3
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(20)
                                                                                                        .addComponent(
                                                                                                                textField_20,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_3
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_3
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_21,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_16,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(
                                                                gl_panel_3
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_12,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_13,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_3
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                label_13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(
                                                                                                gl_panel_3
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_14,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(20)
                                                                        .addComponent(
                                                                                label_14,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_15,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE)))));
        gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_3
                        .createSequentialGroup()
                        .addGap(11)
                        .addGroup(
                                gl_panel_3
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_9,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_18,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_15,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_19,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_3
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_10,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_17,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_3
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(textField_16,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_3,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_20,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_11,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_21,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_16,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_3
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_12,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_13,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_13,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_14,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_14,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_15,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))));
        panel_3.setLayout(gl_panel_3);

        JPanel panel_5 = new JPanel();
        tabbedPane_1.addTab("Adres do korespondencji", null, panel_5, null);

        JLabel label_18 = new JLabel("Nr telefonu:");

        JLabel label_19 = new JLabel("Miejscowoœæ:");

        JLabel lblUlica_1 = new JLabel("Ulica:");

        JLabel label_22 = new JLabel("Kod Pocztowy:");

        textField_22 = new JTextField();
        textField_22.setColumns(10);

        JLabel label_23 = new JLabel("-");

        textField_23 = new JTextField();
        textField_23.setColumns(10);

        JLabel label_24 = new JLabel("Poczta:");

        textField_24 = new JTextField();
        textField_24.setColumns(10);

        textField_25 = new JTextField();
        textField_25.setColumns(10);

        textField_26 = new JTextField();
        textField_26.setColumns(10);

        textField_27 = new JTextField();
        textField_27.setColumns(10);

        JLabel label_25 = new JLabel("e-mail:");

        textField_28 = new JTextField();
        textField_28.setColumns(10);

        JLabel label_26 = new JLabel("Nr:");

        textField_29 = new JTextField();
        textField_29.setColumns(10);

        JLabel label_27 = new JLabel("/");

        textField_30 = new JTextField();
        textField_30.setColumns(10);
        GroupLayout gl_panel_5 = new GroupLayout(panel_5);
        gl_panel_5
                .setHorizontalGroup(gl_panel_5
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_5
                                        .createSequentialGroup()
                                        .addGap(10)
                                        .addGroup(
                                                gl_panel_5
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_5
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_18,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_27,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(10)
                                                                        .addComponent(
                                                                                label_25,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_28,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_5
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_19,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_26,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_5
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_5
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                lblUlica_1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                108,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(
                                                                                                gl_panel_5
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(80)
                                                                                                        .addComponent(
                                                                                                                textField_25,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                200,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(10)
                                                                        .addGroup(
                                                                                gl_panel_5
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_5
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(20)
                                                                                                        .addComponent(
                                                                                                                textField_29,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_26,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_5
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_5
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_30,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                label_27,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(
                                                                gl_panel_5
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                label_22,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                90,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_22,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(5)
                                                                        .addGroup(
                                                                                gl_panel_5
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                label_23,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(
                                                                                                gl_panel_5
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_23,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(20)
                                                                        .addComponent(
                                                                                label_24,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_24,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE)))));
        gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_5
                        .createSequentialGroup()
                        .addGap(11)
                        .addGroup(
                                gl_panel_5
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_18,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_27,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_25,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_28,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_5
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_19,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_26,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_5
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblUlica_1,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_25,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_29,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_26,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_30,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_27,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE))
                        .addGap(5)
                        .addGroup(
                                gl_panel_5
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_22,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_22,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_23,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_23,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_24,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_24,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))));
        panel_5.setLayout(gl_panel_5);

        JPanel panel_6 = new JPanel();
        tabbedPane_1.addTab("Sposób wyp³aty", null, panel_6, null);

        JLabel lblNrKonta = new JLabel("Nr konta:");

        txtPl = new JTextField();
        txtPl.setColumns(10);
        txtPl.setDocument(new JTextFieldLimit(2));
        txtPl.setText("PL");

        textField_32 = new JTextField();
        textField_32.setColumns(10);
        textField_32.setDocument(new JTextFieldLimit(2));

        textField_33 = new JTextField();
        textField_33.setColumns(10);
        textField_33.setDocument(new JTextFieldLimit(4));

        textField_34 = new JTextField();
        textField_34.setColumns(10);
        textField_34.setDocument(new JTextFieldLimit(4));

        textField_35 = new JTextField();
        textField_35.setColumns(10);
        textField_35.setDocument(new JTextFieldLimit(4));

        textField_36 = new JTextField();
        textField_36.setColumns(10);
        textField_36.setDocument(new JTextFieldLimit(4));

        textField_37 = new JTextField();
        textField_37.setColumns(10);
        textField_37.setDocument(new JTextFieldLimit(4));

        textField_38 = new JTextField();
        textField_38.setColumns(10);
        textField_38.setDocument(new JTextFieldLimit(4));

        JLabel lblNewLabel_1 = new JLabel("");

        KontoCheck konto = new KontoCheck(txtPl, textField_32, textField_33,
                textField_34, textField_35, textField_36, textField_37,
                textField_38, lblNewLabel_1);

        JLabel lblNazwaBanku = new JLabel("Nazwa banku:");

        textField_39 = new JTextField();
        textField_39.setColumns(10);

        JLabel lblWacicielKonta = new JLabel("W³aœciciel konta:");

        textField_40 = new JTextField();
        textField_40.setColumns(10);

        JLabel lblSposbRealizacji = new JLabel("Sposób realizacji:");

        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(new String[]{"gotówka",
                "konto bankowe", "przekaz pocztowy", "inny"}));

        JLabel lblPodajJaki = new JLabel("Podaj jaki:");
        lblPodajJaki.setVisible(false);

        textField_31 = new JTextField();
        textField_31.setColumns(10);
        textField_31.setVisible(false);

        GroupLayout gl_panel_6 = new GroupLayout(panel_6);
        gl_panel_6
                .setHorizontalGroup(gl_panel_6
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_6
                                        .createSequentialGroup()
                                        .addGap(10)
                                        .addGroup(
                                                gl_panel_6
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_6
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_6
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_6
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(57)
                                                                                                        .addComponent(
                                                                                                                txtPl,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                25,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                lblNrKonta,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                60,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                lblNazwaBanku,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                90,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(
                                                                                gl_panel_6
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                gl_panel_6
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                textField_32,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                20,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_33,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_34,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_35,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_36,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_37,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(5)
                                                                                                        .addComponent(
                                                                                                                textField_38,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(
                                                                                                gl_panel_6
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(10)
                                                                                                        .addComponent(
                                                                                                                textField_39,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                250,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(20)
                                                                        .addComponent(
                                                                                lblNewLabel_1,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_6
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                lblWacicielKonta,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(
                                                                                textField_40,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                250,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_6
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                lblSposbRealizacji,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                102,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(3)
                                                                        .addComponent(
                                                                                comboBox_3,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                122,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(8)
                                                                        .addComponent(
                                                                                lblPodajJaki,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(10)
                                                                        .addComponent(
                                                                                textField_31,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                GroupLayout.PREFERRED_SIZE)))));
        gl_panel_6
                .setVerticalGroup(gl_panel_6
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_6
                                        .createSequentialGroup()
                                        .addGap(11)
                                        .addGroup(
                                                gl_panel_6
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_6
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_6
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                txtPl,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                lblNrKonta,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(5)
                                                                        .addComponent(
                                                                                lblNazwaBanku,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                20,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_6
                                                                        .createSequentialGroup()
                                                                        .addGroup(
                                                                                gl_panel_6
                                                                                        .createParallelGroup(
                                                                                                Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                textField_32,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_33,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_34,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_35,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_36,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_37,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                textField_38,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(5)
                                                                        .addComponent(
                                                                                textField_39,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(
                                                                lblNewLabel_1,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                45,
                                                                GroupLayout.PREFERRED_SIZE))
                                        .addGap(5)
                                        .addGroup(
                                                gl_panel_6
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addComponent(
                                                                lblWacicielKonta,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                20,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                textField_40,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE))
                                        .addGap(5)
                                        .addGroup(
                                                gl_panel_6
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addComponent(
                                                                lblSposbRealizacji,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                20,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                comboBox_3,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                lblPodajJaki,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                20,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                textField_31,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE))));

        comboBox_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int index = comboBox_3.getSelectedIndex();
                if (index == 3) {
                    lblPodajJaki.setVisible(true);
                    textField_31.setVisible(true);
                } else {
                    lblPodajJaki.setVisible(false);
                    textField_31.setVisible(false);
                }
            }
        });

        panel_6.setLayout(gl_panel_6);


        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                        gl_panel.createSequentialGroup()
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addGroup(
                                                        gl_panel.createSequentialGroup()
                                                                .addGap(379)
                                                                .addGroup(
                                                                        gl_panel.createParallelGroup(
                                                                                Alignment.LEADING)
                                                                                .addGroup(
                                                                                        gl_panel.createSequentialGroup()
                                                                                                .addGap(100)
                                                                                                .addComponent(
                                                                                                        comboBox_2,
                                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                                        GroupLayout.DEFAULT_SIZE,
                                                                                                        GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(
                                                                                        lblOkresZasikowy,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        110,
                                                                                        GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(
                                                        gl_panel.createSequentialGroup()
                                                                .addGap(10)
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
                                                                        lblNewLabel,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        200,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                .addGroup(
                                                        gl_panel.createSequentialGroup()
                                                                .addGap(10)
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
                                                                .addGap(10)
                                                                .addGroup(
                                                                        gl_panel.createParallelGroup(
                                                                                Alignment.LEADING)
                                                                                .addComponent(
                                                                                        lblPe,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        46,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(
                                                                                        gl_panel.createSequentialGroup()
                                                                                                .addGap(45)
                                                                                                .addComponent(
                                                                                                        comboBox,
                                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                                        90,
                                                                                                        GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(65)
                                                                .addComponent(
                                                                        lblDataUrodzenia,
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
                                                                .addGap(10)
                                                                .addComponent(
                                                                        lblStanCywilny,
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
                                                                        lblObywatelstwo,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        90,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10)
                                                                .addComponent(
                                                                        textField_9,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        120,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                .addGroup(
                                                        gl_panel.createSequentialGroup()
                                                                .addGap(18)
                                                                .addComponent(
                                                                        panel_4,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        559,
                                                                        GroupLayout.PREFERRED_SIZE)))
                                .addGap(22)));
        gl_panel.setVerticalGroup(gl_panel
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                        gl_panel.createSequentialGroup()
                                .addGap(10)
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addComponent(
                                                        comboBox_2,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        lblOkresZasikowy,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE))
                                .addGap(3)
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addGroup(
                                                        gl_panel.createParallelGroup(
                                                                Alignment.BASELINE)
                                                                .addComponent(
                                                                        textField,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(
                                                                        lblNewLabel,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        20,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                .addComponent(
                                                        label,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE))
                                .addGap(2)
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addComponent(
                                                        label_1,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        textField_1,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        label_2,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        textField_2,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addComponent(
                                                        lblPe,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        comboBox,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        lblDataUrodzenia,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        dateChooser,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addGroup(
                                        gl_panel.createParallelGroup(
                                                Alignment.LEADING)
                                                .addComponent(
                                                        lblStanCywilny,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        comboBox_1,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        lblObywatelstwo,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        20,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addComponent(
                                                        textField_9,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE))
                                .addGap(41)
                                .addComponent(panel_4,
                                        GroupLayout.PREFERRED_SIZE, 146,
                                        GroupLayout.PREFERRED_SIZE)));

        panel.setLayout(gl_panel);
    }

    //zak³adka wnioskowane œwiadczenia
    private void tabWnioskowaneSwiadczenia(JTabbedPane tabbedPane) {
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Wnioskowane œwiadczenia", null, panel_1, null);

        JScrollPane scrollPane = new JScrollPane();

        JButton btnDodajOsob = new JButton("Dodaj osobê");
        btnDodajOsob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setVisible(false);
                OsobaGUI osobagui = new OsobaGUI(contentPane, zasilkowe);
                osobagui.setVisible(true);
            }
        });

        JButton btnEdytujDane = new JButton("Edytuj dane");

        JButton btnUsuOsob = new JButton("Usuñ osobê");

        JTextArea txtrLegendaZr = new JTextArea();
        txtrLegendaZr.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
        txtrLegendaZr.setWrapStyleWord(true);
        txtrLegendaZr
                .setText("Legenda:\r\nZR - zasi³ek rodzinny\r\ndodatki z tytu³u:\r\nD1 - urodzenia dziecka\r\nD2 - opieki nad dzieckiem w trakcie korzystania z urlopu wychowawczego\r\nD3 - samotnego wychowywania dziecka\r\nD4 - wychowywania dziecka w rodzinie wielodzietnej\r\nD5 - kszta³cenia i rehabilitacji dziecka niepe³nosprawnego\r\nD6 - rozpoczêcia roku szkolnego\r\npodjêcia przez dziecko nauki poza miejscem zamieszkania:\r\nD7 - na czêœciowe pokrycie wydatków zwi¹zanych z zamieszkiwaniem w miejscowoœci, w której znajduje siê siedziba szko³y\r\nD8 - na czêœciowe pokrycie wydatków zwi¹zanych z dojazdem do miejscowoœci, w której znajduje siê siedziba szko³y ");
        txtrLegendaZr.setLineWrap(true);
        txtrLegendaZr.setEditable(false);
        txtrLegendaZr.setBackground(SystemColor.menu);

        table = new JTable();
        table.setFillsViewportHeight(true);
        scrollPane.setViewportView(table);
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null, null, null,
                                null},
                        {null, null, null, Boolean.FALSE, null, null, null,
                                null, null, null},
                        {null, null, null, null, null, null, null, null, null,
                                null},
                        {null, null, null, null, null, null, null, null, null,
                                null},
                        {null, null, null, null, null, null, null, null, null,
                                null},}, new String[]{"Imie i nazwisko",
                "ZR", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8"}) {
            Class[] columnTypes = new Class[]{String.class, Boolean.class,
                    Boolean.class, Boolean.class, Boolean.class, Boolean.class,
                    Boolean.class, Boolean.class, Boolean.class, Boolean.class};

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(161);
        table.getColumnModel().getColumn(1).setPreferredWidth(25);
        table.getColumnModel().getColumn(2).setPreferredWidth(25);
        table.getColumnModel().getColumn(3).setPreferredWidth(25);
        table.getColumnModel().getColumn(4).setPreferredWidth(25);
        table.getColumnModel().getColumn(5).setPreferredWidth(25);
        table.getColumnModel().getColumn(6).setPreferredWidth(25);
        table.getColumnModel().getColumn(7).setPreferredWidth(25);
        table.getColumnModel().getColumn(8).setPreferredWidth(25);
        table.getColumnModel().getColumn(9).setPreferredWidth(25);
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1
                .setHorizontalGroup(gl_panel_1
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_1
                                        .createSequentialGroup()
                                        .addGroup(
                                                gl_panel_1
                                                        .createParallelGroup(
                                                                Alignment.LEADING,
                                                                false)
                                                        .addGroup(
                                                                gl_panel_1
                                                                        .createSequentialGroup()
                                                                        .addGap(22)
                                                                        .addComponent(
                                                                                btnDodajOsob)
                                                                        .addGap(6)
                                                                        .addComponent(
                                                                                btnEdytujDane)
                                                                        .addGap(6)
                                                                        .addComponent(
                                                                                btnUsuOsob))
                                                        .addGroup(
                                                                gl_panel_1
                                                                        .createSequentialGroup()
                                                                        .addGap(22)
                                                                        .addComponent(
                                                                                scrollPane,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                559,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                gl_panel_1
                                                                        .createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(
                                                                                txtrLegendaZr)))
                                        .addContainerGap(18, Short.MAX_VALUE)));
        gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_1
                        .createSequentialGroup()
                        .addGap(11)
                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE,
                                103, GroupLayout.PREFERRED_SIZE)
                        .addGap(2)
                        .addGroup(
                                gl_panel_1
                                        .createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnDodajOsob)
                                        .addComponent(btnEdytujDane)
                                        .addComponent(btnUsuOsob))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(txtrLegendaZr,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE).addContainerGap()));
        panel_1.setLayout(gl_panel_1);
    }

    //zak³adka wyliczenie dochodu
    private void tabWyliczenieDochodu(JTabbedPane tabbedPane) {

        JPanel panel_7 = new JPanel();
        tabbedPane.addTab("Wyliczenie dochodu", null, panel_7, null);

        JScrollPane scrollPane_1 = new JScrollPane();

        table_1 = new JTable();
        table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table_1.setModel(new DefaultTableModel(new Object[][]{
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},}, new String[]{
                "Lp.", "Imie i nazwisko",
                "<html>Dochód za " + zasilkowe.getRokBazowy() + " rok</html>",
                "Dochód uzyskany", "Dochód utracony", "Dochód wyliczony"}) {
            Class[] columnTypes = new Class[]{Integer.class, String.class,
                    Double.class, Double.class, Double.class, Double.class};

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table_1.getColumnModel().getColumn(0).setPreferredWidth(30);
        table_1.getColumnModel().getColumn(1).setPreferredWidth(115);
        table_1.getColumnModel().getColumn(2).setPreferredWidth(99);
        table_1.getColumnModel().getColumn(3).setPreferredWidth(101);
        table_1.getColumnModel().getColumn(4).setPreferredWidth(105);
        table_1.getColumnModel().getColumn(5).setPreferredWidth(99);
        scrollPane_1.setViewportView(table_1);


        JLabel lblRazem = new JLabel(
                "Dochód miesiêczny ³¹cznie wszystkich cz³onków rodziny:");

        JButton btnDodajOsob_1 = new JButton("Dodaj osobê");

        JButton btnSzczegyOsoby = new JButton("Edytuj dane");

        JButton btnUsuOsob_1 = new JButton("Usuñ osobê");

        JLabel lblDochdNaOsob = new JLabel("Dochód na osobê wynosi:");
        GroupLayout gl_panel_7 = new GroupLayout(panel_7);
        gl_panel_7.setHorizontalGroup(gl_panel_7
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                        gl_panel_7
                                .createSequentialGroup()
                                .addGap(10)
                                .addComponent(scrollPane_1,
                                        GroupLayout.PREFERRED_SIZE, 579,
                                        GroupLayout.PREFERRED_SIZE))
                .addGroup(
                        gl_panel_7
                                .createSequentialGroup()
                                .addGap(195)
                                .addComponent(lblRazem,
                                        GroupLayout.PREFERRED_SIZE, 330,
                                        GroupLayout.PREFERRED_SIZE))
                .addGroup(
                        gl_panel_7
                                .createSequentialGroup()
                                .addGap(10)
                                .addComponent(btnDodajOsob_1,
                                        GroupLayout.PREFERRED_SIZE, 104,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(10)
                                .addComponent(btnSzczegyOsoby,
                                        GroupLayout.PREFERRED_SIZE, 104,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(10)
                                .addComponent(btnUsuOsob_1,
                                        GroupLayout.PREFERRED_SIZE, 104,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(33)
                                .addComponent(lblDochdNaOsob,
                                        GroupLayout.PREFERRED_SIZE, 180,
                                        GroupLayout.PREFERRED_SIZE)));
        gl_panel_7
                .setVerticalGroup(gl_panel_7
                        .createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel_7
                                        .createSequentialGroup()
                                        .addGap(25)
                                        .addComponent(scrollPane_1,
                                                GroupLayout.PREFERRED_SIZE,
                                                135, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRazem,
                                                GroupLayout.PREFERRED_SIZE, 20,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGap(5)
                                        .addGroup(
                                                gl_panel_7
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                gl_panel_7
                                                                        .createSequentialGroup()
                                                                        .addGap(5)
                                                                        .addComponent(
                                                                                btnDodajOsob_1))
                                                        .addGroup(
                                                                gl_panel_7
                                                                        .createSequentialGroup()
                                                                        .addGap(5)
                                                                        .addComponent(
                                                                                btnSzczegyOsoby))
                                                        .addGroup(
                                                                gl_panel_7
                                                                        .createSequentialGroup()
                                                                        .addGap(5)
                                                                        .addComponent(
                                                                                btnUsuOsob_1))
                                                        .addComponent(
                                                                lblDochdNaOsob,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                20,
                                                                GroupLayout.PREFERRED_SIZE))));
        panel_7.setLayout(gl_panel_7);
    }

    //zak³adka informacje koñcowe
    private void tabInformacjeKoncowe(JTabbedPane tabbedPane) {
        JPanel panel_8 = new JPanel();
        tabbedPane.addTab("Informacje koñcowe", null, panel_8, null);
        GroupLayout gl_panel_8 = new GroupLayout(panel_8);
        gl_panel_8.setHorizontalGroup(gl_panel_8.createParallelGroup(
                Alignment.LEADING).addGap(0, 599, Short.MAX_VALUE));
        gl_panel_8.setVerticalGroup(gl_panel_8.createParallelGroup(
                Alignment.LEADING).addGap(0, 326, Short.MAX_VALUE));
        panel_8.setLayout(gl_panel_8);
    }
}
