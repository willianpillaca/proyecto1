package pe.gob.ep.ginnet.controller.seguridad;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pe.gob.ep.ginnet.email.service.EmailService;
import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.radamanthys.bean.Persona;
import pe.gob.ep.ginnet.radamanthyz.service.RadamanthyzService;
import pe.gob.ep.ginnet.seguridad.bean.Opcion;
import pe.gob.ep.ginnet.seguridad.bean.Rol;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;
import pe.gob.ep.ginnet.seguridad.service.OpcionService;
import pe.gob.ep.ginnet.seguridad.service.RolService;
import pe.gob.ep.ginnet.seguridad.service.SeguridadService;
import pe.gob.ep.ginnet.seguridad.service.UsuarioService;
import pe.gob.ep.ginnet.util.Util;


@Controller
public class SeguridadController {
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
	private OpcionService opcionService;
	
	@RequestMapping(value = "login.app")
	public ModelAndView login() throws Exception {
		System.out.println("pagina de inicio->>>");
		ModelAndView modelAndView = new ModelAndView("main/login");	
		return modelAndView;
	}
	
	@RequestMapping(value = "inicio.app")
	public ModelAndView inicio() throws Exception {		
		ModelAndView modelAndView = new ModelAndView("main/login");	
		return modelAndView;
	}
	
	@RequestMapping(value = "logout.app")
	public ModelAndView logout(HttpSession sesion) throws Exception {
		
		sesion.removeAttribute("usuario");
		sesion.invalidate();
		ModelAndView modelAndView = new ModelAndView("main/login");
		
		return modelAndView;
	}
	
	
	@RequestMapping(value = "pagarvisa.app")
	public ModelAndView pagarvisa(HttpSession sesion,HttpServletRequest request) throws Exception {
		System.out.println("willian pillaca meneses->>>");
		String fw="main/index";
		
		String nombre = request.getParameter("nombre");
		System.out.println("nombre->>>"+nombre);
		String sessionToken = Util.getGUID();
		String merchantid = "507138702";
		Double amount = Double.parseDouble("125");
		//String sessionKey = create_token(amount,"dev",merchantid,"AKIAJW2DLUZOAVCI2GIQ","fAMZnyWPkGvoSZ8VmRqnYAlyQjsqENjE8eMw7OIW",Util.create_token(amount, des, merchantId, accessKey, secretKey, uuid));
		fw="main/inicio";					
		
		ModelAndView modelAndView = new ModelAndView(fw);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "main.app")
	public ModelAndView home(HttpSession sesion,HttpServletRequest request) throws Exception {
		System.out.println("willian pillaca meneses->>>");
		Usuario usuario = (Usuario) sesion.getAttribute("usuario");
		int idRol = usuario.getIdRolSelectedLogin().intValue(); 
		String fw="";
		if(idRol ==3){
			fw="main/index";
		}
		if(idRol ==2 ){
			fw="main/index2";
		}
		if(idRol ==1 ){
			fw="main/index2";
		}
		
		if(usuario==null){
			fw="main/inicio";			
		}else{
			usuario.setStrMenu(seguridadService.obtenerOpcionesPorRol(usuario.getIdRolSelectedLogin()));
			usuario.setRolName(rolService.findByPk(usuario.getIdRolSelectedLogin()).getvRolNombre());
			sesion.setAttribute("usuario", usuario);
			request.getRequestURI();			
			String path=request.getRealPath("librerias/components");			
			File components=new File(path);
			String scripts=Util.listFilesForFolder(components);
			sesion.setAttribute("scriptsComponents", scripts);
		 }
		
		ModelAndView modelAndView = new ModelAndView(fw);
		
		return modelAndView;
	}	
	
