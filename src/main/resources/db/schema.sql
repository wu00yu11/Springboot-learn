CREATE TABLE country
( id int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  country_name varchar(255) DEFAULT NULL COMMENT '名称',
  country_code varchar(255) DEFAULT NULL COMMENT '代码',
  PRIMARY KEY (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家信息';
CREATE TABLE city
(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  state varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='市级信息';
CREATE TABLE user_info (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_name varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  password varchar(32) DEFAULT NULL COMMENT '密码',
  user_type varchar(2) DEFAULT NULL COMMENT '用户类型',
  enabled int(2) DEFAULT NULL COMMENT '是否可用',
  real_name varchar(32) DEFAULT NULL COMMENT '真实姓名',
  qq varchar(14) DEFAULT NULL COMMENT 'QQ',
  email varchar(100) DEFAULT NULL,
  tel varchar(255) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (id)
)
ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户信息表';