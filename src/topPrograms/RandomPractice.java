package accessmodifiers;

import java.util.Random;
import java.util.UUID;

public class RandomPractice {

	public static void main(String[] args) {
		Random r1= new Random();
		
		for(int i=1; i<=8; i++) {
			System.out.println(r1.nextInt(999999)+10);
		}
		
		for(int i=1; i<=8; i++) {
			System.out.println(UUID.randomUUID());
		}
		
		
		
	}
}
