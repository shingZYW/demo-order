package com.example.demoorder.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demoorder.entity.ShingTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShingTestMapper extends BaseMapper<ShingTest> {
    void executeSql(String sql);

    void add(ShingTest shingTest);

}
