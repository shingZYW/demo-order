package com.example.demoorder.Controller;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.ShingTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController

public class ShingController {

    private static Logger logger = LoggerFactory.getLogger(ShingController.class);

    @Autowired
    private ShingTestMapper shingTestMapper;

    @GetMapping("/test")
    public ShingTest getTest() {
        return shingTestMapper.selectById(1);
    }

    @GetMapping("/add")
    public String addTest(@RequestBody ShingTest shingTest1) {
        shingTestMapper.insert(shingTest1);
        System.out.println("test:" + shingTest1.toString());
        return "success";
    }

    @GetMapping("list")
    public List<ShingTest> list() {
        List<ShingTest> shingTestList = shingTestMapper.selectList(null);
        logger.info("list返回了" + shingTestList.size() + "条记录!");
        return shingTestList;


    }

    @GetMapping("execu")
    public Integer executeSql() {
        shingTestMapper.executeSql("");
        return 0;

    }

    @PostMapping("add")
    public Integer addData(@RequestBody ShingTest shingTest) {
        shingTestMapper.add(shingTest);
        return 0;

    }

    /**
     * 测试select *,union，group by，sum
     * @return
     */
    @PostMapping("testUnion")
    public List<Map<String,Object>> testUnion() {
        List<Map<String,Object>> tableUnionList = shingTestMapper.testUnion();


        return tableUnionList;

    }

    /**
     * 测试sum and case
     * @param id
     * @return
     */
    @PostMapping("testSum")
    public Map<String, BigDecimal> testSum(Integer id) {
        Map<String, BigDecimal> sum = shingTestMapper.testSum(Long.valueOf(id));
        return sum;
    }

    /**
     * 测试in select
     * @param
     * @return
     */
    @PostMapping("testInSelect")
    public List<Map<String,Object>> testInSelect(Integer age) {
        List<Map<String,Object>> testInSelectList = shingTestMapper.testInSelect(Long.valueOf(age));
        return testInSelectList;

    }

    /**
     * 测试多个join,并且含有时间计算以及基本运算
     * @return
     */
    @PostMapping("testNJoin")
    public List<Map<String,Object>> testNJoin() {
        List<Map<String,Object>> NJoin = shingTestMapper.testNJoin();
        return NJoin;
    }


}
