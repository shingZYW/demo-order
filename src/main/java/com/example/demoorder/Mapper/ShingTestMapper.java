package com.example.demoorder.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableUnion;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface ShingTestMapper extends BaseMapper<ShingTest> {
    void executeSql(String sql);

    void add(ShingTest shingTest);

    List<TableUnion> testUnion();

    Map<String, BigDecimal> testSum(Long Id);


    List<TableUnion> testInSelect(Long id);

}
