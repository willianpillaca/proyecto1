package pe.gob.ep.ginnet.seguridad.service;

import java.util.List;
import java.util.Map;

import pe.gob.ep.ginnet.seguridad.bean.Rol;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;

public interface SeguridadService {
	public List<UsuarioRol> findRolesByUserName(String username) throws Exception;
	public String obtenerOpcionesPorRol(Integer idRol) throws Exception;
	public String strMenuRecursivo(List<Map<String, Object>> opcionesPorRol) throws Exception;
	
	public String obtenerTreeOpcionesPorRol(Integer idRol) throws Exception;
	public String strTreeRecursivo(List<Map<String, Object>> opcionesPorRol) throws Exception;
	public Map<String, Object> insertOpcionPorRol(Rol rol) throws Exception;
	
}
