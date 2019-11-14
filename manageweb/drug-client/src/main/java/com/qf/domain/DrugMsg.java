package com.qf.domain;

import java.io.Serializable;
import java.util.Date;

public class DrugMsg implements Serializable {
    private Long pkDrugid;

        private Long ukPage;

    private String drugName;

    private String drugSyz;

    private String drugManu;

    private Long drugPrice;

    private String drugType;

    private String drugGgxh;

    private String drugYfyl;

    private String drugPic;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPkDrugid() {
        return pkDrugid;
    }

    public void setPkDrugid(Long pkDrugid) {
        this.pkDrugid = pkDrugid;
    }

    public Long getUkPage() {
        return ukPage;
    }

    public void setUkPage(Long ukPage) {
        this.ukPage = ukPage;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugSyz() {
        return drugSyz;
    }

    public void setDrugSyz(String drugSyz) {
        this.drugSyz = drugSyz == null ? null : drugSyz.trim();
    }

    public String getDrugManu() {
        return drugManu;
    }

    public void setDrugManu(String drugManu) {
        this.drugManu = drugManu == null ? null : drugManu.trim();
    }

    public Long getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Long drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
    }

    public String getDrugGgxh() {
        return drugGgxh;
    }

    public void setDrugGgxh(String drugGgxh) {
        this.drugGgxh = drugGgxh == null ? null : drugGgxh.trim();
    }

    public String getDrugYfyl() {
        return drugYfyl;
    }

    public void setDrugYfyl(String drugYfyl) {
        this.drugYfyl = drugYfyl == null ? null : drugYfyl.trim();
    }

    public String getDrugPic() {
        return drugPic;
    }

    public void setDrugPic(String drugPic) {
        this.drugPic = drugPic == null ? null : drugPic.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}