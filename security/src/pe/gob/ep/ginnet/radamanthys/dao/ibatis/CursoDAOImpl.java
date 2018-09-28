package pe.gob.ep.ginnet.radamanthys.dao.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.gob.ep.ginnet.radamanthys.bean.Curso;
import pe.gob.ep.ginnet.radamanthys.bean.CursoCriteria;
import pe.gob.ep.ginnet.radamanthys.dao.CursoDAO;

public class CursoDAOImpl extends SqlMapClientDaoSupport implements CursoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public CursoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int countByExample(CursoCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tbl_curso.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int deleteByExample(CursoCriteria example) {
        int rows = getSqlMapClientTemplate().delete("tbl_curso.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int deleteByPrimaryKey(Integer id) {
        Curso key = new Curso();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbl_curso.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public void insert(Curso record) {
        getSqlMapClientTemplate().insert("tbl_curso.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public void insertSelective(Curso record) {
        getSqlMapClientTemplate().insert("tbl_curso.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    @SuppressWarnings("unchecked")
    public List<Curso> selectByExample(CursoCriteria example) {
        List<Curso> list = getSqlMapClientTemplate().queryForList("tbl_curso.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public Curso selectByPrimaryKey(Integer id) {
        Curso key = new Curso();
        key.setId(id);
        Curso record = (Curso) getSqlMapClientTemplate().queryForObject("tbl_curso.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int updateByExampleSelective(Curso record, CursoCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_curso.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int updateByExample(Curso record, CursoCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_curso.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKeySelective(Curso record) {
        int rows = getSqlMapClientTemplate().update("tbl_curso.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKey(Curso record) {
        int rows = getSqlMapClientTemplate().update("tbl_curso.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_curso
     *
     * @ibatorgenerated
     */
    private static class UpdateByExampleParms extends CursoCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, CursoCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<Curso> findAllCursosByIdDocente(int idProfesor) {
		// TODO Auto-generated method stub
		List<Curso> list = getSqlMapClientTemplate().queryForList("tbl_curso.selectCursoByIdDocente", idProfesor);
        return list;
	}
	
	@Override
	public List<Map<String, Object>> listarmiscursos(Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_curso.getCursosByIdAlumno", params);
		return list;
	}
	
}