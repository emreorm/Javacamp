
public class Main {

	public static void main(String[] args) {
		int number = -5;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Asal degildir");
			return;
			
		}
		if(number<1) {
			System.out.println("gecersiz sayi");
			return;
		}
		
		for(int i = 2; i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
			
		}
		if(isPrime) {
			System.out.println("sayi asaldrr");
		}else {
			System.out.println("sayi asal degildir");
		}

	}

}
