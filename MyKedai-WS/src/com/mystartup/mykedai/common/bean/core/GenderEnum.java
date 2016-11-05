package com.mystartup.mykedai.common.bean.core;

public enum GenderEnum {
    MALE(true),
    FEMALE(false);
    
    private boolean gender;

    private GenderEnum(boolean gender) {
    this.gender=gender;
    }
    
    public boolean gender(){
    	return gender;
    }
        
};
