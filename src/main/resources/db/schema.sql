CREATE TABLE user_info (
  id int(11)  PRIMARY KEY,
  user_name varchar(32),
  pass_word varchar(32),
  user_type varchar(2),
  enabled int(2),
  real_name varchar(32),
  qq varchar(14),
  email varchar(100),
  tel varchar(255)
);

CREATE TABLE country
( id int(11)  PRIMARY KEY,
  country_name varchar(255),
  country_code varchar(255)
);
CREATE TABLE city
(
  id int(11) PRIMARY KEY,
  name varchar(255),
  state varchar(255)
);
