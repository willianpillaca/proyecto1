package pe.gob.ep.ginnet.radamanthyz.service;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;















import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogo;
import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogoCriteria;
import pe.gob.ep.ginnet.excepcion.GenericExcepcion;
import pe.gob.ep.ginnet.radamanthys.bean.Alternativa;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCurso;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCursoCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Catalogo;
import pe.gob.ep.ginnet.radamanthys.bean.CatalogoCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Curso;
import pe.gob.ep.ginnet.radamanthys.bean.CursoCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Docente;
import pe.gob.ep.ginnet.radamanthys.bean.DocenteCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Examen;
import pe.gob.ep.ginnet.radamanthys.bean.Persona;
import pe.gob.ep.ginnet.radamanthys.bean.Pregunta;
import pe.gob.ep.ginnet.radamanthys.bean.PreguntaCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Profesor;
import pe.gob.ep.ginnet.radamanthys.bean.ProfesorCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Resultado;
import pe.gob.ep.ginnet.radamanthys.bean.Tema;
import pe.gob.ep.ginnet.radamanthys.bean.TemaCriteria;
import pe.gob.ep.ginnet.radamanthys.dao.AlternativaDAO;
import pe.gob.ep.ginnet.radamanthys.dao.AlumnoCursoDAO;
import pe.gob.ep.ginnet.radamanthys.dao.CatalogoDAO;
import pe.gob.ep.ginnet.radamanthys.dao.CursoDAO;
import pe.gob.ep.ginnet.radamanthys.dao.DocenteDAO;
import pe.gob.ep.ginnet.radamanthys.dao.ExamenDAO;
import pe.gob.ep.ginnet.radamanthys.dao.PersonaDAO;
import pe.gob.ep.ginnet.radamanthys.dao.PreguntaDAO;
import pe.gob.ep.ginnet.radamanthys.dao.ProfesorDAO;
import pe.gob.ep.ginnet.radamanthys.dao.ResultadoDAO;
import pe.gob.ep.ginnet.radamanthys.dao.TemaDAO;
import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.ruedanegocio.bean.ProyectoCriteria;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioCriteria;
import pe.gob.ep.ginnet.seguridad.bean.UsuarioRol;
import pe.gob.ep.ginnet.seguridad.dao.UsuarioDAO;
import pe.gob.ep.ginnet.util.Constante;
import pe.gob.ep.ginnet.util.Util;


@Service
public class RadamanthyzServiceImpl implements RadamanthyzService {
	
	@Autowired
	private CatalogoDAO catalogoDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private CursoDAO cursoDAO;
	
	@Autowired
	private ProfesorDAO profesorDAO;
	
	@Autowired
	private DocenteDAO docenteDAO;
	
	@Autowired
	private PreguntaDAO preguntaDAO;
	
	@Autowired
	private AlumnoCursoDAO alumnoCursoDAO;
	
	@Autowired
	private ExamenDAO examenDAO;
	
	@Autowired
	private AlternativaDAO alternativaDAO;
	
	@Autowired
	private ResultadoDAO resultadoDAO;
	
	@Autowired
	private PersonaDAO personaDAO;
	
	@Autowired
	private TemaDAO temaDAO;

	@Override
	public List<Catalogo> findCatalogoByIdGrupo(Integer idGrupo)
			throws Exception {
		// TODO Auto-generated method stub
		CatalogoCriteria elCri=new CatalogoCriteria();
		elCri.createCriteria().andICatalogoGrupoIdEqualTo(idGrupo).andICatalogoEstadoEqualTo(Constante.ESTADO_ACTIVO);
		List<Catalogo> list=catalogoDAO.selectByExample(elCri);
		return list;
	}
	
	@Override
	public List<Curso> findAllCursos(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		CursoCriteria cursoCriteria=new CursoCriteria();		
		
		List<Curso> cursos=cursoDAO.selectByExample(cursoCriteria);		
		
		return cursos;
	}
	
	@Override
	public List<Curso> findAllCursosByIdDocente(int idProfesor) throws Exception {
		// TODO Auto-generated method stub
		List<Curso> list = new ArrayList<Curso>();
		list = cursoDAO.findAllCursosByIdDocente(idProfesor);	
		return list;				
	}
	
