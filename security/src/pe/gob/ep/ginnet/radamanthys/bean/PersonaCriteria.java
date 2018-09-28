package pe.gob.ep.ginnet.radamanthys.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonaCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public PersonaCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    protected PersonaCriteria(PersonaCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
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
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tbl_persona
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tbl_persona
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

        public Criteria andCodigoIsNull() {
            addCriterion("codigo is null");
            return this;
        }

        public Criteria andCodigoIsNotNull() {
            addCriterion("codigo is not null");
            return this;
        }

        public Criteria andCodigoEqualTo(Integer value) {
            addCriterion("codigo =", value, "codigo");
            return this;
        }

        public Criteria andCodigoNotEqualTo(Integer value) {
            addCriterion("codigo <>", value, "codigo");
            return this;
        }

        public Criteria andCodigoGreaterThan(Integer value) {
            addCriterion("codigo >", value, "codigo");
            return this;
        }

        public Criteria andCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("codigo >=", value, "codigo");
            return this;
        }

        public Criteria andCodigoLessThan(Integer value) {
            addCriterion("codigo <", value, "codigo");
            return this;
        }

        public Criteria andCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("codigo <=", value, "codigo");
            return this;
        }

        public Criteria andCodigoIn(List<Integer> values) {
            addCriterion("codigo in", values, "codigo");
            return this;
        }

        public Criteria andCodigoNotIn(List<Integer> values) {
            addCriterion("codigo not in", values, "codigo");
            return this;
        }

        public Criteria andCodigoBetween(Integer value1, Integer value2) {
            addCriterion("codigo between", value1, value2, "codigo");
            return this;
        }

        public Criteria andCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("codigo not between", value1, value2, "codigo");
            return this;
        }

        public Criteria andNombresIsNull() {
            addCriterion("nombres is null");
            return this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("nombres is not null");
            return this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("nombres =", value, "nombres");
            return this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("nombres <>", value, "nombres");
            return this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("nombres >", value, "nombres");
            return this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nombres >=", value, "nombres");
            return this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("nombres <", value, "nombres");
            return this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("nombres <=", value, "nombres");
            return this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("nombres like", value, "nombres");
            return this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("nombres not like", value, "nombres");
            return this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("nombres in", values, "nombres");
            return this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("nombres not in", values, "nombres");
            return this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("nombres between", value1, value2, "nombres");
            return this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("nombres not between", value1, value2, "nombres");
            return this;
        }

        public Criteria andApaternoIsNull() {
            addCriterion("apaterno is null");
            return this;
        }

        public Criteria andApaternoIsNotNull() {
            addCriterion("apaterno is not null");
            return this;
        }

        public Criteria andApaternoEqualTo(String value) {
            addCriterion("apaterno =", value, "apaterno");
            return this;
        }

        public Criteria andApaternoNotEqualTo(String value) {
            addCriterion("apaterno <>", value, "apaterno");
            return this;
        }

        public Criteria andApaternoGreaterThan(String value) {
            addCriterion("apaterno >", value, "apaterno");
            return this;
        }

        public Criteria andApaternoGreaterThanOrEqualTo(String value) {
            addCriterion("apaterno >=", value, "apaterno");
            return this;
        }

        public Criteria andApaternoLessThan(String value) {
            addCriterion("apaterno <", value, "apaterno");
            return this;
        }

        public Criteria andApaternoLessThanOrEqualTo(String value) {
            addCriterion("apaterno <=", value, "apaterno");
            return this;
        }

        public Criteria andApaternoLike(String value) {
            addCriterion("apaterno like", value, "apaterno");
            return this;
        }

        public Criteria andApaternoNotLike(String value) {
            addCriterion("apaterno not like", value, "apaterno");
            return this;
        }

        public Criteria andApaternoIn(List<String> values) {
            addCriterion("apaterno in", values, "apaterno");
            return this;
        }

        public Criteria andApaternoNotIn(List<String> values) {
            addCriterion("apaterno not in", values, "apaterno");
            return this;
        }

        public Criteria andApaternoBetween(String value1, String value2) {
            addCriterion("apaterno between", value1, value2, "apaterno");
            return this;
        }

        public Criteria andApaternoNotBetween(String value1, String value2) {
            addCriterion("apaterno not between", value1, value2, "apaterno");
            return this;
        }

        public Criteria andAmaternoIsNull() {
            addCriterion("amaterno is null");
            return this;
        }

        public Criteria andAmaternoIsNotNull() {
            addCriterion("amaterno is not null");
            return this;
        }

        public Criteria andAmaternoEqualTo(String value) {
            addCriterion("amaterno =", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoNotEqualTo(String value) {
            addCriterion("amaterno <>", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoGreaterThan(String value) {
            addCriterion("amaterno >", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoGreaterThanOrEqualTo(String value) {
            addCriterion("amaterno >=", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoLessThan(String value) {
            addCriterion("amaterno <", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoLessThanOrEqualTo(String value) {
            addCriterion("amaterno <=", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoLike(String value) {
            addCriterion("amaterno like", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoNotLike(String value) {
            addCriterion("amaterno not like", value, "amaterno");
            return this;
        }

        public Criteria andAmaternoIn(List<String> values) {
            addCriterion("amaterno in", values, "amaterno");
            return this;
        }

        public Criteria andAmaternoNotIn(List<String> values) {
            addCriterion("amaterno not in", values, "amaterno");
            return this;
        }

        public Criteria andAmaternoBetween(String value1, String value2) {
            addCriterion("amaterno between", value1, value2, "amaterno");
            return this;
        }

        public Criteria andAmaternoNotBetween(String value1, String value2) {
            addCriterion("amaterno not between", value1, value2, "amaterno");
            return this;
        }

        public Criteria andTipoIsNull() {
            addCriterion("tipo is null");
            return this;
        }

        public Criteria andTipoIsNotNull() {
            addCriterion("tipo is not null");
            return this;
        }

        public Criteria andTipoEqualTo(Integer value) {
            addCriterion("tipo =", value, "tipo");
            return this;
        }

        public Criteria andTipoNotEqualTo(Integer value) {
            addCriterion("tipo <>", value, "tipo");
            return this;
        }

        public Criteria andTipoGreaterThan(Integer value) {
            addCriterion("tipo >", value, "tipo");
            return this;
        }

        public Criteria andTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo >=", value, "tipo");
            return this;
        }

        public Criteria andTipoLessThan(Integer value) {
            addCriterion("tipo <", value, "tipo");
            return this;
        }

        public Criteria andTipoLessThanOrEqualTo(Integer value) {
            addCriterion("tipo <=", value, "tipo");
            return this;
        }

        public Criteria andTipoIn(List<Integer> values) {
            addCriterion("tipo in", values, "tipo");
            return this;
        }

        public Criteria andTipoNotIn(List<Integer> values) {
            addCriterion("tipo not in", values, "tipo");
            return this;
        }

        public Criteria andTipoBetween(Integer value1, Integer value2) {
            addCriterion("tipo between", value1, value2, "tipo");
            return this;
        }

        public Criteria andTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo not between", value1, value2, "tipo");
            return this;
        }

        public Criteria andCorreoIsNull() {
            addCriterion("correo is null");
            return this;
        }

        public Criteria andCorreoIsNotNull() {
            addCriterion("correo is not null");
            return this;
        }

        public Criteria andCorreoEqualTo(String value) {
            addCriterion("correo =", value, "correo");
            return this;
        }

        public Criteria andCorreoNotEqualTo(String value) {
            addCriterion("correo <>", value, "correo");
            return this;
        }

        public Criteria andCorreoGreaterThan(String value) {
            addCriterion("correo >", value, "correo");
            return this;
        }

        public Criteria andCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("correo >=", value, "correo");
            return this;
        }

        public Criteria andCorreoLessThan(String value) {
            addCriterion("correo <", value, "correo");
            return this;
        }

        public Criteria andCorreoLessThanOrEqualTo(String value) {
            addCriterion("correo <=", value, "correo");
            return this;
        }

        public Criteria andCorreoLike(String value) {
            addCriterion("correo like", value, "correo");
            return this;
        }

        public Criteria andCorreoNotLike(String value) {
            addCriterion("correo not like", value, "correo");
            return this;
        }

        public Criteria andCorreoIn(List<String> values) {
            addCriterion("correo in", values, "correo");
            return this;
        }

        public Criteria andCorreoNotIn(List<String> values) {
            addCriterion("correo not in", values, "correo");
            return this;
        }

        public Criteria andCorreoBetween(String value1, String value2) {
            addCriterion("correo between", value1, value2, "correo");
            return this;
        }

        public Criteria andCorreoNotBetween(String value1, String value2) {
            addCriterion("correo not between", value1, value2, "correo");
            return this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("login =", value, "login");
            return this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("login <>", value, "login");
            return this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("login like", value, "login");
            return this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("login not like", value, "login");
            return this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
            return this;
        }

        public Criteria andClaveIsNull() {
            addCriterion("clave is null");
            return this;
        }

        public Criteria andClaveIsNotNull() {
            addCriterion("clave is not null");
            return this;
        }

        public Criteria andClaveEqualTo(String value) {
            addCriterion("clave =", value, "clave");
            return this;
        }

        public Criteria andClaveNotEqualTo(String value) {
            addCriterion("clave <>", value, "clave");
            return this;
        }

        public Criteria andClaveGreaterThan(String value) {
            addCriterion("clave >", value, "clave");
            return this;
        }

        public Criteria andClaveGreaterThanOrEqualTo(String value) {
            addCriterion("clave >=", value, "clave");
            return this;
        }

        public Criteria andClaveLessThan(String value) {
            addCriterion("clave <", value, "clave");
            return this;
        }

        public Criteria andClaveLessThanOrEqualTo(String value) {
            addCriterion("clave <=", value, "clave");
            return this;
        }

        public Criteria andClaveLike(String value) {
            addCriterion("clave like", value, "clave");
            return this;
        }

        public Criteria andClaveNotLike(String value) {
            addCriterion("clave not like", value, "clave");
            return this;
        }

        public Criteria andClaveIn(List<String> values) {
            addCriterion("clave in", values, "clave");
            return this;
        }

        public Criteria andClaveNotIn(List<String> values) {
            addCriterion("clave not in", values, "clave");
            return this;
        }

        public Criteria andClaveBetween(String value1, String value2) {
            addCriterion("clave between", value1, value2, "clave");
            return this;
        }

        public Criteria andClaveNotBetween(String value1, String value2) {
            addCriterion("clave not between", value1, value2, "clave");
            return this;
        }
    }
}