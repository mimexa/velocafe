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
		produitDb.setTypeUsage(rs.getString(TYP_USAGE_PRODUIT)); // VARCHAR(3)
		produitDb.setDiametreRoue(rs.getString(DIAM_ROUE_PRODUIT)); // VARCHAR(5)
		produitDb.setTailleCadre(rs.getString(TAILL_CADRE_PRODUIT)); // VARCHAR(4)
		produitDb.setDimensionCadre(rs.getInt(DIM_CADRE_PRODUIT)); // INT
		produitDb.setDisponibilite(rs.getString(DISPO_PRODUIT));
		produitDb.setUserSize(rs.getInt(USER_SIZE_PRODUIT)); // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		produitDb.setStyle(rs.getString(STYLE_PRODUIT)); // ADD COLUMN `STYLE` VARCHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		produitDb.setOption1(rs.getString(OPTION_1_PRODUIT)); // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		produitDb.setOption2(rs.getString(OPTION_2_PRODUIT)); // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		produitDb.setOption3(rs.getString(OPTION_3_PRODUIT)); // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		produitDb.setSizecategory(rs.getString(SIZE_CAT_PRODUIT)); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		produitDb.setWeightCategory(rs.getString(WEIGHT_CAT_PRODUIT)); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		produitDb.setPackageCategory(rs.getString(PACK_CAT_PRODUIT)); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		produitDb.setStockOption(rs.getString(STOCK_OPTION_PRODUIT)); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		produitDb.setColor(rs.getString(COLOR_PRODUIT)); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		produitDb.setSuspensionSeat(rs.getString(SUSP_SEAT_PRODUIT)); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		produitDb.setEasyEntry(rs.getString(EASY_ENTRY_PRODUIT)); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
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
			mapPropertiesColumns.put(typeUsage, TYP_USAGE_PRODUIT);
			mapPropertiesColumns.put(diametreRoue, DIAM_ROUE_PRODUIT);
			mapPropertiesColumns.put(tailleCadre, TAILL_CADRE_PRODUIT);
			mapPropertiesColumns.put(dimensionCadre, DIM_CADRE_PRODUIT);
			mapPropertiesColumns.put(disponibilite, DISPO_PRODUIT);
			mapPropertiesColumns.put(userSize, USER_SIZE_PRODUIT);
			mapPropertiesColumns.put(style, STYLE_PRODUIT);
			mapPropertiesColumns.put(option1, OPTION_1_PRODUIT);
			mapPropertiesColumns.put(option2, OPTION_2_PRODUIT);
			mapPropertiesColumns.put(option3, OPTION_3_PRODUIT);
			mapPropertiesColumns.put(sizecategory, SIZE_CAT_PRODUIT); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
			mapPropertiesColumns.put(weightCategory, WEIGHT_CAT_PRODUIT); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
			mapPropertiesColumns.put(packageCategory, PACK_CAT_PRODUIT); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
			mapPropertiesColumns.put(stockOption, STOCK_OPTION_PRODUIT); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
			mapPropertiesColumns.put(color, COLOR_PRODUIT); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
			mapPropertiesColumns.put(suspensionSeat, SUSP_SEAT_PRODUIT); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
			mapPropertiesColumns.put(easyEntry, EASY_ENTRY_PRODUIT); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
		}
	}

	@Override
	public String getIdPropertyName() {
		return idProduit;
	}
}
