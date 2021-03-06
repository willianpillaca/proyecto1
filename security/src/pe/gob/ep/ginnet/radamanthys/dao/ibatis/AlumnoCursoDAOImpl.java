package pe.gob.ep.ginnet.radamanthys.dao.ibatis;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCurso;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCursoCriteria;
import pe.gob.ep.ginnet.radamanthys.dao.AlumnoCursoDAO;

public class AlumnoCursoDAOImpl extends SqlMapClientDaoSupport implements AlumnoCursoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public AlumnoCursoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int countByExample(AlumnoCursoCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tbl_alumno_curso.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int deleteByExample(AlumnoCursoCriteria example) {
        int rows = getSqlMapClientTemplate().delete("tbl_alumno_curso.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int deleteByPrimaryKey(Integer id) {
        AlumnoCurso key = new AlumnoCurso();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbl_alumno_curso.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public void insert(AlumnoCurso record) {
        getSqlMapClientTemplate().insert("tbl_alumno_curso.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public void insertSelective(AlumnoCurso record) {
        getSqlMapClientTemplate().insert("tbl_alumno_curso.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    @SuppressWarnings("unchecked")
    public List<AlumnoCurso> selectByExample(AlumnoCursoCriteria example) {
        List<AlumnoCurso> list = getSqlMapClientTemplate().queryForList("tbl_alumno_curso.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public AlumnoCurso selectByPrimaryKey(Integer id) {
        AlumnoCurso key = new AlumnoCurso();
        key.setId(id);
        AlumnoCurso record = (AlumnoCurso) getSqlMapClientTemplate().queryForObject("tbl_alumno_curso.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int updateByExampleSelective(AlumnoCurso record, AlumnoCursoCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_alumno_curso.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int updateByExample(AlumnoCurso record, AlumnoCursoCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_alumno_curso.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKeySelective(AlumnoCurso record) {
        int rows = getSqlMapClientTemplate().update("tbl_alumno_curso.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKey(AlumnoCurso record) {
        int rows = getSqlMapClientTemplate().update("tbl_alumno_curso.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    private static class UpdateByExampleParms extends AlumnoCursoCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, AlumnoCursoCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}