package com.example.demoorder.Controller;

import com.example.demoorder.entity.TableB;
import com.example.demoorder.entity.TableQuery;
import com.example.demoorder.service.TestSqlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        logger.info("测试 sum and group by->>>" + list.toString());
        return list;
    }

    /**
     * 测试 select * from left join
     */
    @PostMapping("/testSelectAndLeftJoin")
    public List<TableQuery> testSelectAndLeftJoin() {
        List<TableQuery> list = testSqlService.testSelectAndLeftJoin();
        logger.info("测试 select * from left join->>>" + list.toString());
        return list;
    }

    /**
     * 测试 复杂SQL作为子表
     */
    @PostMapping("/testComplexSqlAsSubTable")
    public List<TableQuery> testComplexSqlAsChildTable(String comment) {
        List<TableQuery> list = testSqlService.testComplexSqlAsChildTable(comment);
        logger.info("测试 复杂SQL作为子表->>>" + list.toString());
        return list;
    }

    /**
     * 测试 not exists子查询
     */
    @PostMapping("/testNotExistsAndSubQuery")
    public List<TableQuery> testNotExistsAndSubQuery(Long bId) {
        List<TableQuery> list = testSqlService.testNotExistsAndSubQuery(bId);
        logger.info("测试 not exists子查询->>>" + list.toString());
        return list;
    }

    /**
     * 测试 批量更新
     */
    @PostMapping("/testBatchUpdate")
    public void testBatchUpdate() {
        List<TableB> list = new ArrayList<>();
        TableB tableB1 = new TableB().setId(1).setAge(1).setAName("11Name").setCId(1).setComment("111111");
        TableB tableB2 = new TableB().setId(2).setAge(2).setAName("22Name").setCId(2).setComment("222222");
        TableB tableB3 = new TableB().setId(3).setAge(3).setAName("33Name").setCId(3).setComment("333333");
        list.add(tableB1);
        list.add(tableB2);
        list.add(tableB3);
        try {
            testSqlService.testBatchUpdate(list);
//            logger.info("==testBatchUpdate==的result值为：｛｝" + result);
        }
        catch (Throwable throwable) {
            logger.info("==throwable==值为：｛｝" + throwable.getCause());
            throwable.printStackTrace();
        }
    }
}
