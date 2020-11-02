package com.example.demoorder.Controller;

import com.example.demoorder.entity.TableQuery;
import com.example.demoorder.service.TestSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestSqlController {

    @Autowired
    private TestSqlService testSqlService;

    /**
     * 测试 sum and group by
     */
    @PostMapping("/testSumAndGroupBy")
    public List<TableQuery> testSumAndGroupBy(Long bId) {
        return testSqlService.testSumAndGroupBy(bId);
    }

    /**
     * 测试 select * from left join
     */
    @PostMapping("/testSelectAndLeftJoin")
    public List<TableQuery> testSelectAndLeftJoin() {
        return testSqlService.testSelectAndLeftJoin();
    }

    /**
     * 测试 复杂SQL作为子表
     */
    @PostMapping("/testComplexSqlAsSubTable")
    public List<TableQuery> testComplexSqlAsChildTable(String comment) {
        return testSqlService.testComplexSqlAsChildTable(comment);
    }

    /**
     * 测试 not exists子查询
     */
    @PostMapping("/testNotExistsAndSubQuery")
    public List<TableQuery> testNotExistsAndSubQuery(Long bId) {
        return testSqlService.testNotExistsAndSubQuery(bId);
    }

}
