//jadencase
public class JadenCase {

	public static String toJadenCase(String phrase) {
		// TODO put your code below this comment
		String[] arrayPhrase = phrase.split(" ");
    	String out = "";
    	String letter = "";
    	for (int i=0; i<arrayPhrase.length;i++){
    		letter = arrayPhrase[i].charAt(0).toString().toUpperCase();
    		out+= letter + arrayPhrase[i].substring(1) +" ";
    	}
    		
		return out;
	}

	public static void main(String[] args) {
		String r = toJadenCase("hello world how are you?");
		System.out.println(r);
	}

}