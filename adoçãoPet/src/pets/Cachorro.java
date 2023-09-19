package pets;

public class Cachorro extends PetGenerico{
	
	
	public Cachorro(String nomeDoPet, int idade) {
		super(nomeDoPet, idade);
	}

	@Override
	public void setTipoAnimal() {
		this.tipoAnimal = "Cachorro";
	}


}