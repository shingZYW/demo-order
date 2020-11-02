package com.example.demoorder.service.impl;

import com.example.demoorder.Mapper.TestSqlMapper;
import com.example.demoorder.entity.TableQuery;
import com.example.demoorder.service.TestSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestSqlServiceImpl implements TestSqlService {

    @Autowired
    private TestSqlMapper testSqlMapper;

    @Override
    public List<TableQuery> testSumAndGroupBy(Long bId) {
        return testSqlMapper.testSumAndGroupBy(bId);
    }

    @Override
    public List<TableQuery> testNotExistsAndSubQuery(Long bId) {
        return testSqlMapper.testNotExistsAndSubQuery(bId);
    }

    @Override
    public List<TableQuery> testComplexSqlAsChildTable(String comment) {
        return testSqlMapper.testComplexSqlAsChildTable(comment);
    }

    @Override
    public List<TableQuery> testSelectAndLeftJoin() {
        return testSqlMapper.testSelectAndLeftJoin();
    }
}
