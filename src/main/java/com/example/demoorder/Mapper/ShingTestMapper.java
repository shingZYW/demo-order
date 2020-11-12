package com.example.demoorder.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableA;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface ShingTestMapper extends BaseMapper<ShingTest> {
    void executeSql(String sql);

    void add(ShingTest shingTest);

    List<Map<String, Object>> testUnion();

    Map<String, BigDecimal> testSum(Long Id);

    List<Map<String, Object>> testInSelect(Long id);

    List<Map<String, Object>> testNJoin();


    void dropTable(@Param("name") String name);


    void createTable(@Param("name") String name);

    Integer insertListA(List<TableA> tableAList);


    List<Map<String, Object>> selectAllTableA();


    Integer UpdateTableA(List<TableA> tableAList);


    List<Map<String, Object>> selectTableAById(Long id);

}
