import java.util.Scanner;

public class cipher {
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int shift;
	int length;
	String word;

	System.out.println("Enter word to be encoded");
	word = scan.next();

	System.out.println("Enter character shift(right is positive):");
	shift = scan.nextInt();

	length = word.length();
	
	for (int n = 0; n < length; n++) {
		char chr = word.charAt(n);
		int asciiValue = (int) chr;
		asciiValue = asciiValue + shift;
		System.out.print(((char) asciiValue));
	}

    }
}
