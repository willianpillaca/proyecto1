package pe.gob.ep.ginnet.ruedanegocio.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.ruedanegocio.bean.ProyectoCriteria;
import pe.gob.ep.ginnet.ruedanegocio.dao.ProyectoDAO;




@Service
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	private ProyectoDAO proyectoDAO;
	
	@Override
	public List<Proyecto> findAll(Proyecto proyecto) throws Exception {
		System.out.println("service->>>>>");
		// TODO Auto-generated method stub
				
		List<Proyecto> proyectos =proyectoDAO.selectByExample(null);				
		return proyectos;
	}

	
	@Override
	@Transactional(propagation =Propagation.REQUIRES_NEW,readOnly = false,rollbackFor = Exception.class)
	public Proyecto save(Proyecto proyecto) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;
		String password="";
		Integer idProyecto=proyecto.getIdProyecto();
		boolean validaProyectoDuplicate=true;
		Proyecto proyectoInicial=null;
		if(idProyecto!=null){
			proyectoInicial=this.findProyectoByPk(idProyecto);
			if(proyectoInicial.getNombreProyecto().equalsIgnoreCase(proyecto.getNombreProyecto())){
				validaProyectoDuplicate=false;
			}			
		}
		
		if(validaProyectoDuplicate){
			if(this.findProyectoByUserName(proyecto.getNombreProyecto())!=null){
				throw new GenericExcepcion("Ya existe un prpyecto con el nombre <b>"+proyecto.getNombreProyecto()+"</b>.");
			}
			
		}
		
		if(proyecto.getIdProyecto()==null){			
			proyectoDAO.insertSelective(proyecto);
			create=true;
		}else{
			proyectoDAO.updateByPrimaryKeySelective(proyecto);
		}		
		return proyecto;
	}


	@Override
	public Proyecto findProyectoByPk(Integer idProyecto) throws Exception {
		// TODO Auto-generated method stub
		return proyectoDAO.selectByPrimaryKey(idProyecto);
		
	}


	@Override
	public Proyecto findProyectoByUserName(String userName) {
		// TODO Auto-generated method stub
		
		ProyectoCriteria uc=new ProyectoCriteria();
		uc.createCriteria().andNombreProyectoEqualTo(userName.toUpperCase());		
		
		Proyecto proyecto=null;
		
		List<Proyecto> result=proyectoDAO.selectByExample(uc);
		
		if(result!=null && result.size()>0){
			proyecto=result.get(0);
		}
		
		return proyecto;
	}
}
