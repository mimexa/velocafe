package paris.velocafe.velocafe.utils;

import java.util.ArrayList;
import java.util.List;

import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.domain.Produit;
import paris.velocafe.velocafe.entity.ProduitDb;
import paris.velocafe.velocafe.forms.ProduitForm;

/**
 * Conversion d'objets bd en objets front
 * 
 * @author maxime
 *
 */
public class ObjectConverter {

	public static MiniProduit toMiniProduit(final ProduitDb produitDb) {
		MiniProduit miniProduit = new MiniProduit();
		miniProduit.setIdProduit(produitDb.getIdProduit());
		miniProduit.setMarque(produitDb.getMarque());
		miniProduit.setMontantHT(produitDb.getMontantHt());
		miniProduit.setMontantTVA(produitDb.getMontantTva());
		miniProduit.setReference(produitDb.getRefProduit());
		miniProduit.setTitre(produitDb.getTitre());
		return miniProduit;
	}

	public static List<MiniProduit> toMiniProduits(List<ProduitDb> produitsDb) {
		List<MiniProduit> miniProduits = new ArrayList<MiniProduit>();
		for (ProduitDb produitDb : produitsDb) {
			miniProduits.add(toMiniProduit(produitDb));
		}
		return miniProduits;
	}

	public static Produit toProduit(final ProduitDb produitDb) {
		Produit produit = new Produit();
		produit.setCategorie(produitDb.getCategorie());
		produit.setDateEntree(produitDb.getDateCreation());
		produit.setDateFabrication(produitDb.getDateFabrication());
		produit.setEtat(produitDb.getEtat());
		produit.setIdProduit(produitDb.getIdProduit());
		produit.setMarque(produitDb.getMarque());
		produit.setMontantHT(produitDb.getMontantHt());
		produit.setMontantTVA(produitDb.getMontantTva());
		produit.setReferenceFabricant(produitDb.getRefProduit());
		produit.setReferenceTechnique(produitDb.getRefTechnique());
		produit.setSousCategorie(produitDb.getSousCategorie());
		produit.setTitre(produitDb.getTitre());
		produit.setTypeUsage(produitDb.getTypeUsage());
		produit.setDiametreRoue(produitDb.getDiametreRoue());
		produit.setTailleCadre(produitDb.getTailleCadre());
		produit.setDimensionCadre(produitDb.getDimensionCadre());
		produit.setDisponibilite(produitDb.getDisponibilite());
		produit.setUserSize(produitDb.getUserSize()); // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		produit.setStyle(produitDb.getStyle()); // ADD COLUMN `STYLE` VARCHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		produit.setOption1(produitDb.getOption1()); // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		produit.setOption2(produitDb.getOption2()); // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		produit.setOption3(produitDb.getOption3()); // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		produit.setSizecategory(produitDb.getSizecategory()); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		produit.setWeightCategory(produitDb.getWeightCategory()); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		produit.setPackageCategory(produitDb.getPackageCategory()); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		produit.setStockOption(produitDb.getStockOption()); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		produit.setColor(produitDb.getColor()); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		produit.setSuspensionSeat(produitDb.getSuspensionSeat()); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		produit.setEasyEntry(produitDb.getEasyEntry()); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
		return produit;
	}

	public static ProduitDb toProduitDb(final Produit produit) {
		ProduitDb produitDb = new ProduitDb();
		produitDb.setCategorie(produit.getCategorie());
		produitDb.setDateCreation(CommonUtils.toSqlDate(produit.getDateEntree()));
		produitDb.setDateFabrication(CommonUtils.toSqlDate(produit.getDateFabrication()));
		produitDb.setEtat(produit.getEtat());
		produitDb.setIdProduit(produit.getIdProduit());
		produitDb.setMarque(produit.getMarque());
		produitDb.setMontantHt(produit.getMontantHT());
		produitDb.setMontantTva(produit.getMontantHT());
		produitDb.setRefProduit(produit.getReferenceFabricant());
		produitDb.setRefTechnique(produit.getReferenceTechnique());
		produitDb.setSousCategorie(produit.getSousCategorie());
		produitDb.setTitre(produit.getTitre());
		produitDb.setTypeUsage(produit.getTypeUsage()); // TYP_USAGE VARCHAR(3)
		produitDb.setDiametreRoue(produit.getDiametreRoue()); // DIAM_ROUE VARCHAR(5)
		produitDb.setTailleCadre(produit.getTailleCadre()); // TAILL_CADRE VARCHAR(4)
		produitDb.setDimensionCadre(produit.getDimensionCadre()); // DIM_CADRE INT
		produitDb.setDisponibilite(produit.getDisponibilite()); // DISPO VARCHAR(5)
		produitDb.setUserSize(produit.getUserSize()); // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		produitDb.setStyle(produit.getStyle()); // ADD COLUMN `STYLE` VARHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		produitDb.setOption1(produit.getOption1()); // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		produitDb.setOption2(produit.getOption2()); // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		produitDb.setOption3(produit.getOption3()); // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		produitDb.setSizecategory(produit.getSizecategory()); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		produitDb.setWeightCategory(produit.getWeightCategory()); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		produitDb.setPackageCategory(produit.getPackageCategory()); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		produitDb.setStockOption(produit.getStockOption()); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		produitDb.setColor(produit.getColor()); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		produitDb.setSuspensionSeat(produit.getSuspensionSeat()); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		produitDb.setEasyEntry(produit.getEasyEntry()); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
		return produitDb;
	}

