package main;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;

public class PeselCheck {

    private byte PESEL[] = new byte[11];
    private boolean popraw;
    private int rok, miesiac, dzien;
    private String stanCywil[] = new String[]{"panna", "zamê¿na", "wdowa",
            "separowana", "rozwiedziona", "konkubina"};
    private String stanCywilM[] = new String[]{"kawaler", "¿onaty",
            "wdowiec", "separowany", "rozwiedziony", "konkubin"};

    public PeselCheck(JTextField psl, JLabel status, JComboBox plec,
                      JComboBox cywil, JDateChooser dateUr) {
        psl.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '-' && psl.getText().indexOf('-') > -1) {
                    e.consume();
                    return;
                }
                if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
                    e.consume();
                }

            }
        });

        psl.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                // TODO Auto-generated method stub
                status.setText("");

            }

            @Override
            public void focusLost(FocusEvent e) {
                // TODO Auto-generated method stub

                sprPesel(psl.getText());
                if (popraw == false) {
                    if (psl.getText().length() > 0) {
                        if (psl.getText().length() < 11) {
                            status.setText("Za ma³o cyfr nr pesel, popraw!");
                        } else {
                            status.setText("Nieprawid³owy nr pesel, popraw!");
                        }
                        status.setForeground(Color.red);
                    }
                } else {
                    status.setText("");
                }

                if (plec() == 1) {
                    plec.setSelectedIndex(1);
                } else if (plec() == 0) {
                    plec.setSelectedIndex(0);
                }

                if (popraw == true) {
                    dateUr.getDateEditor().setDate(pslData());

                }

            }
        });

        psl.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void changedUpdate(DocumentEvent arg0) {
                // TODO Auto-generated method stub
                spr();
            }

            @Override
            public void insertUpdate(DocumentEvent arg0) {
                // TODO Auto-generated method stub
                spr();
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                // TODO Auto-generated method stub
                spr();
                dateUr.getDateEditor().setDate(null);
            }

            public void spr() {
                if (psl.getText().length() > 11) {
                    status.setText("Nr pesel nie ma tylu cyfr! popraw");
                    status.setForeground(Color.red);
                } else {
                    status.setText("");
                }
            }

        });

        cywil.setModel(new DefaultComboBoxModel(stanCywil));

        plec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int select = plec.getSelectedIndex();
                if (select == 0) { // kobieta
                    cywil.setModel(new DefaultComboBoxModel(stanCywil));
                } else if (select == 1) { // Mê¿czyzna
                    cywil.setModel(new DefaultComboBoxModel(stanCywilM));
                }
            }
        });

    }

    public boolean sprPesel(String psl) {

        if (psl.length() != 11) {
            popraw = false;
        } else {

            for (int i = 0; i < 11; i++) {
                PESEL[i] = Byte.parseByte(psl.substring(i, i + 1));
            }

            if (sumKont() && sprMies() && sprDnia()) {
                popraw = true;
            } else {
                popraw = false;
            }

        }

        return popraw;
    }

    public int rokUr() {
        rok = 10 * PESEL[0];
        rok += PESEL[1];
        miesiac = 10 * PESEL[2];
        miesiac += PESEL[3];
        if (miesiac > 80 && 93 < miesiac) {
            rok += 1800;
        } else if (miesiac > 0 && 13 > miesiac) {
            rok += 1900;
        } else if (miesiac > 20 && 33 > miesiac) {
            rok += 2000;
        } else if (miesiac > 40 && 53 > miesiac) {
            rok += 2100;
        } else if (miesiac > 60 && 73 > miesiac) {
            rok += 2200;
        }
        return rok;
    }

    public int MiesiacUr() {
        miesiac = 10 * PESEL[2];
        miesiac += PESEL[3];
        if (miesiac > 80 && miesiac < 93) {
            miesiac -= 80;
        } else if (miesiac > 20 && miesiac < 33) {
            miesiac -= 20;
        } else if (miesiac > 40 && miesiac < 53) {
            miesiac -= 40;
        } else if (miesiac > 60 && miesiac < 73) {
            miesiac -= 60;
        }
        return miesiac;
    }

    public int dzienUr() {
        dzien = 10 * PESEL[4];
        dzien += PESEL[5];
        return dzien;
    }

    public int plec() {
        if (popraw) {
            if (PESEL[9] % 2 == 1) {
                return 1; // Mê¿czyzna
            } else {
                return 0; // Kobieta
            }
        } else {
            return -1;
        }
    }

    private boolean sumKont() {
        int sum = 1 * PESEL[0] + 3 * PESEL[1] + 7 * PESEL[2] + 9 * PESEL[3] + 1
                * PESEL[4] + 3 * PESEL[5] + 7 * PESEL[6] + 9 * PESEL[7] + 1
                * PESEL[8] + 3 * PESEL[9];
        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        if (sum == PESEL[10]) {
            return true;
        } else {
            return false;
        }
    }

    private boolean sprMies() {
        int miesiace = MiesiacUr();
        if (miesiace > 0 && miesiace < 13) {
            return true;
        } else {
            return false;
        }
    }

    private boolean sprDnia() {
        int roki = rokUr();
        int miesiace = MiesiacUr();
        int dziena = dzienUr();
        if ((dziena > 0 && dziena < 32)
                && (miesiace == 1 || miesiace == 3 || miesiace == 5
                || miesiace == 7 || miesiace == 8 || miesiace == 10 || miesiace == 12)) {
            return true;
        } else if ((dziena > 0 && dziena < 31)
                && (miesiace == 4 || miesiace == 6 || miesiace == 9 || miesiace == 11)) {
            return true;
        } else if ((dziena > 0 && dziena < 30 && rokPrzest(roki))
                || (dziena > 0 && dziena < 29 && !rokPrzest(roki))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean rokPrzest(int rok) {
        if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Date pslData() {
        Calendar cal = Calendar.getInstance();
        cal.set(rok , miesiac - 1, dzien);
        Date data = cal.getTime();

        return data;
    }
}