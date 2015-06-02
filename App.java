
public class App {

	public static void main(String[] args) {
		///////// RUNTIME EXCEPTIONS /////////
		
		//Will create a runtime exception
		//Runtime exceptions do not force you to handle them
		//They're usually indicative of serious issues in your program
		
		//ArithmeticException
		// int value = 7;
		// value = value/0;

		//NullPointerException
		// String text = null;s
		// System.out.println(text.length());
		
		//ArrayIndexOutOfBoundsException
		// String[] texts = {"one", "two", "three"};
		// System.out.println(texts[3]);
		
		/////////// Catching Runtime exceptions /////////
		//Not usually done bc Runtime exceptions are seriously bad
		
		String[] texts = {"one", "two", "three"};
		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}

}
