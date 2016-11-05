package com.mystartup.mykedai.common.bean.core;

import java.util.List;

public class SelectResultBean<E> {
    private int limit=10;
    private int offset=1;
    private List<E> data=null;
    private int currentPage=1;
    private int pageCount=-1;

    public SelectResultBean() {
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        setOffset((getCurrentPage() - 1) * getLimit());
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
        setCurrentPage(1);
    }

    public int getOffset() {
        return offset<0?0:offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public void countPage(Integer count){
        if(count!=null && count>0){
            int totalPage = (int) Math.ceil(count.doubleValue()/getLimit());
            setPageCount(totalPage);
        }
    }
}