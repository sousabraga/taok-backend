package br.com.taok.service.importation;

import br.com.taok.exception.importation.ImportationException;

public interface Importer {

	public void importa() throws ImportationException;
}
