import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lesson3point2 {

	public static void main(String[] args) {
		
		
		System.out.println("a\\b\\c" + "''d''");
		System.out.println();
		System.out.println("\\t is a tab, \\n is a new line, \\' prints a " + "'quote'");
		System.out.println();
		System.out.println("''line one''\n " + "\\line" + "                two\\");
		System.out.println();
		System.out.println("\\\\denotes a single line comment\n" + "\\*denotes a multiline comment*\\");
		System.out.println();
		System.out.println("''\\\\''\\''''\n" + "                 \\''\\''''\\\n" + "\\''''''''\\"  );
		System.out.println();
		System.out.println();
		
		String word = "Birthday";
		System.out.println(word.toUpperCase());
		System.out.println();
		
		word = "it's my party";
		System.out.println(word.substring(0,4) + " a " + "''PARTY''");
		System.out.println();
		
		word = "whose a whats it";
	    System.out.println("WHOSE\n" + "is " + "WHAT");
		System.out.println();
		
		word = "Every Way The Wind Blows";
		String e = word.substring(0,5);
		System.out.println(e.toLowerCase());
		

	}

}
