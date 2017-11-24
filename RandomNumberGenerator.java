import java.util.Random;
import java.time.LocalTime;

public final class RandomNumberGenerator {
	private static final Random rand = new Random(LocalTime.now().toNanoOfDay());

	public static Random get() {
		return rand;
	}

	public static void reseed() {
		rand.setSeed(LocalTime.now().toNanoOfDay());
	}
}
