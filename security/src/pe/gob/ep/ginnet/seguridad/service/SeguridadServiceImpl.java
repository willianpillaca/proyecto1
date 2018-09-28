package pe.gob.ep.ginnet.seguridad.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.seguridad.bean.Opcion;
import pe.gob.ep.ginnet.seguridad.bean.Rol;
import pe.gob.ep.ginnet.seguridad.bean.RolOpcion;
import pe.gob.ep.ginnet.seguridad.bean.RolOpcionCriteria;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRolCriteria;
import pe.gob.ep.ginnet.seguridad.dao.RolOpcionDAO;
import pe.gob.ep.ginnet.seguridad.dao.UsuarioRolDAO;
import pe.gob.ep.ginnet.util.Constante;
import pe.gob.ep.ginnet.util.Util;

@Service
public class SeguridadServiceImpl implements SeguridadService {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private RolService rolService;
	@Autowired
	private OpcionService opcionService;
	@Autowired
	private UsuarioRolDAO usuarioRolDAO;
	@Autowired
	private RolOpcionDAO rolOpcionDAO;
	
	@Override
	public List<UsuarioRol> findRolesByUserName(String username)
			throws Exception {
		// TODO Auto-generated method stub
		
		Usuario usuario=usuarioService.findUsuarioByUserName(username);
		
		List<UsuarioRol> rolesPorUsuario=null;
		
		if(usuario==null){
			throw new GenericExcepcion("El usuario ingresado no existe.");
		}
		
		UsuarioRolCriteria usuarioRolCriteria=new UsuarioRolCriteria();
		usuarioRolCriteria.createCriteria().andIUsuarioxrolUsuarioIdEqualTo(usuario.getiUsuarioId());
		
		rolesPorUsuario=usuarioRolDAO.selectByExample(usuarioRolCriteria);
		
		if(rolesPorUsuario==null){
				
			rolesPorUsuario=new ArrayList<UsuarioRol>();
			
		}else{
			
			if(rolesPorUsuario.size()>0){
				for (UsuarioRol usuarioRol : rolesPorUsuario) {
					usuarioRol.setRol(rolService.findByPk(usuarioRol.getiUsuarioxrolRolId()));
				}
			}
		}
		
		
		return rolesPorUsuario;
	}
	
	public static void main(String[] args) {
				
		SeguridadService s=new SeguridadServiceImpl();
		
		List<Map<String, Object>> opcionesPorRol=new ArrayList<Map<String,Object>>();
		Map<String, Object> map=null;
		for (int i = 1; i <= 5; i++) {
			map=new HashMap<String, Object>();
			map.put("idRolOpcion", i);
			map.put("nombreRol", "Administrador del Sistema");
			map.put("nombreOpcion", "opcion - "+i);
			map.put("idOpcion", i);
			if(i==1){
				map.put("indPadre",0);
				map.put("childrens",4);
			}else{
				if(i==3){
					map.put("indPadre", 1);
					map.put("childrens",1);
				}else{
				map.put("indPadre", 1);
				map.put("childrens",0);
				}
			}
			
			map.put("action", "");
			map.put("modulo",0);
			opcionesPorRol.add(map);
		}
		
		

		map=new HashMap<String, Object>();
		map.put("idRolOpcion", 6);
		map.put("nombreRol", "Administrador del Sistema");
		map.put("nombreOpcion", "opcion - "+6);
		map.put("idOpcion", 6);
			
		map.put("indPadre",3);
		map.put("childrens",0);
		
		
		map.put("action", "");
		map.put("modulo",0);
		opcionesPorRol.add(map);
	
		
		String menu="";
		try {
			menu = s.strMenuRecursivo(opcionesPorRol);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(menu);
	}
	
	
	@Override
	public String obtenerOpcionesPorRol(Integer idRol) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("IDROL", idRol);
		List<Map<String, Object>> opcionesPorRol=rolOpcionDAO.selectMenu(params);
		return this.strMenuRecursivo(opcionesPorRol);
	}

