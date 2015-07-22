package paris.velocafe.velocafe.utils;

public enum XhtmlPages {
	PRODUIT_XHTML("/produit.xhtml");

	private String xhtmlPage;

	private XhtmlPages(String xhtmlPage) {
		this.xhtmlPage = xhtmlPage;
	}

	@Override
	public String toString() {
		return xhtmlPage;
	}

}
