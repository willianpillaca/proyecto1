package pe.gob.ep.ginnet.radamanthys.bean;

public class Profesor {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.id
     *
     * @ibatorgenerated
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.cod_persona
     *
     * @ibatorgenerated
     */
    private String codPersona;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.cod_especialidad
     *
     * @ibatorgenerated
     */
    private Integer codEspecialidad;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.cod_institucion
     *
     * @ibatorgenerated
     */
    private Integer codInstitucion;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.anio_finalizo
     *
     * @ibatorgenerated
     */
    private String anioFinalizo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.cod_grado_academico
     *
     * @ibatorgenerated
     */
    private Integer codGradoAcademico;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_profesor.cod_nacionalidad
     *
     * @ibatorgenerated
     */
    private Integer codNacionalidad;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.id
     *
     * @return the value of tbl_profesor.id
     *
     * @ibatorgenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.id
     *
     * @param id the value for tbl_profesor.id
     *
     * @ibatorgenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.cod_persona
     *
     * @return the value of tbl_profesor.cod_persona
     *
     * @ibatorgenerated
     */
    public String getCodPersona() {
        return codPersona;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.cod_persona
     *
     * @param codPersona the value for tbl_profesor.cod_persona
     *
     * @ibatorgenerated
     */
    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.cod_especialidad
     *
     * @return the value of tbl_profesor.cod_especialidad
     *
     * @ibatorgenerated
     */
    public Integer getCodEspecialidad() {
        return codEspecialidad;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.cod_especialidad
     *
     * @param codEspecialidad the value for tbl_profesor.cod_especialidad
     *
     * @ibatorgenerated
     */
    public void setCodEspecialidad(Integer codEspecialidad) {
        this.codEspecialidad = codEspecialidad;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.cod_institucion
     *
     * @return the value of tbl_profesor.cod_institucion
     *
     * @ibatorgenerated
     */
    public Integer getCodInstitucion() {
        return codInstitucion;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.cod_institucion
     *
     * @param codInstitucion the value for tbl_profesor.cod_institucion
     *
     * @ibatorgenerated
     */
    public void setCodInstitucion(Integer codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.anio_finalizo
     *
     * @return the value of tbl_profesor.anio_finalizo
     *
     * @ibatorgenerated
     */
    public String getAnioFinalizo() {
        return anioFinalizo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.anio_finalizo
     *
     * @param anioFinalizo the value for tbl_profesor.anio_finalizo
     *
     * @ibatorgenerated
     */
    public void setAnioFinalizo(String anioFinalizo) {
        this.anioFinalizo = anioFinalizo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.cod_grado_academico
     *
     * @return the value of tbl_profesor.cod_grado_academico
     *
     * @ibatorgenerated
     */
    public Integer getCodGradoAcademico() {
        return codGradoAcademico;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.cod_grado_academico
     *
     * @param codGradoAcademico the value for tbl_profesor.cod_grado_academico
     *
     * @ibatorgenerated
     */
    public void setCodGradoAcademico(Integer codGradoAcademico) {
        this.codGradoAcademico = codGradoAcademico;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_profesor.cod_nacionalidad
     *
     * @return the value of tbl_profesor.cod_nacionalidad
     *
     * @ibatorgenerated
     */
    public Integer getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_profesor.cod_nacionalidad
     *
     * @param codNacionalidad the value for tbl_profesor.cod_nacionalidad
     *
     * @ibatorgenerated
     */
    public void setCodNacionalidad(Integer codNacionalidad) {
        this.codNacionalidad = codNacionalidad;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor
     *
     * @ibatorgenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) that;
        return this.getId() == null ? other == null : this.getId().equals(other.getId())
            && this.getCodPersona() == null ? other == null : this.getCodPersona().equals(other.getCodPersona())
            && this.getCodEspecialidad() == null ? other == null : this.getCodEspecialidad().equals(other.getCodEspecialidad())
            && this.getCodInstitucion() == null ? other == null : this.getCodInstitucion().equals(other.getCodInstitucion())
            && this.getAnioFinalizo() == null ? other == null : this.getAnioFinalizo().equals(other.getAnioFinalizo())
            && this.getCodGradoAcademico() == null ? other == null : this.getCodGradoAcademico().equals(other.getCodGradoAcademico())
            && this.getCodNacionalidad() == null ? other == null : this.getCodNacionalidad().equals(other.getCodNacionalidad());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_profesor
     *
     * @ibatorgenerated
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getId() != null) {
            hash *= getId().hashCode();
        }
        if (getCodPersona() != null) {
            hash *= getCodPersona().hashCode();
        }
        if (getCodEspecialidad() != null) {
            hash *= getCodEspecialidad().hashCode();
        }
        if (getCodInstitucion() != null) {
            hash *= getCodInstitucion().hashCode();
        }
        if (getAnioFinalizo() != null) {
            hash *= getAnioFinalizo().hashCode();
        }
        if (getCodGradoAcademico() != null) {
            hash *= getCodGradoAcademico().hashCode();
        }
        if (getCodNacionalidad() != null) {
            hash *= getCodNacionalidad().hashCode();
        }
        return hash;
    }
}