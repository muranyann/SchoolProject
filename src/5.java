package SchoolProject;

import java.util.Random;

public class RandomNumber {
	
	private static final Random RANDOM = new Random();
	
	public static int generateRandomNumber() {
		return RANDOM.nextInt(100) + 1;
	}
}