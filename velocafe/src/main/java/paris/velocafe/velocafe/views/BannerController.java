package paris.velocafe.velocafe.views;

import static paris.velocafe.velocafe.forms.FiltreForm.Props.*;
import static paris.velocafe.velocafe.utils.Constantes.Categorie.*;
import static paris.velocafe.velocafe.utils.Constantes.Etat.*;
import static paris.velocafe.velocafe.utils.Constantes.Lang.*;
import static paris.velocafe.velocafe.utils.Constantes.SousCategorie.*;
import static paris.velocafe.velocafe.utils.XhtmlPages.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import paris.velocafe.velocafe.domain.Args;
import paris.velocafe.velocafe.forms.BannerForm;
import paris.velocafe.velocafe.utils.CommonUtils;
import paris.velocafe.velocafe.utils.Graphics;
import paris.velocafe.velocafe.utils.XhtmlPages;

/**
 * Controlleur du filtre de la bannière
 * 
 * @author maxime
 *
 */
@SuppressWarnings("serial")
@Named
@SessionScoped
public class BannerController implements Serializable {

	private BannerForm form;

	@PostConstruct
	public void postConstruct() {
		form = new BannerForm();
	}

	// Assesseurs

	public int getDropDownMenuWidth() {
		return Consts.dropDownMenuWidth;
	}

	public BannerForm getForm() {
		return form;
	}

	// Actions

	public void goTo(String dest) {
		Consts.Destination destination = Consts.Destination.valueOf(dest);
		CommonUtils.toUrlAndParams(Consts.xhtmlPages.get(destination), Consts.params.get(destination));

	}

