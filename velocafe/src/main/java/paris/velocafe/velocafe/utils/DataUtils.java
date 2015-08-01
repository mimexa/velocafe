package paris.velocafe.velocafe.utils;

import static paris.velocafe.velocafe.domain.Operator.*;
import static paris.velocafe.velocafe.entity.ProduitDb.Props.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.primefaces.model.TreeNode;

import paris.velocafe.velocafe.domain.Pair;
import paris.velocafe.velocafe.domain.SqlParams;
import paris.velocafe.velocafe.entity.ProduitDb.Props;
import paris.velocafe.velocafe.forms.FiltreForm;

public class DataUtils {

	public static Set<SqlParams<?>> filtreToSqlparams(final FiltreForm filtreForm) {
		Set<SqlParams<?>> args = new HashSet<SqlParams<?>>();
		int anneeDebut = filtreForm.getAnneeDebut();
		if (anneeDebut > 0) {
			args.add(new SqlParams<Date>(dateFabrication, SUPERIOR_OR_EQUALS, CommonUtils.toSqlDate(1, 0, anneeDebut)));
		}
		int anneeFin = filtreForm.getAnneeFin();
		if (anneeFin > 0) {
			args.add(new SqlParams<Date>(dateFabrication, INFERIOR_OR_EQUALS, CommonUtils.toSqlDate(1, 0, anneeFin)));
		}
		Set<String> couleur = filtreForm.getCouleur();
		if (CommonUtils.isNotNullOrEmpty(couleur)) {
			args.add(new SqlParams<String>("couleur", EQUALS, couleur));
		}
		Set<String> etat = filtreForm.getEtat();
		if (CommonUtils.isNotNullOrEmpty(etat)) {
			args.add(new SqlParams<String>(Props.etat, EQUALS, etat));
		}
		String marque = filtreForm.getMarque();
		if (isNotNullOrEmpty(marque)) {
			args.add(new SqlParams<String>(Props.marque, EQUALS, marque));
		}
		int prixMaximum = filtreForm.getPrixMaximum();
		if (prixMaximum > 0) {
			args.add(new SqlParams<Double>(montantHt, INFERIOR_OR_EQUALS, getMontantHT(prixMaximum)));
		}
		int prixMinimum = filtreForm.getPrixMinimum();
		if (prixMinimum > 0) {
			args.add(new SqlParams<Double>(montantHt, SUPERIOR_OR_EQUALS, getMontantHT(prixMinimum)));
		}
		Set<String> categorie = toSelection(filtreForm.getCategoriesTree());
		if (CommonUtils.isNotNullOrEmpty(categorie)) {
			args.add(new SqlParams<String>(Props.categorie, EQUALS, categorie));
		}
		return args;
	}

	@SuppressWarnings("unchecked")
	private static Set<String> toSelection(final TreeNode treeNodes) {
		Set<String> selection = new HashSet<String>();
		for (TreeNode treeNode : treeNodes.getChildren()) {
			if (treeNode.isSelected()) {
				selection.add(((Pair<String, String>) treeNode.getData()).getValue());
			}
		}
		return selection;
	}

	private static double getMontantHT(final int montantTTC) {
		return montantTTC * (1 - Consts.tva);
	}

	private static boolean isNotNullOrEmpty(final String value) {
		return CommonUtils.isNotNullOrEmpty(value) && !Consts.tousValue.equals(value);
	}

	private interface Consts {
		double tva = 0.196;
		String tousValue = "TOUS";
	}

}
