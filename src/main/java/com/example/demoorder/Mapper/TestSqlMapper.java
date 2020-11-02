package com.example.demoorder.Mapper;

import com.example.demoorder.entity.TableA;
import com.example.demoorder.entity.TableQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestSqlMapper {
    List<TableQuery> testSumAndGroupBy(Long bId);

    List<TableQuery> testNotExistsAndSubQuery(Long bId);

    List<TableQuery> testComplexSqlAsChildTable(String comment);

    List<TableQuery> testSelectAndLeftJoin();
}
