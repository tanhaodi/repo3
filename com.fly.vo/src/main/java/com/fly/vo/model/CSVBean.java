package com.fly.vo.model;


import org.supercsv.cellprocessor.ift.CellProcessor;

import java.util.List;


public class CSVBean extends BaseCSVBean {
    /**
     * 头部内容
     */
    private List<String[]> topList;
    /**
     * 尾部内容
     */
    private List<String[]> endList;

    public CSVBean(){
        super();
    }
    public CSVBean(String fileName, String[] headerNames, String[] beanFields, List<?> beanList, CellProcessor[] processors, List<String[]> topList, List<String[]> endList) {
        super(fileName, headerNames, beanFields, beanList, processors);
        this.topList = topList;
        this.endList = endList;
    }

    public CSVBean(String fileName, String[] headerNames, String[] beanFields, List<?> beanList, CellProcessor[] processors) {
        super(fileName, headerNames, beanFields, beanList, processors);
    }

    public List<String[]> getTopList() {
        return topList;
    }

    public void setTopList(List<String[]> topList) {
        this.topList = topList;
    }

    public List<String[]> getEndList() {
        return endList;
    }

    public void setEndList(List<String[]> endList) {
        this.endList = endList;
    }
}
