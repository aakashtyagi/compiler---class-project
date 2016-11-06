package comp;

import java.util.*;

public class SemanticStack {

	static Stack s = new Stack();

public void push(String a){
	s.push(a);
}
public String pop(){
	return (String) s.pop();
}
static void peek(){
	s.peek();
}

}