	@RequestMapping(value = "obtenerrolesbyusername.app")
	public @ResponseBody Map<String, ? extends Object> obtenerRolesByUsername(String username) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", seguridadService.findRolesByUserName(username));
		}catch(GenericExcepcion ge){
			data.put("data", null);
			log.debug(ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "findallrol.app")
	public @ResponseBody Map<String, ? extends Object> findAllRol(Rol rol) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", rolService.findAll(rol));
		}catch(GenericExcepcion ge){
			data.put("data", null);
			log.debug(ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "saverol.app")
	public @ResponseBody Map<String, ? extends Object> saveRol(Rol rol) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String mode="registr&oacute;";
			if(rol.getiRolId()!=null){
				mode="actualiz&oacute;";
			}
			data.put("data", rolService.save(rol));
			data.put("success", Boolean.TRUE);
			data.put("message", "El rol se "+mode+" de forma satisfactoria.");
		}catch(GenericExcepcion ge){
			data.put("data", null);
			data.put("success", Boolean.FALSE);
			data.put("message", ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado");
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "deleterol.app")
	public @ResponseBody Map<String, ? extends Object> deleteRol(Integer idRol) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			rolService.deleteByPk(idRol);
			data.put("success", Boolean.TRUE);
			data.put("message", "El rol se elimin&oacute; de forma satisfactoria.");
		}catch(GenericExcepcion ge){
			data.put("success", Boolean.FALSE);
			log.debug(ge.getMessage());
			data.put("message", ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado");
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "findallopciones.app")
	public @ResponseBody Map<String, ? extends Object> findAllOpciones(Opcion opcion) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", opcionService.findAll(opcion));
		}catch(GenericExcepcion ge){
			data.put("data", new ArrayList<Opcion>());
			log.debug(ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", new ArrayList<Opcion>());
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "saveopcion.app")
	public @ResponseBody Map<String, ? extends Object> saveOpcion(Opcion opcion) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String mode="registr&oacute;";
			if(opcion.getiOpcionId()!=null){
				mode="actualiz&oacute;";
			}
			data.put("data", opcionService.save(opcion));
			data.put("success", Boolean.TRUE);
			data.put("message", "La opcion se "+mode+" de forma satisfactoria.");
		}catch(GenericExcepcion ge){
			data.put("data", null);
			data.put("success", Boolean.FALSE);
			data.put("message", ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado");
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "deleteopcion.app")
	public @ResponseBody Map<String, ? extends Object> deleteOpcion(Integer idOpcion) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			opcionService.deleteByPk(idOpcion);
			data.put("success", Boolean.TRUE);
			data.put("message", "La opcion se elimin&oacute; de forma satisfactoria.");
		}catch(GenericExcepcion ge){
			data.put("success", Boolean.FALSE);
			log.debug(ge.getMessage());
			data.put("message", ge.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			data.put("success", Boolean.FALSE);
			data.put("message", "Error inesperado");
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "testemail.app")
	public @ResponseBody Map<String, ? extends Object> testEmail() throws Exception {
		log.debug("testemail()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			String[] cc = new String[2];
			cc[0] = "willian1802@gmail.com";
			cc[1] = "wjpm@hotmail.com";
			emailService.enviarCorreo(cc, "Asunto Prueba", "Mensaje de Prueba de Willian Pillaca");
			data.put("data", true);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return data;
	}	
	
	@RequestMapping(value = "rolopciontree.app")
	public void testTreeMenu(HttpServletResponse response,HttpSession sesion,Integer idRol) throws Exception {
		Usuario usuario=(Usuario)sesion.getAttribute("usuario");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		if(usuario!=null){
			if (idRol == null) {
				out.write("[]");
			} else {
				out.write(seguridadService.obtenerTreeOpcionesPorRol(idRol));
			}
			
		}else{
			out.write("[]");
		}
	}
	
	@RequestMapping(value = "insertopcionxrol.app")
	public @ResponseBody Map<String, ? extends Object> insertOpcionPorRol(Rol rol) throws Exception {
		log.debug("insertOpcionPorRol()");
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			data.put("data", seguridadService.insertOpcionPorRol(rol));
			data.put("message", "Registro Satisfactorio.");
			data.put("success", Boolean.TRUE);
		}catch(GenericExcepcion e){
			data.put("data", null);
			data.put("message", e.getMessage());
			data.put("success", Boolean.FALSE);
		}catch (Exception e) {
			// TODO: handle exception
			data.put("data", null);
			data.put("message", "Error Inesperado");
			data.put("success", Boolean.FALSE);
			e.printStackTrace();
		}
		return data;
	}
	
	
		
}
