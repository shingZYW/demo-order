package com.example.demoorder.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Tablethree implements Serializable {
    private long id;
    private String name;
    private String three;
    private long status;

}
