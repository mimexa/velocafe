package paris.velocafe.velocafe.forms;

import static paris.velocafe.velocafe.utils.Constantes.Categorie.*;
import static paris.velocafe.velocafe.utils.Constantes.Couleur.*;
import static paris.velocafe.velocafe.utils.Constantes.Etat.*;
import static paris.velocafe.velocafe.utils.Constantes.SousCategorie.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.faces.context.FacesContext;

import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.TreeNode;

import paris.velocafe.velocafe.domain.Args;
import paris.velocafe.velocafe.domain.Pair;
import paris.velocafe.velocafe.utils.CommonUtils;
import paris.velocafe.velocafe.views.MessagesConfig;

/**
 * 
 * Formulaire du filtre de gauche
 * 
 * @author maxime
 *
 */
public class FiltreForm {

	private String marque;
	private Set<String> etat;
	private int prixMinimum;
	private int prixMaximum;
	private int anneeDebut;
	private int anneeFin;
	private TreeNode categoriesTree;
	private TreeNode[] selection;
	private Set<String> couleur;

	// Constructeurs

	public FiltreForm() {
		reset();
	}

	// Assesseurs

	public int getAnneeDebut() {
		return anneeDebut;
	}

	public int getPrixMinimum() {
		return prixMinimum;
	}

	public Set<String> getEtat() {
		return etat;
	}

	public void setEtat(Set<String> etat) {
		this.etat = etat;
	}

	public void setPrixMinimum(int prixMinimum) {
		this.prixMinimum = prixMinimum;
	}

	public int getPrixMaximum() {
		return prixMaximum;
	}

	public void setPrixMaximum(int prixMaximum) {
		this.prixMaximum = prixMaximum;
	}

	public void setAnneeDebut(int anneeDebut) {
		this.anneeDebut = anneeDebut;
	}

	public int getAnneeFin() {
		return anneeFin;
	}

	public void setAnneeFin(int anneeFin) {
		this.anneeFin = anneeFin;
	}

	public Map<String, String> getMarques() {
		return Consts.marques;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Map<Integer, Integer> getAnnees() {
		return Consts.annees;
	}

	public Map<String, String> getEtats() {
		Map<String, String> etats = new HashMap<String, String>();
		etats.put(NEUF, MessagesConfig.getMessage("neuf"));
		etats.put(OCCASION, MessagesConfig.getMessage("occasions"));
		return etats;
	}

	public Map<String, String> getCouleurs() {
		return Consts.couleurs;
	}

	public TreeNode[] getSelection() {
		return selection;
	}

	public TreeNode getCategoriesTree() {
		return categoriesTree;
	}

	public void setSelection(TreeNode[] selection) {
		this.selection = selection;
	}

	public Set<String> getCouleur() {
		return couleur;
	}

	public void setCouleur(Set<String> couleur) {
		this.couleur = couleur;
	}

	// Methodes utiles

	public void reset() {
		marque = null;
		etat = null;
		prixMinimum = -1;
		prixMaximum = -1;
		anneeDebut = -1;
		anneeFin = -1;
		categoriesTree = null;
		selection = null;
		couleur = null;
	}

	public void refresh() {
		initialiseEmptyProperties();
		Map<String, String> attributes = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		setPropertiesWithAttributes(CommonUtils.toMap(attributes));
	}

	public void initialiseEmptyProperties() {
		if (CommonUtils.isNullOrEmpty(marque)) {
			marque = Consts.tousValue;
		}
		if (anneeDebut < 0) {
			anneeDebut = Consts.anneeMinimum;
		}
		if (anneeFin < 0) {
			anneeFin = Consts.anneeMaximum;
		}
		if (prixMinimum < 0) {
			prixMinimum = Consts.prixMinimum;
		}
		if (prixMaximum < 0) {
			prixMaximum = Consts.prixMaximum;
		}
		if (CommonUtils.isNullOrEmpty(etat)) {
			etat = new HashSet<String>();
			etat.add(OCCASION);
			etat.add(NEUF);
		}
		if (CommonUtils.isNullOrEmpty(couleur)) {
			couleur = new HashSet<String>();
			couleur.add(BLEU);
			couleur.add(BLANC);
			couleur.add(ROUGE);
			couleur.add(VERT);
			couleur.add(JAUNE);
		}
		if (CommonUtils.isNullOrEmpty(categoriesTree)) {
			categoriesTree = newTreeNode();
		}
	}

	@SuppressWarnings("unchecked")
	public void setPropertiesWithAttributes(final Set<Args<String>> args) {
		if (CommonUtils.isNotNullOrEmpty(args)) {
			for (Args<String> arg : args) {
				String param = arg.getParam();
				Set<String> values = arg.getValues();
				if (CommonUtils.isNotNullOrEmpty(param) && CommonUtils.isNotNullOrEmpty(values)) {
					if (Props.ETAT.equals(param)) {
						etat = values;
					} else if (Props.CATEGORIE.equals(param)) {
						for (String value : values) {
							for (TreeNode node : categoriesTree.getChildren()) {
								if (value.equals(((Pair<String, String>) node.getData()).getValue())) {
									node.setSelected(true);
								}
							}
						}
					} else if (Props.SOUS_CATEGORIE.equals(param)) {
						for (String value : values) {
							for (TreeNode node : categoriesTree.getChildren()) {
								if (value.equals(((Pair<String, String>) node.getData()).getValue())) {
									node.setSelected(true);
								}
							}
						}
					}
				}
			}
		}
	}

	public static TreeNode newTreeNode() {
		TreeNode categoriesTree = new CheckboxTreeNode();
		TreeNode velos = new CheckboxTreeNode(new Pair<String, String>(VELO, "Vélos"), categoriesTree);
		TreeNode accessoires = new CheckboxTreeNode(new Pair<String, String>(ACCESSOIRE, "Accessoires"), categoriesTree);
		TreeNode vetements = new CheckboxTreeNode(new Pair<String, String>(VETEMENT, "Vêtements"), categoriesTree);
		new CheckboxTreeNode(new Pair<String, String>(PIECE_DETACHEE, "Pièces détachées"), categoriesTree);
		new CheckboxTreeNode(new Pair<String, String>(CASQUE, "Casques"), accessoires);
		new CheckboxTreeNode(new Pair<String, String>(CADENAS, "Cadenas"), accessoires);
		new CheckboxTreeNode(new Pair<String, String>(VTT, "VTT"), velos);
		new CheckboxTreeNode(new Pair<String, String>(VILLE, "Urbain"), velos);
		new CheckboxTreeNode(new Pair<String, String>(PLIABLE, "Pliables"), velos);
		new CheckboxTreeNode(new Pair<String, String>(VTC, "TVC"), velos);
		new CheckboxTreeNode(new Pair<String, String>(SHORT, "Short"), vetements);
		new CheckboxTreeNode(new Pair<String, String>(TSHIRT, "Tshirt"), vetements);
		new CheckboxTreeNode(new Pair<String, String>(CHAUSSURES, "Chaussures"), vetements);
		new CheckboxTreeNode(new Pair<String, String>(GANTS, "Gants"), vetements);
		new CheckboxTreeNode(new Pair<String, String>(SONNETTE, "Sonnettes"), accessoires);
		return categoriesTree;
	}

	public interface Props {
		String MARQUE = "marque";
		String ETAT = "etat";
		String PRIX_MAXIMUM = "prixMinimum";
		String PRIX_MINIMUM = "prixMaximum";
		String ANNEE_DEBUT = "anneeDebut";
		String ANNEE_FIN = "anneeFin";
		String CATEGORIE = "categorie";
		String SOUS_CATEGORIE = "sousCategorie";
	}

	/**
	 * Constantes locales utiles
	 *
	 */
	private static class Consts {
		static final String tousLabel = "-- Tous --";
		static final String tousValue = "TOUS";
		/**
		 * Marques disponibles
		 */
		static final Map<String, String> marques = new HashMap<String, String>();
		static {
			marques.put(tousLabel, tousValue);
			marques.put("BMX", "BMX");
			marques.put("GIANT", "GIANT");
			marques.put("PIAGGO", "PIAGGO");
		}
		static final int anneeMinimum = 1970;
		static final int anneeMaximum = CommonUtils.getYear();
		static final int prixMinimum = 0;
		static final int prixMaximum = 3000;
		/**
		 * Années de fabrication
		 */
		static final Map<Integer, Integer> annees = new TreeMap<Integer, Integer>();
		static {
			for (int year = anneeMinimum; year <= anneeMaximum; year++) {
				annees.put(year, year);
			}
		}
		static final Map<String, String> couleurs = new HashMap<String, String>();
		static {
			couleurs.put(BLEU, BLEU);
			couleurs.put(BLANC, BLANC);
			couleurs.put(ROUGE, ROUGE);
			couleurs.put(VERT, VERT);
			couleurs.put(JAUNE, JAUNE);
		}
	}

}
