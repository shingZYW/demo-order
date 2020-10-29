package com.example.demoorder.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class ShingTest implements Serializable {
    private long id;
    private String name;
    private String comment;
    private long status;
}
