package com.example.demoorder.Controller;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.ShingTest;
import com.example.demoorder.entity.TableAReq;
import com.example.demoorder.service.ShingTestService;
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

    @Autowired
    private ShingTestService shingTestService;

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
    public Integer executeSql() throws Throwable {
        shingTestService.executeSql("");
        return 0;

    }

    @PostMapping("add")
    public Integer addData(@RequestBody ShingTest shingTest) throws Throwable {
        shingTestService.add(shingTest);
        return 0;

    }

    /**
     * 测试select *,union，group by，sum
     *
     * @return
     */
    @PostMapping("testUnion")
    public List<Map<String, Object>> testUnion() {
        List<Map<String, Object>> tableUnionList = null;
        try {
            tableUnionList = shingTestService.testUnion();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("测试select *,union，group by，sum->>>" + tableUnionList.toString());
        return tableUnionList;

    }

    /**
     * 测试sum and case
     *
     * @param id
     * @return
     */
    @PostMapping("testSum")
    public Map<String, BigDecimal> testSum(Integer id) {
        Map<String, BigDecimal> sum = null;
        try {
            sum = shingTestService.testSum(Long.valueOf(id));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("测试sum and case->>>" + sum.toString());
        return sum;
    }

    /**
     * 测试in select
     *
     * @param
     * @return
     */
    @PostMapping("testInSelect")
    public List<Map<String, Object>> testInSelect(Integer age) {
        List<Map<String, Object>> testInSelectList = shingTestService.testInSelect(Long.valueOf(age));
        logger.info("测试in select->>>" + testInSelectList.toString());
        return testInSelectList;

    }

    /**
     * 测试多个join,并且含有时间计算以及基本运算
     *
     * @return
     */
    @PostMapping("testNJoin")
    public List<Map<String, Object>> testNJoin() {

        List<Map<String, Object>> NJoin = null;
        try {
            NJoin = shingTestService.testNJoin();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("测试多个join,并且含有时间计算以及基本运算->>>" + NJoin.toString());
        return NJoin;
    }

    @PostMapping("testDropTable")
    public void testDropTable(String name) {
        logger.info("测试删除表");
        shingTestMapper.dropTable(name);
    }

    @PostMapping("testCreateTable")
    public void testcreateTable(String name) {
        logger.info("测试建表");
        shingTestMapper.createTable(name);
    }


    @PostMapping("insertListA")
    public void insertList(@RequestBody TableAReq tableAReq) {
        logger.info("测试批量插入");
        try {
            shingTestService.insertListA(tableAReq.getTableAList());
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @PostMapping("listAllTableA")
    public List<Map<String, Object>> listAllTableA(String name) {
        logger.info("listA");

        return shingTestMapper.selectAllTableA();
    }


    @PostMapping("UpdateTableA")
    public Integer UpdateTableA(@RequestBody TableAReq tableAReq) {
        logger.info("UpdateTableA");
        Integer res = 0;
        try {
            res = shingTestService.UpdateTableA(tableAReq.getTableAList());
        }

        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return res;
    }
}
