package pe.gob.ep.ginnet.seguridad.service;

import java.util.List;

import pe.gob.ep.ginnet.seguridad.bean.Rol;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;

public interface RolService {

	public List<Rol> findAll(Rol rol) throws Exception;
	public Rol findByPk(Integer idRol) throws Exception;
	public Rol save(Rol rol) throws Exception;
	public void delete(Rol rol) throws Exception;
	public void deleteByPk(Integer idRol) throws Exception;
	public List<UsuarioRol> getRolesByIdUsuario(Integer idUsuario) throws Exception;
	
}
