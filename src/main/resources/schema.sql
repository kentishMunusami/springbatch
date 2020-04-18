drop table if exists users;

CREATE TABLE users (
  id_user INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250),
  dept VARCHAR(250),
  account FLOAT
);