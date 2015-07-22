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

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
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

}
