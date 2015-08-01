package paris.velocafe.velocafe.utils;

public interface Constantes {

	interface Etat {
		String OCCASION = "O";
		String NEUF = "N";
	}

	interface Categorie {
		String VELO = "VELO";
		String ACCESSOIRE = "ACCESSOIRE";
		String VETEMENT = "VETEMENT";
		String PIECE_DETACHEE = "PIECE_DETACHEE";
	}

	interface SousCategorie {
		String CASQUE = "CASQUE";
		String CADENAS = "CADENAS";
		String VTT = "VTT";
		String VILLE = "VILLE";
		String PLIABLE = "PLIABLE";
		String VTC = "VTC";
		String SHORT = "SHORT";
		String TSHIRT = "TSHIRT";
		String CHAUSSURES = "CHAUSSURES";
		String GANTS = "GANTS";
		String SONNETTE = "SONNETTE";
	}

	interface Couleur {
		String BLEU = "BLEU";
		String BLANC = "BLANC";
		String ROUGE = "ROUGE";
		String VERT = "VERT";
		String JAUNE = "JAUNE";
	}

	interface Tables {
		String LABELS = "LABELS";
		String PRODUITS = "PRODUITS";
		String TECHNIQUE = "TECHNIQUE";
		String IMG = "IMG";
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
			String CATEGORIE_PRODUIT = "CATEGORIE";
			String SOUS_CATEGORIE_PRODUIT = "SOUS_CATEGORIE";
			String ETAT_PRODUIT = "ETAT";
			String REF_TECHNIQUE_PRODUIT = "REF_TECHNIQUE";
			String DATE_FAB_PRODUIT = "DATE_FAB";
		}

		interface Img {
			String ID_IMG_IMG = "ID_IMG";
			String ID_PRODUIT_IMG = "ID_PRODUIT";
			String IMG_IMG = "IMG";
			String MIME_TYPE_IMG = "MIME_TYPE";
			String FILE_NAME_IMG = "FILE_NAME";
			String ORDRE_IMG = "ORDRE";
			String DATE_CRE_IMG = "DATE_CRE";
			String USER_CRE_IMG = "USER_CRE";
			String SIZE_IMG = "SIZE";

		}
	}

	interface Lang {
		String FR = "FR";
		String EN = "EN";
		String HD = "HD";
	}

	interface Roles {
		String CLIENT = "CLIENT";
		String ADMIN = "ADMIN";
	}
}
