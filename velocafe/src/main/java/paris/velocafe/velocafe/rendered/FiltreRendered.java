package paris.velocafe.velocafe.rendered;

import paris.velocafe.velocafe.forms.FiltreForm;

import static paris.velocafe.velocafe.utils.Constantes.Etat.*;

public class FiltreRendered {

	private final FiltreForm form;

	public FiltreRendered(FiltreForm form) {
		this.form = form;
	}

	public boolean isAnneesRendered() {
		return form.getEtat().contains(OCCASION);
	}

}