	public void changeLanguage(String lang) {
		if (FR.equals(lang)) {
			FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
			form.setLang(FR);
			form.setLocale(Locale.FRANCE);
		} else if (EN.equals(lang)) {
			FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.ENGLISH);
			form.setLang(EN);
			form.setLocale(Locale.ENGLISH);
		} else if (HD.equals(lang)) {
			FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("nl"));
			form.setLang(HD);
			form.setLocale(Locale.ENGLISH);
		}
		form.setLang(lang);
	}

	public Locale getLocale() {
		return form.getLocale();
	}

	public int getFooterHeight() {
		return Graphics.footerHeight;
	}

	@SuppressWarnings("unchecked")
	private static class Consts {
		static final int dropDownMenuWidth = 135;
		static final Map<Destination, Set<Args<String>>> params = new HashMap<Destination, Set<Args<String>>>();
		static final Map<Destination, XhtmlPages> xhtmlPages = new HashMap<Destination, XhtmlPages>();
		static {
			xhtmlPages.put(Destination.TOUS_VELOS_NEUFS, MARQUETPLACE_XHTML);
			params.put(Destination.TOUS_VELOS_NEUFS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF)));
			xhtmlPages.put(Destination.VELOS_NEUF_VILLE, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_NEUF_VILLE, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_NEUF_ELECTRIQUES, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_NEUF_ELECTRIQUES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_NEUF_VTT, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_NEUF_VTT, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_NEUF_POLYVALENTS, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_NEUF_POLYVALENTS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_NEUF_PLIABLES, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_NEUF_PLIABLES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.TOUS_ACCESSOIRES_NEUFS, MARQUETPLACE_XHTML);
			params.put(Destination.TOUS_ACCESSOIRES_NEUFS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.PIECES_DETACHEES_NEUVES, MARQUETPLACE_XHTML);
			params.put(Destination.PIECES_DETACHEES_NEUVES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.CASQUES_NEUFS, MARQUETPLACE_XHTML);
			params.put(Destination.CASQUES_NEUFS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VETEMENTS_NEUFS, MARQUETPLACE_XHTML);
			params.put(Destination.VETEMENTS_NEUFS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.CADENAS_NEUFS, MARQUETPLACE_XHTML);
			params.put(Destination.CADENAS_NEUFS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.TOUS_VELOS_OCCASIONS, MARQUETPLACE_XHTML);
			params.put(Destination.TOUS_VELOS_OCCASIONS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_OCCASIONS_VILLE, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_OCCASIONS_VILLE, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_OCCASIONS_ELECTRIQUES, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_OCCASIONS_ELECTRIQUES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_OCCASIONS_VTT, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_OCCASIONS_VTT, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_OCCASIONS_POLYVALENTS, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_OCCASIONS_POLYVALENTS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VELOS_OCCASIONS_PLIABLES, MARQUETPLACE_XHTML);
			params.put(Destination.VELOS_OCCASIONS_PLIABLES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.TOUS_OCCASIONS_ACCESSOIRES, MARQUETPLACE_XHTML);
			params.put(Destination.TOUS_OCCASIONS_ACCESSOIRES, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.PIECES_DETACHEES_OCCASIONS, MARQUETPLACE_XHTML);
			params.put(Destination.PIECES_DETACHEES_OCCASIONS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.CASQUES_OCCASIONS, MARQUETPLACE_XHTML);
			params.put(Destination.CASQUES_OCCASIONS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.VETEMENTS_OCCASIONS, MARQUETPLACE_XHTML);
			params.put(Destination.VETEMENTS_OCCASIONS, CommonUtils.toSet(new Args<String>(CATEGORIE, VELO), new Args<String>(ETAT, NEUF), new Args<String>(SOUS_CATEGORIE, VILLE)));
			xhtmlPages.put(Destination.RESERVER_VELO, LOCATIONS_XHTML);
			xhtmlPages.put(Destination.RESERVER_GROUPE, LOCATIONS_XHTML);
			xhtmlPages.put(Destination.TOURISME_PRO, LOCATIONS_XHTML);
			xhtmlPages.put(Destination.LIVRE_OR, LOCATIONS_XHTML);
			xhtmlPages.put(Destination.ASSEMBLER_VELO, ASSEMBLER_XHTML);
			xhtmlPages.put(Destination.REALISATIONS_ASSEMBLAGE, REALISATION_MESURE_XHTML);
			xhtmlPages.put(Destination.TARIFS_REPARATIONS, REPARATIONS_XHTML);
			xhtmlPages.put(Destination.REALISATIONS_REPARATIONS, REPARATIONS_XHTML);
			xhtmlPages.put(Destination.NOUS_TROUVER, PRATIQUE_XHTML);
			xhtmlPages.put(Destination.HORAIRES, PRATIQUE_XHTML);
			xhtmlPages.put(Destination.QUI_SOMMES_NOUS, PRATIQUE_XHTML);
			xhtmlPages.put(Destination.PARTENAIRES, PARTENAIRES_XHTML);
			xhtmlPages.put(Destination.NOUVEAU_PRODUIT, PRODUIT_XHTML);
		}

		enum Destination {
			TOUS_VELOS_NEUFS("tous_velos_neuf"), VELOS_NEUF_VILLE("velos_neuf_ville"), VELOS_NEUF_ELECTRIQUES("velos_neuf_electrique"), VELOS_NEUF_VTT("velos_neuf_vtt"), VELOS_NEUF_POLYVALENTS(
					"velos_neuf_polyvalents"), VELOS_NEUF_PLIABLES("velos_neuf_pliables"), TOUS_ACCESSOIRES_NEUFS("tous_accessoires_neufs"), PIECES_DETACHEES_NEUVES("pieces_detachees_neuves"), CASQUES_NEUFS(
					"casques_neufs"), VETEMENTS_NEUFS("vetements_neufs"), CADENAS_NEUFS("Cadenas_neufs"), TOUS_VELOS_OCCASIONS("tous_velos_occasions"), VELOS_OCCASIONS_VILLE("velos_occasions_ville"), VELOS_OCCASIONS_ELECTRIQUES(
					"velos_occasions_electrique"), VELOS_OCCASIONS_VTT("velos_occasions_vtt"), VELOS_OCCASIONS_POLYVALENTS("velos_occasions_polyvalents"), VELOS_OCCASIONS_PLIABLES(
					"velos_occasions_pliables"), TOUS_OCCASIONS_ACCESSOIRES("tous_accessoires_occasions"), PIECES_DETACHEES_OCCASIONS("pieces_detachees_occasions"), CASQUES_OCCASIONS(
					"casques_occasions"), VETEMENTS_OCCASIONS("vetements_occasions"), RESERVER_VELO("reserver_velos"), RESERVER_GROUPE("reserver_groupe"), TOURISME_PRO("tourisme_pro"), LIVRE_OR(
					"livre_or"), ASSEMBLER_VELO("assembler_velo"), REALISATIONS_ASSEMBLAGE("realisations_assemblage"), TARIFS_REPARATIONS("tarifs_reparations"), REALISATIONS_REPARATIONS(
					"realisations_reparations"), NOUS_TROUVER("nous_trouver"), HORAIRES("horaires"), QUI_SOMMES_NOUS("qui_sommes_nous"), PARTENAIRES("partenaires"), NOUVEAU_PRODUIT("nouveau_produit");

			private String value;

			private Destination(String value) {
				this.value = value;
			}

			@Override
			public String toString() {
				return value;
			}
		}
	}

}