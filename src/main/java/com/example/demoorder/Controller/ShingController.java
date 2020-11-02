package com.example.demoorder.Controller;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableUnion;
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

    @PostMapping("testUnion")
    public List<TableUnion> testUnion() {
        List<TableUnion> tableUnionList = shingTestMapper.testUnion();


        return tableUnionList;

    }

    @PostMapping("testSum")
    public Map<String, BigDecimal> testSum(Integer id) {
        Map<String, BigDecimal> sum = shingTestMapper.testSum(Long.valueOf(id));
        return sum;
    }

    @PostMapping("testInSelect")
    public List<TableUnion> testInSelect(Integer age) {
        List<TableUnion> testInSelectList = shingTestMapper.testInSelect(Long.valueOf(age));
        return testInSelectList;

    }

    @PostMapping("testNJoin")
    public Map<String, Object> testNJoin() {
        Map<String, Object> NJoin = shingTestMapper.testNJoin();
        return NJoin;
    }


}
