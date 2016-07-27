package com.infoengine.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentIsNull() {
            addCriterion("IDENT is null");
            return (Criteria) this;
        }

        public Criteria andIdentIsNotNull() {
            addCriterion("IDENT is not null");
            return (Criteria) this;
        }

        public Criteria andIdentEqualTo(Integer value) {
            addCriterion("IDENT =", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotEqualTo(Integer value) {
            addCriterion("IDENT <>", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThan(Integer value) {
            addCriterion("IDENT >", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDENT >=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThan(Integer value) {
            addCriterion("IDENT <", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThanOrEqualTo(Integer value) {
            addCriterion("IDENT <=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentIn(List<Integer> values) {
            addCriterion("IDENT in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotIn(List<Integer> values) {
            addCriterion("IDENT not in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentBetween(Integer value1, Integer value2) {
            addCriterion("IDENT between", value1, value2, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotBetween(Integer value1, Integer value2) {
            addCriterion("IDENT not between", value1, value2, "ident");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("HOSPITAL is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("HOSPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(Integer value) {
            addCriterion("HOSPITAL =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(Integer value) {
            addCriterion("HOSPITAL <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(Integer value) {
            addCriterion("HOSPITAL >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOSPITAL >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(Integer value) {
            addCriterion("HOSPITAL <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(Integer value) {
            addCriterion("HOSPITAL <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<Integer> values) {
            addCriterion("HOSPITAL in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<Integer> values) {
            addCriterion("HOSPITAL not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(Integer value1, Integer value2) {
            addCriterion("HOSPITAL between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(Integer value1, Integer value2) {
            addCriterion("HOSPITAL not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andMainDoctorIsNull() {
            addCriterion("MAIN_DOCTOR is null");
            return (Criteria) this;
        }

        public Criteria andMainDoctorIsNotNull() {
            addCriterion("MAIN_DOCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andMainDoctorEqualTo(Integer value) {
            addCriterion("MAIN_DOCTOR =", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorNotEqualTo(Integer value) {
            addCriterion("MAIN_DOCTOR <>", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorGreaterThan(Integer value) {
            addCriterion("MAIN_DOCTOR >", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIN_DOCTOR >=", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorLessThan(Integer value) {
            addCriterion("MAIN_DOCTOR <", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("MAIN_DOCTOR <=", value, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorIn(List<Integer> values) {
            addCriterion("MAIN_DOCTOR in", values, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorNotIn(List<Integer> values) {
            addCriterion("MAIN_DOCTOR not in", values, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_DOCTOR between", value1, value2, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andMainDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_DOCTOR not between", value1, value2, "mainDoctor");
            return (Criteria) this;
        }

        public Criteria andAttachment1IsNull() {
            addCriterion("ATTACHMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andAttachment1IsNotNull() {
            addCriterion("ATTACHMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttachment1EqualTo(String value) {
            addCriterion("ATTACHMENT1 =", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1NotEqualTo(String value) {
            addCriterion("ATTACHMENT1 <>", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1GreaterThan(String value) {
            addCriterion("ATTACHMENT1 >", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT1 >=", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1LessThan(String value) {
            addCriterion("ATTACHMENT1 <", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1LessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT1 <=", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1Like(String value) {
            addCriterion("ATTACHMENT1 like", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1NotLike(String value) {
            addCriterion("ATTACHMENT1 not like", value, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1In(List<String> values) {
            addCriterion("ATTACHMENT1 in", values, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1NotIn(List<String> values) {
            addCriterion("ATTACHMENT1 not in", values, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1Between(String value1, String value2) {
            addCriterion("ATTACHMENT1 between", value1, value2, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment1NotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT1 not between", value1, value2, "attachment1");
            return (Criteria) this;
        }

        public Criteria andAttachment2IsNull() {
            addCriterion("ATTACHMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andAttachment2IsNotNull() {
            addCriterion("ATTACHMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttachment2EqualTo(String value) {
            addCriterion("ATTACHMENT2 =", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2NotEqualTo(String value) {
            addCriterion("ATTACHMENT2 <>", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2GreaterThan(String value) {
            addCriterion("ATTACHMENT2 >", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT2 >=", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2LessThan(String value) {
            addCriterion("ATTACHMENT2 <", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2LessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT2 <=", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2Like(String value) {
            addCriterion("ATTACHMENT2 like", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2NotLike(String value) {
            addCriterion("ATTACHMENT2 not like", value, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2In(List<String> values) {
            addCriterion("ATTACHMENT2 in", values, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2NotIn(List<String> values) {
            addCriterion("ATTACHMENT2 not in", values, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2Between(String value1, String value2) {
            addCriterion("ATTACHMENT2 between", value1, value2, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment2NotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT2 not between", value1, value2, "attachment2");
            return (Criteria) this;
        }

        public Criteria andAttachment3IsNull() {
            addCriterion("ATTACHMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andAttachment3IsNotNull() {
            addCriterion("ATTACHMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttachment3EqualTo(String value) {
            addCriterion("ATTACHMENT3 =", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3NotEqualTo(String value) {
            addCriterion("ATTACHMENT3 <>", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3GreaterThan(String value) {
            addCriterion("ATTACHMENT3 >", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT3 >=", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3LessThan(String value) {
            addCriterion("ATTACHMENT3 <", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3LessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT3 <=", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3Like(String value) {
            addCriterion("ATTACHMENT3 like", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3NotLike(String value) {
            addCriterion("ATTACHMENT3 not like", value, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3In(List<String> values) {
            addCriterion("ATTACHMENT3 in", values, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3NotIn(List<String> values) {
            addCriterion("ATTACHMENT3 not in", values, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3Between(String value1, String value2) {
            addCriterion("ATTACHMENT3 between", value1, value2, "attachment3");
            return (Criteria) this;
        }

        public Criteria andAttachment3NotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT3 not between", value1, value2, "attachment3");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}