DROP DATABASE IF EXISTS BotigaInformatica;

CREATE DATABASE BotigaInformatica;

USE BotigaInformatica;

-- Estructura de la taula CLIENTS
SELECT "Creant la taula de CLIENTS";

CREATE TABLE CLIENTS (
codi_client     smallint unsigned NOT NULL AUTO_INCREMENT, 
nom_client      varchar(50) NOT NULL, 
adressa_client  varchar(200) NOT NULL, 
telefon_client  varchar(9) NOT NULL, 
correu_client  varchar(30) NOT NULL, 
    PRIMARY KEY (codi_client)
);

