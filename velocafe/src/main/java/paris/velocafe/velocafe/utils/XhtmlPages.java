package paris.velocafe.velocafe.utils;

/**
 * Enumération des pages xhtml de l'applications
 * 
 * @author maxime
 *
 */
public enum XhtmlPages {
	PRODUIT_XHTML("/produit.xhtml"), MARQUETPLACE_XHTML("/marquetplace.xhtml"), INDEX_XHTML("/index.xhtml"), PRATIQUE_XHTML("/pratique.xhtml"), CONTACT_XHTML("/contact.xhtml"), LOCATIONS_XHTML(
			"/locations.xhtml"), LIVRE_OR_XHTML("/livre_or.xhtml"), REPARATIONS_XHTML("/reparations.xhtml"), REALISATION_REPARATIONS_XHTML("/realisation_reparations.xhtml"), REALISATION_MESURE_XHTML(
			"/realisation_mesure.xhtml"), ASSEMBLER_XHTML("/assembler.xhtml"), MESURE_XHTML("/mesure.xhtml"), PARTENAIRES_XHTML("/partenaires.xhtml");

	private String xhtmlPage;

	private XhtmlPages(String xhtmlPage) {
		this.xhtmlPage = xhtmlPage;
	}

	@Override
	public String toString() {
		return xhtmlPage;
	}

}
