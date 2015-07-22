package paris.velocafe.velocafe.utils;

public interface Constantes {
	interface Etat {
		String OCCASION = "O";
		String NEUF = "N";
	}

	interface Categorie {
		String VILLE = "VIL";
		String VTT = "VTT";
		String CASQUE = "CASQ";
	}

	interface Tables {
		String LABELS = "LABELS";
		String PRODUITS = "PRODUITS";
		String TECHNIQUE = "TECHNIQUE";
	}

	interface Colonnes {
		interface Produits {
			String ID_PRODUIT_PRODUITS = "ID_PRODUIT";
			String MONTANT_HT_PRODUITS = "MONTANT_HT";
			String MONTANT_TVA_PRODUITS = "MONTANT_TVA";
			String DATE_CRE_PRODUITS = "DATE_CRE";
			String MARQUE_PRODUITS = "MARQUE";
			String TITRE_PRODUITS = "TITRE";
			String REF_PRODUIT_PRODUITS = "REF_PRODUIT";
		}
	}
}
