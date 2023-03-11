//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class SchimbMVC {
    public SchimbMVC() {
    }

    public static void main(String[] args) {
        SchimbModel model = new SchimbModel();
        SchimbView view = new SchimbView(model);
        new SchimbController(model, view);
        view.setVisible(true);
    }
}
