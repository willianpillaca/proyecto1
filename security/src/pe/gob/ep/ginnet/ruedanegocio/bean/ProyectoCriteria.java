package pe.gob.ep.ginnet.ruedanegocio.bean;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ProyectoCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public ProyectoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    protected ProyectoCriteria(ProyectoCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table WILLIAN.CTRL_MANT_PROYECTO
     *
     * @ibatorgenerated
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdProyectoIsNull() {
            addCriterion("ID_PROYECTO is null");
            return this;
        }

        public Criteria andIdProyectoIsNotNull() {
            addCriterion("ID_PROYECTO is not null");
            return this;
        }

        public Criteria andIdProyectoEqualTo(Integer value) {
            addCriterion("ID_PROYECTO =", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoNotEqualTo(Integer value) {
            addCriterion("ID_PROYECTO <>", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoGreaterThan(Integer value) {
            addCriterion("ID_PROYECTO >", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_PROYECTO >=", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoLessThan(Integer value) {
            addCriterion("ID_PROYECTO <", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoLessThanOrEqualTo(Integer value) {
            addCriterion("ID_PROYECTO <=", value, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoIn(List<Integer> values) {
            addCriterion("ID_PROYECTO in", values, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoNotIn(List<Integer> values) {
            addCriterion("ID_PROYECTO not in", values, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoBetween(Integer value1, Integer value2) {
            addCriterion("ID_PROYECTO between", value1, value2, "idProyecto");
            return this;
        }

        public Criteria andIdProyectoNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_PROYECTO not between", value1, value2, "idProyecto");
            return this;
        }

        public Criteria andNombreProyectoIsNull() {
            addCriterion("NOMBRE_PROYECTO is null");
            return this;
        }

        public Criteria andNombreProyectoIsNotNull() {
            addCriterion("NOMBRE_PROYECTO is not null");
            return this;
        }

        public Criteria andNombreProyectoEqualTo(String value) {
            addCriterion("NOMBRE_PROYECTO =", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoNotEqualTo(String value) {
            addCriterion("NOMBRE_PROYECTO <>", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoGreaterThan(String value) {
            addCriterion("NOMBRE_PROYECTO >", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRE_PROYECTO >=", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoLessThan(String value) {
            addCriterion("NOMBRE_PROYECTO <", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoLessThanOrEqualTo(String value) {
            addCriterion("NOMBRE_PROYECTO <=", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoLike(String value) {
            addCriterion("NOMBRE_PROYECTO like", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoNotLike(String value) {
            addCriterion("NOMBRE_PROYECTO not like", value, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoIn(List<String> values) {
            addCriterion("NOMBRE_PROYECTO in", values, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoNotIn(List<String> values) {
            addCriterion("NOMBRE_PROYECTO not in", values, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoBetween(String value1, String value2) {
            addCriterion("NOMBRE_PROYECTO between", value1, value2, "nombreProyecto");
            return this;
        }

        public Criteria andNombreProyectoNotBetween(String value1, String value2) {
            addCriterion("NOMBRE_PROYECTO not between", value1, value2, "nombreProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoIsNull() {
            addCriterion("DESCRIPCION_PROYECTO is null");
            return this;
        }

        public Criteria andDescripcionProyectoIsNotNull() {
            addCriterion("DESCRIPCION_PROYECTO is not null");
            return this;
        }

        public Criteria andDescripcionProyectoEqualTo(String value) {
            addCriterion("DESCRIPCION_PROYECTO =", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoNotEqualTo(String value) {
            addCriterion("DESCRIPCION_PROYECTO <>", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoGreaterThan(String value) {
            addCriterion("DESCRIPCION_PROYECTO >", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_PROYECTO >=", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoLessThan(String value) {
            addCriterion("DESCRIPCION_PROYECTO <", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION_PROYECTO <=", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoLike(String value) {
            addCriterion("DESCRIPCION_PROYECTO like", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoNotLike(String value) {
            addCriterion("DESCRIPCION_PROYECTO not like", value, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoIn(List<String> values) {
            addCriterion("DESCRIPCION_PROYECTO in", values, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoNotIn(List<String> values) {
            addCriterion("DESCRIPCION_PROYECTO not in", values, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_PROYECTO between", value1, value2, "descripcionProyecto");
            return this;
        }

        public Criteria andDescripcionProyectoNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION_PROYECTO not between", value1, value2, "descripcionProyecto");
            return this;
        }

        public Criteria andEstadoProyectoIsNull() {
            addCriterion("ESTADO_PROYECTO is null");
            return this;
        }

        public Criteria andEstadoProyectoIsNotNull() {
            addCriterion("ESTADO_PROYECTO is not null");
            return this;
        }

        public Criteria andEstadoProyectoEqualTo(Integer value) {
            addCriterion("ESTADO_PROYECTO =", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoNotEqualTo(Integer value) {
            addCriterion("ESTADO_PROYECTO <>", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoGreaterThan(Integer value) {
            addCriterion("ESTADO_PROYECTO >", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ESTADO_PROYECTO >=", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoLessThan(Integer value) {
            addCriterion("ESTADO_PROYECTO <", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoLessThanOrEqualTo(Integer value) {
            addCriterion("ESTADO_PROYECTO <=", value, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoIn(List<Integer> values) {
            addCriterion("ESTADO_PROYECTO in", values, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoNotIn(List<Integer> values) {
            addCriterion("ESTADO_PROYECTO not in", values, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoBetween(Integer value1, Integer value2) {
            addCriterion("ESTADO_PROYECTO between", value1, value2, "estadoProyecto");
            return this;
        }

        public Criteria andEstadoProyectoNotBetween(Integer value1, Integer value2) {
            addCriterion("ESTADO_PROYECTO not between", value1, value2, "estadoProyecto");
            return this;
        }

        public Criteria andFechaDefinicionIsNull() {
            addCriterion("FECHA_DEFINICION is null");
            return this;
        }

        public Criteria andFechaDefinicionIsNotNull() {
            addCriterion("FECHA_DEFINICION is not null");
            return this;
        }

        public Criteria andFechaDefinicionEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION =", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION <>", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionGreaterThan(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION >", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION >=", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionLessThan(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION <", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_DEFINICION <=", value, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA_DEFINICION in", values, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA_DEFINICION not in", values, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA_DEFINICION between", value1, value2, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaDefinicionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA_DEFINICION not between", value1, value2, "fechaDefinicion");
            return this;
        }

        public Criteria andFechaCierreIsNull() {
            addCriterion("FECHA_CIERRE is null");
            return this;
        }

        public Criteria andFechaCierreIsNotNull() {
            addCriterion("FECHA_CIERRE is not null");
            return this;
        }

        public Criteria andFechaCierreEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE =", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE <>", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreGreaterThan(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE >", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE >=", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreLessThan(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE <", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA_CIERRE <=", value, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA_CIERRE in", values, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA_CIERRE not in", values, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA_CIERRE between", value1, value2, "fechaCierre");
            return this;
        }

        public Criteria andFechaCierreNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA_CIERRE not between", value1, value2, "fechaCierre");
            return this;
        }

        public Criteria andNumeroParticipantesIsNull() {
            addCriterion("NUMERO_PARTICIPANTES is null");
            return this;
        }

        public Criteria andNumeroParticipantesIsNotNull() {
            addCriterion("NUMERO_PARTICIPANTES is not null");
            return this;
        }

        public Criteria andNumeroParticipantesEqualTo(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES =", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesNotEqualTo(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES <>", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesGreaterThan(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES >", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES >=", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesLessThan(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES <", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesLessThanOrEqualTo(Integer value) {
            addCriterion("NUMERO_PARTICIPANTES <=", value, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesIn(List<Integer> values) {
            addCriterion("NUMERO_PARTICIPANTES in", values, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesNotIn(List<Integer> values) {
            addCriterion("NUMERO_PARTICIPANTES not in", values, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesBetween(Integer value1, Integer value2) {
            addCriterion("NUMERO_PARTICIPANTES between", value1, value2, "numeroParticipantes");
            return this;
        }

        public Criteria andNumeroParticipantesNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMERO_PARTICIPANTES not between", value1, value2, "numeroParticipantes");
            return this;
        }

        public Criteria andTipoProyectoIsNull() {
            addCriterion("TIPO_PROYECTO is null");
            return this;
        }

        public Criteria andTipoProyectoIsNotNull() {
            addCriterion("TIPO_PROYECTO is not null");
            return this;
        }

        public Criteria andTipoProyectoEqualTo(Integer value) {
            addCriterion("TIPO_PROYECTO =", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoNotEqualTo(Integer value) {
            addCriterion("TIPO_PROYECTO <>", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoGreaterThan(Integer value) {
            addCriterion("TIPO_PROYECTO >", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIPO_PROYECTO >=", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoLessThan(Integer value) {
            addCriterion("TIPO_PROYECTO <", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoLessThanOrEqualTo(Integer value) {
            addCriterion("TIPO_PROYECTO <=", value, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoIn(List<Integer> values) {
            addCriterion("TIPO_PROYECTO in", values, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoNotIn(List<Integer> values) {
            addCriterion("TIPO_PROYECTO not in", values, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoBetween(Integer value1, Integer value2) {
            addCriterion("TIPO_PROYECTO between", value1, value2, "tipoProyecto");
            return this;
        }

        public Criteria andTipoProyectoNotBetween(Integer value1, Integer value2) {
            addCriterion("TIPO_PROYECTO not between", value1, value2, "tipoProyecto");
            return this;
        }

        public Criteria andTipoRetornoIsNull() {
            addCriterion("TIPO_RETORNO is null");
            return this;
        }

        public Criteria andTipoRetornoIsNotNull() {
            addCriterion("TIPO_RETORNO is not null");
            return this;
        }

        public Criteria andTipoRetornoEqualTo(Integer value) {
            addCriterion("TIPO_RETORNO =", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoNotEqualTo(Integer value) {
            addCriterion("TIPO_RETORNO <>", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoGreaterThan(Integer value) {
            addCriterion("TIPO_RETORNO >", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIPO_RETORNO >=", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoLessThan(Integer value) {
            addCriterion("TIPO_RETORNO <", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoLessThanOrEqualTo(Integer value) {
            addCriterion("TIPO_RETORNO <=", value, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoIn(List<Integer> values) {
            addCriterion("TIPO_RETORNO in", values, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoNotIn(List<Integer> values) {
            addCriterion("TIPO_RETORNO not in", values, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoBetween(Integer value1, Integer value2) {
            addCriterion("TIPO_RETORNO between", value1, value2, "tipoRetorno");
            return this;
        }

        public Criteria andTipoRetornoNotBetween(Integer value1, Integer value2) {
            addCriterion("TIPO_RETORNO not between", value1, value2, "tipoRetorno");
            return this;
        }

        public Criteria andTiempoDevolucionIsNull() {
            addCriterion("TIEMPO_DEVOLUCION is null");
            return this;
        }

        public Criteria andTiempoDevolucionIsNotNull() {
            addCriterion("TIEMPO_DEVOLUCION is not null");
            return this;
        }

        public Criteria andTiempoDevolucionEqualTo(String value) {
            addCriterion("TIEMPO_DEVOLUCION =", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionNotEqualTo(String value) {
            addCriterion("TIEMPO_DEVOLUCION <>", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionGreaterThan(String value) {
            addCriterion("TIEMPO_DEVOLUCION >", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionGreaterThanOrEqualTo(String value) {
            addCriterion("TIEMPO_DEVOLUCION >=", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionLessThan(String value) {
            addCriterion("TIEMPO_DEVOLUCION <", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionLessThanOrEqualTo(String value) {
            addCriterion("TIEMPO_DEVOLUCION <=", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionLike(String value) {
            addCriterion("TIEMPO_DEVOLUCION like", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionNotLike(String value) {
            addCriterion("TIEMPO_DEVOLUCION not like", value, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionIn(List<String> values) {
            addCriterion("TIEMPO_DEVOLUCION in", values, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionNotIn(List<String> values) {
            addCriterion("TIEMPO_DEVOLUCION not in", values, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionBetween(String value1, String value2) {
            addCriterion("TIEMPO_DEVOLUCION between", value1, value2, "tiempoDevolucion");
            return this;
        }

        public Criteria andTiempoDevolucionNotBetween(String value1, String value2) {
            addCriterion("TIEMPO_DEVOLUCION not between", value1, value2, "tiempoDevolucion");
            return this;
        }
    }
}