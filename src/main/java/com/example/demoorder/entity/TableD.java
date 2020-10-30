package com.example.demoorder.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class TableD {

   private long id;
   private long eId;
   private  long age;
   private String cName;
   private String comment;
   private Date createDate;
   private Date updateDate;


}
