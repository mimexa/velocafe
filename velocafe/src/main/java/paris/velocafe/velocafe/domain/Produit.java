package paris.velocafe.velocafe.domain;

import java.util.Date;

public class Produit {

	private Long idProduit;
	private String titre;
	private String marque;
	private String referenceFabricant;
	private double montantHT;
	private double montantTVA;
	private Long idTechnique;
	private String categorie;
	private String sousCategorie;
	private String etat;
	private Date dateEntree;
	private Date dateFabrication;
	private String referenceTechnique;
	private String couleur;

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getReferenceFabricant() {
		return referenceFabricant;
	}

	public void setReferenceFabricant(String referenceFabricant) {
		this.referenceFabricant = referenceFabricant;
	}

	public double getMontantHT() {
		return montantHT;
	}

	public void setMontantHT(double montantHT) {
		this.montantHT = montantHT;
	}

	public double getMontantTVA() {
		return montantTVA;
	}

	public void setMontantTVA(double montantTVA) {
		this.montantTVA = montantTVA;
	}

	public Long getIdTechnique() {
		return idTechnique;
	}

	public void setIdTechnique(Long idTechnique) {
		this.idTechnique = idTechnique;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(String sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public String getReferenceTechnique() {
		return referenceTechnique;
	}

	public void setReferenceTechnique(String referenceTechnique) {
		this.referenceTechnique = referenceTechnique;
	}

	public interface Props {
		String idProduit = "idProduit";
		String titre = "titre";
		String marque = "marque";
		String referenceFabricant = "referenceFabricant";
		String montantHT = "montantHT";
		String montantTVA = "montantTVA";
		String idTechnique = "idTechnique";
		String categorie = "categorie";
		String sousCategorie = "sousCategorie";
		String etat = "etat";
		String dateEntree = "dateEntree";
		String dateFabrication = "dateFabrication";
		String referenceTechnique = "referenceTechnique";
		String couleur = "couleur";
	}

}
