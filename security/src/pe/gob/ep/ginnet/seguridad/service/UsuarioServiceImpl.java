package pe.gob.ep.ginnet.seguridad.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.ep.ginnet.email.service.EmailService;
import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.seguridad.bean.Test;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioCriteria;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRolCriteria;
import pe.gob.ep.ginnet.seguridad.dao.UsuarioDAO;
import pe.gob.ep.ginnet.seguridad.dao.UsuarioRolDAO;
import pe.gob.ep.ginnet.seguridad.md5.AeSimpleMD5;
import pe.gob.ep.ginnet.util.Constante;
import pe.gob.ep.ginnet.util.Util;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private RolService rolService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private UsuarioRolDAO usuarioRolDAO;
	
	@Override
	public Usuario login(String userName, String password){
		// TODO Auto-generated method stub
		
		Usuario user=this.findUsuarioByUserName(userName);
		return user;
	}

	@Override
	public Usuario findUsuarioByUserName(String userName){
		// TODO Auto-generated method stub
		UsuarioCriteria uc=new UsuarioCriteria();
		uc.createCriteria().andVUsuarioUsernameEqualTo(userName.toUpperCase());
		
		Usuario user=null;
		
		List<Usuario> result=usuarioDAO.selectByExample(uc);
		
		if(result!=null && result.size()>0){
			user=result.get(0);
		}
		
		return user;
	}
	
	//obtener el id del usuario regsitrado
	@Override
	public Usuario ultimoUsuarioRegistrado(String userName){
		// TODO Auto-generated method stub
		UsuarioCriteria uc=new UsuarioCriteria();
		uc.createCriteria().andVUsuarioUsernameEqualTo(userName.toUpperCase());
		
		Usuario user=null;
		
		List<Usuario> result=usuarioDAO.selectByExample(uc);
		
		if(result!=null && result.size()>0){
			user=result.get(0);
		}
		
		return user;
	}

	@Override
	public List<Usuario> findAll(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		UsuarioCriteria userCriteria=new UsuarioCriteria();
		userCriteria.createCriteria().andIUsuarioEstadoEqualTo(Constante.ESTADO_ACTIVO);
		
		List<Usuario> usuarios=usuarioDAO.selectByExample(userCriteria);
		List<UsuarioRol> roles=null;
		
		if(usuarios!=null && usuarios.size()>0){
			for (Usuario user : usuarios) {
				roles=rolService.getRolesByIdUsuario(user.getiUsuarioId());
				user.setRoles(roles);
			}
		}
		
		return usuarios;
	}
	
	@Override
	public List<Test> findAllProyectos(Test test) throws Exception {
		// TODO Auto-generated method stub
		
		test.setParam1("Desarrollo y Automatización de Política de Precios");
		test.setParam2("Mejorar las ventas de la empresa");
		test.setParam3("Estratégico");
		test.setParam4("Toda la Empresa");
		test.setParam5("Planeamiento");
		test.setParam6("01/01/2012");
		test.setParam7("31/08/2012");
		test.setParam8("Indicador De proyecto1");
		test.setParam9("Alto");
		test.setParam10("Pillaca Meneses Willian");
		test.setParam11("Pariona Ramirez Karen");
		test.setParam12("15000 soles");
		
		
		List<Test> list = new ArrayList<Test>();
		list.add(test);
		
		
		return list;
	}
	
	@Override
	public List<Test> findAllObjetivos(Test test) throws Exception {
		// TODO Auto-generated method stub
		List<Test> t = new ArrayList<Test>();
		
		
		test.setParam1("Disminuir costos de la empresa");
		test.setParam2("Estrategico");
		test.setParam3("Toda la empresa");		
		List<Test> list = new ArrayList<Test>();
		list.add(test);
		
		
		return list;
	}
	
	@Override
	public List<Test> findAllIndicadores(Test test) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		test.setParam1("Market Share PPEE");
		test.setParam2("Estrategico");
		test.setParam3("Toda la empresa");		
		test.setParam4("me");
		test.setParam5("%");
		test.setParam6("20");		
		test.setParam7("100");
		test.setParam8("0.5");
		
		List<Test> list = new ArrayList<Test>();
		list.add(test);
		
		
		return list;
	}

	@Override
	@Transactional(propagation =Propagation.REQUIRES_NEW,readOnly = false,rollbackFor = Exception.class)
	public Usuario save(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;
		String password="";
		Integer idusuario=usuario.getiUsuarioId();
		boolean validaUserDuplicate=true;
		Usuario userInicial=null;
		if(idusuario!=null){
			userInicial=this.findUsuarioByPk(idusuario);
			if(userInicial.getvUsuarioUsername().equalsIgnoreCase(usuario.getvUsuarioUsername())){
				validaUserDuplicate=false;
			}
		}
		
		if(validaUserDuplicate){
			if(this.findUsuarioByUserName(usuario.getvUsuarioUsername())!=null){
				throw new GenericExcepcion("Ya existe un usuario con el nombre <b>"+usuario.getvUsuarioUsername()+"</b>.");
			}
		}
		
		if(usuario.getiUsuarioId()==null){
//			password=Util.generateAleatorioAlphaNumeric(8);
//			AeSimpleMD5  aeSimpleMD5 = new AeSimpleMD5();
//			String passwordMD5=aeSimpleMD5.getMD5Spring(password);
			String passwordMD5= "e10adc3949ba59abbe56e057f20f883e";
			usuario.setvUsuarioPassword(passwordMD5);
			usuario.setiUsuarioEstado(Constante.ESTADO_ACTIVO);
			usuarioDAO.insertSelective(usuario);
			create=true;
		}else{
			usuarioDAO.updateByPrimaryKeySelective(usuario);
		}
		Usuario usu = new Usuario();
		usu = ultimoUsuarioRegistrado(usuario.getvUsuarioUsername());
		System.out.println("dianita->>>"+usu.getiUsuarioId());
		if(usuario.getRoles()!=null){			
			UsuarioRolCriteria urc = new UsuarioRolCriteria();
			System.out.println("willian->>>"+usu.getiUsuarioId());
			urc.createCriteria().andIUsuarioxrolUsuarioIdEqualTo(usu.getiUsuarioId());
			usuarioRolDAO.deleteByExample(urc);			
			for (UsuarioRol usuarioRol : usuario.getRoles()) {
				usuarioRol.setiUsuarioxrolUsuarioId(usu.getiUsuarioId());
				usuarioRolDAO.insertSelective(usuarioRol);
			}
		}
		if(create){
			String[] emails=new String[1];
			emails[0]=usuario.getvUsuarioEmail();
			System.out.println("correo->>>"+emails[0]);
			//emailService.enviarCorreo(emails, "Usuario Creado", "Usuario : "+usuario.getvUsuarioUsername()+"<br />"+"Clave : "+password);
		}
		System.out.println("nuevo usuario->>>"+usuario.getiUsuarioId());
		return usuario;
	}

	@Override
	public Usuario deleteByPk(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disabledUser(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findUsuarioByPk(Integer idUsuario) throws Exception {
		// TODO Auto-generated method stub
		return usuarioDAO.selectByPrimaryKey(idUsuario);
	}

	@Override
	public Usuario updateByPk(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		usuarioDAO.updateByPrimaryKeySelective(usuario);
		usuario=this.findUsuarioByPk(usuario.getiUsuarioId());
		return usuario;
	}

	@Override
	public void cambiarClave(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		if(usuario.getiUsuarioId()==null){throw new GenericExcepcion("El usuario no existe.");}
		String passwordActual=usuario.getPasswordActual();
		String newPassword=usuario.getvUsuarioPassword();
		String modeChangePassword=usuario.getModeChangePassword();
		usuario=this.findUsuarioByPk(usuario.getiUsuarioId());
		if(usuario==null){throw new GenericExcepcion("El usuario no existe.");}
		AeSimpleMD5  aeSimpleMD5 = new AeSimpleMD5();
		
		String passwordMD5Actual="";
		if(passwordActual!=null){
			passwordMD5Actual=aeSimpleMD5.getMD5Spring(passwordActual);
		}
		
		if (modeChangePassword.equals(
				Constante.MODE_CHANGE_PASS_PERFIL)) {
			if (!passwordMD5Actual.equals(usuario.getvUsuarioPassword())) {
				throw new GenericExcepcion("La contrase&ntilde;a actual del usuario no es correcta.");
			}
		}
		
		String newPasswordMD5=aeSimpleMD5.getMD5Spring(newPassword);
		
		Usuario usuarioUpdate=new Usuario();
		usuarioUpdate.setiUsuarioId(usuario.getiUsuarioId());
		usuarioUpdate.setvUsuarioPassword(newPasswordMD5);
		
		usuarioDAO.updateByPrimaryKeySelective(usuarioUpdate);
		
		if(usuario.getModeChangePassword().equals(
				Constante.MODE_CHANGE_PASS_PERFIL)){
			String[] emails=new String[1];
			emails[0]=usuario.getvUsuarioEmail();
			emailService.enviarCorreo(emails, "Clave Actualizada", "Usuario : "+usuario.getvUsuarioUsername()+"<br />"+"Clave : "+newPassword);
		}
		
	}

	@Override
	public void cambiarEstadoUsuario(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		this.updateByPk(usuario);
	}

}