	public static Produit toProduit(final ProduitForm produitForm) {
		Produit produit = new Produit();
		produit.setCategorie(produit.getCategorie());
		produit.setDateEntree(produit.getDateEntree());
		produit.setDateFabrication(produit.getDateFabrication());
		produit.setEtat(produit.getEtat());
		produit.setIdProduit(produit.getIdProduit());
		produit.setIdTechnique(produit.getIdTechnique());
		produit.setMarque(produit.getMarque());
		produit.setMontantHT(produit.getMontantHT());
		produit.setMontantTVA(produit.getMontantTVA());
		produit.setReferenceFabricant(produit.getReferenceFabricant());
		produit.setReferenceTechnique(produit.getReferenceTechnique());
		produit.setSousCategorie(produit.getReferenceTechnique());
		produit.setTitre(produit.getTitre());
		produit.setTypeUsage(produit.getTypeUsage()); // TYP_USAGE VARCHAR(3)
		produit.setDiametreRoue(produit.getDiametreRoue()); // DIAM_ROUE VARCHAR(5)
		produit.setTailleCadre(produit.getTailleCadre()); // TAILL_CADRE VARCHAR(4)
		produit.setDimensionCadre(produit.getDimensionCadre()); // DIM_CADRE INT
		produit.setDisponibilite(produit.getDisponibilite()); // DISPO VARCHAR(5)
		produit.setUserSize(produit.getUserSize()); // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		produit.setStyle(produit.getStyle()); // ADD COLUMN `STYLE` VARHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		produit.setOption1(produit.getOption1()); // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		produit.setOption2(produit.getOption2()); // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		produit.setOption3(produit.getOption3()); // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		produit.setSizecategory(produit.getSizecategory()); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		produit.setWeightCategory(produit.getWeightCategory()); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		produit.setPackageCategory(produit.getPackageCategory()); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		produit.setStockOption(produit.getStockOption()); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		produit.setColor(produit.getColor()); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		produit.setSuspensionSeat(produit.getSuspensionSeat()); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		produit.setEasyEntry(produit.getEasyEntry()); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
		return produit;
	}

	public static ProduitForm toProduitForm(final Produit produit) {
		ProduitForm produitForm = new ProduitForm();
		produitForm.setIdProduit(produit.getIdProduit());
		produitForm.setTitre(produit.getTitre());
		produitForm.setMarque(produit.getMarque());
		produitForm.setReferenceFabricant(produit.getReferenceFabricant());
		produitForm.setMontantHT(produit.getMontantHT());
		produitForm.setMontantTVA(produit.getMontantTVA());
		produitForm.setIdTechnique(produit.getIdTechnique());
		produitForm.setCategorie(produit.getCategorie());
		produitForm.setSousCategorie(produit.getSousCategorie());
		produitForm.setEtat(produit.getEtat());
		produitForm.setDateEntree(produit.getDateEntree());
		produitForm.setDateFabrication(produit.getDateFabrication());
		produitForm.setReferenceTechnique(produit.getReferenceTechnique());
		produitForm.setTypeUsage(produit.getTypeUsage()); // TYP_USAGE VARCHAR(3)
		produitForm.setDiametreRoue(produit.getDiametreRoue()); // DIAM_ROUE VARCHAR(5)
		produitForm.setTailleCadre(produit.getTailleCadre()); // TAILL_CADRE VARCHAR(4)
		produitForm.setDimensionCadre(produit.getDimensionCadre()); // DIM_CADRE INT
		produitForm.setDisponibilite(produit.getDisponibilite()); // DISPO VARCHAR(5)
		produitForm.setUserSize(produit.getUserSize()); // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		produitForm.setStyle(produit.getStyle()); // ADD COLUMN `STYLE` VARHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		produitForm.setOption1(produit.getOption1()); // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		produitForm.setOption2(produit.getOption2()); // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		produitForm.setOption3(produit.getOption3()); // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		produitForm.setSizecategory(produit.getSizecategory()); // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		produitForm.setWeightCategory(produit.getWeightCategory()); // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		produitForm.setPackageCategory(produit.getPackageCategory()); // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		produitForm.setStockOption(produit.getStockOption()); // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		produitForm.setColor(produit.getColor()); // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		produitForm.setSuspensionSeat(produit.getSuspensionSeat()); // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		produitForm.setEasyEntry(produit.getEasyEntry()); // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;
		return produitForm;
	}

}
