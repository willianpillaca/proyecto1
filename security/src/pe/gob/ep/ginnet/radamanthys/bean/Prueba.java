package pe.gob.ep.ginnet.radamanthys.bean;

import java.util.Date;

public class Prueba {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_prueba.id_nombre
     *
     * @ibatorgenerated
     */
    private Integer idNombre;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_prueba.nombre
     *
     * @ibatorgenerated
     */
    private String nombre;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_prueba.correo
     *
     * @ibatorgenerated
     */
    private String correo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tbl_prueba.fecha
     *
     * @ibatorgenerated
     */
    private Date fecha;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_prueba.id_nombre
     *
     * @return the value of tbl_prueba.id_nombre
     *
     * @ibatorgenerated
     */
    public Integer getIdNombre() {
        return idNombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_prueba.id_nombre
     *
     * @param idNombre the value for tbl_prueba.id_nombre
     *
     * @ibatorgenerated
     */
    public void setIdNombre(Integer idNombre) {
        this.idNombre = idNombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_prueba.nombre
     *
     * @return the value of tbl_prueba.nombre
     *
     * @ibatorgenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_prueba.nombre
     *
     * @param nombre the value for tbl_prueba.nombre
     *
     * @ibatorgenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_prueba.correo
     *
     * @return the value of tbl_prueba.correo
     *
     * @ibatorgenerated
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_prueba.correo
     *
     * @param correo the value for tbl_prueba.correo
     *
     * @ibatorgenerated
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tbl_prueba.fecha
     *
     * @return the value of tbl_prueba.fecha
     *
     * @ibatorgenerated
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tbl_prueba.fecha
     *
     * @param fecha the value for tbl_prueba.fecha
     *
     * @ibatorgenerated
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_prueba
     *
     * @ibatorgenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Prueba)) {
            return false;
        }
        Prueba other = (Prueba) that;
        return this.getIdNombre() == null ? other == null : this.getIdNombre().equals(other.getIdNombre())
            && this.getNombre() == null ? other == null : this.getNombre().equals(other.getNombre())
            && this.getCorreo() == null ? other == null : this.getCorreo().equals(other.getCorreo())
            && this.getFecha() == null ? other == null : this.getFecha().equals(other.getFecha());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_prueba
     *
     * @ibatorgenerated
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getIdNombre() != null) {
            hash *= getIdNombre().hashCode();
        }
        if (getNombre() != null) {
            hash *= getNombre().hashCode();
        }
        if (getCorreo() != null) {
            hash *= getCorreo().hashCode();
        }
        if (getFecha() != null) {
            hash *= getFecha().hashCode();
        }
        return hash;
    }
}