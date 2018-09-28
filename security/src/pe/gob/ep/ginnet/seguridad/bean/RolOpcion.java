package pe.gob.ep.ginnet.seguridad.bean;

public class RolOpcion {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ID
     *
     * @ibatorgenerated
     */
    private Integer iRolxopcionId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ROL_ID
     *
     * @ibatorgenerated
     */
    private Integer iRolxopcionRolId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ctrl_seg_rolxopcion.I_ROLXOPCION_OPCION_ID
     *
     * @ibatorgenerated
     */
    private Integer iRolxopcionOpcionId;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ID
     *
     * @return the value of ctrl_seg_rolxopcion.I_ROLXOPCION_ID
     *
     * @ibatorgenerated
     */
    public Integer getiRolxopcionId() {
        return iRolxopcionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ID
     *
     * @param iRolxopcionId the value for ctrl_seg_rolxopcion.I_ROLXOPCION_ID
     *
     * @ibatorgenerated
     */
    public void setiRolxopcionId(Integer iRolxopcionId) {
        this.iRolxopcionId = iRolxopcionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ROL_ID
     *
     * @return the value of ctrl_seg_rolxopcion.I_ROLXOPCION_ROL_ID
     *
     * @ibatorgenerated
     */
    public Integer getiRolxopcionRolId() {
        return iRolxopcionRolId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_ROL_ID
     *
     * @param iRolxopcionRolId the value for ctrl_seg_rolxopcion.I_ROLXOPCION_ROL_ID
     *
     * @ibatorgenerated
     */
    public void setiRolxopcionRolId(Integer iRolxopcionRolId) {
        this.iRolxopcionRolId = iRolxopcionRolId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_OPCION_ID
     *
     * @return the value of ctrl_seg_rolxopcion.I_ROLXOPCION_OPCION_ID
     *
     * @ibatorgenerated
     */
    public Integer getiRolxopcionOpcionId() {
        return iRolxopcionOpcionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ctrl_seg_rolxopcion.I_ROLXOPCION_OPCION_ID
     *
     * @param iRolxopcionOpcionId the value for ctrl_seg_rolxopcion.I_ROLXOPCION_OPCION_ID
     *
     * @ibatorgenerated
     */
    public void setiRolxopcionOpcionId(Integer iRolxopcionOpcionId) {
        this.iRolxopcionOpcionId = iRolxopcionOpcionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rolxopcion
     *
     * @ibatorgenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof RolOpcion)) {
            return false;
        }
        RolOpcion other = (RolOpcion) that;
        return this.getiRolxopcionId() == null ? other == null : this.getiRolxopcionId().equals(other.getiRolxopcionId())
            && this.getiRolxopcionRolId() == null ? other == null : this.getiRolxopcionRolId().equals(other.getiRolxopcionRolId())
            && this.getiRolxopcionOpcionId() == null ? other == null : this.getiRolxopcionOpcionId().equals(other.getiRolxopcionOpcionId());
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rolxopcion
     *
     * @ibatorgenerated
     */
    @Override
    public int hashCode() {
        int hash = 23;
        if (getiRolxopcionId() != null) {
            hash *= getiRolxopcionId().hashCode();
        }
        if (getiRolxopcionRolId() != null) {
            hash *= getiRolxopcionRolId().hashCode();
        }
        if (getiRolxopcionOpcionId() != null) {
            hash *= getiRolxopcionOpcionId().hashCode();
        }
        return hash;
    }
    
    /**Atributos Adicionales**/
	private Rol rol;
	private Opcion opcion;

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}
}