import java.util.HashMap;
import java.util.Scanner;

public class Fetva {

	public static void main(String[] args) {
		System.out.println("Doğduğun Ay:\n" + "Doğduğun Gün:\n" + "Doğum Yılının Son Hanesi:\n");

		Scanner scan = new Scanner(System.in);

		String letter = scan.next();
		int day = scan.nextInt();
		int year = scan.nextInt();

		HashMap<String, String> letters = new HashMap<String, String>();
		letters.put("Ocak", "Kadınların ");
		letters.put("Şubat", "Alkoliklerin ");
		letters.put("Mart", "Sağcıların ");
		letters.put("Nisan", "Erkeklerin ");
		letters.put("Mayıs", "Yaşlıların ");
		letters.put("Haziran", "Aşı karşıtlarının ");
		letters.put("Temmuz", "Torbacıların ");
		letters.put("Ağustos", "Yalnızların ");
		letters.put("Eylül", "Sevgililerin ");
		letters.put("Ekim", "Zenginlerin ");
		letters.put("Kasım", "Fakirlerin ");
		letters.put("Aralık", "Solcuların ");

		HashMap<Integer, String> days = new HashMap<Integer, String>();
		days.put(1, "Arabada ");
		days.put(2, "Oturarak ");
		days.put(3, "Üstü açık ");
		days.put(4, "Gözü Kapalı ");
		days.put(5, "Bağırarak ");
		days.put(6, "Mitingte ");
		days.put(7, "Yan komşuyla ");
		days.put(8, "Elleri bağlı ");
		days.put(9, "Afganlarla ");
		days.put(10, "Suriyelilerle ");
		days.put(11, "Mültecilerle ");
		days.put(12, "Evde ");
		days.put(13, "Mezarlıkta ");
		days.put(13, "Kafası güzelken ");
		days.put(14, "Ekrem İmamoğlu ile ");
		days.put(15, "Kemal Kılıçdaroğlu ile ");
		days.put(16, "Mansur Yavaş ile ");
		days.put(17, "Sandıkta ");
		days.put(18, "Fısıldayarak ");
		days.put(19, "Çıplak ");
		days.put(20, "Kapalılarla ");
		days.put(21, "Recep Tayyip Erdoğan ile ");
		days.put(22, "Devlet Bahçeli ile ");
		days.put(23, "Banyoda ");
		days.put(24, "Ağzı açık ");
		days.put(25, "Doğu Perinçek ile ");
		days.put(26, "Yahudilerle ");
		days.put(27, "Budistlerle ");
		days.put(28, "Hayallerde ");
		days.put(29, "Rüyada ");
		days.put(30, "Hristiyanlarla ");
		days.put(31, "Müslümanlarla ");
		
		HashMap<Integer, String> years = new HashMap<Integer, String>();
		years.put(0, "Bağırması caiz değildir.");
		years.put(1, "Yatması günahtir.");
		years.put(2, "Gülmesi uygun değildir.");
		years.put(3, "Küfretmesi caizdir.");
		years.put(4, "Nefes alması caiz değildir.");
		years.put(5, "Sevişmesi haramdır.");
		years.put(6, "İçki içmesi haramdır.");
		years.put(7, "Aşkını ilan etmesi caiz değildir.");
		years.put(8, "Öpüşmesi haramdır.");
		years.put(9, "Bakışması uygun değildir.");

		
		System.out.println("Destur!! Yeni fetva verildi:  " +letters.get(letter)+days.get(day)+years.get(year));
	}

}
