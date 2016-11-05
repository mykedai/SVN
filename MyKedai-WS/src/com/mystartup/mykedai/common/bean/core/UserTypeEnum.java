package com.mystartup.mykedai.common.bean.core;

public enum UserTypeEnum {
    CUSTOMER(0),
    CASHIER(1),
    SERVANT(2),
    CATERER(3);
    
    private int user;

    private UserTypeEnum(int user) {
    this.user=user;
    }
    
    public int user(){
    	return user;
    }
        
};
