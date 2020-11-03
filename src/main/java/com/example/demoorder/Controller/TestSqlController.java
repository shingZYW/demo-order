package com.example.demoorder.Controller;

import com.example.demoorder.entity.TableQuery;
import com.example.demoorder.service.TestSqlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestSqlController {

    @Autowired
    private TestSqlService testSqlService;

    private static Logger logger = LoggerFactory.getLogger(TestSqlController.class);

    /**
     * 测试 sum and group by
     */
    @PostMapping("/testSumAndGroupBy")
    public List<TableQuery> testSumAndGroupBy(Long bId) {
        List<TableQuery> list = testSqlService.testSumAndGroupBy(bId);
        logger.info("测试 sum and group by->>>"+list.toString());
        return list;
    }

    /**
     * 测试 select * from left join
     */
    @PostMapping("/testSelectAndLeftJoin")
    public List<TableQuery> testSelectAndLeftJoin() {
        List<TableQuery> list =  testSqlService.testSelectAndLeftJoin();
        logger.info("测试 select * from left join->>>"+list.toString());
        return list;
    }

    /**
     * 测试 复杂SQL作为子表
     */
    @PostMapping("/testComplexSqlAsSubTable")
    public List<TableQuery> testComplexSqlAsChildTable(String comment) {
        List<TableQuery> list = testSqlService.testComplexSqlAsChildTable(comment);
        logger.info("测试 复杂SQL作为子表->>>"+list.toString());
        return list;
    }

    /**
     * 测试 not exists子查询
     */
    @PostMapping("/testNotExistsAndSubQuery")
    public List<TableQuery> testNotExistsAndSubQuery(Long bId) {
        List<TableQuery> list=testSqlService.testNotExistsAndSubQuery(bId);
        logger.info("测试 not exists子查询->>>"+list.toString());
        return list;
    }

}
