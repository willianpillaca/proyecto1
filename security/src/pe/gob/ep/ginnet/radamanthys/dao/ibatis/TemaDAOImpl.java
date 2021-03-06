package pe.gob.ep.ginnet.radamanthys.dao.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.gob.ep.ginnet.radamanthys.bean.Tema;
import pe.gob.ep.ginnet.radamanthys.bean.TemaCriteria;
import pe.gob.ep.ginnet.radamanthys.dao.TemaDAO;

public class TemaDAOImpl extends SqlMapClientDaoSupport implements TemaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public TemaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int countByExample(TemaCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tbl_tema.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int deleteByExample(TemaCriteria example) {
        int rows = getSqlMapClientTemplate().delete("tbl_tema.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int deleteByPrimaryKey(Integer idTema) {
        Tema key = new Tema();
        key.setIdTema(idTema);
        int rows = getSqlMapClientTemplate().delete("tbl_tema.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public void insert(Tema record) {
        getSqlMapClientTemplate().insert("tbl_tema.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public void insertSelective(Tema record) {
        getSqlMapClientTemplate().insert("tbl_tema.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    @SuppressWarnings("unchecked")
    public List<Tema> selectByExample(TemaCriteria example) {
        List<Tema> list = getSqlMapClientTemplate().queryForList("tbl_tema.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public Tema selectByPrimaryKey(Integer idTema) {
        Tema key = new Tema();
        key.setIdTema(idTema);
        Tema record = (Tema) getSqlMapClientTemplate().queryForObject("tbl_tema.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int updateByExampleSelective(Tema record, TemaCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_tema.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int updateByExample(Tema record, TemaCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tbl_tema.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKeySelective(Tema record) {
        int rows = getSqlMapClientTemplate().update("tbl_tema.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    public int updateByPrimaryKey(Tema record) {
        int rows = getSqlMapClientTemplate().update("tbl_tema.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_tema
     *
     * @ibatorgenerated
     */
    private static class UpdateByExampleParms extends TemaCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, TemaCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<Map<String, Object>> getTemasByCodigoCurso(
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = getSqlMapClientTemplate().queryForList("tbl_tema.getTemasXCurso", params);
		return list;
	}
}