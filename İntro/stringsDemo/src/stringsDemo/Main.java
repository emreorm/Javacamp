package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "   Bugun hava cok guzel.   ";
		System.out.println(mesaj);
		/*System.out.println("eleman sayisi: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("yasasin"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith(" "));
		
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ava"));
		System.out.println(mesaj.lastIndexOf('a'));
		*/
		
		String yeniMesaj = mesaj.replace(' ', '-');  
		System.out.println(mesaj.replace( ' ', '-'));
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));  //secili harfleri alır
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase()); //hepsini kucuk yapar
		System.out.println(mesaj.toUpperCase());  //hepsini buyuk yapar
		System.out.println(mesaj.trim()); //boslukları atar
		

	}

}
