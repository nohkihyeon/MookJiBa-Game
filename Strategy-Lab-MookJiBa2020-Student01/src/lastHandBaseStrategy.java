
import java.util.concurrent.ThreadLocalRandom;

public class lastHandBaseStrategy implements PlayingStrategy {

	@Override
	public HandType computeNextHand(HandType lastUserHand, boolean isUserAttack) {
		if(lastUserHand == null) {
			return HandType.valueOf(ThreadLocalRandom.current().nextInt(3));
		}
		return null;
	}

}
