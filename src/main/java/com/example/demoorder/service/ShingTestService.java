package com.example.demoorder.service;

import com.example.demoorder.entity.ShingTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShingTestService {

    void executeSql(String sql);

    void add(ShingTest shingTest);

    List<Map<String,Object>> testUnion();

    Map<String, BigDecimal> testSum(Long Id);

    List<Map<String,Object>> testInSelect(Long id);

    List<Map<String,Object>> testNJoin();
}
