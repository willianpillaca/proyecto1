package pe.gob.ep.ginnet.ruedanegocio.dao;


import java.util.List;

import pe.gob.ep.ginnet.ruedanegocio.bean.Proyecto;
import pe.gob.ep.ginnet.ruedanegocio.bean.ProyectoCriteria;

public interface ProyectoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int countByExample(ProyectoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int deleteByExample(ProyectoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int deleteByPrimaryKey(Integer idProyecto);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    void insert(Proyecto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    void insertSelective(Proyecto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    List<Proyecto> selectByExample(ProyectoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    Proyecto selectByPrimaryKey(Integer idProyecto);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int updateByExampleSelective(Proyecto record, ProyectoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int updateByExample(Proyecto record, ProyectoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKeySelective(Proyecto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKey(Proyecto record);
}