drop table if exists users;
drop table if exists employee;

CREATE TABLE users (
  id_user INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250),
  dept VARCHAR(250),
  account FLOAT
);

CREATE TABLE employee (
  id_employee INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250),
  lastname VARCHAR(250),
  age INTEGER,
  salary FLOAT
);