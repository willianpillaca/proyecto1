package pe.gob.ep.ginnet.ruedanegocio.service;

import java.util.List;

import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.seguridad.bean.Test;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;

public interface ProyectoService {
	
	public List<Proyecto> findAll(Proyecto proyecto) throws Exception;
	public Proyecto save(Proyecto proyecto) throws Exception;
	public Proyecto findProyectoByPk(Integer idProyecto) throws Exception;
	public Proyecto findProyectoByUserName(String userName);
	
}
