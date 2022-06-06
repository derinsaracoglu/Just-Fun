import java.util.HashMap;
import java.util.Scanner;

public class Fetva {

	public static void main(String[] args) {
		System.out.println("Doðduðun Ay:\n" + "Doðduðun Gün:\n" + "Doðum Yýlýnýn Son Hanesi:\n");

		Scanner scan = new Scanner(System.in);

		String letter = scan.next();
		int day = scan.nextInt();
		int year = scan.nextInt();

		HashMap<String, String> letters = new HashMap<String, String>();
		letters.put("Ocak", "Kadýnlarýn ");
		letters.put("Þubat", "Alkoliklerin ");
		letters.put("Mart", "Saðcýlarýn ");
		letters.put("Nisan", "Erkeklerin ");
		letters.put("Mayýs", "Yaþlýlarýn ");
		letters.put("Haziran", "Aþý karþýtlarýnýn ");
		letters.put("Temmuz", "Torbacýlarýn ");
		letters.put("Aðustos", "Yalnýzlarýn ");
		letters.put("Eylül", "Sevgililerin ");
		letters.put("Ekim", "Zenginlerin ");
		letters.put("Kasým", "Fakirlerin ");
		letters.put("Aralýk", "Solcularýn ");

		HashMap<Integer, String> days = new HashMap<Integer, String>();
		days.put(1, "Arabada ");
		days.put(2, "Oturarak ");
		days.put(3, "Üstü açýk ");
		days.put(4, "Gözü Kapalý ");
		days.put(5, "Baðýrarak ");
		days.put(6, "Mitingte ");
		days.put(7, "Yan komþuyla ");
		days.put(8, "Elleri baðlý ");
		days.put(9, "Afganlarla ");
		days.put(10, "Suriyelilerle ");
		days.put(11, "Mültecilerle ");
		days.put(12, "Evde ");
		days.put(13, "Mezarlýkta ");
		days.put(13, "Kafasý güzelken ");
		days.put(14, "Ekrem Ýmamoðlu ile ");
		days.put(15, "Kemal Kýlýçdaroðlu ile ");
		days.put(16, "Mansur Yavaþ ile ");
		days.put(17, "Sandýkta ");
		days.put(18, "Fýsýldayarak ");
		days.put(19, "Çýplak ");
		days.put(20, "Kapalýlarla ");
		days.put(21, "Recep Tayyip Erdoðan ile ");
		days.put(22, "Devlet Bahçeli ile ");
		days.put(23, "Banyoda ");
		days.put(24, "Aðzý açýk ");
		days.put(25, "Doðu Perinçek ile ");
		days.put(26, "Yahudilerle ");
		days.put(27, "Budistlerle ");
		days.put(28, "Hayallerde ");
		days.put(29, "Rüyada ");
		days.put(30, "Hristiyanlarla ");
		days.put(31, "Müslümanlarla ");
		
		HashMap<Integer, String> years = new HashMap<Integer, String>();
		years.put(0, "Baðýrmasý caiz deðildir.");
		years.put(1, "Yatmasý günahtir.");
		years.put(2, "Gülmesi uygun deðildir.");
		years.put(3, "Küfretmesi caizdir.");
		years.put(4, "Nefes almasý caiz deðildir.");
		years.put(5, "Seviþmesi haramdýr.");
		years.put(6, "Ýçki içmesi haramdýr.");
		years.put(7, "Aþkýný ilan etmesi caiz deðildir.");
		years.put(8, "Öpüþmesi haramdýr.");
		years.put(9, "Bakýþmasý uygun deðildir.");

		
		System.out.println("Destur!! Yeni fetva verildi:  " +letters.get(letter)+days.get(day)+years.get(year));
	}

}
