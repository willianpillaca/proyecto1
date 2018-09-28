package pe.gob.ep.ginnet.radamanthys.dao.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.gob.ep.ginnet.radamanthys.bean.Pregunta;
import pe.gob.ep.ginnet.radamanthys.bean.PreguntaCriteria;
import pe.gob.ep.ginnet.radamanthys.dao.PreguntaDAO;

public class PreguntaDAOImpl extends SqlMapClientDaoSupport implements PreguntaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public PreguntaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int countByExample(PreguntaCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tbl_pregunta.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int deleteByExample(PreguntaCriteria example) {
        int rows = getSqlMapClientTemplate().delete("tbl_pregunta.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int deleteByPrimaryKey(Integer id) {
        Pregunta key = new Pregunta();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbl_pregunta.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public void insert(Pregunta record) {
        getSqlMapClientTemplate().insert("tbl_pregunta.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public void insertSelective(Pregunta record) {
        getSqlMapClientTemplate().insert("tbl_pregunta.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    @SuppressWarnings("unchecked")
    public List<Pregunta> selectByExample(PreguntaCriteria example) {
        List<Pregunta> list = getSqlMapClientTemplate().queryForList("tbl_pregunta.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public Pregunta selectByPrimaryKey(Integer id) {
        Pregunta key = new Pregunta();
        key.setId(id);
        Pregunta record = (Pregunta) getSqlMapClientTemplate().queryForObject("tbl_pregunta.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int updateByExampleSelective(Pregunta record, PreguntaCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_pregunta.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int updateByExample(Pregunta record, PreguntaCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_pregunta.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKeySelective(Pregunta record) {
        int rows = getSqlMapClientTemplate().update("tbl_pregunta.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKey(Pregunta record) {
        int rows = getSqlMapClientTemplate().update("tbl_pregunta.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_pregunta
     *
     * @ibatorgenerated
     */
    private static class UpdateByExampleParms extends PreguntaCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, PreguntaCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
    @Override
	public List<Map<String, Object>> getAllPreguntas(Map<String, Object> params) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_pregunta.getAllPreguntas", params);
		return list;
	}

	@Override
	public List<Map<String, Object>> getPreguntasByCodigoCurso(Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_pregunta.getByCodigoCurso", params);
		return list;
	}
	
	@Override
	public List<Map<String, Object>> getPreguntaAbiertaByCodigoCurso(Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_pregunta.getPreguntaAbiertaByCodigoCurso", params);
		return list;
	}

	@Override
	public List<Map<String, Object>> getAllPreguntasXTema(
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_pregunta.getAllPreguntasXTema", params);
		return list;
	}
    
}