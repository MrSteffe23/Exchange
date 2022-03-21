import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SchimbView extends JFrame{
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
		model = modelul;
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JPanel infoPanel = new JPanel();
		infoPanel.add(informatie);
		mainPanel.add(infoPanel);
		
		JPanel centrePanel = new JPanel();
		centrePanel.add(box1);
		centrePanel.add(buton);
		centrePanel.add(box2);
		mainPanel.add(centrePanel);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label3);
		panel2.add(label2);
		panel2.add(text2);
		panel2.add(label4);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		panel3.add(butonConvert);
		mainPanel.add(panel3);

		this.add(mainPanel, BorderLayout.PAGE_START);

        //this.setContentPane(mainPanel);
        this.pack();
        this.setSize(300, 220);
        this.setTitle("Schimb Valutar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    String ValueInput() {
        return text1.getText();
    }
    
    String FromInput() {
        return (String) box1.getSelectedItem();
    }
    
    String ToInput() {
        return (String) box2.getSelectedItem();
    }
    
    void setRezultat(String newTotal) {
    	text2.setText(newTotal);
    }
    
    void setLabel3() {
    	label3.setText(FromInput());
    }
    
    void setLabel4() {
    	label4.setText(ToInput());
    }
    
    void setInformatie(String newTotal) {
    	informatie.setText(newTotal);
    }
    
    void setBox1(int index) {
    	box1.setSelectedIndex(index);
    }
    
    void setBox2(int index) {
    	box2.setSelectedIndex(index);
    }
    
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    void addSchimbListener(ActionListener mal) {
        buton.addActionListener(mal);
    }

    void addChangeListener(ItemListener mal) {
        box1.addItemListener(mal);
        box2.addItemListener(mal);
    }
    
    void addConvertListener(ActionListener mal) {
        butonConvert.addActionListener(mal);
    }
}
