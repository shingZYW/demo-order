package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class TableUnion {

    private long id;

    private long UnionId;

    private BigDecimal ageSum;

    private String name;

    private long age;


}
