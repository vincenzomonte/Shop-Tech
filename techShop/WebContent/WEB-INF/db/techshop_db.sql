
CREATE DATABASE IF NOT EXISTS techshop_db; 
USE techshop_db;


CREATE TABLE IF NOT EXISTS gestoreaccouting (
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  nome varchar(45) NOT NULL,
  cognome varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  sesso varchar(1) DEFAULT NULL,
  telefono varchar(15) NOT NULL,
  PRIMARY KEY (username)
);

DELETE FROM recensioni;
INSERT INTO recensioni (username,recensione) VALUES
	('admin', 'admin', '', '', NULL, NULL, ''),
	('admin1', 'admin1', '', '', NULL, NULL, '');
	
	
	CREATE TABLE IF NOT EXISTS recensioni (
  username varchar(255) NOT NULL,
  recensione varchar(255) NOT NULL,
 
);

DELETE FROM gestoreaccounting;
INSERT INTO gestoreaccounting (username, password, nome, cognome, email, sesso, telefono) VALUES
	('admin', 'admin', '', '', NULL, NULL, ''),
	('admin1', 'admin1', '', '', NULL, NULL, '');
	
	
	
	CREATE TABLE IF NOT EXISTS moderatore (
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  nome varchar(45) NOT NULL,
  cognome varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  sesso varchar(1) DEFAULT NULL,
  telefono varchar(15) NOT NULL,
  PRIMARY KEY (username)
);

DELETE FROM moderatore;
INSERT INTO moderatore (username, password, nome, cognome, email, sesso, telefono) VALUES
	('admin', 'admin', '', '', NULL, NULL, ''),
	('admin1', 'admin1', '', '', NULL, NULL, '');
	


CREATE TABLE IF NOT EXISTS cliente (
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  nome varchar(45) NOT NULL,
  cognome varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  sesso varchar(1) DEFAULT NULL,
  telefono varchar(15) NOT NULL,
  via varchar(45) NOT NULL,
  città varchar(45) NOT NULL,
  cap char(5) NOT NULL,
  PRIMARY KEY (username)
) ;

DELETE FROM cliente;
INSERT INTO cliente (username, password, nome, cognome, email, sesso, telefono, via, città, cap) VALUES
	('cliente1', 'cliente1', '', '', NULL, NULL, '', '', '', ''),
	('cliente2', 'cliente2', '', '', NULL, NULL, '', '', '', '');

CREATE TABLE IF NOT EXISTS venditore (
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  nome varchar(45) NOT NULL,
  cognome varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  sesso varchar(1) DEFAULT NULL,
  teleofono varchar(15) NOT NULL,
  via varchar(45) NOT NULL,
  città varchar(45) NOT NULL,
  cap varchar(5) NOT NULL,
  PRIMARY KEY (username)
);

DELETE FROM venditore;
INSERT INTO venditore (username, password, nome, cognome, email, sesso, teleofono, via, città, cap) VALUES
	('venditore1', 'venditore1', '', '', NULL, NULL, '', '', '', '');

