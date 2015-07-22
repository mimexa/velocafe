package paris.velocafe.velocafe.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import paris.velocafe.velocafe.dao.ProduitDaoImpl;
import paris.velocafe.velocafe.domain.MiniProduit;
import paris.velocafe.velocafe.utils.ObjectConverter;

@Stateless
public class ProduitService {

	@Inject
	private ProduitDaoImpl produitDao;

	public MiniProduit findMiniProduitById(final Long id) {
		MiniProduit miniProduit = ObjectConverter.toMiniProduit(produitDao.find(id));
		return miniProduit;
	}

	public List<MiniProduit> findAllMiniProduit() {
		List<MiniProduit> miniProduits = ObjectConverter.toMiniProduits(produitDao.findAll());
		return miniProduits;
	}

}
