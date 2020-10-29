package com.example.demoorder.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class TableFour implements Serializable {
    private long id;
    private String name;
    private String four;
    private long status;

}
