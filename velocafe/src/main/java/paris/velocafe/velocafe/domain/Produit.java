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
	private String disponibilite;
	private int userSize; // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
	private String style; // ADD COLUMN `STYLE` VARCHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
	private String option1; // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
	private String option2; // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
	private String option3; // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
	private String sizecategory; // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
	private String weightCategory; // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
	private String packageCategory; // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
	private String stockOption; // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
	private String color; // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
	private String suspensionSeat; // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
	private String easyEntry; // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getTypeUsage() {
		return typeUsage;
	}

	public void setTypeUsage(String typeUsage) {
		this.typeUsage = typeUsage;
	}

	public String getDiametreRoue() {
		return diametreRoue;
	}

	public void setDiametreRoue(String diametreRoue) {
		this.diametreRoue = diametreRoue;
	}

	public String getTailleCadre() {
		return tailleCadre;
	}

	public void setTailleCadre(String tailleCadre) {
		this.tailleCadre = tailleCadre;
	}

	public int getDimensionCadre() {
		return dimensionCadre;
	}

	public void setDimensionCadre(int dimensionCadre) {
		this.dimensionCadre = dimensionCadre;
	}

	private String typeUsage; // TYP_USAGE VARCHAR(3)
	private String diametreRoue; // DIAM_ROUE VARCHAR(5)
	private String tailleCadre; // TAILL_CADRE VARCHAR(4)
	private int dimensionCadre; // DIM_CADRE INT

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

	public int getUserSize() {
		return userSize;
	}

	public void setUserSize(int userSize) {
		this.userSize = userSize;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getSizecategory() {
		return sizecategory;
	}

	public void setSizecategory(String sizecategory) {
		this.sizecategory = sizecategory;
	}

	public String getWeightCategory() {
		return weightCategory;
	}

	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}

	public String getPackageCategory() {
		return packageCategory;
	}

	public void setPackageCategory(String packageCategory) {
		this.packageCategory = packageCategory;
	}

	public String getStockOption() {
		return stockOption;
	}

	public void setStockOption(String stockOption) {
		this.stockOption = stockOption;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSuspensionSeat() {
		return suspensionSeat;
	}

	public void setSuspensionSeat(String suspensionSeat) {
		this.suspensionSeat = suspensionSeat;
	}

	public String getEasyEntry() {
		return easyEntry;
	}

	public void setEasyEntry(String easyEntry) {
		this.easyEntry = easyEntry;
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
		String typeUsage = "typeUsage"; // TYP_USAGE VARCHAR(3)
		String diametreRoue = "diametreRoue"; // DIAM_ROUE VARCHAR(5)
		String tailleCadre = "tailleCadre"; // TAILL_CADRE VARCHAR(4)
		String dimensionCadre = "dimensionCadre"; // DIM_CADRE INT
		String disponibilite = "disponibilite";
		String userSize = "userSize"; // ADD COLUMN `USER_SIZE` INT NULL COMMENT '' AFTER `DISPO`,
		String style = "style"; // ADD COLUMN `STYLE` VARCHAR(10) NULL COMMENT '' AFTER `USER_SIZE`,
		String option1 = "option1"; // ADD COLUMN `OPTION_1` VARCHAR(10) NULL COMMENT '' AFTER `STYLE`,
		String option2 = "option2"; // ADD COLUMN `OPTION_2` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_1`,
		String option3 = "option3"; // ADD COLUMN `OPTION_3` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_2`;
		String sizecategory = "sizecategory"; // ADD COLUMN `SIZE_CAT` VARCHAR(10) NULL COMMENT '' AFTER `OPTION_3`,
		String weightCategory = "weightCategory"; // ADD COLUMN `WEIGHT_CAT` VARCHAR(10) NULL COMMENT '' AFTER `SIZE_CAT`,
		String packageCategory = "packageCategory"; // ADD COLUMN `PACK_CAT` VARCHAR(10) NULL COMMENT '' AFTER `WEIGHT_CAT`,
		String stockOption = "stockOption"; // ADD COLUMN `STOCK_OPTION` VARCHAR(10) NULL COMMENT '' AFTER `PACK_CAT`,
		String color = "color"; // ADD COLUMN `COLOR` VARCHAR(10) NULL COMMENT '' AFTER `STOCK_OPTION`,
		String suspensionSeat = "suspensionSeat"; // ADD COLUMN `SUSP_SEAT` VARCHAR(1) NULL COMMENT '' AFTER `COLOR`,
		String easyEntry = "easyEntry"; // ADD COLUMN `EASY_ENTRY` VARCHAR(1) NULL COMMENT '' AFTER `SUSP_SEAT`;

	}

}
