package formation;

import org.junit.Test;

import formation.service.PairePossible;
import junit.framework.TestCase;

public class PairePossibleTest extends TestCase {
	
	@Test
	public void testPairePossiblePositif(){
		
		PairePossible paire = new PairePossible();		
		int k = paire.nombrePaire(6);
		assertEquals(15, k);
		
	}

}
