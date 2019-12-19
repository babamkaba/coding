package formation.service;

public class PairePossible {

	public static final String LE_NOMBRE_DE_PAIRES_AVEC_DEUX_CAR_AU_MOINS = "Le nombre de paires ne peut être constitué qu'avec deux caractères au moins";
	public static final String LE_NOMBRE_DE_PAIRES_MAX_DEPASSE = "Le nombre de caracteres possibles est 27";
	public int count(int n) {
		
		if (n <= 1) {
			throw new IllegalArgumentException(
					LE_NOMBRE_DE_PAIRES_AVEC_DEUX_CAR_AU_MOINS);
		}
		else if (n == 2) {
			return 1;
		} else if (n <= 27) {
			return count(n - 1) + n - 1;
		} else {
			throw new IllegalArgumentException(LE_NOMBRE_DE_PAIRES_MAX_DEPASSE);
		}
	}

}
