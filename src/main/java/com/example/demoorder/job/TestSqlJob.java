package com.example.demoorder.job;

import com.example.demoorder.service.ShingTestService;
import com.example.demoorder.service.TestSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSqlJob {
    @Autowired
    private TestSqlService testSqlService;

    @Autowired
    private ShingTestService shingTestService;

    /**
     * 每隔5分钟执行一次
     */
    @Scheduled(cron = "0 */5 * * * ?")
    public void testSqlJob() {
        testSqlService.testNotExistsAndSubQuery(66L);
        testSqlService.testComplexSqlAsChildTable("测试哈哈");
        testSqlService.testSelectAndLeftJoin();
        testSqlService.testSumAndGroupBy(66L);

        shingTestService.testInSelect(18L);
        shingTestService.testSum(70L);
        shingTestService.testUnion();
        shingTestService.testNJoin();
    }
}
