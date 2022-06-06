import java.util.HashMap;
import java.util.Scanner;

public class Fetva {

	public static void main(String[] args) {
		System.out.println("Do�du�un Ay:\n" + "Do�du�un G�n:\n" + "Do�um Y�l�n�n Son Hanesi:\n");

		Scanner scan = new Scanner(System.in);

		String letter = scan.next();
		int day = scan.nextInt();
		int year = scan.nextInt();

		HashMap<String, String> letters = new HashMap<String, String>();
		letters.put("Ocak", "Kad�nlar�n ");
		letters.put("�ubat", "Alkoliklerin ");
		letters.put("Mart", "Sa�c�lar�n ");
		letters.put("Nisan", "Erkeklerin ");
		letters.put("May�s", "Ya�l�lar�n ");
		letters.put("Haziran", "A�� kar��tlar�n�n ");
		letters.put("Temmuz", "Torbac�lar�n ");
		letters.put("A�ustos", "Yaln�zlar�n ");
		letters.put("Eyl�l", "Sevgililerin ");
		letters.put("Ekim", "Zenginlerin ");
		letters.put("Kas�m", "Fakirlerin ");
		letters.put("Aral�k", "Solcular�n ");

		HashMap<Integer, String> days = new HashMap<Integer, String>();
		days.put(1, "Arabada ");
		days.put(2, "Oturarak ");
		days.put(3, "�st� a��k ");
		days.put(4, "G�z� Kapal� ");
		days.put(5, "Ba��rarak ");
		days.put(6, "Mitingte ");
		days.put(7, "Yan kom�uyla ");
		days.put(8, "Elleri ba�l� ");
		days.put(9, "Afganlarla ");
		days.put(10, "Suriyelilerle ");
		days.put(11, "M�ltecilerle ");
		days.put(12, "Evde ");
		days.put(13, "Mezarl�kta ");
		days.put(13, "Kafas� g�zelken ");
		days.put(14, "Ekrem �mamo�lu ile ");
		days.put(15, "Kemal K�l��daro�lu ile ");
		days.put(16, "Mansur Yava� ile ");
		days.put(17, "Sand�kta ");
		days.put(18, "F�s�ldayarak ");
		days.put(19, "��plak ");
		days.put(20, "Kapal�larla ");
		days.put(21, "Recep Tayyip Erdo�an ile ");
		days.put(22, "Devlet Bah�eli ile ");
		days.put(23, "Banyoda ");
		days.put(24, "A�z� a��k ");
		days.put(25, "Do�u Perin�ek ile ");
		days.put(26, "Yahudilerle ");
		days.put(27, "Budistlerle ");
		days.put(28, "Hayallerde ");
		days.put(29, "R�yada ");
		days.put(30, "Hristiyanlarla ");
		days.put(31, "M�sl�manlarla ");
		
		HashMap<Integer, String> years = new HashMap<Integer, String>();
		years.put(0, "Ba��rmas� caiz de�ildir.");
		years.put(1, "Yatmas� g�nahtir.");
		years.put(2, "G�lmesi uygun de�ildir.");
		years.put(3, "K�fretmesi caizdir.");
		years.put(4, "Nefes almas� caiz de�ildir.");
		years.put(5, "Sevi�mesi haramd�r.");
		years.put(6, "��ki i�mesi haramd�r.");
		years.put(7, "A�k�n� ilan etmesi caiz de�ildir.");
		years.put(8, "�p��mesi haramd�r.");
		years.put(9, "Bak��mas� uygun de�ildir.");

		
		System.out.println("Destur!! Yeni fetva verildi:  " +letters.get(letter)+days.get(day)+years.get(year));
	}

}
