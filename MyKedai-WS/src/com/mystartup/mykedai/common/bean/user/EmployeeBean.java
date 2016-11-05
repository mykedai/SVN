package com.mystartup.mykedai.common.bean.user;

import java.util.Date;

import com.mystartup.mykedai.common.bean.core.GenderEnum;
import com.mystartup.mykedai.common.bean.resources.BranchBean;

public class EmployeeBean{

    private int id;
    private String name;
    private Date dateofbirth;
    private Date dateofjoin;
    private int liabilities;
    private String phone;
    private String email;
    private String idtype;
    private int idnumber;
    private GenderEnum gender;
    private String fieldofwork;
    private String alamat;
    private String catatan;
    private int branchId;
    private BranchBean branch;
    private int archieveId;
    private int lastUpdatedBy;
    private Date lasUpdated;

    public EmployeeBean() {
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Date getDateofbirth() {
        return dateofbirth;
    }

    
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    
    public Date getDateofjoin() {
        return dateofjoin;
    }

    
    public void setDateofjoin(Date dateofjoin) {
        this.dateofjoin = dateofjoin;
    }

    
    public int getLiabilities() {
        return liabilities;
    }

    
    public void setLiabilities(int liabilities) {
        this.liabilities = liabilities;
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getIdtype() {
        return idtype;
    }

    
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    
    public int getIdnumber() {
        return idnumber;
    }

    
    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    
    public GenderEnum getGender() {
        return gender;
    }

    
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    
    public String getFieldofwork() {
        return fieldofwork;
    }

    
    public void setFieldofwork(String fieldofwork) {
        this.fieldofwork = fieldofwork;
    }

    
    public String getAlamat() {
        return alamat;
    }

    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public String getCatatan() {
        return catatan;
    }

    
    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    
    public int getBranchId() {
        return branchId;
    }

    
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    
    public BranchBean getBranch() {
        return branch;
    }

    
    public void setBranch(BranchBean branch) {
        this.branch = branch;
    }

    public int getArchieveId() {
        return archieveId;
    }

    public void setArchieveId(int archieveId) {
        this.archieveId = archieveId;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLasUpdated() {
        return lasUpdated;
    }

    public void setLasUpdated(Date lasUpdated) {
        this.lasUpdated = lasUpdated;
    }
}
