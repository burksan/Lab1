package pkgCore;
import java.util.Random;

public class Die {

	private int DieValue;

	public Die() {
		// TODO: Determine DieVaue.. a random number between 1 and 6
		Random rand = new Random();
		DieValue = rand.nextInt(6) + 1;
	}

	public int getDieValue() {
		return DieValue;
	}
}
