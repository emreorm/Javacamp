package Main;

public class Switch0 {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : gectiniz");
			break;
		case 'C':
			System.out.println("İyi : gectiniz");
			break;
		case 'D':
			System.out.println("Orta : gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef : kaldınız");
			break;
		default:
			System.out.println("gecersiz not girdiniz");

		}

	}

}
