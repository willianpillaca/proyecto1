package pe.gob.ep.ginnet.radamanthys.dao;

import java.util.List;

import pe.gob.ep.ginnet.radamanthys.bean.Resumen;
import pe.gob.ep.ginnet.radamanthys.bean.ResumenCriteria;

public interface ResumenDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int countByExample(ResumenCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int deleteByExample(ResumenCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    void insert(Resumen record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    void insertSelective(Resumen record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    List<Resumen> selectByExample(ResumenCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    Resumen selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int updateByExampleSelective(Resumen record, ResumenCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int updateByExample(Resumen record, ResumenCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKeySelective(Resumen record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKey(Resumen record);
}