	private String obtenerChildrens(List<Map<String, Object>> opcionesPorRol,Integer padre){
		
		String childrens="",cadena="";
		Boolean isPadre=false;
		Integer indPadre=null;
		Integer countChildren=null;
		Integer idPadre=null;
		for (Map<String, Object> rolOpcion : opcionesPorRol) {
			indPadre=Integer.parseInt(rolOpcion.get("indPadre").toString());
			idPadre=Integer.parseInt(rolOpcion.get("idOpcion").toString());
			if(indPadre==padre){
				countChildren=Integer.parseInt(rolOpcion.get("childrens").toString());
				isPadre=(countChildren>0?true:false);
				
				if(isPadre){
					
					cadena=obtenerChildrens(opcionesPorRol,idPadre);
					if(!cadena.equals("")){
					childrens=childrens.concat("<li class=\"dropdown-submenu\">");
					childrens=childrens.concat("<a  href=\"#\">"+rolOpcion.get("nombreOpcion").toString()+"</a>");
					childrens=childrens.concat("<ul class=\"dropdown-menu\">");
					childrens=childrens.concat(cadena);
					childrens=childrens.concat("</ul>");
					childrens=childrens.concat("</li>");
					}else{
						childrens=childrens.concat("<li><a href=\"#\" onclick=\"SirepManager.goToComponent(\\'"+rolOpcion.get("action").toString()+"\\',\\'"+rolOpcion.get("nombreOpcion").toString()+"\\');\">"+rolOpcion.get("nombreOpcion").toString()+"</a></li>");
					}
				}else{
				childrens=childrens.concat("<li><a href=\"#\" onclick=\"SirepManager.goToComponent(\\'"+rolOpcion.get("action").toString()+"\\',\\'"+rolOpcion.get("nombreOpcion").toString()+"\\');\">"+rolOpcion.get("nombreOpcion").toString()+"</a></li>");
				}
			}
		}
		
		return childrens;
	}
	
	@Override
	public String strMenuRecursivo(List<Map<String, Object>> opcionesPorRol)
			throws Exception {
		String strMenu="";
		String cadena="";
		Integer idPadre=null;
		List<Map<String, Object>> roots=new ArrayList<Map<String,Object>>();
		if(opcionesPorRol!=null && opcionesPorRol.size()>0){
			for (Map<String, Object> a : opcionesPorRol) {
				if(a.get("indPadre")!=null){
					if(a.get("indPadre").toString().equals("0")){
						roots.add(a);
					}
					
				}
			}
		}

		for (Map<String, Object> root : roots) {
			idPadre = Integer.parseInt(root.get("idOpcion").toString());
			strMenu = strMenu
					.concat("<li class=\"dropdown\">")
					.concat("<a role=\"button\" data-toggle=\"dropdown\"  href=\"#\">"
							+ root.get("nombreOpcion").toString()
							+ "<span class=\"caret\"></span></a>")
					.concat("<ul class=\"dropdown-menu multi-level\" role=\"menu\" aria-labelledby=\"dropdownMenu\">");

			cadena = obtenerChildrens(opcionesPorRol, idPadre);
			strMenu = strMenu.concat(cadena);
			strMenu = strMenu.concat("</ul>");
			strMenu = strMenu.concat("</li>");

		}
		
		return strMenu;
	}

	
	/**
	 @author Willian Pillaca
	 Opciones por Rol Tree 
	  **/
	@Override
	public String obtenerTreeOpcionesPorRol(Integer idRol) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("IDROL", idRol);
		List<Map<String, Object>> opcionesPorRol=rolOpcionDAO.selectTreeRolOpcion(params);
		return this.strTreeRecursivo(opcionesPorRol);
	}

	@Override
	public String strTreeRecursivo(List<Map<String, Object>> opcionesPorRol)
			throws Exception {
		// TODO Auto-generated method stub
		String strMenu="";
		String cadena="";
		Integer idPadre=null;
		List<Map<String, Object>> roots=new ArrayList<Map<String,Object>>();
		if(opcionesPorRol!=null && opcionesPorRol.size()>0){
			for (Map<String, Object> a : opcionesPorRol) {
				if(a.get("indPadre")!=null){
					if(a.get("indPadre").toString().equals("0")){
						roots.add(a);
					}
					
				}
			}
		}

		for (Map<String, Object> root : roots) {
			idPadre = Integer.parseInt(root.get("idOpcion").toString());
			strMenu = strMenu
					.concat("{\n")
					.concat("\"text\": \""+root.get("nombreOpcion").toString()+"\",\n")
					.concat("\"cls\": \"folder\",\n")
					.concat("\"expanded\": true,\n")
					.concat("\"idOpcion\": "+root.get("idOpcion").toString()+",\n")
					.concat("\"checked\": "+(root.get("idRolOpcion")==null?false:true)+",\n")
					.concat("\"children\": [\n");

			cadena = obtenerChildrensTree(opcionesPorRol, idPadre);
			strMenu = strMenu.concat(cadena);
			strMenu = strMenu.concat("\n]\n},");
		}
		strMenu=strMenu.substring(0, strMenu.length()-1);
		return "["+strMenu+"]";
	
	}
	
