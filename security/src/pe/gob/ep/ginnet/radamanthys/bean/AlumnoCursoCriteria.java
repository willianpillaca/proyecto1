package pe.gob.ep.ginnet.radamanthys.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoCursoCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public AlumnoCursoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    protected AlumnoCursoCriteria(AlumnoCursoCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
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
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno_curso
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_alumno_curso
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andCodAlumnoIsNull() {
            addCriterion("cod_alumno is null");
            return this;
        }

        public Criteria andCodAlumnoIsNotNull() {
            addCriterion("cod_alumno is not null");
            return this;
        }

        public Criteria andCodAlumnoEqualTo(Integer value) {
            addCriterion("cod_alumno =", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoNotEqualTo(Integer value) {
            addCriterion("cod_alumno <>", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoGreaterThan(Integer value) {
            addCriterion("cod_alumno >", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cod_alumno >=", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoLessThan(Integer value) {
            addCriterion("cod_alumno <", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoLessThanOrEqualTo(Integer value) {
            addCriterion("cod_alumno <=", value, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoIn(List<Integer> values) {
            addCriterion("cod_alumno in", values, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoNotIn(List<Integer> values) {
            addCriterion("cod_alumno not in", values, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoBetween(Integer value1, Integer value2) {
            addCriterion("cod_alumno between", value1, value2, "codAlumno");
            return this;
        }

        public Criteria andCodAlumnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cod_alumno not between", value1, value2, "codAlumno");
            return this;
        }

        public Criteria andNombreAlumnoIsNull() {
            addCriterion("nombre_alumno is null");
            return this;
        }

        public Criteria andNombreAlumnoIsNotNull() {
            addCriterion("nombre_alumno is not null");
            return this;
        }

        public Criteria andNombreAlumnoEqualTo(String value) {
            addCriterion("nombre_alumno =", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoNotEqualTo(String value) {
            addCriterion("nombre_alumno <>", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoGreaterThan(String value) {
            addCriterion("nombre_alumno >", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_alumno >=", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoLessThan(String value) {
            addCriterion("nombre_alumno <", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoLessThanOrEqualTo(String value) {
            addCriterion("nombre_alumno <=", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoLike(String value) {
            addCriterion("nombre_alumno like", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoNotLike(String value) {
            addCriterion("nombre_alumno not like", value, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoIn(List<String> values) {
            addCriterion("nombre_alumno in", values, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoNotIn(List<String> values) {
            addCriterion("nombre_alumno not in", values, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoBetween(String value1, String value2) {
            addCriterion("nombre_alumno between", value1, value2, "nombreAlumno");
            return this;
        }

        public Criteria andNombreAlumnoNotBetween(String value1, String value2) {
            addCriterion("nombre_alumno not between", value1, value2, "nombreAlumno");
            return this;
        }

        public Criteria andCodCursoIsNull() {
            addCriterion("cod_curso is null");
            return this;
        }

        public Criteria andCodCursoIsNotNull() {
            addCriterion("cod_curso is not null");
            return this;
        }

        public Criteria andCodCursoEqualTo(String value) {
            addCriterion("cod_curso =", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoNotEqualTo(String value) {
            addCriterion("cod_curso <>", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoGreaterThan(String value) {
            addCriterion("cod_curso >", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoGreaterThanOrEqualTo(String value) {
            addCriterion("cod_curso >=", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoLessThan(String value) {
            addCriterion("cod_curso <", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoLessThanOrEqualTo(String value) {
            addCriterion("cod_curso <=", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoLike(String value) {
            addCriterion("cod_curso like", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoNotLike(String value) {
            addCriterion("cod_curso not like", value, "codCurso");
            return this;
        }

        public Criteria andCodCursoIn(List<String> values) {
            addCriterion("cod_curso in", values, "codCurso");
            return this;
        }

        public Criteria andCodCursoNotIn(List<String> values) {
            addCriterion("cod_curso not in", values, "codCurso");
            return this;
        }

        public Criteria andCodCursoBetween(String value1, String value2) {
            addCriterion("cod_curso between", value1, value2, "codCurso");
            return this;
        }

        public Criteria andCodCursoNotBetween(String value1, String value2) {
            addCriterion("cod_curso not between", value1, value2, "codCurso");
            return this;
        }

        public Criteria andNombreCursoIsNull() {
            addCriterion("nombre_curso is null");
            return this;
        }

        public Criteria andNombreCursoIsNotNull() {
            addCriterion("nombre_curso is not null");
            return this;
        }

        public Criteria andNombreCursoEqualTo(String value) {
            addCriterion("nombre_curso =", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoNotEqualTo(String value) {
            addCriterion("nombre_curso <>", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoGreaterThan(String value) {
            addCriterion("nombre_curso >", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_curso >=", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoLessThan(String value) {
            addCriterion("nombre_curso <", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoLessThanOrEqualTo(String value) {
            addCriterion("nombre_curso <=", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoLike(String value) {
            addCriterion("nombre_curso like", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoNotLike(String value) {
            addCriterion("nombre_curso not like", value, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoIn(List<String> values) {
            addCriterion("nombre_curso in", values, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoNotIn(List<String> values) {
            addCriterion("nombre_curso not in", values, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoBetween(String value1, String value2) {
            addCriterion("nombre_curso between", value1, value2, "nombreCurso");
            return this;
        }

        public Criteria andNombreCursoNotBetween(String value1, String value2) {
            addCriterion("nombre_curso not between", value1, value2, "nombreCurso");
            return this;
        }

        public Criteria andTipoPagoIsNull() {
            addCriterion("tipo_pago is null");
            return this;
        }

        public Criteria andTipoPagoIsNotNull() {
            addCriterion("tipo_pago is not null");
            return this;
        }

        public Criteria andTipoPagoEqualTo(Integer value) {
            addCriterion("tipo_pago =", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoNotEqualTo(Integer value) {
            addCriterion("tipo_pago <>", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoGreaterThan(Integer value) {
            addCriterion("tipo_pago >", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_pago >=", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoLessThan(Integer value) {
            addCriterion("tipo_pago <", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_pago <=", value, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoIn(List<Integer> values) {
            addCriterion("tipo_pago in", values, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoNotIn(List<Integer> values) {
            addCriterion("tipo_pago not in", values, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoBetween(Integer value1, Integer value2) {
            addCriterion("tipo_pago between", value1, value2, "tipoPago");
            return this;
        }

        public Criteria andTipoPagoNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_pago not between", value1, value2, "tipoPago");
            return this;
        }

        public Criteria andEstadoPagoIsNull() {
            addCriterion("estado_pago is null");
            return this;
        }

        public Criteria andEstadoPagoIsNotNull() {
            addCriterion("estado_pago is not null");
            return this;
        }

        public Criteria andEstadoPagoEqualTo(Integer value) {
            addCriterion("estado_pago =", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoNotEqualTo(Integer value) {
            addCriterion("estado_pago <>", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoGreaterThan(Integer value) {
            addCriterion("estado_pago >", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoGreaterThanOrEqualTo(Integer value) {
            addCriterion("estado_pago >=", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoLessThan(Integer value) {
            addCriterion("estado_pago <", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoLessThanOrEqualTo(Integer value) {
            addCriterion("estado_pago <=", value, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoIn(List<Integer> values) {
            addCriterion("estado_pago in", values, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoNotIn(List<Integer> values) {
            addCriterion("estado_pago not in", values, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoBetween(Integer value1, Integer value2) {
            addCriterion("estado_pago between", value1, value2, "estadoPago");
            return this;
        }

        public Criteria andEstadoPagoNotBetween(Integer value1, Integer value2) {
            addCriterion("estado_pago not between", value1, value2, "estadoPago");
            return this;
        }

        public Criteria andFechaEvaluacionIsNull() {
            addCriterion("fecha_evaluacion is null");
            return this;
        }

        public Criteria andFechaEvaluacionIsNotNull() {
            addCriterion("fecha_evaluacion is not null");
            return this;
        }

        public Criteria andFechaEvaluacionEqualTo(Date value) {
            addCriterion("fecha_evaluacion =", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionNotEqualTo(Date value) {
            addCriterion("fecha_evaluacion <>", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionGreaterThan(Date value) {
            addCriterion("fecha_evaluacion >", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_evaluacion >=", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionLessThan(Date value) {
            addCriterion("fecha_evaluacion <", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionLessThanOrEqualTo(Date value) {
            addCriterion("fecha_evaluacion <=", value, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionIn(List<Date> values) {
            addCriterion("fecha_evaluacion in", values, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionNotIn(List<Date> values) {
            addCriterion("fecha_evaluacion not in", values, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionBetween(Date value1, Date value2) {
            addCriterion("fecha_evaluacion between", value1, value2, "fechaEvaluacion");
            return this;
        }

        public Criteria andFechaEvaluacionNotBetween(Date value1, Date value2) {
            addCriterion("fecha_evaluacion not between", value1, value2, "fechaEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionIsNull() {
            addCriterion("estado_evaluacion is null");
            return this;
        }

        public Criteria andEstadoEvaluacionIsNotNull() {
            addCriterion("estado_evaluacion is not null");
            return this;
        }

        public Criteria andEstadoEvaluacionEqualTo(Integer value) {
            addCriterion("estado_evaluacion =", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionNotEqualTo(Integer value) {
            addCriterion("estado_evaluacion <>", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionGreaterThan(Integer value) {
            addCriterion("estado_evaluacion >", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("estado_evaluacion >=", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionLessThan(Integer value) {
            addCriterion("estado_evaluacion <", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionLessThanOrEqualTo(Integer value) {
            addCriterion("estado_evaluacion <=", value, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionIn(List<Integer> values) {
            addCriterion("estado_evaluacion in", values, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionNotIn(List<Integer> values) {
            addCriterion("estado_evaluacion not in", values, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionBetween(Integer value1, Integer value2) {
            addCriterion("estado_evaluacion between", value1, value2, "estadoEvaluacion");
            return this;
        }

        public Criteria andEstadoEvaluacionNotBetween(Integer value1, Integer value2) {
            addCriterion("estado_evaluacion not between", value1, value2, "estadoEvaluacion");
            return this;
        }

        public Criteria andNotaFinalIsNull() {
            addCriterion("nota_final is null");
            return this;
        }

        public Criteria andNotaFinalIsNotNull() {
            addCriterion("nota_final is not null");
            return this;
        }

        public Criteria andNotaFinalEqualTo(Integer value) {
            addCriterion("nota_final =", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalNotEqualTo(Integer value) {
            addCriterion("nota_final <>", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalGreaterThan(Integer value) {
            addCriterion("nota_final >", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalGreaterThanOrEqualTo(Integer value) {
            addCriterion("nota_final >=", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalLessThan(Integer value) {
            addCriterion("nota_final <", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalLessThanOrEqualTo(Integer value) {
            addCriterion("nota_final <=", value, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalIn(List<Integer> values) {
            addCriterion("nota_final in", values, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalNotIn(List<Integer> values) {
            addCriterion("nota_final not in", values, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalBetween(Integer value1, Integer value2) {
            addCriterion("nota_final between", value1, value2, "notaFinal");
            return this;
        }

        public Criteria andNotaFinalNotBetween(Integer value1, Integer value2) {
            addCriterion("nota_final not between", value1, value2, "notaFinal");
            return this;
        }

        public Criteria andReclamoIsNull() {
            addCriterion("reclamo is null");
            return this;
        }

        public Criteria andReclamoIsNotNull() {
            addCriterion("reclamo is not null");
            return this;
        }

        public Criteria andReclamoEqualTo(String value) {
            addCriterion("reclamo =", value, "reclamo");
            return this;
        }

        public Criteria andReclamoNotEqualTo(String value) {
            addCriterion("reclamo <>", value, "reclamo");
            return this;
        }

        public Criteria andReclamoGreaterThan(String value) {
            addCriterion("reclamo >", value, "reclamo");
            return this;
        }

        public Criteria andReclamoGreaterThanOrEqualTo(String value) {
            addCriterion("reclamo >=", value, "reclamo");
            return this;
        }

        public Criteria andReclamoLessThan(String value) {
            addCriterion("reclamo <", value, "reclamo");
            return this;
        }

        public Criteria andReclamoLessThanOrEqualTo(String value) {
            addCriterion("reclamo <=", value, "reclamo");
            return this;
        }

        public Criteria andReclamoLike(String value) {
            addCriterion("reclamo like", value, "reclamo");
            return this;
        }

        public Criteria andReclamoNotLike(String value) {
            addCriterion("reclamo not like", value, "reclamo");
            return this;
        }

        public Criteria andReclamoIn(List<String> values) {
            addCriterion("reclamo in", values, "reclamo");
            return this;
        }

        public Criteria andReclamoNotIn(List<String> values) {
            addCriterion("reclamo not in", values, "reclamo");
            return this;
        }

        public Criteria andReclamoBetween(String value1, String value2) {
            addCriterion("reclamo between", value1, value2, "reclamo");
            return this;
        }

        public Criteria andReclamoNotBetween(String value1, String value2) {
            addCriterion("reclamo not between", value1, value2, "reclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoIsNull() {
            addCriterion("nota_final_reclamo is null");
            return this;
        }

        public Criteria andNotaFinalReclamoIsNotNull() {
            addCriterion("nota_final_reclamo is not null");
            return this;
        }

        public Criteria andNotaFinalReclamoEqualTo(Integer value) {
            addCriterion("nota_final_reclamo =", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoNotEqualTo(Integer value) {
            addCriterion("nota_final_reclamo <>", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoGreaterThan(Integer value) {
            addCriterion("nota_final_reclamo >", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoGreaterThanOrEqualTo(Integer value) {
            addCriterion("nota_final_reclamo >=", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoLessThan(Integer value) {
            addCriterion("nota_final_reclamo <", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoLessThanOrEqualTo(Integer value) {
            addCriterion("nota_final_reclamo <=", value, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoIn(List<Integer> values) {
            addCriterion("nota_final_reclamo in", values, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoNotIn(List<Integer> values) {
            addCriterion("nota_final_reclamo not in", values, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoBetween(Integer value1, Integer value2) {
            addCriterion("nota_final_reclamo between", value1, value2, "notaFinalReclamo");
            return this;
        }

        public Criteria andNotaFinalReclamoNotBetween(Integer value1, Integer value2) {
            addCriterion("nota_final_reclamo not between", value1, value2, "notaFinalReclamo");
            return this;
        }
    }
}