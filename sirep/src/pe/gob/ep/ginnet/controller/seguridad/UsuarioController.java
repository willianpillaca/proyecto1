package pe.gob.ep.ginnet.controller.seguridad;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;









import com.google.gson.Gson;

import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogo;
import pe.gob.ep.ginnet.email.service.EmailService;
import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCurso;
import pe.gob.ep.ginnet.radamanthys.bean.Curso;
import pe.gob.ep.ginnet.radamanthys.bean.Docente;
import pe.gob.ep.ginnet.radamanthys.bean.Examen;
import pe.gob.ep.ginnet.radamanthys.bean.Persona;
import pe.gob.ep.ginnet.radamanthys.bean.Pregunta;
import pe.gob.ep.ginnet.radamanthys.bean.Profesor;
import pe.gob.ep.ginnet.radamanthys.bean.Respuesta;
import pe.gob.ep.ginnet.radamanthys.bean.Tema;
import pe.gob.ep.ginnet.radamanthyz.service.RadamanthyzService;
import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.ruedanegocio.service.ProyectoService;
import pe.gob.ep.ginnet.seguridad.bean.Test;
import pe.gob.ep.ginnet.seguridad.bean.UserSecurity;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;
import pe.gob.ep.ginnet.seguridad.service.RolService;
import pe.gob.ep.ginnet.seguridad.service.SeguridadService;
import pe.gob.ep.ginnet.seguridad.service.UsuarioService;
import pe.gob.ep.ginnet.seguridad.service.UsuarioServiceImpl;
import pe.gob.ep.ginnet.util.Constante;
import pe.gob.ep.ginnet.util.Util;


@Controller
public class UsuarioController {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private SeguridadService seguridadService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private RolService rolService;
	
	@Autowired
	private ProyectoService proyectoService;	
	
