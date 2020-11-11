package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class TableB {

   private long id;
   private long cId;
   private  long age;
   private String aName;
   private String comment;
   private Date createTime;
   private Date updateTime;


}
