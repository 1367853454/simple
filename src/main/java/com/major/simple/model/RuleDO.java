package com.major.simple.model;

import java.util.Date;

public class RuleDO {
    private Long id;

    private String ruleName;

    private String ruleDescribe;

    private String ruleTips;

    private String status;

    private Long rulePackageId;

    private String executeCondition;

    private String result;

    private Date createTime;

    private Date updateTime;

    private Byte flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getRuleDescribe() {
        return ruleDescribe;
    }

    public void setRuleDescribe(String ruleDescribe) {
        this.ruleDescribe = ruleDescribe == null ? null : ruleDescribe.trim();
    }

    public String getRuleTips() {
        return ruleTips;
    }

    public void setRuleTips(String ruleTips) {
        this.ruleTips = ruleTips == null ? null : ruleTips.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getRulePackageId() {
        return rulePackageId;
    }

    public void setRulePackageId(Long rulePackageId) {
        this.rulePackageId = rulePackageId;
    }

    public String getExecuteCondition() {
        return executeCondition;
    }

    public void setExecuteCondition(String executeCondition) {
        this.executeCondition = executeCondition == null ? null : executeCondition.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }
}