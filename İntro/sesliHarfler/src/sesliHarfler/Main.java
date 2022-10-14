package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'a';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalin sesli harf");
			break;
		default:
			System.out.println("ince sesli");

		}
	}

}
