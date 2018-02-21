package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll r = new Roll();
		rolls.add(r);
		ComeOutScore=r.getScore();

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12)
			eGameResult = eGameResult.CRAPS;
		
		else if (ComeOutScore == 7 || ComeOutScore == 11)
			eGameResult = eGameResult.NATURAL;
		
		else
			r = new Roll();
			rolls.add(r);
		
			while (r.getScore() != 7 && r.getScore() != ComeOutScore) {
				r = new Roll();
				rolls.add(r);
			}

			if (r.getScore() == 7)
				eGameResult = eGameResult.SEVEN_OUT;
			else
				eGameResult = eGameResult.POINT;
		// TODO: value the eGameResult after the round is complete
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

	public eGameResult getResult() {
		return eGameResult;
	}
}
