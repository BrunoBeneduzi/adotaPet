package Central;

import pets.*;

import java.util.*;
public class CentralDeAdocao {
	private List<PetGenerico> pet = new ArrayList<>();


	private especieDoPet getEspecieDoPet(int codigo) {//Metodo que apoia o metodo INSTANCIAPET, ele puxa a classe pelo enum
		instanciaEspecie especie = new instanciaEspecie();
		return especie.chamaEspecie(codigo);
	}

	private PetGenerico instanciaPet(int codigo, String nomeDoPet,int idadePet) {//metodo que instancia uma animal
		especieDoPet especie = getEspecieDoPet(codigo);

		if(especie == null) throw new NullPointerException();//se for nulo vai gerar uma execção que será tratada pelo metodo ADICIONAPET

		if(especieDoPet.CACHORRO.equals(especie)) return new Cachorro(nomeDoPet, idadePet);
		else if(especieDoPet.GATO.equals(especie)) return new Gato(nomeDoPet, idadePet);
		else if(especieDoPet.CAVALO.equals(especie)) return new Cavalo(nomeDoPet, idadePet);
		return null;
	}

	public void adicionaPet(int codigo,String nome, int idadePet) {//metodo para adicionar um pet
		try {
			this.pet.add(instanciaPet(codigo, nome, idadePet));
			System.out.println("Registrado");
		}catch(NullPointerException e) {System.out.println("o Codigo "+codigo+" é invalido");}
	}

	public void mostraPets() {
		for(PetGenerico i: pet) {
			System.out.println("O animal é do tipo: "+i.getTipoAnimal()+" | Seu nome é: "+i.getNome()+" | Sua idade é: "+i.getIdade());
		}
	}
	
	public void exibeCodigos() {
		System.out.print("Codigos dos pets\n"+"1- Cachorro\n"+"2- Gato\n"+"3- Cavalo\n");
	}
}