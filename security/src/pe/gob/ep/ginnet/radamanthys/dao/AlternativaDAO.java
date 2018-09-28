package pe.gob.ep.ginnet.radamanthys.dao;

import java.util.List;
import java.util.Map;

import pe.gob.ep.ginnet.radamanthys.bean.Alternativa;
import pe.gob.ep.ginnet.radamanthys.bean.AlternativaCriteria;
import pe.gob.ep.ginnet.radamanthys.bean.Curso;
import pe.gob.ep.ginnet.radamanthys.bean.Resultado;

public interface AlternativaDAO {
    
    int countByExample(AlternativaCriteria example);    
    int deleteByExample(AlternativaCriteria example);
    int deleteByPrimaryKey(Integer id);
    void insert(Alternativa record);
    void insertSelective(Alternativa record);
    List<Alternativa> selectByExample(AlternativaCriteria example);
    Alternativa selectByPrimaryKey(Integer id);
    int updateByExampleSelective(Alternativa record, AlternativaCriteria example);    
    int updateByExample(Alternativa record, AlternativaCriteria example);
    int updateByPrimaryKeySelective(Alternativa record);
    int updateByPrimaryKey(Alternativa record);    
    public List<Alternativa> listarAlternativasExamen(Map<String, Object> params) throws Exception;
    int validarRespuesta(String param);
    /**Alternativas**/
    void insertarAlternativas1(Map<String, Object> params);
    void insertarAlternativas2(Map<String, Object> params);
    void insertarAlternativas3(Map<String, Object> params);
    void insertarAlternativas4(Map<String, Object> params);
    void insertarAlternativas5(Map<String, Object> params);    
    
}