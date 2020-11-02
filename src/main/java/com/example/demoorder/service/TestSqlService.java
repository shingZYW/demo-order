package com.example.demoorder.service;

import com.example.demoorder.entity.TableQuery;

import java.util.List;

public interface TestSqlService {
    List<TableQuery> testSumAndGroupBy(Long bId);

    List<TableQuery> testNotExistsAndSubQuery(Long bId);

    List<TableQuery> testComplexSqlAsChildTable(String comment);

    List<TableQuery> testSelectAndLeftJoin();
}