private String obtenerChildrensTree(List<Map<String, Object>> opcionesPorRol,Integer padre){
		
		String childrens="",cadena="";
		Boolean isPadre=false;
		Integer indPadre=null;
		Integer countChildren=null;
		Integer idPadre=null;
		for (Map<String, Object> rolOpcion : opcionesPorRol) {
			indPadre=Integer.parseInt(rolOpcion.get("indPadre").toString());
			idPadre=Integer.parseInt(rolOpcion.get("idOpcion").toString());
			if(indPadre==padre){
				countChildren=Integer.parseInt(rolOpcion.get("childrens").toString());
				isPadre=(countChildren>0?true:false);
				
				if(isPadre){
					
					cadena=obtenerChildrensTree(opcionesPorRol,idPadre);
					if(!cadena.equals("")){
					childrens=childrens.concat("{\n");
					childrens=childrens.concat("\"text\": \""+rolOpcion.get("nombreOpcion").toString()+"\",\n");
					childrens=childrens.concat("\"cls\": \"folder\",\n");
					childrens=childrens.concat("\"expanded\": true,\n");
					childrens=childrens.concat("\"checked\": "+(rolOpcion.get("idRolOpcion")==null?false:true)+",\n");
					childrens=childrens.concat("\"idOpcion\": "+rolOpcion.get("idOpcion").toString()+"\n");
					childrens=childrens.concat(",\"children\": [\n");
					childrens=childrens.concat(cadena);
					childrens=childrens.concat("]");
					childrens=childrens.concat("},");
					}else{
						childrens=childrens.concat("{\n");
						childrens=childrens.concat("\"text\": \""+rolOpcion.get("nombreOpcion").toString()+"\",\n");
						childrens=childrens.concat("\"leaf\": true,\n");
						childrens=childrens.concat("\"idOpcion\": "+rolOpcion.get("idOpcion").toString()+",\n");
						childrens=childrens.concat("\"checked\": "+(rolOpcion.get("idRolOpcion")==null?false:true)+"\n},\n");
					}
				}else{
					childrens=childrens.concat("{\n");
					childrens=childrens.concat("\"text\": \""+rolOpcion.get("nombreOpcion").toString()+"\",\n");
					childrens=childrens.concat("\"leaf\": true,\n");
					childrens=childrens.concat("\"idOpcion\": "+rolOpcion.get("idOpcion").toString()+",\n");
					childrens=childrens.concat("\"checked\": "+(rolOpcion.get("idRolOpcion")==null?false:true)+"\n},\n");
				}
			}
		}
		
		if(!childrens.equals("")){
			childrens=childrens.substring(0, childrens.length()-2);
		}
		
		return childrens;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, rollbackFor = Exception.class)
	public Map<String, Object> insertOpcionPorRol(Rol rol) throws Exception {
		// TODO Auto-generated method stub
		List<RolOpcion> opcionesPorRol = rol.getOpcionesPorRol();
		Integer idRol = rol.getiRolId();

		RolOpcionCriteria rxocri = new RolOpcionCriteria();
		rxocri.createCriteria().andIRolxopcionRolIdEqualTo(idRol);
		rolOpcionDAO.deleteByExample(rxocri);

		if (opcionesPorRol != null) {
			for (RolOpcion rolOpcion : opcionesPorRol) {
				rolOpcion.setiRolxopcionRolId(idRol);
				rolOpcionDAO.insertSelective(rolOpcion);
			}
		}
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("opcionesPorRol", opcionesPorRol);
		return result;
	}

}
