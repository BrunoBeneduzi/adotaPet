package pets;

public class Cavalo extends PetGenerico{

	public Cavalo(String nomeDoPet, int idade) {
		super(nomeDoPet, idade);

	}

	@Override
	protected void setTipoAnimal() {
		this.tipoAnimal = "Cavalo";
	}

}
