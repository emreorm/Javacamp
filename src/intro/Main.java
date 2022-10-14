

public class Main {

	public static void main(String[] args) {
		System.out.println("hello sworld");
        
		String ortaMetin = "ilginizi cekebilir";
		String altMetin ="vade suresi"	;
	    System.out.println(ortaMetin + " " + altMetin);
	    int vade = 15;
	    double DolarDun = 18.18;
	    double DolarBugun = 18.20;
	    boolean dolarDustuMU = false;
	    
	    String okYonu = "";
	    
	    if (DolarBugun<DolarDun) {
		     okYonu = "down.jpg";

			System.out.println(okYonu);
		} 
	    else if(DolarBugun>DolarDun) {
		     okYonu = "up.jpg";
            System.out.println(okYonu);
	    	
	    }
	    else {
		     okYonu = "equal.jpg";
		    System.out.println(okYonu);
		    
          }
	    
	    String[] krediler = {"Hizli kredi","Maasi halkbank"};
	    System.out.println(krediler[0]);
	    for (int i =0 ; i< krediler.length; i++) {
	    	System.out.println(krediler[i]);
	 
	    }

}
}
