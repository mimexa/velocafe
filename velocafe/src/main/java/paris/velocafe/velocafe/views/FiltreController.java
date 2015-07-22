package paris.velocafe.velocafe.views;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import paris.velocafe.velocafe.forms.FiltreForm;
import paris.velocafe.velocafe.rendered.FiltreRendered;

/**
 * Controlleur du filtre de gauche
 * 
 * @author maxime
 *
 */
@SuppressWarnings("serial")
@Named
@ViewAccessScoped
public class FiltreController implements Serializable {

	private FiltreForm form;
	private FiltreRendered rendered;

	@PostConstruct
	public void postConstruct() {
		form = new FiltreForm();
		rendered = new FiltreRendered(form);
	}

	// Assesseurs

	public FiltreForm getForm() {
		return form;
	}

	public FiltreRendered getRendered() {
		return rendered;
	}

	// Actions

	public void reset() {
		form.reset();
	}

}
