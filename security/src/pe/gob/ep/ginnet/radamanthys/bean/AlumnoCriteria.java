package pe.gob.ep.ginnet.radamanthys.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public AlumnoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    protected AlumnoCriteria(AlumnoCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
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
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_alumno
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_alumno
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

        public Criteria andCodPersonaIsNull() {
            addCriterion("cod_persona is null");
            return this;
        }

        public Criteria andCodPersonaIsNotNull() {
            addCriterion("cod_persona is not null");
            return this;
        }

        public Criteria andCodPersonaEqualTo(Integer value) {
            addCriterion("cod_persona =", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaNotEqualTo(Integer value) {
            addCriterion("cod_persona <>", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaGreaterThan(Integer value) {
            addCriterion("cod_persona >", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cod_persona >=", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaLessThan(Integer value) {
            addCriterion("cod_persona <", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaLessThanOrEqualTo(Integer value) {
            addCriterion("cod_persona <=", value, "codPersona");
            return this;
        }

        public Criteria andCodPersonaIn(List<Integer> values) {
            addCriterion("cod_persona in", values, "codPersona");
            return this;
        }

        public Criteria andCodPersonaNotIn(List<Integer> values) {
            addCriterion("cod_persona not in", values, "codPersona");
            return this;
        }

        public Criteria andCodPersonaBetween(Integer value1, Integer value2) {
            addCriterion("cod_persona between", value1, value2, "codPersona");
            return this;
        }

        public Criteria andCodPersonaNotBetween(Integer value1, Integer value2) {
            addCriterion("cod_persona not between", value1, value2, "codPersona");
            return this;
        }

        public Criteria andFechaNacimientoIsNull() {
            addCriterion("fecha_nacimiento is null");
            return this;
        }

        public Criteria andFechaNacimientoIsNotNull() {
            addCriterion("fecha_nacimiento is not null");
            return this;
        }

        public Criteria andFechaNacimientoEqualTo(Date value) {
            addCriterion("fecha_nacimiento =", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoNotEqualTo(Date value) {
            addCriterion("fecha_nacimiento <>", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoGreaterThan(Date value) {
            addCriterion("fecha_nacimiento >", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_nacimiento >=", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoLessThan(Date value) {
            addCriterion("fecha_nacimiento <", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoLessThanOrEqualTo(Date value) {
            addCriterion("fecha_nacimiento <=", value, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoIn(List<Date> values) {
            addCriterion("fecha_nacimiento in", values, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoNotIn(List<Date> values) {
            addCriterion("fecha_nacimiento not in", values, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoBetween(Date value1, Date value2) {
            addCriterion("fecha_nacimiento between", value1, value2, "fechaNacimiento");
            return this;
        }

        public Criteria andFechaNacimientoNotBetween(Date value1, Date value2) {
            addCriterion("fecha_nacimiento not between", value1, value2, "fechaNacimiento");
            return this;
        }

        public Criteria andTelefono1IsNull() {
            addCriterion("telefono1 is null");
            return this;
        }

        public Criteria andTelefono1IsNotNull() {
            addCriterion("telefono1 is not null");
            return this;
        }

        public Criteria andTelefono1EqualTo(String value) {
            addCriterion("telefono1 =", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1NotEqualTo(String value) {
            addCriterion("telefono1 <>", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1GreaterThan(String value) {
            addCriterion("telefono1 >", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1GreaterThanOrEqualTo(String value) {
            addCriterion("telefono1 >=", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1LessThan(String value) {
            addCriterion("telefono1 <", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1LessThanOrEqualTo(String value) {
            addCriterion("telefono1 <=", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1Like(String value) {
            addCriterion("telefono1 like", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1NotLike(String value) {
            addCriterion("telefono1 not like", value, "telefono1");
            return this;
        }

        public Criteria andTelefono1In(List<String> values) {
            addCriterion("telefono1 in", values, "telefono1");
            return this;
        }

        public Criteria andTelefono1NotIn(List<String> values) {
            addCriterion("telefono1 not in", values, "telefono1");
            return this;
        }

        public Criteria andTelefono1Between(String value1, String value2) {
            addCriterion("telefono1 between", value1, value2, "telefono1");
            return this;
        }

        public Criteria andTelefono1NotBetween(String value1, String value2) {
            addCriterion("telefono1 not between", value1, value2, "telefono1");
            return this;
        }

        public Criteria andTelefono2IsNull() {
            addCriterion("telefono2 is null");
            return this;
        }

        public Criteria andTelefono2IsNotNull() {
            addCriterion("telefono2 is not null");
            return this;
        }

        public Criteria andTelefono2EqualTo(String value) {
            addCriterion("telefono2 =", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2NotEqualTo(String value) {
            addCriterion("telefono2 <>", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2GreaterThan(String value) {
            addCriterion("telefono2 >", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2GreaterThanOrEqualTo(String value) {
            addCriterion("telefono2 >=", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2LessThan(String value) {
            addCriterion("telefono2 <", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2LessThanOrEqualTo(String value) {
            addCriterion("telefono2 <=", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2Like(String value) {
            addCriterion("telefono2 like", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2NotLike(String value) {
            addCriterion("telefono2 not like", value, "telefono2");
            return this;
        }

        public Criteria andTelefono2In(List<String> values) {
            addCriterion("telefono2 in", values, "telefono2");
            return this;
        }

        public Criteria andTelefono2NotIn(List<String> values) {
            addCriterion("telefono2 not in", values, "telefono2");
            return this;
        }

        public Criteria andTelefono2Between(String value1, String value2) {
            addCriterion("telefono2 between", value1, value2, "telefono2");
            return this;
        }

        public Criteria andTelefono2NotBetween(String value1, String value2) {
            addCriterion("telefono2 not between", value1, value2, "telefono2");
            return this;
        }
    }
}