package paris.velocafe.velocafe.rowmapper;

import static paris.velocafe.velocafe.utils.Constantes.Colonnes.Produits.*;
import static paris.velocafe.velocafe.utils.Constantes.Tables.*;
import static paris.velocafe.velocafe.entity.ProduitDb.Props.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import paris.velocafe.velocafe.entity.ProduitDb;

public class ProduitDbRowMapper extends AbstractRowMapper<ProduitDb> {

	@Override
	public ProduitDb mapRow(ResultSet rs, int line) throws SQLException {
		ProduitDb produitDb = new ProduitDb();
		produitDb.setIdProduit(rs.getLong(ID_PRODUIT_PRODUITS));
		produitDb.setDateCreation(rs.getDate(DATE_CRE_PRODUITS));
		produitDb.setMarque(rs.getString(MARQUE_PRODUITS));
		produitDb.setMontantHt(rs.getDouble(MONTANT_HT_PRODUITS));
		produitDb.setMontantTva(rs.getDouble(MONTANT_TVA_PRODUITS));
		produitDb.setRefProduit(rs.getString(REF_PRODUIT_PRODUITS));
		produitDb.setTitre(rs.getString(TITRE_PRODUITS));
		produitDb.setCategorie(rs.getString(CATEGORIE_PRODUIT));
		produitDb.setSousCategorie(rs.getString(SOUS_CATEGORIE_PRODUIT));
		produitDb.setEtat(rs.getString(ETAT_PRODUIT));
		produitDb.setRefTechnique(rs.getString(REF_TECHNIQUE_PRODUIT));
		produitDb.setDateFabrication(rs.getDate(DATE_FAB_PRODUIT));
		return produitDb;
	}

	@Override
	public String getTableName() {
		return PRODUITS;
	}

	@Override
	public String getColumn(String propertie) {
		return propertie != null ? Consts.mapPropertiesColumns.get(propertie) : null;
	}

	private static class Consts {
		public static final Map<String, String> mapPropertiesColumns = new HashMap<String, String>();
		static {
			mapPropertiesColumns.put(idProduit, ID_PRODUIT_PRODUITS);
			mapPropertiesColumns.put(dateCreation, DATE_CRE_PRODUITS);
			mapPropertiesColumns.put(marque, MARQUE_PRODUITS);
			mapPropertiesColumns.put(montantHt, MONTANT_HT_PRODUITS);
			mapPropertiesColumns.put(montantTva, MONTANT_TVA_PRODUITS);
			mapPropertiesColumns.put(refProduit, REF_PRODUIT_PRODUITS);
			mapPropertiesColumns.put(titre, TITRE_PRODUITS);
			mapPropertiesColumns.put(categorie, CATEGORIE_PRODUIT);
			mapPropertiesColumns.put(sousCategorie, SOUS_CATEGORIE_PRODUIT);
			mapPropertiesColumns.put(etat, ETAT_PRODUIT);
			mapPropertiesColumns.put(refTechnique, REF_TECHNIQUE_PRODUIT);
			mapPropertiesColumns.put(dateFabrication, DATE_FAB_PRODUIT);
		}
	}

	@Override
	public String getIdPropertyName() {
		return idProduit;
	}
}
