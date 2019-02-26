
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
		System.out.println(word.substring(0,4) + " a " + word.toUpperCase());
		
		

	}

}
