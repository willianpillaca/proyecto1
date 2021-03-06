package pe.gob.ep.ginnet.radamanthys.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlternativaCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public AlternativaCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    protected AlternativaCriteria(AlternativaCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
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
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alternativa
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_alternativa
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

        public Criteria andIdPreguntaIsNull() {
            addCriterion("id_pregunta is null");
            return this;
        }

        public Criteria andIdPreguntaIsNotNull() {
            addCriterion("id_pregunta is not null");
            return this;
        }

        public Criteria andIdPreguntaEqualTo(Integer value) {
            addCriterion("id_pregunta =", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaNotEqualTo(Integer value) {
            addCriterion("id_pregunta <>", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaGreaterThan(Integer value) {
            addCriterion("id_pregunta >", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_pregunta >=", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaLessThan(Integer value) {
            addCriterion("id_pregunta <", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaLessThanOrEqualTo(Integer value) {
            addCriterion("id_pregunta <=", value, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaIn(List<Integer> values) {
            addCriterion("id_pregunta in", values, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaNotIn(List<Integer> values) {
            addCriterion("id_pregunta not in", values, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaBetween(Integer value1, Integer value2) {
            addCriterion("id_pregunta between", value1, value2, "idPregunta");
            return this;
        }

        public Criteria andIdPreguntaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_pregunta not between", value1, value2, "idPregunta");
            return this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("descripcion is null");
            return this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("descripcion is not null");
            return this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("descripcion =", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("descripcion <>", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("descripcion >", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("descripcion >=", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("descripcion <", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("descripcion <=", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("descripcion like", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("descripcion not like", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("descripcion in", values, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("descripcion not in", values, "descripcion");
            return this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("descripcion between", value1, value2, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("descripcion not between", value1, value2, "descripcion");
            return this;
        }

        public Criteria andValorIsNull() {
            addCriterion("valor is null");
            return this;
        }

        public Criteria andValorIsNotNull() {
            addCriterion("valor is not null");
            return this;
        }

        public Criteria andValorEqualTo(String value) {
            addCriterion("valor =", value, "valor");
            return this;
        }

        public Criteria andValorNotEqualTo(String value) {
            addCriterion("valor <>", value, "valor");
            return this;
        }

        public Criteria andValorGreaterThan(String value) {
            addCriterion("valor >", value, "valor");
            return this;
        }

        public Criteria andValorGreaterThanOrEqualTo(String value) {
            addCriterion("valor >=", value, "valor");
            return this;
        }

        public Criteria andValorLessThan(String value) {
            addCriterion("valor <", value, "valor");
            return this;
        }

        public Criteria andValorLessThanOrEqualTo(String value) {
            addCriterion("valor <=", value, "valor");
            return this;
        }

        public Criteria andValorLike(String value) {
            addCriterion("valor like", value, "valor");
            return this;
        }

        public Criteria andValorNotLike(String value) {
            addCriterion("valor not like", value, "valor");
            return this;
        }

        public Criteria andValorIn(List<String> values) {
            addCriterion("valor in", values, "valor");
            return this;
        }

        public Criteria andValorNotIn(List<String> values) {
            addCriterion("valor not in", values, "valor");
            return this;
        }

        public Criteria andValorBetween(String value1, String value2) {
            addCriterion("valor between", value1, value2, "valor");
            return this;
        }

        public Criteria andValorNotBetween(String value1, String value2) {
            addCriterion("valor not between", value1, value2, "valor");
            return this;
        }

        public Criteria andRespuestaIsNull() {
            addCriterion("respuesta is null");
            return this;
        }

        public Criteria andRespuestaIsNotNull() {
            addCriterion("respuesta is not null");
            return this;
        }

        public Criteria andRespuestaEqualTo(Integer value) {
            addCriterion("respuesta =", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaNotEqualTo(Integer value) {
            addCriterion("respuesta <>", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaGreaterThan(Integer value) {
            addCriterion("respuesta >", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaGreaterThanOrEqualTo(Integer value) {
            addCriterion("respuesta >=", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaLessThan(Integer value) {
            addCriterion("respuesta <", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaLessThanOrEqualTo(Integer value) {
            addCriterion("respuesta <=", value, "respuesta");
            return this;
        }

        public Criteria andRespuestaIn(List<Integer> values) {
            addCriterion("respuesta in", values, "respuesta");
            return this;
        }

        public Criteria andRespuestaNotIn(List<Integer> values) {
            addCriterion("respuesta not in", values, "respuesta");
            return this;
        }

        public Criteria andRespuestaBetween(Integer value1, Integer value2) {
            addCriterion("respuesta between", value1, value2, "respuesta");
            return this;
        }

        public Criteria andRespuestaNotBetween(Integer value1, Integer value2) {
            addCriterion("respuesta not between", value1, value2, "respuesta");
            return this;
        }
    }
}