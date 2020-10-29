package com.example.demoorder.Controller;

import com.example.demoorder.Mapper.ShingTestMapper;
import com.example.demoorder.entity.ShingTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ShingController {

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
        return shingTestMapper.selectList(null);

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


}
