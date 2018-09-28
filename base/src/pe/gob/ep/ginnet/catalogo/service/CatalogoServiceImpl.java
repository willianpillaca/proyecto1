package pe.gob.ep.ginnet.catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogo;
import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogoCriteria;
import pe.gob.ep.ginnet.catalogo.dao.ElementoCatalogoDAO;
import pe.gob.ep.ginnet.util.Constante;

@Service
public class CatalogoServiceImpl implements CatalogoService {

	@Autowired
	private ElementoCatalogoDAO elementoCatalogoDAO;
	@Override
	public List<ElementoCatalogo> findCatalogoByIdGrupo(Integer idGrupo)
			throws Exception {
		// TODO Auto-generated method stub
		ElementoCatalogoCriteria elCri=new ElementoCatalogoCriteria();
		elCri.createCriteria().andICatalogoGrupoIdEqualTo(idGrupo).andICatalogoEstadoEqualTo(Constante.ESTADO_ACTIVO);
		List<ElementoCatalogo> list=elementoCatalogoDAO.selectByExample(elCri);
		return list;
	}
	
}
