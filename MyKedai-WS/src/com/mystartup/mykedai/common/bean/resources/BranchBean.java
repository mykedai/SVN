package com.mystartup.mykedai.common.bean.resources;

import java.util.Date;

public class BranchBean {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String village;
    private String alamat;
    private String catatan;
    private int archiveId;
    private int lastupdatedby;
    private Date lastUpdate;

    public BranchBean() {
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

    
    public String getVillage() {
        return village;
    }

    
    public void setVillage(String village) {
        this.village = village;
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

    public int getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(int archiveId) {
        this.archiveId = archiveId;
    }

    public int getLastupdatedby() {
        return lastupdatedby;
    }

    public void setLastupdatedby(int lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}