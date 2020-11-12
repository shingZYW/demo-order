package com.example.demoorder.service.impl;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableA;
import com.example.demoorder.service.ShingTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class ShingTestServiceImpl implements ShingTestService {

    @Autowired
    ShingTestMapper shingTestMapper;

    @Override
    public void executeSql(String sql) {
        shingTestMapper.executeSql(sql);
    }

    @Override
    public void add(ShingTest shingTest) {
        shingTestMapper.add(shingTest);
    }

    @Override
    public List<Map<String, Object>> testUnion() {
        return shingTestMapper.testUnion();
    }

    @Override
    public Map<String, BigDecimal> testSum(Long Id) {
        return shingTestMapper.testSum(Id);
    }

    @Override
    public List<Map<String, Object>> testInSelect(Long id) {

        return shingTestMapper.testInSelect(id);
    }

    @Override
    public List<Map<String, Object>> testNJoin() {
        return shingTestMapper.testNJoin();
    }

    @Override
    public Integer insertListA(List<TableA> tableAList) {
        return shingTestMapper.insertListA(tableAList);
    }

    @Transactional
    @Override
    public Integer UpdateTableA(List<TableA> tableAList) throws Throwable {
        return shingTestMapper.UpdateTableA(tableAList);
    }

    @Override
    public Integer updateBatch(List<TableA> tableAList) throws Throwable {
        return shingTestMapper.updateBatch(tableAList);
    }
}
