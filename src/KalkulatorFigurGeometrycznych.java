import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class KalkulatorFigurGeometrycznych extends JFrame {
    private JRadioButton kwadrat;
    private JRadioButton prostokat;
    private JRadioButton trojkat;
    private JRadioButton trapez;
    private JRadioButton szescian;
    private JRadioButton prostopadloscian;
    private JRadioButton walec;
    private JRadioButton kula;
    private JTextField Bok1;
    private JTextField Pole;
    private JTextField Bok2;
    private JTextField Obwod;
    private JTextField Objetosc;
    private JTextField Wysokosc;
    private JTextField Promien;
    private JButton wyczysc;
    private JButton oblicz;
    private JPanel panelMain;
    private JPanel PanelText;
    private JRadioButton trojkatProstokatny;

    private  ButtonGroup buttonGroup =  new ButtonGroup();
    private float a, b, h, r;
    private double pole,obwod,objetosc;
    DecimalFormat df = new DecimalFormat("#.####");

    public static void main(String[] args) {
        KalkulatorFigurGeometrycznych calcFigur = new KalkulatorFigurGeometrycznych();
        calcFigur.setVisible(true);
    }

    public KalkulatorFigurGeometrycznych() {
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        buttonGroup.add(kula);
        buttonGroup.add(kwadrat);
        buttonGroup.add(trapez);
        buttonGroup.add(szescian);
        buttonGroup.add(prostokat);
        buttonGroup.add(prostopadloscian);
        buttonGroup.add(walec);
        buttonGroup.add(trojkat);
        buttonGroup.add(trojkatProstokatny);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object przycisk =e.getSource();

                // wybór figury
                if(przycisk == kula) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            (   (JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Promien.setEnabled(true);
                }
                else if(przycisk == kwadrat) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                }
                else if(przycisk == trapez) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                    Bok2.setEnabled(true);
                    Wysokosc.setEnabled(true);
                }
                else if(przycisk == szescian) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                }
                else if(przycisk == prostokat) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                    Bok2.setEnabled(true);
                }
                else if(przycisk == prostopadloscian) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                    Wysokosc.setEnabled(true);
                }
                else if(przycisk == trojkat) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                    Bok2.setEnabled(true);
                    Wysokosc.setEnabled(true);
                }
                else if(przycisk == trojkatProstokatny) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Bok1.setEnabled(true);
                    Bok2.setEnabled(true);
                }
                else if(przycisk == walec) {
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                    Promien.setEnabled(true);
                    Wysokosc.setEnabled(true);
                }

                // wyczyść
                if(przycisk == wyczysc) {
                    buttonGroup.clearSelection();
                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            ((JTextField) c).setText("");
                            c.setEnabled(false);
                        }}
                }

                //obliczenia
                else if(przycisk == oblicz) {

                    for (Component c : PanelText.getComponents()) {
                        if (c instanceof JTextField) {
                            c.setBackground(Color.WHITE);
                            ((JTextField) c).setDisabledTextColor(Color.BLACK);
                        }
                    }

                    if (kula.isSelected()) {
                        r = Float.parseFloat(Promien.getText());
                        objetosc = (4.0 / 3) * Math.PI * Math.pow(r, 3);
                        Objetosc.setText(String.valueOf(df.format(objetosc)));

                    } else if (kwadrat.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        pole = Math.pow(a, 2);
                        obwod = 4 * a;
                        Pole.setText(String.valueOf(df.format(pole)));
                        Obwod.setText(String.valueOf(df.format(obwod)));

                    } else if (trapez.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        b = Float.parseFloat(Bok2.getText());
                        h = Float.parseFloat(Wysokosc.getText());

                        pole = 0.5*(a+b)*h;
                        Pole.setText(String.valueOf(df.format(pole)));

                    } else if (szescian.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        pole = 6 * Math.pow(a, 2);
                        objetosc = Math.pow(a, 3);

                        Pole.setText(String.valueOf(df.format(pole)));
                        Objetosc.setText(String.valueOf(df.format(objetosc)));
                    } else if (prostokat.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        b = Float.parseFloat(Bok2.getText());
                        pole = a * b;
                        obwod = 2 * a + 2 * b;

                        Pole.setText(String.valueOf(df.format(pole)));
                        Obwod.setText(String.valueOf(df.format(obwod)));
                    } else if (prostopadloscian.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        h = Float.parseFloat(Wysokosc.getText());
                        pole = 2 * Math.pow(a, 2) + 4 * a * h;
                        objetosc = Math.pow(a, 2) * h;

                        Pole.setText(String.valueOf(df.format(pole)));
                        Objetosc.setText(String.valueOf(df.format(objetosc)));
                    } else if (trojkat.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        h = Float.parseFloat(Wysokosc.getText());

                        if (a == b) { // trójkąt równoramienny
                            obwod = 3 * a;
                            pole = 0.5 * a * h;
                        } else { // trójkąt różnoboczny
                            double c;
                            c = Math.pow(0.5 * a, 2) + Math.pow(h, 2);
                            obwod = a + b + Math.sqrt(c);
                            pole = 0.5 * a * h;
                        }
                        Pole.setText(String.valueOf(df.format(pole)));
                        Obwod.setText(String.valueOf(df.format(obwod)));
                    } else if (trojkatProstokatny.isSelected()) {
                        a = Float.parseFloat(Bok1.getText());
                        b = Float.parseFloat(Bok2.getText());
                        pole = 0.5 * a * b;
                        double c = Math.pow(a, 2) + Math.pow(b, 2);
                        obwod = a + b + Math.sqrt(c);
                        Pole.setText(String.valueOf(df.format(pole)));
                        Obwod.setText(String.valueOf(df.format(obwod)));
                    } else if (walec.isSelected()) {
                        r = Float.parseFloat(Promien.getText());
                        h = Float.parseFloat(Wysokosc.getText());

                        pole = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
                        objetosc = Math.PI * Math.pow(r, 2) * h;

                        Pole.setText(String.valueOf(df.format(pole)));
                        Objetosc.setText(String.valueOf(df.format(objetosc)));
                    }
                }
            }};

        kula.addActionListener(listener);
        kwadrat.addActionListener(listener);
        trapez.addActionListener(listener);
        szescian.addActionListener(listener);
        prostokat.addActionListener(listener);
        prostopadloscian.addActionListener(listener);
        trojkat.addActionListener(listener);
        trojkatProstokatny.addActionListener(listener);
        walec.addActionListener(listener);
        wyczysc.addActionListener(listener);
        oblicz.addActionListener(listener);
    }
}