package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class TableA {

   private long id;
   private long bId;
   private  long age;
   private String comment;
   private Date createTime;
   private Date updateTime;


}
