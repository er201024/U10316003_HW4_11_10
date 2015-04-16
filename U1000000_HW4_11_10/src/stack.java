import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class stack {
	/**Main method*/
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		//Create a MyStack name stack
		MyStack stack = new MyStack();
		//The user enter five string
		out.print("請輸入五個字串:");
		//Prompt the user to enter five string
		for(int i = 0 ; i < 5  ; i++)
			stack.push(input.nextLine());
			//Print string
			out.print(" 字串 : ");
			//if not empty ,Print string
			while(!stack.isEmpty())
				out.print(stack.pop()+ " ");

	}
}


class MyStack extends ArrayList {
	//Check stack empty
	public boolean isEmpty() {
	    return super.isEmpty();
	  }
	//Get size
	public int getSize() {
	    return size();
	  }
	//Peek stack
	public String peek() {
	    return (String)get(getSize() - 1);
	  }
	//remove string
	public String pop() {
		  String o = (String)get(getSize() - 1);
	    remove(getSize() - 1);
	    return o;
	  }
	//push stack
	public void push(String o) {
	    add(o);
	  }

	  @Override /** Override the toString in the Object class */
	  public String toString() {
	    return "stack: " + toString();
	  }
	  
	}
