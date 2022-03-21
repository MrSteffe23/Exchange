import java.awt.event.*;

public class SchimbController {
	private SchimbView view;
	private SchimbModel model;
	
	SchimbController(SchimbModel s_model, SchimbView s_view) {
        model = s_model;
        view  = s_view;
        
        view.addSchimbListener(new ReverseListener());
        view.addChangeListener(new ChangeListener());
        view.addConvertListener(new ConvertListener());
    }
	
	class ReverseListener implements ActionListener { //ascultator care inverseaza conversia
        public void actionPerformed(ActionEvent e) {
            String valueInput = "";
            String fromInput = "";
            String toInput = "";
            try {
                valueInput = view.ValueInput();
                fromInput = view.FromInput();
                toInput = view.ToInput();
                view.setBox1(model.searchIndex1(toInput));
                view.setBox2(model.searchIndex2(fromInput));
                model.multiplyBy(valueInput, toInput, fromInput);
                view.setRezultat(model.getRez());
                view.setInformatie(model.getInfo());
                view.setLabel3();
                view.setLabel4();
                
            } catch (NumberFormatException nfex) {
                view.showError("Bad input: '" + valueInput + "'");
            }
        }
    }
	
	class ChangeListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			String valueInput = "";
            String fromInput = "";
            String toInput = "";
            try {
                valueInput = view.ValueInput();
                fromInput = view.FromInput();
                toInput = view.ToInput();
                model.multiplyBy(valueInput, fromInput, toInput);
                view.setRezultat(model.getRez());
                view.setInformatie(model.getInfo());
                view.setLabel3();
                view.setLabel4();
                
            } catch (NumberFormatException nfex) {
                view.showError("Bad input: '" + valueInput + "'");
            }
		}   
    }
	
	class ConvertListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String valueInput = "";
            String fromInput = "";
            String toInput = "";
            try {
                valueInput = view.ValueInput();
                fromInput = view.FromInput();
                toInput = view.ToInput();
                model.multiplyBy(valueInput, fromInput, toInput);
                view.setRezultat(model.getRez());
                view.setInformatie(model.getInfo());
                view.setLabel3();
                view.setLabel4();
                
            } catch (NumberFormatException nfex) {
                view.showError("Bad input: '" + valueInput + "'");
            }
		}
        
    }
}