	@Autowired
	private RadamanthyzService radamanthyzService;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping(value = "findallusuarios.app")
	public @ResponseBody Map<String, ? extends Object> findAllUsuarios(Usuario usuario) throws Exception {
		log.debug("findAllUsuarios()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{			
			data.put("data", usuarioService.findAll(usuario));			
			
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Usuario>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "findallproyectos.app")
	public @ResponseBody Map<String, ? extends Object> findAllProyectos(Proyecto proyecto) throws Exception {
		log.debug("findAllProyecto->>>>>");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", proyectoService.findAll(proyecto));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Proyecto>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	//controller para adjuntar archivos
	
	
	
	
	/**esto se tiene que eliminar**/
	@RequestMapping(value = "findallobjetivos.app")
	public @ResponseBody Map<String, ? extends Object> findAllObjetivos(Test test) throws Exception {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		try{
			data.put("data", usuarioService.findAllObjetivos(test));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Usuario>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	/**esto se tiene que eliminar**/
	@RequestMapping(value = "findallindicadores.app")
	public @ResponseBody Map<String, ? extends Object> findAllIndicador(Test test) throws Exception {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		try{
			data.put("data", usuarioService.findAllIndicadores(test));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Usuario>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	
	@RequestMapping(value = "findusuariobypk.app")
	public @ResponseBody Map<String, ? extends Object> findUsuarioByPk(Integer iUsuarioId) throws Exception {
		log.debug("findAllUsuarios()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", usuarioService.findUsuarioByPk(iUsuarioId));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Usuario>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "saveusuario.app")
	public @ResponseBody Map<String, ? extends Object> saveUsuario(Usuario usuario) throws Exception {
		log.debug("saveUsuario()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(usuario.getiUsuarioId()!=null){
				type="actualizado";
			}
			data.put("usuario", usuarioService.save(usuario));
			data.put("message", "El usuario <b>"+usuario.getvUsuarioUsername()+"</b> ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("usuario", new Usuario());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("usuario", new Usuario());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	//guardar persona
	
		@RequestMapping(value = "crearnuevousuario.app")
		public void nuevoRegistro(HttpServletRequest req, HttpServletResponse resp, String apaterno,
				String amaterno, String nombre, String login, String clave, String email, int tipo ) throws Exception {
			log.debug("savePersona->>>>()");
			Usuario usu = new Usuario();
			List<UsuarioRol> usuRol = new ArrayList<UsuarioRol>();
			
 			usu.setvUsuarioApPaterno(apaterno);
			usu.setvUsuarioApMaterno(amaterno);
			usu.setvUsuarioNombres(nombre);
			usu.setvUsuarioEmail(email);
			usu.setvUsuarioPassword(clave);
			usu.setvUsuarioUsername(login);
			usu.setIdRolSelectedLogin(3);
			usu.setiUsuarioSexo(1);
			usu.setcUsuarioCodCargo("1");
			usu.setRoles(null);
			usuarioService.save(usu);
			
//			Persona persona = new Persona();
//			persona.setAmaterno(amaterno);
//			persona.setApaterno(apaterno);
//			persona.setClave(clave);
//			persona.setCorreo(email);
//			persona.setLogin(login);
//			persona.setNombres(nombre);
//			persona.setTipo(tipo);
//			radamanthyzService.savePersona(persona); 
			
			
		}
	
	
	/**guardar proyecto**/
	@RequestMapping(value = "saveproyecto.app")
	public @ResponseBody Map<String, ? extends Object> saveProyecto(Proyecto proyecto) throws Exception {
		log.debug("saveProyecto()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(proyecto.getIdProyecto()!=null){
				type="actualizado";
			}
			data.put("usuario", proyectoService.save(proyecto));
			data.put("message", "El proyecto <b>"+proyecto.getNombreProyecto()+"</b> ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("proyecto", new Proyecto());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("proyecto", new Usuario());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "cambiarclaveuser.app")
	public @ResponseBody Map<String, ? extends Object> cambiarClaveUser(Usuario usuario) throws Exception {
		log.debug("cambiarClave()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			usuarioService.cambiarClave(usuario);
			data.put("success", Boolean.TRUE);
			data.put("message", "La contrase&ntilde;a se actualizo satisfactoriamente.");
			
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado.");
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "cambiarestadouser.app")
	public @ResponseBody Map<String, ? extends Object> cambiarEstadoUser(Usuario usuario) throws Exception {
		log.debug("cambiarEstadoUser()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			usuarioService.cambiarEstadoUsuario(usuario);
			data.put("success", Boolean.TRUE);
			if(Util.equiv(usuario.getiUsuarioIndhabilitado(), Constante.ESTADO_ACTIVO)){
				data.put("message", "El usuario habilitado de forma satisfactoria.");
			}else{
				data.put("message", "El usuario fue deshabilitado de forma satisfactoria.");
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado.");
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "personalizartema.app")
	public @ResponseBody Map<String, ? extends Object> personalizarTema(HttpSession sesion,String bgApp) throws Exception {
		log.debug("cambiarEstadoUser()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			Usuario usuarioSesion=(Usuario)sesion.getAttribute("usuario");
			if(usuarioSesion!=null){
				Usuario u=new Usuario();
				u.setiUsuarioId(usuarioSesion.getiUsuarioId());
				u.setvUsuarioBgApplication(bgApp);
				usuarioService.updateByPk(u);
				data.put("success", Boolean.TRUE);
				data.put("message", "Se cambio el tema de forma satisfactoria.");
			}else{
				data.put("message", "La sesion de usuario ha expirado.");
				data.put("success", Boolean.FALSE);
			}
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "No se pudo personalizar el tema.");
			e.printStackTrace();
		}
		return data;
	}
	
	
	/**metodos propios del sistema de Administacion de Cursos***/
	
	/** @Autor: Willian Pillaca Meneses **/
	
	/**CURSOS**/
	
	@RequestMapping(value = "findallcursos.app")
	public @ResponseBody Map<String, ? extends Object> findAllCursos(Curso curso) throws Exception {
		log.debug("muestro loa cursos->>>()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllCursos(curso));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Curso>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "findallcursosbyiddocente.app")
	public @ResponseBody Map<String, ? extends Object> findAllCursosByIdDocente(int idUsuario) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllCursosByIdDocente(idUsuario));
			data.put("total", 10);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Curso>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "savecurso.app")
	public @ResponseBody Map<String, ? extends Object> saveCurso(Curso curso) throws Exception {
		log.debug("saveCurso()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(curso.getId() !=null){
				type="actualizado";
			}
			data.put("curso", radamanthyzService.saveCurso(curso));
			data.put("message", "El curso ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("curso", new Pregunta());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("curso", new Pregunta());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	/**listar los cursos en un combo**/
	@RequestMapping(value = "listacursos.app")
	public @ResponseBody Map<String, ? extends Object> listcursos(Integer estado) throws Exception {
		System.out.println("idGrupo->>>"+estado);
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data",radamanthyzService.listaCursos(estado));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<ElementoCatalogo>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	
	/**PROFESORES**/
	
	@RequestMapping(value = "findallprofesores.app")
	public @ResponseBody Map<String, ? extends Object> findAllProfesores(Profesor profesor) throws Exception {
		log.debug("findAllProfesores()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllProfesores(profesor));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Profesor>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	/**DOCENTES**/
	
	@RequestMapping(value = "findalldocentes.app")
	public @ResponseBody Map<String, ? extends Object> findAllDocentes(Docente docente) throws Exception {
		log.debug("findAllProfesores()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllDocentes(docente));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Docente>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "listardocentes.app")
	public @ResponseBody Map<String, ? extends Object> listarDocentes() throws Exception {
		log.debug("findAllProfesores()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.listarDocentes());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Docente>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	
	
	/**PREGUNTAS**/
	
	@RequestMapping(value = "findallpreguntas.app")
	public @ResponseBody Map<String, ? extends Object> findAllPreguntas(Pregunta pregunta) throws Exception {
		log.debug("findAllProfesores()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllPregunta(pregunta));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Pregunta>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "listarpreguntas.app")
	public @ResponseBody Map<String, ? extends Object> getAllPreguntas(int ideTema) throws Exception {
		log.debug("ideTema->>>"+ideTema);
		
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.getAllPreguntasXTema(ideTema));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Pregunta>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "obtenerpreguntas.app")
	public @ResponseBody Map<String, ? extends Object> getPreguntasByCodigoCurso(Integer cantidad, String codCurso) throws Exception {
		log.debug("traendo cursos->>");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.getPreguntasByCodigoCurso(cantidad, codCurso));
			data.put("success", Boolean.TRUE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Map<String, Object>>());			
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "obtenerpreguntasabiertas.app")
	public @ResponseBody Map<String, ? extends Object> getPreguntasAbiertasByCodigoCurso(Integer cantidad, String codCurso) throws Exception {
		log.debug("traendo cursos->>");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.getPreguntaAbiertaByCodigoCurso(cantidad, codCurso));
			data.put("success", Boolean.TRUE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Map<String, Object>>());			
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "listarmiscursos.app")
	public @ResponseBody Map<String, ? extends Object> listarmiscursos(String codCurso) throws Exception {
		log.debug("traendo cursos->>");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.listarmiscursos(codCurso));			
			data.put("success", Boolean.TRUE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Map<String, Object>>());			
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	
	
	//ingresar persona logeada
	
	
		@RequestMapping(value = "ingresarusuario.app")
		  public @ResponseBody ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, String usu, String pass) throws Exception{
		    ModelAndView mav = null;		    
		    Persona persona = radamanthyzService.validateUser(usu, pass);
		    if (null != persona) {
//		    	HttpSession sesion = request.getSession();		    	
		    	String nombreCompelto = persona.getNombres()+" "+persona.getApaterno()+" "+persona.getAmaterno();
		    	mav = new ModelAndView("main/bienvenida");
//		    	sesion.setAttribute("usuarioLogin", nombreCompelto);		    	
		    	mav.addObject("usuario", nombreCompelto);
		    } 
		    else 
		    {		    	
			    mav = new ModelAndView("main/inicio");
			    mav.addObject("message", "Username or Password is wrong!!");
		    }
		    System.out.println("direccionando->>>");
		    return mav;
		  }
		
//	cursos por alumno		
		@RequestMapping(value = "cursosxalumno.app")
		public @ResponseBody ModelAndView cursosPorAlumno(HttpServletRequest request, HttpServletResponse response, String cod) throws Exception{
		    ModelAndView mav = null;
		    System.out.println("codigo->>>"+cod);
		    mav = new ModelAndView("main/miscursos");
//		    Persona persona = radamanthyzService.validateUser(cod);	    
		    
		    System.out.println("direccionando->>>");
		    return mav;
		}	
	
//	Guardar pregunta x tema
	
	@RequestMapping(value = "savepreguntaxtema.app")
	public @ResponseBody Map<String, ? extends Object> savePreguntaXTema(Pregunta pregunta) throws Exception {
			log.debug("savePregunta()");
			Map<String, Object> data = new HashMap<String, Object>();
			try{
				String type="registrado";
				if(pregunta.getId() !=null){
					type="actualizado";
				}
				data.put("pregunta", radamanthyzService.savePreguntaXTema(pregunta));
				data.put("message", "La pregunta ha sido "+type+" de forma satisfactoria");
				data.put("success", Boolean.TRUE);
			}catch (GenericExcepcion e) {
				// TODO: handle exception
				data.put("pregunta", new Pregunta());
				data.put("message", e.getMessage());
				data.put("success", Boolean.FALSE);
			}catch (Exception e) {
				// TODO: handle exception
				data.put("pregunta", new Pregunta());
				data.put("success", "Error inesperado");
				data.put("success", Boolean.FALSE);
				e.printStackTrace();
			}
			return data;
	}
		
		
	@RequestMapping(value = "savepregunta.app")
	public @ResponseBody Map<String, ? extends Object> savePregunta(Pregunta pregunta) throws Exception {
		log.debug("savePregunta()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(pregunta.getId() !=null){
				type="actualizado";
			}
			data.put("pregunta", radamanthyzService.savePregunta(pregunta));
			data.put("message", "La pregunta ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("pregunta", new Pregunta());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("pregunta", new Pregunta());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	/**ALUMNO CURSO**/	
	
	@RequestMapping(value = "findallcursosalumno.app")
	public @ResponseBody Map<String, ? extends Object> findAllCursosAlumno(AlumnoCurso alumnoCurso) throws Exception {
		log.debug("findAllCursosAlumno()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.findAllCursosAlumno(alumnoCurso));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Curso>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "savealumnocurso.app")
	public @ResponseBody Map<String, ? extends Object> saveAlumnoCurso(String nombreCurso, AlumnoCurso alumnoCurso) throws Exception {
		log.debug("saveAlumnoCurso->>");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(alumnoCurso.getId() !=null){
				type="actualizado";
			}
			data.put("alumnoCurso", radamanthyzService.saveAlumnoCurso(alumnoCurso));
			data.put("message", "Se ha sido "+type+" de forma satisfactoria en el curso"+alumnoCurso.getNombreCurso());
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("alumnoCurso", new AlumnoCurso());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("alumnoCurso", new AlumnoCurso());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	
	/**Listar Preguntas**/
	@RequestMapping(value = "listarpreguntasexamen.app")
	public @ResponseBody Map<String, ? extends Object> listarPreguntasExamen(Integer idSistema) throws Exception {
		log.debug("findPreguntasExamen()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.listarPreguntasExamen(idSistema));
			data.put("total", radamanthyzService.listarPreguntasExamen(idSistema).size());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Pregunta>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
//	listar preguntas old 
	
//	@RequestMapping(value = "listarpreguntasexamen.app")
//	public @ResponseBody Map<String, ? extends Object> listarPreguntasExamen(Integer idSistema) throws Exception {
//		log.debug("findPreguntasExamen()");
//		Map<String, Object> data = new HashMap<String, Object>();
//		try{
//			data.put("data", radamanthyzService.listarPreguntasExamen(idSistema));
//			data.put("total", radamanthyzService.listarPreguntasExamen(idSistema).size());
//		}catch (Exception e) {
//			// TODO: handle exception
//			data.put("data", new ArrayList<Pregunta>());
//			log.debug(e.getMessage());
//			e.printStackTrace();
//		}
//		return data;
//	}
	
	
	
	
	/**redireccionar a pagina de examen 
	 * @throws Exception **/
	@RequestMapping(value = "rendirexamen.app")
	public ModelAndView rendirExamen(HttpSession sesion,HttpServletRequest request, String codCurso, String nombreCurso, Integer idCurso) throws Exception{	
		log.debug("codCurso()->>>"+codCurso);
		log.debug("nombreCurso()->>>"+nombreCurso);
		Map<String, Object> map = new HashMap<String, Object>();		
		ModelAndView model = new ModelAndView("main/examen");
		Usuario usuarioSesion=(Usuario)sesion.getAttribute("usuario");
		
		model.addObject("codigoCurso", codCurso);
		model.addObject("nombreCurso", nombreCurso);
		model.addObject("idCurso", idCurso);
		model.addObject("idUsuario", usuarioSesion.getiUsuarioId());
		return model;
	}
	
	
	/**Listar Examenes**/
	@RequestMapping(value = "testexamen.app")
	public @ResponseBody Map<String, ? extends Object> home(HttpSession sesion,HttpServletRequest request, Integer idSistema){	
		log.debug("findPreguntasExamen()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.listarPreguntasExamen(idSistema).toArray());
			data.put("total", radamanthyzService.listarPreguntasExamen(idSistema).size());
			data.put("success", true);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Pregunta>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	
	
		
	
	/**Pregunta cerrada (con alternativas)**/
	@RequestMapping(value = "saveexamen.app")
	public @ResponseBody Map<String, ? extends Object> savePreguntaCerrada(Examen examen, String alt1, String alt2, String alt3, String alt4, String alt5, Integer rpta) throws Exception {
		log.debug("saveExamen()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(examen.getId() !=null){
				type="actualizado";
			}
			data.put("examen", radamanthyzService.saveExamen(examen, alt1, alt2, alt3, alt4 ,alt5, rpta));
			data.put("message", "La pregunta ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("examen", new Examen());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("examen", new Examen());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}	
	
	/**Pregunta abierta (sin alternativas)**/
	
	@RequestMapping(value = "saveexamenpreguntaabierta.app")
	public @ResponseBody Map<String, ? extends Object> savePreguntaAbierta(Examen examen) throws Exception {
		log.debug("saveExamen()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(examen.getId() !=null){
				type="actualizado";
			}
			data.put("examen", radamanthyzService.savePreguntaAbierta(examen));
			data.put("message", "La pregunta ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("examen", new Examen());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("examen", new Examen());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	
	//listar los cursos
	/**Listar Examenes**/
	@RequestMapping(value = "listadocursos.app")
	public ModelAndView listadocursos(HttpSession sesion,HttpServletRequest request){	
		System.out.println("listando cursos->>>");
		Map<String, Object> data = new HashMap<String, Object>();
		
		Gson gson = new Gson();
		String json = gson.toJson(data);
		//return data;
		ModelAndView modelAndView = new ModelAndView("main/cursos");
		return modelAndView;
	}
	
	//listar los cursos
	/**Listar Examenes**/
	@RequestMapping(value = "listadopreguntas.app")
	public ModelAndView listadopreguntas(HttpSession sesion,HttpServletRequest request){	
		System.out.println("listando cursos->>>");
		Map<String, Object> data = new HashMap<String, Object>();
		
		Gson gson = new Gson();
		String json = gson.toJson(data);
		//return data;
		ModelAndView modelAndView = new ModelAndView("main/preguntas");
		return modelAndView;
	}
	
	@PostMapping("fileupload.app")
	public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file, @RequestParam("idCurso") Integer idCurso, @RequestParam("idUsuario") Integer idUsuario)
	         throws Exception {			
	      // Save file on system
		System.out.println("idCurso->>>"+idCurso);
		System.out.println("idUsuario->>>"+idUsuario);
		
	    if (!file.getOriginalFilename().isEmpty()) {
	    	System.out.println("nombrewww->>"+file.getOriginalFilename());
	    	String nombreArchivo = file.getOriginalFilename();
	    	  //aqui se tiene q insertar el metodo para insertar en la BD
	    	
	    	radamanthyzService.insertResultadoPrevio(idUsuario, idCurso, nombreArchivo);
//	    	String root = getServletContext().getRealPath("/");
	    	String uploadPath = context.getRealPath("") + File.separator + "files";
	    	System.out.println("uploadPath->>>"+uploadPath);
	        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(uploadPath, file.getOriginalFilename())));
	         outputStream.write(file.getBytes());
	         outputStream.flush();
	         outputStream.close();
	      }else{
	         return new ResponseEntity<Object>("Archivo Incorrecto.",HttpStatus.BAD_REQUEST);
	      }
	      
	      return new ResponseEntity<Object>("El archivo ah sido enviado correctamente.",HttpStatus.OK);
	}
	
	/**Guardar Examen**/
	
	@RequestMapping(value = "procesarexamen.app")
	public @ResponseBody Map<String, ? extends Object> procesarExamen(String rpta) throws Exception {
		log.debug("findAllCursosAlumno()");
		System.out.println("procesando examen...");
		System.out.println(rpta);
		
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.procesarPreguntas(rpta));	
			
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Pregunta>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;		
	}
	
	@RequestMapping(value = "mostrarresultadoexamen.app")
	public @ResponseBody Map<String, ? extends Object> mostrarResultadoExamen(int idUsuario) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", radamanthyzService.mostrarResultadoExamen(idUsuario));
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Curso>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "actualizarnotaexamen.app")
	public @ResponseBody Map<String, ? extends Object> actualizarNotaExamen(Integer idResultado, Integer nota) throws Exception {
		log.debug("actu8alziar notasssss");
		System.out.println("idResultado->>>"+idResultado);
		System.out.println("nota->>>"+nota);
		Map<String, Object> data = new HashMap<String, Object>();
		
		try{
			radamanthyzService.actualizarNotaExamen(idResultado, nota);
			data.put("success", Boolean.TRUE);
			data.put("message", "Se actualizo correctamente la nota.");
			
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado.");
			e.printStackTrace();
		}
		return data;
	}
	
	/**guardar tema**/
	@RequestMapping(value = "savetemacurso.app")
	public @ResponseBody Map<String, ? extends Object> saveTemaCurso(Tema tema) throws Exception {
		log.debug("saveTema()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String type="registrado";
			if(tema.getIdTema()!=null){
				type="actualizado";
			}
			data.put("tema", radamanthyzService.saveTemaCurso(tema));
			data.put("message", "El proyecto <b>"+tema.getTema()+"</b> ha sido "+type+" de forma satisfactoria");
			data.put("success", Boolean.TRUE);
		}catch (GenericExcepcion e) {
			// TODO: handle exception
			data.put("tema", new Tema());
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("tema", new Tema());
			data.put("success", "Error inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "listartemasxcurso.app")
	public @ResponseBody Map<String, ? extends Object> findAllTemasXCurso(HttpServletRequest req) throws Exception {
		log.debug("findAllTemas()");
		int idCurso =0;
		String cadena = req.getParameter("idCurso");		
		if(cadena==null){
			idCurso = 0;
		}else{
			idCurso = Integer.parseInt(cadena); 
		}		
		Map<String, Object> data = new HashMap<String, Object>();
		try{			
			data.put("data", radamanthyzService.findAllTemasXCurso(idCurso));			
			
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Tema>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
}
