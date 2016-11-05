package com.mystartup.mykedai.common.service.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystartup.mykedai.common.bean.core.ResponseBean;
import com.mystartup.mykedai.common.bean.core.ResponseI;
import com.mystartup.mykedai.common.bean.core.SelectResultBean;
import com.mystartup.mykedai.common.bean.user.UserBean;
import com.mystartup.mykedai.common.dao.user.UserDao;

@Service
public class UserService {

	private static final Logger logger = Logger.getLogger(UserService.class);
	
	@Autowired
	UserDao dao;
	
	public UserService() {
    }

	public ResponseI login(String username, String password){
		ResponseBean resp = new ResponseBean();
		resp.setCode("00");
		resp.setMessage("Login Success");
		UserBean bean = new UserBean();
		bean.setUsername(username);
		bean.setPassword(password);
		resp.setPayload(bean);
		return resp;
	}

    public ResponseI insert(String username, String password){
        ResponseBean resp = new ResponseBean();
    	try{
            UserBean bean = new UserBean();
            bean.setUsername(username);
            bean.setPassword(password);
            dao.insert(bean);
            resp.setCode("00");
            resp.setMessage("Insert Success");    		
    	} catch (Exception e){
            resp.setCode("99");
            resp.setMessage(e.getMessage());    		
    		logger.error(e);
    	}
    	return resp;
    }

    public ResponseI update(int publicid, String username, String password){
        ResponseBean resp = new ResponseBean();
    	try{
            UserBean bean = new UserBean();
            bean.setPublicId(publicid);
            bean.setUsername(username);
            bean.setPassword(password);
            dao.updateById(bean);
            resp.setCode("00");
            resp.setMessage("Update Success");    		
    	} catch (Exception e){
            resp.setCode("99");
            resp.setMessage(e.getMessage());    		
    		logger.error(e);
    	}
    	return resp;
    }
    
    public ResponseI deleteByPublicId(int publicid,int userid){
        ResponseBean resp = new ResponseBean();
    	try{
            dao.deleteById(publicid,userid);
            resp.setCode("00");
            resp.setMessage("delete Success");    		
    	} catch (Exception e){
            resp.setCode("99");
            resp.setMessage(e.getMessage());    		
    		logger.error(e);
    	}
    	return resp;
    }
    
    public ResponseI selectByPublicId(int publicid){
        ResponseBean resp = new ResponseBean();
    	try{
            UserBean bean = dao.selectByPublicId(publicid);
            resp.setCode("00");
            resp.setMessage("Select Success");    
            resp.setPayload(bean);
    	} catch (Exception e){
            resp.setCode("99");
            resp.setMessage(e.getMessage());    		
    		logger.error(e);
    	}
    	return resp;
    }
    
    
    public void delete(int publicid, int userid) throws Exception {
        dao.deleteById(publicid,userid);
    }
	
    public void insert(UserBean bean) throws Exception {
        
        dao.insert(bean);
    }

    
    public void updateById(UserBean bean) throws Exception {
        dao.updateById(bean);
    }

    
    public SelectResultBean<UserBean> selectPage(SelectResultBean<UserBean> selectBean) throws Exception {
        Integer count=dao.selectCountAll();
        selectBean.countPage(count);
        
        if(selectBean.getPageCount()>0){
            List<UserBean> data = dao.selectPage(
                    selectBean.getLimit(), 
                    selectBean.getOffset());
            selectBean.setData(data);
        }
        return selectBean;
    }

    
    public UserBean selectById(int id) throws Exception {
        return dao.selectById(id);
    }

    
    public void deleteById(int id,int userid) throws Exception {
        dao.deleteById(id, userid);
    }
   
}
