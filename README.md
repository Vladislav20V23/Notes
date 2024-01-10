Проект с применением REST API 
*к нему написан и размещен в моем репозитории клиент "RestClient"

Использовались: 
@ControllerAdvice
@ExceptionHandler
@RestController
@RequestMapping ...

POST http запросы можно посылать с помощью приложения Postman.


На основе конфигурационного Config.java файла.

MySQL для проекта:
CREATE DATABASE  my_db;
USE my_db;

CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  PRIMARY KEY (id)
);
