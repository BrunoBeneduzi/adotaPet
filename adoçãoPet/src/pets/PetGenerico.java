package pets;

public abstract class PetGenerico {
	protected String tipoAnimal, nome;
	protected int idade;
	
	
	public PetGenerico(String nomeDoPet, int idade) {
		setNome(nomeDoPet);
		setIdade(idade);
		setTipoAnimal();
	}
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}

	protected abstract void setTipoAnimal();//seta o tipo de especie que é o animal

	public int getIdade() {
		return idade;
	}

	public  void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {//seta o nome que foi dado a o pet
		this.nome = nome;
	}
	
	
}