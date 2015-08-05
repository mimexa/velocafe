package paris.velocafe.velocafe.utils;

import java.util.ArrayList;
import java.util.List;

import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.domain.Produit;
import paris.velocafe.velocafe.entity.ProduitDb;

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
		produit.setCouleur(""); // TODO couleur impl
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
		return produitDb;
	}

}
