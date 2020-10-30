package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TableUnion {

    private long id;

    private long UnionId;

    private long ageSum;

    private String name;

    private long age;


}
