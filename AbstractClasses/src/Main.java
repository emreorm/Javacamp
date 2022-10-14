
public class Main {

	public static void main(String[] args) {
		GameCalculator[] gameCalculators =  new GameCalculator[] {new WomanGameCalculator(), new OlderGameCalculator(), new KidsGameCalculator(), new ManGameCalculator()};
		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
		}
		
		
	}

}
