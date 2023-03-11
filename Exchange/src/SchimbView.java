//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SchimbView extends JFrame {
    private JLabel informatie = new JLabel("1 EUR = 4.946 RON");
    private JComboBox box1 = new JComboBox(new String[]{"EUR", "RON", "USD"});
    private JComboBox box2 = new JComboBox(new String[]{"RON", "EUR", "USD"});
    private JButton buton = new JButton("<>");
    private JButton butonConvert = new JButton("Convert");
    private JLabel label1 = new JLabel("Suma:");
    private JLabel label2 = new JLabel("Rezultat:");
    private JLabel label3 = new JLabel("EUR");
    private JLabel label4 = new JLabel("RON");
    private JTextField text1 = new JTextField("1", 10);
    private JTextField text2 = new JTextField("4.946", 10);
    private SchimbModel model;

    public SchimbView(SchimbModel modelul) {
        this.model = modelul;
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, 1));
        JPanel infoPanel = new JPanel();
        infoPanel.add(this.informatie);
        mainPanel.add(infoPanel);
        JPanel centrePanel = new JPanel();
        centrePanel.add(this.box1);
        centrePanel.add(this.buton);
        centrePanel.add(this.box2);
        mainPanel.add(centrePanel);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.add(this.label1);
        panel1.add(this.text1);
        panel1.add(this.label3);
        panel2.add(this.label2);
        panel2.add(this.text2);
        panel2.add(this.label4);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        panel3.add(this.butonConvert);
        mainPanel.add(panel3);
        this.add(mainPanel, "First");
        this.pack();
        this.setSize(300, 220);
        this.setTitle("Schimb Valutar");
        this.setDefaultCloseOperation(3);
    }

    String ValueInput() {
        return this.text1.getText();
    }

    String FromInput() {
        return (String)this.box1.getSelectedItem();
    }

    String ToInput() {
        return (String)this.box2.getSelectedItem();
    }

    void setRezultat(String newTotal) {
        this.text2.setText(newTotal);
    }

    void setLabel3() {
        this.label3.setText(this.FromInput());
    }

    void setLabel4() {
        this.label4.setText(this.ToInput());
    }

    void setInformatie(String newTotal) {
        this.informatie.setText(newTotal);
    }

    void setBox1(int index) {
        this.box1.setSelectedIndex(index);
    }

    void setBox2(int index) {
        this.box2.setSelectedIndex(index);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    void addSchimbListener(ActionListener mal) {
        this.buton.addActionListener(mal);
    }

    void addChangeListener(ItemListener mal) {
        this.box1.addItemListener(mal);
        this.box2.addItemListener(mal);
    }

    void addConvertListener(ActionListener mal) {
        this.butonConvert.addActionListener(mal);
    }
}
