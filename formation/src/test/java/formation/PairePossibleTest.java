package formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import formation.exception.PaireException;
import formation.service.PairePossible;

@RunWith(JUnit4.class)
public class PairePossibleTest {

	
	@Test
	public void testPairePossiblePositif(){
		
		PairePossible paire = new PairePossible();		
		int k = paire.count(3);
		assertEquals(3, k);
		
	}	
	@Test
	public void testPairePossibleVingtSept(){
		
		PairePossible paire = new PairePossible();		
		int k = paire.count(27);
		assertEquals(351, k);
	}	
	@Test(expected=PaireException.class)
	public void testPairePossibleSupVingtSept(){		
		PairePossible paire = new PairePossible();		
		paire.count(Integer.MAX_VALUE);			
	
	}	
	@Test(expected=PaireException.class)
	public void testPairePossibleInfDeux(){		
		PairePossible paire = new PairePossible();		
		paire.count(Integer.MIN_VALUE);
		
	}

}
