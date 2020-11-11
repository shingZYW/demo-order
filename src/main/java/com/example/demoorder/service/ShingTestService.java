package com.example.demoorder.service;

import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableA;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShingTestService {

    void executeSql(String sql)throws Throwable;

    void add(ShingTest shingTest)throws Throwable;

    List<Map<String, Object>> testUnion()throws Throwable;

    Map<String, BigDecimal> testSum(Long Id)throws Throwable;

    List<Map<String, Object>> testInSelect(Long id);

    List<Map<String, Object>> testNJoin() throws Throwable;

    Integer insertListA(List<TableA> tableAList) throws Throwable;


    Integer UpdateTableA(List<TableA> tableAList) throws Throwable;


}
