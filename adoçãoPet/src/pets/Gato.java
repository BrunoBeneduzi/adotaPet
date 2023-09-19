package pets;

public class Gato extends PetGenerico {
	
	
	
	public Gato(String nomeDoPet, int idade) {
		super(nomeDoPet, idade);

	}

	@Override
	protected void setTipoAnimal() {
		this.tipoAnimal = "Gato";
	}

}