package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;
import pkgCore.Round;
import pkgCore.eGameResult;
import pkgTest.DieTest;
import pkgTest.RollTest;

public class RoundTest {
	
	@Test
	public void RoundTest() {
		
		for (int a = 0; a < 10000; a++) {
			Round r = new Round();
			assertTrue(r.getResult() == eGameResult.NATURAL || r.getResult() == eGameResult.CRAPS || r.getResult() == eGameResult.POINT || r.getResult() == eGameResult.SEVEN_OUT);
			
	}
	}

}
