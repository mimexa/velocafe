package paris.velocafe.velocafe.views;

import static paris.velocafe.velocafe.domain.MiniProduit.Props.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import paris.velocafe.velocafe.domain.Args;
import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.service.ProduitService;
import paris.velocafe.velocafe.utils.CommonUtils;
import paris.velocafe.velocafe.utils.Graphics;
import paris.velocafe.velocafe.utils.XhtmlPages;

@SuppressWarnings("serial")
@Named
@ViewAccessScoped
public class MozaiqueController implements Serializable {

	@Inject
	private ProduitService produitService;
	@Inject
	private FiltreController filtreController;

	private Set<MiniProduit> miniProduits;

	@PostConstruct
	public void postConstruct() {
		miniProduits = new HashSet<MiniProduit>();
	}

	// Assesseurs

	public Set<MiniProduit> getMiniProduits() {
		return miniProduits;
	}

	public int getLeftPosition() {
		return Graphics.filtreWidth;
	}

	// Actions

	public void refresh() {
		miniProduits.clear();
		miniProduits.addAll(produitService.findMiniProduit(filtreController.getForm()));
	}

	public void goToDetail(MiniProduit miniProduit) {
		String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
		String url = CommonUtils.toUrlAndParams(XhtmlPages.PRODUIT_XHTML, Arrays.asList(new Args<Long>(ID_PRODUIT, miniProduit.getIdProduit())));
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(path + url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
