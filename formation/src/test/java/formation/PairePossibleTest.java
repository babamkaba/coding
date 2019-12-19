package formation;

import org.junit.Test;

import formation.exception.PaireException;
import formation.service.PairePossible;
import junit.framework.TestCase;

public class PairePossibleTest extends TestCase {
	
	public static final String MOINS_CARACTERS = "Le nombre de paires ne peut être constitué qu'avec deux caractères au moins";
	public static final String PLUS_CARACTERS = "Le nombre de caracteres possibles est 27";
	
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
