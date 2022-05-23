
public class Main {

	public static void main(String[] args) {
		

		String original = "abcd FGHIJ ABC abc DEFG      ";
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println();
		
		// passando para minuscula
			String s01 = original.toLowerCase();
			System.out.println("toLowerCase: -"+s01+"!-");
		
		// passando para maiuscula
			String s02 = original.toUpperCase();
			System.out.println("toUpperCase: -"+s02+"!-");

		// retirando os espaçõs das laterais
			String s03 = original.trim();
			System.out.println("Trim: -"+s03+"!-");

		// substring determina o inicio de uma nova string 
			String s04 = original.substring(2);
			System.out.println("Substring(2): -"+s04+"!-");
	
		// substring determina o inicio de uma nova string 
		// vai começar no 2 e vai parar no caractere de indice 9
			String s05 = original.substring(2,9);
			System.out.println("Substring(2,9): -"+s05+"!-");
			
		//Sempre que houver um a vai ser substituido por um x
			String s06 = original.replace('a','x');
			System.out.println("Replace(a,x): -"+s06+"!-");	
			
		//  replace com substrings
			String s07 = original.replace("abc", "xy");
			System.out.println("Replac eabc -> xy -"+s06+"!-");
			
		// ve o primeiro index dos caracteres passados no parametro	
		int i = original.indexOf("bc");
		System.out.println("Index of 'bc': "+ i);
		// ve o ultimo index dos caracteres passados no parametro	
		int j = original.lastIndexOf("bc");
		System.out.println("Last Index of 'bc': "+ j);
		
		System.out.println();
		System.out.println();
		// recorat o string de acordo com o parametro de separação passado em:
		System.out.println("--- SPLIT ---");
		System.out.println();
		
		String s = "potato lemon juice orange";
//		String s = "potato-lemon-juice-orange";
//		String [] vect = s.split("-");
		
		// passado aq
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		

		

				
		

		
		
	}

}
