package paris.velocafe.velocafe.utils;

import java.util.ArrayList;
import java.util.List;

import paris.velocafe.velocafe.domain.MiniProduit;
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

}
