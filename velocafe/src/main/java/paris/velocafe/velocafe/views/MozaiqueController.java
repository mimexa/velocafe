package paris.velocafe.velocafe.views;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.service.ProduitService;
import paris.velocafe.velocafe.utils.CommonUtils;
import paris.velocafe.velocafe.utils.XhtmlPages;

@SuppressWarnings("serial")
@Named
@ViewAccessScoped
public class MozaiqueController implements Serializable {

	@Inject
	private ProduitService produitService;

	private Set<MiniProduit> miniProduits;

	@PostConstruct
	public void postConstruct() {
		miniProduits = new TreeSet<MiniProduit>();
		refresh();
	}

	// Assesseurs

	public Set<MiniProduit> getMiniProduits() {
		return miniProduits;
	}

	// Actions

	public void refresh() {
		miniProduits.addAll(produitService.findAllMiniProduit());
	}

	public String goToDetail(MiniProduit miniProduit) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("idProduit", String.valueOf(miniProduit.getIdProduit()));
		return CommonUtils.toUrlAndParams(XhtmlPages.PRODUIT_XHTML, params);
	}
}
