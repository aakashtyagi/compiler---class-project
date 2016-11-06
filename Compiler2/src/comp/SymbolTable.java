package comp;

import java.util.Vector;

public class SymbolTable {

	Vector v = new Vector();
	int t = 0;
	public String newTemp(){
		String temp = "T" + t;
		v.add(temp);
		t++;
		return temp;
	}
}
