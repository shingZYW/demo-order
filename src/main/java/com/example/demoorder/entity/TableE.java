package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class TableE {

   private long id;
   private  long age;
   private String dName;
   private String eName;
   private String comment;
   private Date createTime;
   private Date updateTime;

}
