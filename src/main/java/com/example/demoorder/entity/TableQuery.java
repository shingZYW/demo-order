package com.example.demoorder.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 此类用于测试Sql查询统一封装的实体
 */
@Data
@Accessors(chain = true)
public class TableQuery {
    private Long id;
    private Long bId;
    private Long age;
    private Long cId;
    private String comment;
    private String bName;
    private String aName;
    private Date createTime;
    private Date updateTime;
}
