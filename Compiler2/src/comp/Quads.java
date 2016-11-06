package comp;

import java.util.*;

public class Quads {

	String op = "";
	String arg1 = "";
	String arg2 = "";
	String res = "";
	static int index = -1;
	static int next;
	static Vector<Quad> v = new Vector<Quad>();
	

	public void addQuad(String op, String arg1, String arg2, String res) {
		Quad q = new Quad();
		q.op = op;
		q.arg1 = arg1;
		q.arg2 = arg2;
		q.res = res;
		v.addElement(q);
		index++;
	}
	
	public static String nextQuad() {
		next = index + 1;
		return Integer.toString(next);
	}
	
	public static Quad pop() {
		return v.get(index);
	}
	
	public String toString() {
		return "(" + op + "," + arg1 + "," + arg2 + "," + res + ")";
	}
	
	public void append(String ind, String s) {
		int i = Integer.parseInt(ind);
		Quad q = v.get(i);
		q.res = s;
		v.set(i, q);
	}

}

class Quad {
	String op = "";
	String arg1 = "";
	String arg2 = "";
	String res = "";	
}