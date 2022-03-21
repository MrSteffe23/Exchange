import java.math.BigInteger;

public class SchimbModel {
	private String[] s1 = new String[]{"EUR", "RON", "USD"};
	private String[] s2 = new String[]{"RON", "EUR", "USD"};
	private String[][] EUR= new String[][] {{"RON", "4.946"}, {"USD", "1.1308"}};
	private String[][] RON= new String[][] {{"EUR", "0.2022"}, {"USD", "0.2286"}};
	private String[][] USD= new String[][] {{"EUR", "0.8843"}, {"RON", "4.3739"}};
	private String rez = -1+"";//in cazul in care nu gasim moneda in care vrem sa convertim suma
	private String info = "";

	@SuppressWarnings("removal")
	public void multiplyBy(String howmuch, String from, String to) {
		info = "";//resetez informatia de fiecare data cand apas butonul, pentru a o forma din nou
		rez=-1+"";//resetez rezultatul
		if(from == "EUR")
		{
			info = info+"1 EUR = ";
			for(int i=0;i<EUR.length;i++) {
				if(EUR[i][0].equals(to)) {
					info = info+EUR[i][1]+" "+to; //construiesc informatie de sus
					rez =  Math.floor((new Double(howmuch))*(new Double(EUR[i][1]))*1000)/1000+""; //construiesc rezultatul schimbului
					break;
				}
			}
			if(rez=="-1") {
				info = info+"1 EUR";
				rez = howmuch;
			}
		}
		if(from == "RON")
		{
			info = info+"1 RON = ";
			for(int i=0;i<RON.length;i++) {
				if(RON[i][0].equals(to)) {
					info = info+RON[i][1]+" "+to;
					rez =  Math.floor((new Double(howmuch))*(new Double(RON[i][1]))*1000)/1000+"";
					break;
				}
			}
			if(rez=="-1") {
				info = info+"1 RON";
				rez = howmuch;
			}
		}
		if(from == "USD")
		{
			info = info+"1 USD = ";
			for(int i=0;i<USD.length;i++) {
				if(USD[i][0].equals(to)) {
					info = info+USD[i][1]+" "+to;
					rez =  Math.floor((new Double(howmuch))*(new Double(USD[i][1]))*1000)/1000+"";
					break;
				}
			}
			if(rez=="-1") {
				info = info+"1 USD";
				rez = howmuch;
			}
		}
	}
	
	public int searchIndex1(String name) {
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(name)) {
				return i;
			}
		}
		return 0;//nu ajunge niciodata aici
	}
	
	public int searchIndex2(String name) {
		for(int i=0;i<s2.length;i++) {
			if(s2[i].equals(name)) {
				return i;
			}
		}
		return 0;//nu ajunge niciodata aici
	}

	public String getInfo() {
		return info;
	}

	public String getRez() {
		return rez;
	}
}
