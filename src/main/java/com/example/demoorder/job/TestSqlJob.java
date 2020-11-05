package com.example.demoorder.job;

import com.example.demoorder.entity.TableQuery;
import com.example.demoorder.service.ShingTestService;
import com.example.demoorder.service.TestSqlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component

public class TestSqlJob {

    private static Logger logger = LoggerFactory.getLogger(TestSqlJob.class);
    @Autowired
    private TestSqlService testSqlService;


    @Autowired
    private ShingTestService shingTestService;

    /**
     * 每隔1分钟执行一次
     */

    @Scheduled(cron = "0 */3 * * * ?")
    public void testSqlJob() {

        logger.info("=========================定时任务查询开始=======================================");
        List<TableQuery> list1 = testSqlService.testNotExistsAndSubQuery(66L);
        logger.info("定时任务->>测试 not exists子查询->>>" + list1.toString());

        List<TableQuery> list2 = testSqlService.testComplexSqlAsChildTable("测试哈哈");
        logger.info("定时任务->>测试 复杂SQL作为子表->>>" + list2.toString());

        List<TableQuery> list3 = testSqlService.testSelectAndLeftJoin();
        logger.info("定时任务->>测试 select * from left join->>>" + list3.toString());

        List<TableQuery> list4 = testSqlService.testSumAndGroupBy(66L);
        logger.info("定时任务->>测试 sum and group by->>>" + list4.toString());


        logger.info("定时任务->>测试select *,union，group by，sum:");
        List<Map<String, Object>> tableUnionList = shingTestService.testUnion();
        logger.info("定时任务->>测试select *,union，group by，sum返回结果" + tableUnionList.toString());

        logger.info("定时任务->>测试sum and case");
        Map<String, BigDecimal> sum = shingTestService.testSum(Long.valueOf(70L));
        logger.info("定时任务->>测试sum and case返回结果:" + sum.toString());

        logger.info("定时任务->>测试in select");
        List<Map<String, Object>> testInSelectList = shingTestService.testInSelect(Long.valueOf(18L));
        logger.info("定时任务->>测试in select返回结果:" + testInSelectList.toString());

        logger.info("定时任务->>测试多个join,并且含有时间计算以及基本运算:");
        List<Map<String, Object>> NJoin = shingTestService.testNJoin();
        logger.info("定时任务->>测试多个join返回结果:" + NJoin.toString());
        logger.info("=========================定时任务查询结束=======================================");
    }
}
