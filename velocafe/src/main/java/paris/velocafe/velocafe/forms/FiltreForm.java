package paris.velocafe.velocafe.forms;

import static paris.velocafe.velocafe.utils.Constantes.Etat.NEUF;
import static paris.velocafe.velocafe.utils.Constantes.Etat.OCCASION;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import paris.velocafe.velocafe.utils.CommonUtils;

/**
 * 
 * Formulaire du filtre de gauche
 * 
 * @author maxime
 *
 */
public class FiltreForm {

	private String marque;
	private List<String> etat;
	private int prixMinimum;
	private int prixMaximum;
	private int anneeDebut;
	private int anneeFin;
	private List<String> categorie;

	// Constructeurs

	public FiltreForm() {
		etat = new LinkedList<String>();
		categorie = new LinkedList<String>();
		reset();
	}

	// Assesseurs

	public int getAnneeDebut() {
		return anneeDebut;
	}

	public int getPrixMinimum() {
		return prixMinimum;
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

	public List<String> getEtat() {
		return etat;
	}

	public Map<Integer, Integer> getAnnees() {
		return Consts.annees;
	}

	public void setEtat(List<String> etat) {
		this.etat = etat;
	}

	public Map<String, String> getEtats() {
		return Consts.etats;
	}

	public List<String> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<String> categorie) {
		this.categorie = categorie;
	}

	public void reset() {
		marque = Consts.tousValue;
		anneeDebut = Consts.anneeMinimum;
		anneeFin = Consts.anneeMaximum;
		prixMinimum = Consts.prixMinimum;
		prixMaximum = Consts.prixMaximum;
		etat.clear();
		etat.add(OCCASION);
		etat.add(NEUF);
		categorie.clear();
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
		static final Map<String, String> etats = new HashMap<String, String>();
		static {
			etats.put("Neuf", NEUF);
			etats.put("Occasion", OCCASION);
		}
		static final Map<String, String> categories = new HashMap<String, String>();
		static {
			categories.put("", "");
		}
	}

}
