package paris.velocafe.velocafe.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import static paris.velocafe.velocafe.utils.Constantes.Colonnes.Produits.*;

import paris.velocafe.velocafe.entity.ProduitDb;

public class ProduitDbRowMapper implements RowMapper<ProduitDb> {

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
		return produitDb;
	}
}
