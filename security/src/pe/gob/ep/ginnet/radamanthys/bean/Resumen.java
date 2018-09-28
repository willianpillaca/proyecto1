package pe.gob.ep.ginnet.radamanthys.bean;

public class Resumen {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.id
     *
     * @ibatorgenerated
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.cod_alumno
     *
     * @ibatorgenerated
     */
    private Integer codAlumno;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.cod_curso
     *
     * @ibatorgenerated
     */
    private Integer codCurso;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.nota_pregunta_abierta
     *
     * @ibatorgenerated
     */
    private Long notaPreguntaAbierta;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.nota_pregunta_cerrada
     *
     * @ibatorgenerated
     */
    private Long notaPreguntaCerrada;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_resumen.nota_final
     *
     * @ibatorgenerated
     */
    private Long notaFinal;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.id
     *
     * @return the value of tbl_resumen.id
     *
     * @ibatorgenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.id
     *
     * @param id the value for tbl_resumen.id
     *
     * @ibatorgenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.cod_alumno
     *
     * @return the value of tbl_resumen.cod_alumno
     *
     * @ibatorgenerated
     */
    public Integer getCodAlumno() {
        return codAlumno;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.cod_alumno
     *
     * @param codAlumno the value for tbl_resumen.cod_alumno
     *
     * @ibatorgenerated
     */
    public void setCodAlumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.cod_curso
     *
     * @return the value of tbl_resumen.cod_curso
     *
     * @ibatorgenerated
     */
    public Integer getCodCurso() {
        return codCurso;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.cod_curso
     *
     * @param codCurso the value for tbl_resumen.cod_curso
     *
     * @ibatorgenerated
     */
    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.nota_pregunta_abierta
     *
     * @return the value of tbl_resumen.nota_pregunta_abierta
     *
     * @ibatorgenerated
     */
    public Long getNotaPreguntaAbierta() {
        return notaPreguntaAbierta;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.nota_pregunta_abierta
     *
     * @param notaPreguntaAbierta the value for tbl_resumen.nota_pregunta_abierta
     *
     * @ibatorgenerated
     */
    public void setNotaPreguntaAbierta(Long notaPreguntaAbierta) {
        this.notaPreguntaAbierta = notaPreguntaAbierta;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.nota_pregunta_cerrada
     *
     * @return the value of tbl_resumen.nota_pregunta_cerrada
     *
     * @ibatorgenerated
     */
    public Long getNotaPreguntaCerrada() {
        return notaPreguntaCerrada;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.nota_pregunta_cerrada
     *
     * @param notaPreguntaCerrada the value for tbl_resumen.nota_pregunta_cerrada
     *
     * @ibatorgenerated
     */
    public void setNotaPreguntaCerrada(Long notaPreguntaCerrada) {
        this.notaPreguntaCerrada = notaPreguntaCerrada;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_resumen.nota_final
     *
     * @return the value of tbl_resumen.nota_final
     *
     * @ibatorgenerated
     */
    public Long getNotaFinal() {
        return notaFinal;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_resumen.nota_final
     *
     * @param notaFinal the value for tbl_resumen.nota_final
     *
     * @ibatorgenerated
     */
    public void setNotaFinal(Long notaFinal) {
        this.notaFinal = notaFinal;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Resumen)) {
            return false;
        }
        Resumen other = (Resumen) that;
        return this.getId() == null ? other == null : this.getId().equals(other.getId())
            && this.getCodAlumno() == null ? other == null : this.getCodAlumno().equals(other.getCodAlumno())
            && this.getCodCurso() == null ? other == null : this.getCodCurso().equals(other.getCodCurso())
            && this.getNotaPreguntaAbierta() == null ? other == null : this.getNotaPreguntaAbierta().equals(other.getNotaPreguntaAbierta())
            && this.getNotaPreguntaCerrada() == null ? other == null : this.getNotaPreguntaCerrada().equals(other.getNotaPreguntaCerrada())
            && this.getNotaFinal() == null ? other == null : this.getNotaFinal().equals(other.getNotaFinal());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_resumen
     *
     * @ibatorgenerated
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getId() != null) {
            hash *= getId().hashCode();
        }
        if (getCodAlumno() != null) {
            hash *= getCodAlumno().hashCode();
        }
        if (getCodCurso() != null) {
            hash *= getCodCurso().hashCode();
        }
        if (getNotaPreguntaAbierta() != null) {
            hash *= getNotaPreguntaAbierta().hashCode();
        }
        if (getNotaPreguntaCerrada() != null) {
            hash *= getNotaPreguntaCerrada().hashCode();
        }
        if (getNotaFinal() != null) {
            hash *= getNotaFinal().hashCode();
        }
        return hash;
    }
}