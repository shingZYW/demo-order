DROP TABLE IF EXISTS `table_a`;

CREATE TABLE `table_a` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `b_id` bigint(20) NOT NULL COMMENT 'b的id',
  `age` bigint(20) COMMENT '列注释填充',
  `comment` varchar(255) COMMENT '列注释填充',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '列注释填充',
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB ;

DROP TABLE IF EXISTS `table_b`;

CREATE TABLE `table_b` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `a_name`varchar(50)DEFAULT NULL COMMENT 'a的名字',
  `c_id` bigint(20) DEFAULT NULL COMMENT 'c的id',
  `age` bigint(20) COMMENT '列注释填充',
  `comment` varchar(255) COMMENT '列注释填充',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '列注释填充',
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB ;

DROP TABLE IF EXISTS `table_c`;

CREATE TABLE `table_c` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `d_id` bigint(20) NOT NULL COMMENT 'b的id',
  `b_name` varchar(50)DEFAULT NULL COMMENT 'b的名字',
  `age` bigint(20) COMMENT '列注释填充',
  `comment` varchar(255) COMMENT '列注释填充',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '列注释填充',
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB ;

DROP TABLE IF EXISTS `table_d`;

CREATE TABLE `table_d` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `e_id` bigint(20) NOT NULL COMMENT 'e的id',
  `c_name`varchar(50)DEFAULT NULL COMMENT 'c的名字',
  `age` bigint(20) COMMENT '列注释填充',
  `comment` varchar(255) COMMENT '列注释填充',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '列注释填充',
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB ;

DROP TABLE IF EXISTS `table_e`;

CREATE TABLE `table_e` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `d_name`varchar(50)DEFAULT NULL COMMENT 'd的名字',
  `e_name`varchar(50)DEFAULT NULL COMMENT 'e的名字',
  `age` bigint(20) COMMENT '列注释填充',
  `comment` varchar(255) COMMENT '列注释填充',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '列注释填充',
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB ;