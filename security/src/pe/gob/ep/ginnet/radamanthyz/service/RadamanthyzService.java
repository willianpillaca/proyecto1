package pe.gob.ep.ginnet.radamanthyz.service;

import java.util.List;
import java.util.Map;

import pe.gob.ep.ginnet.catalogo.bean.ElementoCatalogo;
import pe.gob.ep.ginnet.radamanthys.bean.Alternativa;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCurso;
import pe.gob.ep.ginnet.radamanthys.bean.Catalogo;
import pe.gob.ep.ginnet.radamanthys.bean.Curso;
import pe.gob.ep.ginnet.radamanthys.bean.Docente;
import pe.gob.ep.ginnet.radamanthys.bean.Examen;
import pe.gob.ep.ginnet.radamanthys.bean.Persona;
import pe.gob.ep.ginnet.radamanthys.bean.Pregunta;
import pe.gob.ep.ginnet.radamanthys.bean.Profesor;
import pe.gob.ep.ginnet.radamanthys.bean.Tema;
import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.seguridad.bean.Usuario;


public interface RadamanthyzService {
	/**@Autor: Willian Pillaca**/
	//catalogo
	public List<Catalogo> findCatalogoByIdGrupo(Integer idGrupo) throws Exception;
	public List<Curso> findAllCursos(Curso curso) throws Exception;
	public List<Curso> findAllCursosByIdDocente(int idDocente) throws Exception;
	public List<Map<String, Object>> mostrarResultadoExamen(int idDocente) throws Exception;
	public List<AlumnoCurso> findAllCursosAlumno(AlumnoCurso alumnoCurso) throws Exception;
	public List<Curso> listaCursos(Integer estado) throws Exception;
	public List<Profesor> findAllProfesores(Profesor profesor) throws Exception;
	public List<Docente> findAllDocentes(Docente docente) throws Exception;
	public List<Usuario> listarDocentes() throws Exception;
	public Curso saveCurso(Curso curso) throws Exception;
	public List<Pregunta> findAllPregunta(Pregunta pregunta) throws Exception;
	public List<Map<String, Object>> getPreguntasByCodigoCurso(Integer cantidad, String codCurso) throws Exception;
	public List<Map<String, Object>> getPreguntaAbiertaByCodigoCurso(Integer cantidad, String codCurso) throws Exception;
	
	public List<Map<String, Object>> listarmiscursos(String codCurso) throws Exception;
	public Pregunta savePregunta(Pregunta pregunta) throws Exception;
	public Pregunta savePreguntaXTema(Pregunta pregunta) throws Exception;
	public Persona savePersona(Persona persona) throws Exception;
	public Persona validateUser(String usu, String pass) throws Exception;
	public Examen saveExamen(Examen examen, String alt1,String alt2, String alt3, String alt4,String alt5, Integer rpta) throws Exception;
	public Examen savePreguntaAbierta(Examen examen) throws Exception;
	public List<Map<String, Object>> getAllPreguntas() ;
	public List<Map<String, Object>> getAllPreguntasXTema(int ideTema) ;
	public AlumnoCurso saveAlumnoCurso(AlumnoCurso alumnoCurso) throws Exception;
	public List<Examen> listarPreguntasExamen(Integer idSistema) throws Exception;
	public void insertResultadoPrevio(Integer idUsuario, Integer idCurso, String nombreArchivo) throws Exception;
	public Map<String, Object> procesarPreguntas(String rpta);
	
	void actualizarNotaExamen(Integer idResultado, Integer nota);
	public Tema findTemaByPk(Integer idTema) throws Exception;
	
	public Tema findTemaByNombreTema(String nombreTema);
	public Tema saveTemaCurso(Tema tema) throws Exception;
	public List<Map<String, Object>> findAllTemasXCurso(int idCurso) throws Exception;	
	
}
