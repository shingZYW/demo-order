package com.example.demoorder.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TableAReq extends TableA {


    private List<TableA> tableAList;

}