	@Override
	public List<Map<String, Object>> mostrarResultadoExamen(int idProfesor) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("idAlumno", 6);
		params.put("idCurso", 15);
		List<Map<String, Object>> map = resultadoDAO.mostrarResultadoExamen(params);
		return map;		
	}
	
	@Override
	public List<Profesor> findAllProfesores(Profesor profesor) throws Exception {
		// TODO Auto-generated method stub
		ProfesorCriteria profesorCriteria=new ProfesorCriteria();				
		List<Profesor> profesores=profesorDAO.selectByExample(profesorCriteria);		
		return profesores;
	}
	
	@Override
	public List<Pregunta> findAllPregunta(Pregunta pregunta) throws Exception {
		// TODO Auto-generated method stub
		PreguntaCriteria preguntaCriteria=new PreguntaCriteria();				
		List<Pregunta> preguntas=preguntaDAO.selectByExample(preguntaCriteria);		
		return preguntas;
	}

	@Override
	public List<Map<String, Object>> getAllPreguntas() {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("a", "Willian");
		return preguntaDAO.getAllPreguntas(params);
	}

	@Override
	public Pregunta savePregunta(Pregunta pregunta) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;		
		Integer idpregunta=pregunta.getId();
		boolean validaPreguntaDuplicate=true;
		Pregunta preguntaInicial=null;

		
		if(pregunta.getId()==null){						
			preguntaDAO.insertSelective(pregunta);
			create=true;
		}else{
			preguntaDAO.updateByPrimaryKeySelective(pregunta);
		}	
		
		return pregunta;
	}
	
	@Override
	public Pregunta savePreguntaXTema(Pregunta pregunta) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;		
		Integer idpregunta=pregunta.getId();
		boolean validaPreguntaDuplicate=true;
		Pregunta preguntaInicial=null;

		
		if(pregunta.getId()==null){						
			preguntaDAO.insertSelective(pregunta);
			create=true;
		}else{
			preguntaDAO.updateByPrimaryKeySelective(pregunta);
		}	
		
		return pregunta;
	}

	@Override
	public Curso saveCurso(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;		
		Integer idcurso=curso.getId();
		boolean validaCursoDuplicate=true;
		Curso cursoInicial=null;
//		if(idpregunta!=null){
//			userInicial=this.findUsuarioByPk(idpregunta);
//			if(userInicial.getvUsuarioUsername().equalsIgnoreCase(usuario.getvUsuarioUsername())){
//				validaUserDuplicate=false;
//			}
//		}
		
//		if(validaPreguntaDuplicate){
//			if(this.findUsuarioByUserName(usuario.getvUsuarioUsername())!=null){
//				throw new GenericExcepcion("Ya existe un usuario con el nombre <b>"+usuario.getvUsuarioUsername()+"</b>.");
//			}
//		}
		
		if(curso.getId()==null){						
			cursoDAO.insertSelective(curso);
			create=true;
		}else{
			cursoDAO.updateByPrimaryKeySelective(curso);
		}	
		
		return curso;
	}

	@Override
	public List<Curso> listaCursos(Integer estado) throws Exception {
		// TODO Auto-generated method stub		
		
		//List<Curso> list=cursoDAO.listaCursos(estado);
		return null;
	}

	@Override
	public AlumnoCurso saveAlumnoCurso(AlumnoCurso alumnoCurso) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;		
		Integer idcurso=alumnoCurso.getId();
		boolean validaCursoDuplicate=true;
		AlumnoCurso alumnoCursoInicial=null;
//		if(idpregunta!=null){
//			userInicial=this.findUsuarioByPk(idpregunta);
//			if(userInicial.getvUsuarioUsername().equalsIgnoreCase(usuario.getvUsuarioUsername())){
//				validaUserDuplicate=false;
//			}
//		}
		
