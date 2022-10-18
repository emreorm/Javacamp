import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int firstDigit;
		int secondDigit;
		Scanner sc = new Scanner(System.in);
		System.out.println("sayinin ilk basamagini griniz");
		firstDigit=sc.nextInt();
		Scanner sf = new Scanner(System.in);
		System.out.println("sayinin ikinci basamagini giriniz");
		secondDigit=sf.nextInt();
		
		
		
		
		do {
			int Steven = firstDigit + secondDigit;
			if(Steven %2 ==0) {
				System.out.println("Steven number");
				return;
			}else {
				System.out.println("Not Steven");
				return;
			}
			
		
		}while (firstDigit<10 && secondDigit<10 && 0<firstDigit);
		
		
		
			
 
		
		
	 
		
		

	}

}
