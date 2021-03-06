package pe.gob.ep.ginnet.radamanthys.dao;

import java.util.List;

import pe.gob.ep.ginnet.radamanthys.bean.ProfesorCurso;
import pe.gob.ep.ginnet.radamanthys.bean.ProfesorCursoCriteria;

public interface ProfesorCursoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    int countByExample(ProfesorCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    int deleteByExample(ProfesorCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    void insert(ProfesorCurso record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    void insertSelective(ProfesorCurso record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    List<ProfesorCurso> selectByExample(ProfesorCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    int updateByExampleSelective(ProfesorCurso record, ProfesorCursoCriteria example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor_curso
     *
     * @ibatorgenerated
     */
    int updateByExample(ProfesorCurso record, ProfesorCursoCriteria example);
}