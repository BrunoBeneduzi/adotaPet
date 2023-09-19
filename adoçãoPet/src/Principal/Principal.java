package Principal;

import Central.CentralDeAdocao;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		CentralDeAdocao central = new CentralDeAdocao();
		Scanner sc = new Scanner(System.in);

		System.out.print("Escolha a opção que deseja realizar\n"+"1- Cadastrar um novo Pet\n"+"2- Exibir a lista dos pets\n"+"-> ");

		switch(sc.nextInt()) {
		case 1:
			System.out.println("******************************************************************************************************");
			central.exibeCodigos();
			System.out.print("Digite o codigo -> ");
			int codigo = sc.nextInt();
			System.out.print("Digite a idade -> ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o nome -> ");
			String nome = sc.next();

			central.adicionaPet(codigo, nome, idade);
			break;
		case 2:
			break;
		default:
			break;
		}
		central.mostraPets();
		;
	}

}
