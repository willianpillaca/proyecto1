package pe.gob.ep.ginnet.catalogo.service;

import java.util.List;

import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogo;

public interface CatalogoService {
	
	public List<ElementoCatalogo> findCatalogoByIdGrupo(Integer idGrupo) throws Exception;	

}
