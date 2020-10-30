package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class TableC {

   private long id;
   private long dId;
   private  long age;
   private String bName;
   private String comment;
   private Date createDate;
   private Date updateDate;


}
