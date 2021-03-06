package pe.gob.ep.ginnet.seguridad.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RolCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public RolCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    protected RolCriteria(RolCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
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
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table ctrl_seg_rol
     *
     * @ibatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table ctrl_seg_rol
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

        public Criteria andIRolIdIsNull() {
            addCriterion("I_ROL_ID is null");
            return this;
        }

        public Criteria andIRolIdIsNotNull() {
            addCriterion("I_ROL_ID is not null");
            return this;
        }

        public Criteria andIRolIdEqualTo(Integer value) {
            addCriterion("I_ROL_ID =", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdNotEqualTo(Integer value) {
            addCriterion("I_ROL_ID <>", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdGreaterThan(Integer value) {
            addCriterion("I_ROL_ID >", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_ID >=", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdLessThan(Integer value) {
            addCriterion("I_ROL_ID <", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_ID <=", value, "iRolId");
            return this;
        }

        public Criteria andIRolIdIn(List<Integer> values) {
            addCriterion("I_ROL_ID in", values, "iRolId");
            return this;
        }

        public Criteria andIRolIdNotIn(List<Integer> values) {
            addCriterion("I_ROL_ID not in", values, "iRolId");
            return this;
        }

        public Criteria andIRolIdBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_ID between", value1, value2, "iRolId");
            return this;
        }

        public Criteria andIRolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_ID not between", value1, value2, "iRolId");
            return this;
        }

        public Criteria andVRolNombreIsNull() {
            addCriterion("V_ROL_NOMBRE is null");
            return this;
        }

        public Criteria andVRolNombreIsNotNull() {
            addCriterion("V_ROL_NOMBRE is not null");
            return this;
        }

        public Criteria andVRolNombreEqualTo(String value) {
            addCriterion("V_ROL_NOMBRE =", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreNotEqualTo(String value) {
            addCriterion("V_ROL_NOMBRE <>", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreGreaterThan(String value) {
            addCriterion("V_ROL_NOMBRE >", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreGreaterThanOrEqualTo(String value) {
            addCriterion("V_ROL_NOMBRE >=", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreLessThan(String value) {
            addCriterion("V_ROL_NOMBRE <", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreLessThanOrEqualTo(String value) {
            addCriterion("V_ROL_NOMBRE <=", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreLike(String value) {
            addCriterion("V_ROL_NOMBRE like", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreNotLike(String value) {
            addCriterion("V_ROL_NOMBRE not like", value, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreIn(List<String> values) {
            addCriterion("V_ROL_NOMBRE in", values, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreNotIn(List<String> values) {
            addCriterion("V_ROL_NOMBRE not in", values, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreBetween(String value1, String value2) {
            addCriterion("V_ROL_NOMBRE between", value1, value2, "vRolNombre");
            return this;
        }

        public Criteria andVRolNombreNotBetween(String value1, String value2) {
            addCriterion("V_ROL_NOMBRE not between", value1, value2, "vRolNombre");
            return this;
        }

        public Criteria andIRolTipoIsNull() {
            addCriterion("I_ROL_TIPO is null");
            return this;
        }

        public Criteria andIRolTipoIsNotNull() {
            addCriterion("I_ROL_TIPO is not null");
            return this;
        }

        public Criteria andIRolTipoEqualTo(Integer value) {
            addCriterion("I_ROL_TIPO =", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoNotEqualTo(Integer value) {
            addCriterion("I_ROL_TIPO <>", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoGreaterThan(Integer value) {
            addCriterion("I_ROL_TIPO >", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_TIPO >=", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoLessThan(Integer value) {
            addCriterion("I_ROL_TIPO <", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoLessThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_TIPO <=", value, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoIn(List<Integer> values) {
            addCriterion("I_ROL_TIPO in", values, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoNotIn(List<Integer> values) {
            addCriterion("I_ROL_TIPO not in", values, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_TIPO between", value1, value2, "iRolTipo");
            return this;
        }

        public Criteria andIRolTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_TIPO not between", value1, value2, "iRolTipo");
            return this;
        }

        public Criteria andDRolFecregistraIsNull() {
            addCriterion("D_ROL_FECREGISTRA is null");
            return this;
        }

        public Criteria andDRolFecregistraIsNotNull() {
            addCriterion("D_ROL_FECREGISTRA is not null");
            return this;
        }

        public Criteria andDRolFecregistraEqualTo(Date value) {
            addCriterion("D_ROL_FECREGISTRA =", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraNotEqualTo(Date value) {
            addCriterion("D_ROL_FECREGISTRA <>", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraGreaterThan(Date value) {
            addCriterion("D_ROL_FECREGISTRA >", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ROL_FECREGISTRA >=", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraLessThan(Date value) {
            addCriterion("D_ROL_FECREGISTRA <", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraLessThanOrEqualTo(Date value) {
            addCriterion("D_ROL_FECREGISTRA <=", value, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraIn(List<Date> values) {
            addCriterion("D_ROL_FECREGISTRA in", values, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraNotIn(List<Date> values) {
            addCriterion("D_ROL_FECREGISTRA not in", values, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraBetween(Date value1, Date value2) {
            addCriterion("D_ROL_FECREGISTRA between", value1, value2, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecregistraNotBetween(Date value1, Date value2) {
            addCriterion("D_ROL_FECREGISTRA not between", value1, value2, "dRolFecregistra");
            return this;
        }

        public Criteria andDRolFecmodificaIsNull() {
            addCriterion("D_ROL_FECMODIFICA is null");
            return this;
        }

        public Criteria andDRolFecmodificaIsNotNull() {
            addCriterion("D_ROL_FECMODIFICA is not null");
            return this;
        }

        public Criteria andDRolFecmodificaEqualTo(Date value) {
            addCriterion("D_ROL_FECMODIFICA =", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaNotEqualTo(Date value) {
            addCriterion("D_ROL_FECMODIFICA <>", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaGreaterThan(Date value) {
            addCriterion("D_ROL_FECMODIFICA >", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ROL_FECMODIFICA >=", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaLessThan(Date value) {
            addCriterion("D_ROL_FECMODIFICA <", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaLessThanOrEqualTo(Date value) {
            addCriterion("D_ROL_FECMODIFICA <=", value, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaIn(List<Date> values) {
            addCriterion("D_ROL_FECMODIFICA in", values, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaNotIn(List<Date> values) {
            addCriterion("D_ROL_FECMODIFICA not in", values, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaBetween(Date value1, Date value2) {
            addCriterion("D_ROL_FECMODIFICA between", value1, value2, "dRolFecmodifica");
            return this;
        }

        public Criteria andDRolFecmodificaNotBetween(Date value1, Date value2) {
            addCriterion("D_ROL_FECMODIFICA not between", value1, value2, "dRolFecmodifica");
            return this;
        }

        public Criteria andVRolDesusuregistraIsNull() {
            addCriterion("V_ROL_DESUSUREGISTRA is null");
            return this;
        }

        public Criteria andVRolDesusuregistraIsNotNull() {
            addCriterion("V_ROL_DESUSUREGISTRA is not null");
            return this;
        }

        public Criteria andVRolDesusuregistraEqualTo(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA =", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraNotEqualTo(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA <>", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraGreaterThan(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA >", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraGreaterThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA >=", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraLessThan(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA <", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraLessThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA <=", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraLike(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA like", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraNotLike(String value) {
            addCriterion("V_ROL_DESUSUREGISTRA not like", value, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraIn(List<String> values) {
            addCriterion("V_ROL_DESUSUREGISTRA in", values, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraNotIn(List<String> values) {
            addCriterion("V_ROL_DESUSUREGISTRA not in", values, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraBetween(String value1, String value2) {
            addCriterion("V_ROL_DESUSUREGISTRA between", value1, value2, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusuregistraNotBetween(String value1, String value2) {
            addCriterion("V_ROL_DESUSUREGISTRA not between", value1, value2, "vRolDesusuregistra");
            return this;
        }

        public Criteria andVRolDesusumodificaIsNull() {
            addCriterion("V_ROL_DESUSUMODIFICA is null");
            return this;
        }

        public Criteria andVRolDesusumodificaIsNotNull() {
            addCriterion("V_ROL_DESUSUMODIFICA is not null");
            return this;
        }

        public Criteria andVRolDesusumodificaEqualTo(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA =", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaNotEqualTo(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA <>", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaGreaterThan(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA >", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaGreaterThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA >=", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaLessThan(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA <", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaLessThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA <=", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaLike(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA like", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaNotLike(String value) {
            addCriterion("V_ROL_DESUSUMODIFICA not like", value, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaIn(List<String> values) {
            addCriterion("V_ROL_DESUSUMODIFICA in", values, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaNotIn(List<String> values) {
            addCriterion("V_ROL_DESUSUMODIFICA not in", values, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaBetween(String value1, String value2) {
            addCriterion("V_ROL_DESUSUMODIFICA between", value1, value2, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesusumodificaNotBetween(String value1, String value2) {
            addCriterion("V_ROL_DESUSUMODIFICA not between", value1, value2, "vRolDesusumodifica");
            return this;
        }

        public Criteria andVRolDesipregistraIsNull() {
            addCriterion("V_ROL_DESIPREGISTRA is null");
            return this;
        }

        public Criteria andVRolDesipregistraIsNotNull() {
            addCriterion("V_ROL_DESIPREGISTRA is not null");
            return this;
        }

        public Criteria andVRolDesipregistraEqualTo(String value) {
            addCriterion("V_ROL_DESIPREGISTRA =", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraNotEqualTo(String value) {
            addCriterion("V_ROL_DESIPREGISTRA <>", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraGreaterThan(String value) {
            addCriterion("V_ROL_DESIPREGISTRA >", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraGreaterThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESIPREGISTRA >=", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraLessThan(String value) {
            addCriterion("V_ROL_DESIPREGISTRA <", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraLessThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESIPREGISTRA <=", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraLike(String value) {
            addCriterion("V_ROL_DESIPREGISTRA like", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraNotLike(String value) {
            addCriterion("V_ROL_DESIPREGISTRA not like", value, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraIn(List<String> values) {
            addCriterion("V_ROL_DESIPREGISTRA in", values, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraNotIn(List<String> values) {
            addCriterion("V_ROL_DESIPREGISTRA not in", values, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraBetween(String value1, String value2) {
            addCriterion("V_ROL_DESIPREGISTRA between", value1, value2, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipregistraNotBetween(String value1, String value2) {
            addCriterion("V_ROL_DESIPREGISTRA not between", value1, value2, "vRolDesipregistra");
            return this;
        }

        public Criteria andVRolDesipmodificaIsNull() {
            addCriterion("V_ROL_DESIPMODIFICA is null");
            return this;
        }

        public Criteria andVRolDesipmodificaIsNotNull() {
            addCriterion("V_ROL_DESIPMODIFICA is not null");
            return this;
        }

        public Criteria andVRolDesipmodificaEqualTo(String value) {
            addCriterion("V_ROL_DESIPMODIFICA =", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaNotEqualTo(String value) {
            addCriterion("V_ROL_DESIPMODIFICA <>", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaGreaterThan(String value) {
            addCriterion("V_ROL_DESIPMODIFICA >", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaGreaterThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESIPMODIFICA >=", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaLessThan(String value) {
            addCriterion("V_ROL_DESIPMODIFICA <", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaLessThanOrEqualTo(String value) {
            addCriterion("V_ROL_DESIPMODIFICA <=", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaLike(String value) {
            addCriterion("V_ROL_DESIPMODIFICA like", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaNotLike(String value) {
            addCriterion("V_ROL_DESIPMODIFICA not like", value, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaIn(List<String> values) {
            addCriterion("V_ROL_DESIPMODIFICA in", values, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaNotIn(List<String> values) {
            addCriterion("V_ROL_DESIPMODIFICA not in", values, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaBetween(String value1, String value2) {
            addCriterion("V_ROL_DESIPMODIFICA between", value1, value2, "vRolDesipmodifica");
            return this;
        }

        public Criteria andVRolDesipmodificaNotBetween(String value1, String value2) {
            addCriterion("V_ROL_DESIPMODIFICA not between", value1, value2, "vRolDesipmodifica");
            return this;
        }

        public Criteria andIRolEstadoIsNull() {
            addCriterion("I_ROL_ESTADO is null");
            return this;
        }

        public Criteria andIRolEstadoIsNotNull() {
            addCriterion("I_ROL_ESTADO is not null");
            return this;
        }

        public Criteria andIRolEstadoEqualTo(Integer value) {
            addCriterion("I_ROL_ESTADO =", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoNotEqualTo(Integer value) {
            addCriterion("I_ROL_ESTADO <>", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoGreaterThan(Integer value) {
            addCriterion("I_ROL_ESTADO >", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_ESTADO >=", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoLessThan(Integer value) {
            addCriterion("I_ROL_ESTADO <", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("I_ROL_ESTADO <=", value, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoIn(List<Integer> values) {
            addCriterion("I_ROL_ESTADO in", values, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoNotIn(List<Integer> values) {
            addCriterion("I_ROL_ESTADO not in", values, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_ESTADO between", value1, value2, "iRolEstado");
            return this;
        }

        public Criteria andIRolEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ROL_ESTADO not between", value1, value2, "iRolEstado");
            return this;
        }
    }
}