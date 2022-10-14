
public class Main {
	public static void main(String[] args) {
	OgretmenKredisiManager ogretmenKredisiManager = new OgretmenKredisiManager();
	ogretmenKredisiManager.Hesapla();
	
	KrediUI krediUI = new KrediUI();
	krediUI.KrediHesapla(new OgretmenKredisiManager());
	krediUI.KrediHesapla(new AskerKredisiManager());
	krediUI.KrediHesapla(new TarimKredisiManager());

	
}
}