package paris.velocafe.velocafe.entity;

import java.sql.Date;

/**
 * Entité "produit"<br/>
 * Correspondance avec la table PRODUITS en base de données
 * 
 * @author maxime
 *
 */
public class ProduitDb {

	private Long idProduit; // ID_PRODUIT
	private double montantHt; // MONTANT_HT
	private double montantTva;// MONTANT_TVA
	private Date dateCreation; // DATE_CRE
	private String marque; // MARQUE
	private String titre; // TITRE
	private String refProduit; // REF_PRODUIT

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public double getMontantHt() {
		return montantHt;
	}

	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}

	public double getMontantTva() {
		return montantTva;
	}

	public void setMontantTva(double montantTva) {
		this.montantTva = montantTva;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}

}