//		if(validaPreguntaDuplicate){
//			if(this.findUsuarioByUserName(usuario.getvUsuarioUsername())!=null){
//				throw new GenericExcepcion("Ya existe un usuario con el nombre <b>"+usuario.getvUsuarioUsername()+"</b>.");
//			}
//		}		
		if(alumnoCurso.getId()==null){			
			alumnoCursoDAO.insertSelective(alumnoCurso);
			create=true;
		}else{						
			alumnoCursoDAO.updateByPrimaryKeySelective(alumnoCurso);
		}		
		return alumnoCurso;
	}

	@Override
	public List<AlumnoCurso> findAllCursosAlumno(AlumnoCurso alumnoCurso) throws Exception {
		// TODO Auto-generated method stub
		AlumnoCursoCriteria cursosAlumnoCriteria=new AlumnoCursoCriteria();		
		
		List<AlumnoCurso> cursosAlumno=alumnoCursoDAO.selectByExample(cursosAlumnoCriteria);		
		
		return cursosAlumno;
	}

	@Override
	public List<Map<String, Object>> getPreguntasByCodigoCurso(Integer cantidad, String codCurso) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("cantidad", cantidad);
		params.put("codigoCurso", codCurso);
		List<Map<String, Object>> map = preguntaDAO.getPreguntasByCodigoCurso(params);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> getPreguntaAbiertaByCodigoCurso(Integer cantidad, String codCurso) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("cantidad", cantidad);
		params.put("codigoCurso", codCurso);
		List<Map<String, Object>> map = preguntaDAO.getPreguntaAbiertaByCodigoCurso(params);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> listarmiscursos(String codCurso) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();		
		params.put("codigoCurso", codCurso);
		return cursoDAO.listarmiscursos(params);
	}

	
	
	@Override
	public List<Examen> listarPreguntasExamen(Integer idSistema) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("idSistema", idSistema);
		List<Examen> list = examenDAO.listarPreguntasExamen(params);
		for(int i=0; i<list.size(); i++){
			System.out.println("i->>"+i);
			Map<String, Object> param=new HashMap<String, Object>();			
			int idPregunta = list.get(i).getId().intValue();
			param.put("idPregunta", idPregunta);
			
			//alternativaDAO.listarAlternativasExamen(param);
			list.get(i).setAlternativa(alternativaDAO.listarAlternativasExamen(param));
			//list.ad
		}
		return list;
	}

	@Override
	public Map<String, Object> procesarPreguntas(String rpta) {
		// TODO Auto-generated method stub
		System.out.println("rpta->>>"+rpta);
		Map<String, Object> params=new HashMap<String, Object>();		
		int respCorrectas=0;
		int respIncorrectas=0;
		String[] respuesta = Util.convertirCadenaArray(rpta);
		int cant= respuesta.length;
		System.out.println("cant->>>"+cant);
		for(int i=0; i<respuesta.length; i++){
			System.out.println("respuesta->>"+respuesta[i]);
			String[] altPreg = Util.alternativaPregunta(respuesta[i]);
			Integer alt = Integer.parseInt(altPreg[1]);
			Integer preg = Integer.parseInt(altPreg[2]);			
			System.out.println("alt->>"+alt);
			int tmp = alternativaDAO.validarRespuesta(alt+"_"+preg);
			if(tmp ==1){
				respCorrectas= respCorrectas+1;
			}
			else{
				respIncorrectas = respIncorrectas+1;
			}			
			System.out.println("preg->>"+preg);			
		}
		System.out.println("respCorrectas->>"+respCorrectas);
		System.out.println("respIncorrectas->>"+respIncorrectas);
		params.put("rptaTrue", respCorrectas);
		params.put("rptaFalse", respIncorrectas);
		params.put("success", true);
		
		//actualizar notas del alumno
		Resultado resultado = new Resultado();
		/**guardando el resultado**/		
		resultado.setIdAlumno(1);
		resultado.setIdCurso(1);
		resultado.setNota(12);
		resultado.setNumPregCorrectas(respCorrectas);
		resultado.setNumPregIncorrectas(respIncorrectas);
		resultado.setCondicion("APROBADO");
		resultado.setEstado(1);
		int maxId = resultadoDAO.getLastResultado();
		
		Map<String, Object> parameter=new HashMap<String, Object>();
		parameter.put("id", maxId);
		parameter.put("nota", 12);
		parameter.put("respCorrectas", respCorrectas);
		parameter.put("respIncorrectas", respIncorrectas);
		parameter.put("condicion", "APROBADO");
		parameter.put("estado", 1);
		resultadoDAO.updateResultadoById(parameter);
//		resultadoDAO.insertSelective(resultado);
//		System.out.println("guardando resultado...");
		return params;
	}
	
	public void insertResultadoPrevio(Integer idUsuario, Integer idCurso, String nombreArchivo){
		Resultado resultado = new Resultado();
		/**guardando el resultado**/		
		resultado.setIdAlumno(idUsuario);
		resultado.setIdCurso(idCurso);
		resultado.setNota(0);
		resultado.setNumPregCorrectas(0);
		resultado.setNumPregIncorrectas(0);
		resultado.setCondicion("Pendiente");
		resultado.setEstado(0);
		resultado.setRutaArchivo(nombreArchivo);
		resultadoDAO.insertSelective(resultado);
		
	} 
	
	
	@Override
	public Examen saveExamen(Examen examen, String alt1,String alt2, String alt3, String alt4,String alt5, Integer rpta) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;				
		examen.setIdEstado(1);
		examen.setIdSistema(1);
		System.out.println(examen.getId());
		if(examen.getId()==null){						
			examenDAO.insertSelective(examen);
			create=true;
		}else{
			examenDAO.updateByPrimaryKeySelective(examen);
		}
		
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("idEstado", 1);		
		System.out.println("soy willian walas");
		List<Examen> lista = examenDAO.obtenerIdPregunta(params);		
		Integer idPregunta = lista.get(0).getId();
		Map<String, Object> parametros1=new HashMap<String, Object>();
		Map<String, Object> parametros2=new HashMap<String, Object>();
		Map<String, Object> parametros3=new HashMap<String, Object>();
		Map<String, Object> parametros4=new HashMap<String, Object>();
		Map<String, Object> parametros5=new HashMap<String, Object>();
		
		if(rpta ==1){
			parametros1.put("respuesta", 1);
			parametros2.put("respuesta", 0);
			parametros3.put("respuesta", 0);
			parametros4.put("respuesta", 0);
			parametros5.put("respuesta", 0);
		}
		
		if(rpta ==2){
			parametros1.put("respuesta", 0);
			parametros2.put("respuesta", 1);
			parametros3.put("respuesta", 0);
			parametros4.put("respuesta", 0);
			parametros5.put("respuesta", 0);
		}
		
		if(rpta ==3){
			parametros1.put("respuesta", 0);
			parametros2.put("respuesta", 0);
			parametros3.put("respuesta", 1);
			parametros4.put("respuesta", 0);
			parametros5.put("respuesta", 0);
		}
		
		if(rpta ==4){
			parametros1.put("respuesta", 0);
			parametros2.put("respuesta", 0);
			parametros3.put("respuesta", 0);
			parametros4.put("respuesta", 1);
			parametros5.put("respuesta", 0);
		}
		
		if(rpta ==5){
			parametros1.put("respuesta", 0);
			parametros2.put("respuesta", 0);
			parametros3.put("respuesta", 0);
			parametros4.put("respuesta", 0);
			parametros5.put("respuesta", 1);
		}
		
		parametros1.put("idPregunta", idPregunta);
		parametros2.put("idPregunta", idPregunta);
		parametros3.put("idPregunta", idPregunta);
		parametros4.put("idPregunta", idPregunta);
		parametros5.put("idPregunta", idPregunta);
		
		
		parametros1.put("descripcion1", alt1);
		parametros2.put("descripcion2", alt2);
		parametros3.put("descripcion3", alt3);
		parametros4.put("descripcion4", alt4);
		parametros5.put("descripcion5", alt5);		
		/****/
		parametros1.put("valor1", idPregunta+"_"+1);
		parametros2.put("valor2", idPregunta+"_"+2);
		parametros3.put("valor3", idPregunta+"_"+3);
		parametros4.put("valor4", idPregunta+"_"+4);
		parametros5.put("valor5", idPregunta+"_"+5);
		
		alternativaDAO.insertarAlternativas1(parametros1);
		alternativaDAO.insertarAlternativas2(parametros2);
		alternativaDAO.insertarAlternativas3(parametros3);
		alternativaDAO.insertarAlternativas4(parametros4);
		alternativaDAO.insertarAlternativas5(parametros5);
		
		System.out.println("el id registrado es->>>"+idPregunta);
		
		
		return examen;
	}

	@Override
	public Examen savePreguntaAbierta(Examen examen) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;	
		examen.setIdEstado(2);
		examen.setIdSistema(1);
		System.out.println(examen.getId());
		if(examen.getId()==null){						
			examenDAO.insertSelective(examen);
			create=true;
		}else{
			examenDAO.updateByPrimaryKeySelective(examen);
		}
		return examen;
	}

	@Override
	public Persona savePersona(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		boolean create=false;		
		Integer idcurso=persona.getCodigo();
		boolean validaCursoDuplicate=true;
		Persona personaInicial=null;
		if(persona.getCodigo()==null){						
			personaDAO.insertSelective(persona);
			create=true;
		}else{
			personaDAO.updateByPrimaryKeySelective(persona);
		}
		return persona;
	}

	@Override
	public Persona validateUser(String usu, String pass) throws Exception {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("login", usu);
		params.put("clave", pass);
		persona = personaDAO.validateUser(params);
		return persona;
	}

	@Override
	public List<Docente> findAllDocentes(Docente docente) throws Exception {
		// TODO Auto-generated method stub
		DocenteCriteria docenteCriteria=new DocenteCriteria();
		
		List<Docente> docentes=docenteDAO.selectByExample(docenteCriteria);
		for(int i=0; i<docentes.size(); i++){
			docentes.get(i).setNombreCompleto(docentes.get(i).getApaterno()+" "+docentes.get(i).getApaterno()+" "+docentes.get(i).getNombre());
			
		}		
		return docentes;
	}

	@Override
	public List<Usuario> listarDocentes() throws Exception {
		// TODO Auto-generated method stub
		int rol=2;
		List<Usuario> docentes=usuarioDAO.listarDocentes(rol);
		
		
		for(int i=0; i<docentes.size(); i++){
			docentes.get(i).setNombreCompleto(docentes.get(i).getvUsuarioApMaterno()+" "+docentes.get(i).getvUsuarioApMaterno()+" "+docentes.get(i).getvUsuarioNombres());
		}
		
		return docentes;
	}

	@Override
	public void actualizarNotaExamen(Integer idResultado, Integer nota) {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("id", idResultado);
		params.put("nota", nota);	
		params.put("estado", 2);
		resultadoDAO.actualizarNotaExamen(params);
	}

	@Override
	public Tema findTemaByPk(Integer idTema) throws Exception {
		// TODO Auto-generated method stub
		return temaDAO.selectByPrimaryKey(idTema);
		
	}
	
	@Override
	public Tema saveTemaCurso(Tema tema) throws Exception {
		// TODO Auto-generated method stub	
		boolean create=false;
		Integer idTema=tema.getIdTema();
		boolean validaTemaDuplicate=true;
		Tema temaInicial=null;
		if(idTema!=null){			
			temaInicial=this.findTemaByPk(idTema);
			if(temaInicial.getTema().equalsIgnoreCase(tema.getTema())){
				validaTemaDuplicate=false;
			}			
		}
		
		if(validaTemaDuplicate){
			if(this.findTemaByNombreTema(tema.getTema())!=null){
				throw new GenericExcepcion("Ya existe un tema con el nombre <b>"+tema.getTema()+"</b>.");
			}
		}
		
		if(tema.getIdTema()==null){			
			temaDAO.insertSelective(tema);
			create=true;
		}else{
			temaDAO.updateByPrimaryKeySelective(tema);
		}		
		return tema;
	}

	@Override
	public Tema findTemaByNombreTema(String nombreTema) {
		// TODO Auto-generated method stub
		TemaCriteria uc=new TemaCriteria();
		uc.createCriteria().andTemaEqualTo(nombreTema.toUpperCase());		
		Tema tema=null;		
		List<Tema> result=temaDAO.selectByExample(uc);		
		if(result!=null && result.size()>0){
			tema=result.get(0);
		}		
		return tema;
	}

	@Override
	public List<Map<String, Object>> findAllTemasXCurso(int idCurso) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("idCurso", idCurso);		
		List<Map<String, Object>> map = temaDAO.getTemasByCodigoCurso(params);
		return map;
	}

	@Override
	public List<Map<String, Object>> getAllPreguntasXTema(int ideTema) {
		// TODO Auto-generated method stub		
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("idTema", ideTema);
		return preguntaDAO.getAllPreguntasXTema(params);
	}

	
	
	
	
}
