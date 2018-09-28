package pe.gob.ep.ginnet.seguridad.service;

import java.util.List;

import pe.gob.ep.ginnet.seguridad.bean.Test;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;

public interface UsuarioService {

	public Usuario login(String userName,String password);
	public Usuario findUsuarioByUserName(String userName);
	public Usuario ultimoUsuarioRegistrado(String userName);
	public Usuario findUsuarioByPk(Integer idUsuario) throws Exception;
	public List<Usuario> findAll(Usuario usuario) throws Exception;
	
	public List<Test> findAllProyectos(Test test) throws Exception;
	public List<Test> findAllObjetivos(Test test) throws Exception;
	public List<Test> findAllIndicadores(Test test) throws Exception;
	
	public Usuario save(Usuario usuario) throws Exception;
	public Usuario deleteByPk(Integer idUsuario);
	public void disabledUser(Usuario usuario);
	public Usuario updateByPk(Usuario usuario) throws Exception;
	public void cambiarClave(Usuario usuario) throws Exception;
	public void cambiarEstadoUsuario(Usuario usuario) throws Exception;
	
}
