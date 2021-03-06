package pe.gob.ep.ginnet.radamanthys.dao;

import java.util.List;

import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCurso;
import pe.gob.ep.ginnet.radamanthys.bean.AlumnoCursoCriteria;

public interface AlumnoCursoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int countByExample(AlumnoCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int deleteByExample(AlumnoCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    void insert(AlumnoCurso record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    void insertSelective(AlumnoCurso record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    List<AlumnoCurso> selectByExample(AlumnoCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    AlumnoCurso selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int updateByExampleSelective(AlumnoCurso record, AlumnoCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int updateByExample(AlumnoCurso record, AlumnoCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKeySelective(AlumnoCurso record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    int updateByPrimaryKey(AlumnoCurso record);
}