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
	private Long imageId;

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

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Override
	public int compareTo(MiniProduit miniProduit) {
		return Integer.parseInt(String.valueOf(idProduit - miniProduit.idProduit));
	}

	public interface Props {
		String ID_PRODUIT = "idProduit";
		String TITRE = "titre";
		String MARQUE = "marque";
		String REFERENCE = "reference";
		String MONTANT_HT = "montantHT";
		String MONTANT_TVA = "montantTVA";
		String IMAGE_ID = "imageId";
	}

}
