package paris.velocafe.velocafe.domain;

/**
 * Mini produit pour la mozaïque
 * 
 * @author maxime
 *
 */
public class MiniProduit implements Comparable<MiniProduit> {

	private Long idProduit;
	private String titre;
	private String marque;
	private String reference;
	private double montantHT;
	private double montantTVA;

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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
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

	@Override
	public int compareTo(MiniProduit miniProduit) {
		return Integer.parseInt(String.valueOf(idProduit - miniProduit.idProduit));
	}

}
