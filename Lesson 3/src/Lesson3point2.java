import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lesson3point2 {

	public static void main(String[] args) {
		
		
		System.out.println("a\\b\\c" + "\"d\"");
		System.out.println();
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a " + "\"quote\"");
		System.out.println();
		System.out.println("\"line one\"\n " + "\\line" + "                two\\");
		System.out.println();
		System.out.println("\\\\denotes a single line comment\n" + "\\*denotes a multiline comment*\\");
		System.out.println();
		System.out.println("\"\\\\\"\\\"\"\n" + "                 \\\"\\\"\"\\\n" + "\\\"\"\"\"\\"  );
		System.out.println();
		System.out.println();
		
		String word = "Birthday";
		System.out.println(word.toUpperCase());
		System.out.println();
		
		word = "it's my party";
		System.out.println(word.substring(0,4) + " a " + "\"PARTY\"");
		System.out.println();
		
		word = "whose a whats it";
		String whose = word.substring(0,5);
		String hello = word.substring(7,12);
		System.out.println(whose.toUpperCase() + "\n" + "is" + hello.toUpperCase());
		System.out.println();
		
		word = "Every Way The Wind Blows";
		String e = word.substring(0,5);
		String q = word.substring(6,9);
		String w = word.substring(10,13);
		String o = word.substring(14,18);
		String b = word.substring(19,24);
		String num = word.substring(0,4);
		System.out.println(e.toLowerCase() + " " + q.toUpperCase() + " " + w.toLowerCase() + " \\" + o.toUpperCase() + "\\ " + b.toLowerCase() + " " + num.length());
		System.out.println();
		
		word = "Peter Piper Picked A Peck Of Picked Peppers ";
		String a = word.substring(19,20);
		String v = word.substring(20,35);
		String r = word.substring(11,18);
		String find = word.substring(35,44);
		String good = word.substring(0,12);
		System.out.println(a + v.toLowerCase() + "          " + find.toLowerCase() + good + "        " + r.toLowerCase()  );
		System.out.println();
		
		
		word = "word has 4 letters";
		String test = word.substring(9,10);
		String eee = word.substring(11,18);
		String ff = word.substring(4,8);
		System.out.println("\"" + test + "\" " + eee + ff + " \"9\" " + eee);
		System.out.println();
		
		word = "Jim, Jacky, Johnny, Jill";
		String ww = word.substring(0,3);
		String qq = word.substring(5,10);
		String hh = word.substring(12,18);
		String cc = word.substring(20);
		
		System.out.println(ww.toLowerCase() + "\\" + ww.length() + "\n" + qq.toUpperCase() + "\\" + + qq.length() + "\n" + hh.toLowerCase() + "\\" + hh.length() + "\n" + cc.toUpperCase() + "\\" + cc.length());
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
