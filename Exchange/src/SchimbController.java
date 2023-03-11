//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SchimbController {
    private SchimbView view;
    private SchimbModel model;

    SchimbController(SchimbModel s_model, SchimbView s_view) {
        this.model = s_model;
        this.view = s_view;
        this.view.addSchimbListener(new ReverseListener());
        this.view.addChangeListener(new ChangeListener());
        this.view.addConvertListener(new ConvertListener());
    }

    class ChangeListener implements ItemListener {
        ChangeListener() {
        }

        public void itemStateChanged(ItemEvent e) {
            String valueInput = "";
            String fromInput = "";
            String toInput = "";

            try {
                valueInput = SchimbController.this.view.ValueInput();
                fromInput = SchimbController.this.view.FromInput();
                toInput = SchimbController.this.view.ToInput();
                SchimbController.this.model.multiplyBy(valueInput, fromInput, toInput);
                SchimbController.this.view.setRezultat(SchimbController.this.model.getRez());
                SchimbController.this.view.setInformatie(SchimbController.this.model.getInfo());
                SchimbController.this.view.setLabel3();
                SchimbController.this.view.setLabel4();
            } catch (NumberFormatException var6) {
                SchimbController.this.view.showError("Bad input: '" + valueInput + "'");
            }

        }
    }

    class ConvertListener implements ActionListener {
        ConvertListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String valueInput = "";
            String fromInput = "";
            String toInput = "";

            try {
                valueInput = SchimbController.this.view.ValueInput();
                fromInput = SchimbController.this.view.FromInput();
                toInput = SchimbController.this.view.ToInput();
                SchimbController.this.model.multiplyBy(valueInput, fromInput, toInput);
                SchimbController.this.view.setRezultat(SchimbController.this.model.getRez());
                SchimbController.this.view.setInformatie(SchimbController.this.model.getInfo());
                SchimbController.this.view.setLabel3();
                SchimbController.this.view.setLabel4();
            } catch (NumberFormatException var6) {
                SchimbController.this.view.showError("Bad input: '" + valueInput + "'");
            }

        }
    }

    class ReverseListener implements ActionListener {
        ReverseListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String valueInput = "";
            String fromInput = "";
            String toInput = "";

            try {
                valueInput = SchimbController.this.view.ValueInput();
                fromInput = SchimbController.this.view.FromInput();
                toInput = SchimbController.this.view.ToInput();
                SchimbController.this.view.setBox1(SchimbController.this.model.searchIndex1(toInput));
                SchimbController.this.view.setBox2(SchimbController.this.model.searchIndex2(fromInput));
                SchimbController.this.model.multiplyBy(valueInput, toInput, fromInput);
                SchimbController.this.view.setRezultat(SchimbController.this.model.getRez());
                SchimbController.this.view.setInformatie(SchimbController.this.model.getInfo());
                SchimbController.this.view.setLabel3();
                SchimbController.this.view.setLabel4();
            } catch (NumberFormatException var6) {
                SchimbController.this.view.showError("Bad input: '" + valueInput + "'");
            }

        }
    }
}
