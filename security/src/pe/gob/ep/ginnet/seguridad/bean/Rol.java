package pe.gob.ep.ginnet.seguridad.bean;

import java.util.Date;
import java.util.List;

public class Rol {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.I_ROL_ID
     *
     * @ibatorgenerated
     */
    private Integer iRolId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.V_ROL_NOMBRE
     *
     * @ibatorgenerated
     */
    private String vRolNombre;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.I_ROL_TIPO
     *
     * @ibatorgenerated
     */
    private Integer iRolTipo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.D_ROL_FECREGISTRA
     *
     * @ibatorgenerated
     */
    private Date dRolFecregistra;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.D_ROL_FECMODIFICA
     *
     * @ibatorgenerated
     */
    private Date dRolFecmodifica;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.V_ROL_DESUSUREGISTRA
     *
     * @ibatorgenerated
     */
    private String vRolDesusuregistra;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.V_ROL_DESUSUMODIFICA
     *
     * @ibatorgenerated
     */
    private String vRolDesusumodifica;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.V_ROL_DESIPREGISTRA
     *
     * @ibatorgenerated
     */
    private String vRolDesipregistra;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.V_ROL_DESIPMODIFICA
     *
     * @ibatorgenerated
     */
    private String vRolDesipmodifica;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rol.I_ROL_ESTADO
     *
     * @ibatorgenerated
     */
    private Integer iRolEstado;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.I_ROL_ID
     *
     * @return the value of ctrl_seg_rol.I_ROL_ID
     *
     * @ibatorgenerated
     */
    public Integer getiRolId() {
        return iRolId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.I_ROL_ID
     *
     * @param iRolId the value for ctrl_seg_rol.I_ROL_ID
     *
     * @ibatorgenerated
     */
    public void setiRolId(Integer iRolId) {
        this.iRolId = iRolId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.V_ROL_NOMBRE
     *
     * @return the value of ctrl_seg_rol.V_ROL_NOMBRE
     *
     * @ibatorgenerated
     */
    public String getvRolNombre() {
        return vRolNombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.V_ROL_NOMBRE
     *
     * @param vRolNombre the value for ctrl_seg_rol.V_ROL_NOMBRE
     *
     * @ibatorgenerated
     */
    public void setvRolNombre(String vRolNombre) {
        this.vRolNombre = vRolNombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.I_ROL_TIPO
     *
     * @return the value of ctrl_seg_rol.I_ROL_TIPO
     *
     * @ibatorgenerated
     */
    public Integer getiRolTipo() {
        return iRolTipo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.I_ROL_TIPO
     *
     * @param iRolTipo the value for ctrl_seg_rol.I_ROL_TIPO
     *
     * @ibatorgenerated
     */
    public void setiRolTipo(Integer iRolTipo) {
        this.iRolTipo = iRolTipo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.D_ROL_FECREGISTRA
     *
     * @return the value of ctrl_seg_rol.D_ROL_FECREGISTRA
     *
     * @ibatorgenerated
     */
    public Date getdRolFecregistra() {
        return dRolFecregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.D_ROL_FECREGISTRA
     *
     * @param dRolFecregistra the value for ctrl_seg_rol.D_ROL_FECREGISTRA
     *
     * @ibatorgenerated
     */
    public void setdRolFecregistra(Date dRolFecregistra) {
        this.dRolFecregistra = dRolFecregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.D_ROL_FECMODIFICA
     *
     * @return the value of ctrl_seg_rol.D_ROL_FECMODIFICA
     *
     * @ibatorgenerated
     */
    public Date getdRolFecmodifica() {
        return dRolFecmodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.D_ROL_FECMODIFICA
     *
     * @param dRolFecmodifica the value for ctrl_seg_rol.D_ROL_FECMODIFICA
     *
     * @ibatorgenerated
     */
    public void setdRolFecmodifica(Date dRolFecmodifica) {
        this.dRolFecmodifica = dRolFecmodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.V_ROL_DESUSUREGISTRA
     *
     * @return the value of ctrl_seg_rol.V_ROL_DESUSUREGISTRA
     *
     * @ibatorgenerated
     */
    public String getvRolDesusuregistra() {
        return vRolDesusuregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.V_ROL_DESUSUREGISTRA
     *
     * @param vRolDesusuregistra the value for ctrl_seg_rol.V_ROL_DESUSUREGISTRA
     *
     * @ibatorgenerated
     */
    public void setvRolDesusuregistra(String vRolDesusuregistra) {
        this.vRolDesusuregistra = vRolDesusuregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.V_ROL_DESUSUMODIFICA
     *
     * @return the value of ctrl_seg_rol.V_ROL_DESUSUMODIFICA
     *
     * @ibatorgenerated
     */
    public String getvRolDesusumodifica() {
        return vRolDesusumodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.V_ROL_DESUSUMODIFICA
     *
     * @param vRolDesusumodifica the value for ctrl_seg_rol.V_ROL_DESUSUMODIFICA
     *
     * @ibatorgenerated
     */
    public void setvRolDesusumodifica(String vRolDesusumodifica) {
        this.vRolDesusumodifica = vRolDesusumodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.V_ROL_DESIPREGISTRA
     *
     * @return the value of ctrl_seg_rol.V_ROL_DESIPREGISTRA
     *
     * @ibatorgenerated
     */
    public String getvRolDesipregistra() {
        return vRolDesipregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.V_ROL_DESIPREGISTRA
     *
     * @param vRolDesipregistra the value for ctrl_seg_rol.V_ROL_DESIPREGISTRA
     *
     * @ibatorgenerated
     */
    public void setvRolDesipregistra(String vRolDesipregistra) {
        this.vRolDesipregistra = vRolDesipregistra;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.V_ROL_DESIPMODIFICA
     *
     * @return the value of ctrl_seg_rol.V_ROL_DESIPMODIFICA
     *
     * @ibatorgenerated
     */
    public String getvRolDesipmodifica() {
        return vRolDesipmodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.V_ROL_DESIPMODIFICA
     *
     * @param vRolDesipmodifica the value for ctrl_seg_rol.V_ROL_DESIPMODIFICA
     *
     * @ibatorgenerated
     */
    public void setvRolDesipmodifica(String vRolDesipmodifica) {
        this.vRolDesipmodifica = vRolDesipmodifica;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rol.I_ROL_ESTADO
     *
     * @return the value of ctrl_seg_rol.I_ROL_ESTADO
     *
     * @ibatorgenerated
     */
    public Integer getiRolEstado() {
        return iRolEstado;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rol.I_ROL_ESTADO
     *
     * @param iRolEstado the value for ctrl_seg_rol.I_ROL_ESTADO
     *
     * @ibatorgenerated
     */
    public void setiRolEstado(Integer iRolEstado) {
        this.iRolEstado = iRolEstado;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) that;
        return this.getiRolId() == null ? other == null : this.getiRolId().equals(other.getiRolId())
            && this.getvRolNombre() == null ? other == null : this.getvRolNombre().equals(other.getvRolNombre())
            && this.getiRolTipo() == null ? other == null : this.getiRolTipo().equals(other.getiRolTipo())
            && this.getdRolFecregistra() == null ? other == null : this.getdRolFecregistra().equals(other.getdRolFecregistra())
            && this.getdRolFecmodifica() == null ? other == null : this.getdRolFecmodifica().equals(other.getdRolFecmodifica())
            && this.getvRolDesusuregistra() == null ? other == null : this.getvRolDesusuregistra().equals(other.getvRolDesusuregistra())
            && this.getvRolDesusumodifica() == null ? other == null : this.getvRolDesusumodifica().equals(other.getvRolDesusumodifica())
            && this.getvRolDesipregistra() == null ? other == null : this.getvRolDesipregistra().equals(other.getvRolDesipregistra())
            && this.getvRolDesipmodifica() == null ? other == null : this.getvRolDesipmodifica().equals(other.getvRolDesipmodifica())
            && this.getiRolEstado() == null ? other == null : this.getiRolEstado().equals(other.getiRolEstado());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getiRolId() != null) {
            hash *= getiRolId().hashCode();
        }
        if (getvRolNombre() != null) {
            hash *= getvRolNombre().hashCode();
        }
        if (getiRolTipo() != null) {
            hash *= getiRolTipo().hashCode();
        }
        if (getdRolFecregistra() != null) {
            hash *= getdRolFecregistra().hashCode();
        }
        if (getdRolFecmodifica() != null) {
            hash *= getdRolFecmodifica().hashCode();
        }
        if (getvRolDesusuregistra() != null) {
            hash *= getvRolDesusuregistra().hashCode();
        }
        if (getvRolDesusumodifica() != null) {
            hash *= getvRolDesusumodifica().hashCode();
        }
        if (getvRolDesipregistra() != null) {
            hash *= getvRolDesipregistra().hashCode();
        }
        if (getvRolDesipmodifica() != null) {
            hash *= getvRolDesipmodifica().hashCode();
        }
        if (getiRolEstado() != null) {
            hash *= getiRolEstado().hashCode();
        }
        return hash;
    }
    
/** Atributos Adicionales **/
	
	private List<RolOpcion> opcionesPorRol;

	public List<RolOpcion> getOpcionesPorRol() {
		return opcionesPorRol;
	}

	public void setOpcionesPorRol(List<RolOpcion> opcionesPorRol) {
		this.opcionesPorRol = opcionesPorRol;
	}
}