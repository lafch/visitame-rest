package pe.com.bbva.visitame.dao.impl;

import org.springframework.stereotype.Component;
import pe.com.bbva.visitame.dao.ValorDAO;
import pe.com.bbva.visitame.dominio.Valor;

@Component
public class ValorDAOImpl extends BaseDAOImpl<Valor, Long> implements ValorDAO {

	private static final long serialVersionUID = -8375244206052720532L;

	@Override
	protected Class<Valor> getClase() { return Valor.class; }
	
}