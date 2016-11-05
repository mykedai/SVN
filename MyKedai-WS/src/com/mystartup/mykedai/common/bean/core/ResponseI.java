package com.mystartup.mykedai.common.bean.core;

public interface ResponseI {
	abstract String getCode();
	abstract void setCode(String code);
	abstract String getMessage();
	abstract void setMessage(String message);
	abstract Object getPayload();
	abstract void setPayload(Object payload);
}
