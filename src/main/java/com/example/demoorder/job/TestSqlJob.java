package com.example.demoorder.job;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.TableA;
import com.example.demoorder.service.ShingTestService;
import com.example.demoorder.service.TestSqlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component

public class TestSqlJob {

    private static Logger logger = LoggerFactory.getLogger(TestSqlJob.class);
    @Autowired
    private TestSqlService testSqlService;


    @Autowired
    private ShingTestService shingTestService;


    @Autowired
    private ShingTestMapper shingTestMapper;

    /**
     * 每隔10秒执行一次
     */

    @Scheduled(cron = "0/10 * * * * ?")
    public void testSqlJob() {

/*
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
        List<Map<String, Object>> tableUnionList = null;
        try {
            tableUnionList = shingTestService.testUnion();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("定时任务->>测试select *,union，group by，sum返回结果" + tableUnionList.toString());

        logger.info("定时任务->>测试sum and case");
        Map<String, BigDecimal> sum = null;
        try {
            sum = shingTestService.testSum(Long.valueOf(70L));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("定时任务->>测试sum and case返回结果:" + sum.toString());

        logger.info("定时任务->>测试in select");
        List<Map<String, Object>> testInSelectList = shingTestService.testInSelect(Long.valueOf(18L));
        logger.info("定时任务->>测试in select返回结果:" + testInSelectList.toString());

        logger.info("定时任务->>测试多个join,并且含有时间计算以及基本运算:");
        List<Map<String, Object>> NJoin = null;
        try {
            NJoin = shingTestService.testNJoin();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.info("定时任务->>测试多个join返回结果:" + NJoin.toString());

        List<TableA> tableASList1 = new ArrayList<>();
        TableA tableA1 = new TableA();
        tableA1.setId(115);
        tableA1.setAge(23);
        tableA1.setBId(123);
        tableA1.setComment("批量插入115");
        TableA tableA2 = new TableA();
        tableA2.setId(116);
        tableA2.setAge(23);
        tableA2.setBId(123);
        tableA2.setComment("批量插入115");
        tableASList1.add(tableA1);
        tableASList1.add(tableA2);
        try {
            logger.info("定时任务->>批量插入表a数据");
            shingTestService.insertListA(tableASList1);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
*/


        List<TableA> tableASList2 = new ArrayList<>();
        TableA tableA3 = new TableA();
        tableA3.setId(115);
        tableA3.setAge(23);
        tableA3.setBId(123);
        tableA3.setCreateTime(new Date());
        tableA3.setComment("批量更新115");
        TableA tableA4 = new TableA();
        tableA4.setId(116);
        tableA4.setAge(23);
        tableA4.setBId(123);
        tableA4.setCreateTime(new Date());
        tableA4.setComment("批量更新116");
        tableASList2.add(tableA3);
        tableASList2.add(tableA4);
        //tableASList2.add(new TableA().setId(117).setComment("批量更新117").setAge(19).setBId(213));
        //tableASList2.add(new TableA().setId(117).setComment("批量更新118").setAge(29).setBId(217));



        try {
            logger.info("定时任务->>批量更新表a数据" + tableASList2.toString());
            Integer res = 0;
            res = shingTestService.UpdateTableA(tableASList2);
            logger.info("==========更新" + res + "条数据============");
            logger.info("定时任务->>批量更新表a数据结束=====");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        logger.info("定时任务->>查询表a数据115,116");
        List<Map<String, Object>> table115 = shingTestMapper.selectTableAById(115L);
        logger.info("===================查询table115:===================" + table115.toString());
        List<Map<String, Object>> table116 = shingTestMapper.selectTableAById(116L);
        logger.info("===================查询able116:====================" + table116.toString());
        logger.info("=========================定时任务查询结束=======================================");
    }
}
