import javax.swing.*;

/*
 * 						                     Convertor Valutar:
 * 
 * - contine un buton de Convert care realizeaza conversia (pentru cand se modifica valuare inserata de noi)
 * - contine un buton de Revers care interschimba tipul monedelor
 * - de fiecare data cand se schimba tipul unei monede (din ComboBox), se modifica/actualizeaza si valorile afisate
 * - rezultatele se vor trunchia automat la 3 zecimale dupa virgula
 * 
 * 
 */
public class SchimbMVC {
	
	public static void main(String[] args) {
		SchimbModel model = new SchimbModel();
		SchimbView view = new SchimbView(model);
		SchimbController controller = new SchimbController(model, view);
		
		view.setVisible(true);
	}

}
