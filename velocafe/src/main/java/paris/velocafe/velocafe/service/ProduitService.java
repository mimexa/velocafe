package paris.velocafe.velocafe.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import paris.velocafe.velocafe.dao.ProduitDaoImpl;
import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.domain.Produit;
import paris.velocafe.velocafe.entity.Image;
import paris.velocafe.velocafe.forms.FiltreForm;
import paris.velocafe.velocafe.utils.DataUtils;
import paris.velocafe.velocafe.utils.ObjectConverter;

@Stateless
public class ProduitService {

	@Inject
	private ProduitDaoImpl produitDao;
	@Inject
	private ImageService imageService;

	public MiniProduit findMiniProduitById(final Long id) {
		return ObjectConverter.toMiniProduit(produitDao.find(id));
	}

	public List<MiniProduit> findAllMiniProduit() {
		List<MiniProduit> miniProduits = ObjectConverter.toMiniProduits(produitDao.findAll());
		return miniProduits;
	}

	public List<MiniProduit> findMiniProduit(final FiltreForm filtreForm) {
		List<MiniProduit> miniProduits = ObjectConverter.toMiniProduits(produitDao.findList(DataUtils.filtreToSqlparams(filtreForm)));
		if (miniProduits != null) {
			for (MiniProduit miniProduit : miniProduits) {
				Image image = imageService.findMainImage(miniProduit.getIdProduit());
				miniProduit.setImageId(image != null ? image.getIdImage() : 0);
			}
		}
		return miniProduits;
	}

	public Produit findProduitById(final Long id) {
		return ObjectConverter.toProduit(produitDao.find(id));
	}

	public int update(final Produit produit) {
		return produitDao.update(ObjectConverter.toProduitDb(produit));
	}
}
