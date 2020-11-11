package com.example.demoorder.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demoorder.entity.TableA;
import com.example.demoorder.entity.TableB;
import com.example.demoorder.entity.TableQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestSqlMapper extends BaseMapper<TableQuery> {
    List<TableQuery> testSumAndGroupBy(Long bId);

    List<TableQuery> testNotExistsAndSubQuery(Long bId);

    List<TableQuery> testComplexSqlAsChildTable(String comment);

    List<TableQuery> testSelectAndLeftJoin();

    void testBatchUpdate( List<TableB> list);
}
