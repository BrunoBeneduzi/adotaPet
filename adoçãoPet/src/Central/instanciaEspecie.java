package Central;

import pets.especieDoPet;

public class instanciaEspecie {
	

	
	public especieDoPet chamaEspecie(int escolha) {
		
		switch(escolha) {
		case 1:
			return especieDoPet.CACHORRO;
		case 2:
			return especieDoPet.GATO;
		case 3:
			return especieDoPet.CAVALO;
		default:
			return null;
		}
	}


	
}