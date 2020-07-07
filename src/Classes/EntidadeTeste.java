package Classes;

import java.util.ArrayList;

import info.debatty.java.stringsimilarity.Jaccard;

public class EntidadeTeste{

	public static void main(String[] args) {

		Jaccard jaccard = new Jaccard();

		ArrayList<Entidade> baseUm = new ArrayList();
		ArrayList<Entidade> baseDois = new ArrayList();



		Entidade entidade1 = new Entidade();
		entidade1.setNome("Eva");
		entidade1.setEndereco("Rua A");
		entidade1.setTelefone("87981446017");
//		Entidade entidade2 = new Entidade();
//		entidade2.setNome("Tiago");
//		entidade2.setEndereco("Rua A");
//		entidade2.setTelefone("111111111");
		Entidade entidade3 = new Entidade();
		entidade3.setNome("Eva Victória");
		entidade3.setEndereco("Rua A");
		entidade3.setTelefone("87981446017");

		baseUm.add(entidade1);
//		baseUm.add(entidade2);
		baseDois.add(entidade3);

		for (int i = 0; i < baseUm.size(); i++) {
			for (int j = 0; j < baseDois.size(); j++) {

				String s1 = baseUm.toString();
				String s2 = baseDois.toString();

				System.out.println(jaccard.similarity(s1, s2));
			}

		}


		System.out.println(baseUm);
		System.out.println(baseDois);
	}

}
