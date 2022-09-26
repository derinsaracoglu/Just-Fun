import java.util.Scanner;

public class ReactionTimer {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		System.out.println("GOOOO !!!!!");
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		long reactTime = stopTime - startTime;
		
		System.out.println("Your Reaction Time:"+ reactTime + "ms");
		
		

	}

}
