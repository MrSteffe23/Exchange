//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class SchimbModel {
    private String[] s1 = new String[]{"EUR", "RON", "USD"};
    private String[] s2 = new String[]{"RON", "EUR", "USD"};
    private String[][] EUR = new String[][]{{"RON", "4.946"}, {"USD", "1.1308"}};
    private String[][] RON = new String[][]{{"EUR", "0.2022"}, {"USD", "0.2286"}};
    private String[][] USD = new String[][]{{"EUR", "0.8843"}, {"RON", "4.3739"}};
    private String rez = "-1";
    private String info = "";

    public SchimbModel() {
    }

    public void multiplyBy(String howmuch, String from, String to) {
        this.info = "";
        this.rez = "-1";
        int i;
        if (from == "EUR") {
            this.info = this.info + "1 EUR = ";

            for(i = 0; i < this.EUR.length; ++i) {
                if (this.EUR[i][0].equals(to)) {
                    this.info = this.info + this.EUR[i][1] + " " + to;
                    this.rez = String.valueOf(Math.floor(new Double(howmuch) * new Double(this.EUR[i][1]) * 1000.0) / 1000.0);
                    break;
                }
            }

            if (this.rez == "-1") {
                this.info = this.info + "1 EUR";
                this.rez = howmuch;
            }
        }

        if (from == "RON") {
            this.info = this.info + "1 RON = ";

            for(i = 0; i < this.RON.length; ++i) {
                if (this.RON[i][0].equals(to)) {
                    this.info = this.info + this.RON[i][1] + " " + to;
                    this.rez = String.valueOf(Math.floor(new Double(howmuch) * new Double(this.RON[i][1]) * 1000.0) / 1000.0);
                    break;
                }
            }

            if (this.rez == "-1") {
                this.info = this.info + "1 RON";
                this.rez = howmuch;
            }
        }

        if (from == "USD") {
            this.info = this.info + "1 USD = ";

            for(i = 0; i < this.USD.length; ++i) {
                if (this.USD[i][0].equals(to)) {
                    this.info = this.info + this.USD[i][1] + " " + to;
                    this.rez = String.valueOf(Math.floor(new Double(howmuch) * new Double(this.USD[i][1]) * 1000.0) / 1000.0);
                    break;
                }
            }

            if (this.rez == "-1") {
                this.info = this.info + "1 USD";
                this.rez = howmuch;
            }
        }

    }

    public int searchIndex1(String name) {
        for(int i = 0; i < this.s1.length; ++i) {
            if (this.s1[i].equals(name)) {
                return i;
            }
        }

        return 0;
    }

    public int searchIndex2(String name) {
        for(int i = 0; i < this.s2.length; ++i) {
            if (this.s2[i].equals(name)) {
                return i;
            }
        }

        return 0;
    }

    public String getInfo() {
        return this.info;
    }

    public String getRez() {
        return this.rez;
    }
}
