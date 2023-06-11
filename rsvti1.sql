-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: rsvti1
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autorizari_ir`
--

DROP TABLE IF EXISTS `autorizari_ir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autorizari_ir` (
  `autorizariId` int NOT NULL AUTO_INCREMENT,
  `dataAutorizare` date DEFAULT NULL,
  `nrRaport` varchar(255) DEFAULT NULL,
  `nrSerie` varchar(255) DEFAULT NULL,
  `scadenta` date DEFAULT NULL,
  `echipamenteId` int DEFAULT NULL,
  PRIMARY KEY (`autorizariId`),
  KEY `FK3e29ctg8vw20xcnss92u928tb` (`echipamenteId`),
  CONSTRAINT `FK3e29ctg8vw20xcnss92u928tb` FOREIGN KEY (`echipamenteId`) REFERENCES `echipamente_ir` (`echipamenteId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autorizari_ir`
--

LOCK TABLES `autorizari_ir` WRITE;
/*!40000 ALTER TABLE `autorizari_ir` DISABLE KEYS */;
INSERT INTO `autorizari_ir` VALUES (1,'2020-11-30','200-1241','98130566','2022-11-29',1),(2,'2018-11-08','203-1891','01012005','2020-11-07',1),(3,'2015-12-08','200-1058','98130566','2018-12-07',1),(4,'2021-07-30','199-555','246784','2023-07-29',3),(5,'2019-07-23','199-560','246784','2021-07-22',3),(6,'2016-08-29','199-650','246784','2019-08-01',3),(7,NULL,NULL,'2345',NULL,NULL),(8,NULL,NULL,'2345',NULL,NULL),(9,NULL,'389-1321','2345',NULL,NULL);
/*!40000 ALTER TABLE `autorizari_ir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `echipamente_ir`
--

DROP TABLE IF EXISTS `echipamente_ir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `echipamente_ir` (
  `echipamenteId` int NOT NULL AUTO_INCREMENT,
  `anFabricatie` date DEFAULT NULL,
  `inaltimeaMax` int DEFAULT NULL,
  `modelEchipament` varchar(255) DEFAULT NULL,
  `nrSerie` varchar(255) DEFAULT NULL,
  `razaMax` int DEFAULT NULL,
  `sarcinaNominala` int DEFAULT NULL,
  `statii` int DEFAULT NULL,
  `tipEchipament` varchar(255) DEFAULT NULL,
  `punctLucruId` int DEFAULT NULL,
  PRIMARY KEY (`echipamenteId`),
  KEY `FKnp8x9jqcqcijuxle7jty5d4dq` (`punctLucruId`),
  CONSTRAINT `FKnp8x9jqcqcijuxle7jty5d4dq` FOREIGN KEY (`punctLucruId`) REFERENCES `puncte_lucru` (`punctLucruId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `echipamente_ir`
--

LOCK TABLES `echipamente_ir` WRITE;
/*!40000 ALTER TABLE `echipamente_ir` DISABLE KEYS */;
INSERT INTO `echipamente_ir` VALUES (1,'2015-12-02',200,'EJE 116','98130566',NULL,1600,NULL,'Transpaleta',1),(2,'2011-11-10',2500,'EJC 112','98282297',NULL,1200,NULL,'Stivuitor',1),(3,'2016-05-08',1750,'Z256.01','246784',NULL,5000,NULL,'Elevator auto',2);
/*!40000 ALTER TABLE `echipamente_ir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `info_product`
--

DROP TABLE IF EXISTS `info_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info_product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `product_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKomi9f4gwemi9iarvuhrg0qsli` (`product_id`),
  CONSTRAINT `FKomi9f4gwemi9iarvuhrg0qsli` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info_product`
--

LOCK TABLES `info_product` WRITE;
/*!40000 ALTER TABLE `info_product` DISABLE KEYS */;
INSERT INTO `info_product` VALUES (1,9),(2,9),(3,10);
/*!40000 ALTER TABLE `info_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lista_firme`
--

DROP TABLE IF EXISTS `lista_firme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lista_firme` (
  `firmeId` int NOT NULL AUTO_INCREMENT,
  `cui` int DEFAULT NULL,
  `numeFirma` varchar(255) DEFAULT NULL,
  `recom` varchar(255) NOT NULL,
  PRIMARY KEY (`firmeId`),
  UNIQUE KEY `UK_80rwgg4cd1deqg7jpu36r8hr8` (`recom`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lista_firme`
--

LOCK TABLES `lista_firme` WRITE;
/*!40000 ALTER TABLE `lista_firme` DISABLE KEYS */;
INSERT INTO `lista_firme` VALUES (1,22891860,'Lidl SRL','J29/3212/2007'),(2,22280483,'Kaufland SRL','J08/4603/2010'),(8,11111111,'Firma Delete SRL','J00/0001/2000'),(9,22222222,'Firma Update SRL','J11/0002/2000'),(12,10322103,'Romstal srl','J10/3224/2003'),(13,27364719,'Dedeman SRL','J10/1155/2013');
/*!40000 ALTER TABLE `lista_firme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puncte_lucru`
--

DROP TABLE IF EXISTS `puncte_lucru`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puncte_lucru` (
  `punctLucruId` int NOT NULL AUTO_INCREMENT,
  `localitate` varchar(255) DEFAULT NULL,
  `numar` varchar(255) DEFAULT NULL,
  `strada` varchar(255) DEFAULT NULL,
  `firmeId` int DEFAULT NULL,
  `judetOrSector` varchar(255) DEFAULT NULL,
  `judet` varchar(255) DEFAULT NULL,
  `sector` int DEFAULT NULL,
  PRIMARY KEY (`punctLucruId`),
  KEY `FK3tr934rwwgoah2pkrpy1gqdaj` (`firmeId`),
  CONSTRAINT `FK3tr934rwwgoah2pkrpy1gqdaj` FOREIGN KEY (`firmeId`) REFERENCES `lista_firme` (`firmeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puncte_lucru`
--

LOCK TABLES `puncte_lucru` WRITE;
/*!40000 ALTER TABLE `puncte_lucru` DISABLE KEYS */;
INSERT INTO `puncte_lucru` VALUES (1,'Bucuresti','8','Iuliu Maniu',1,'6',NULL,NULL),(2,'Ilfov','14','Industriilor',1,'Ilfov',NULL,NULL),(5,'Bucuresti','1','Splaiul Unirii',NULL,NULL,'sector 4',NULL);
/*!40000 ALTER TABLE `puncte_lucru` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'James','Smith','james@rsvti.ro','1111','James'),(2,'William','Campbell','william@rsvti.ro','2222','William'),(3,'Michael','Anderson','michael@rsvti.ro','3333','Michael'),(4,'Noah','Jones','noah@rsvti.ro','4444','Noah'),(5,'Davis','Wilson','davis@rsvti.ro','5555','Davis'),(6,'Jack','Miller','jack@rsvti.ro','6666','Jack'),(7,'Julia','Taylor','julia@rsvti.ro','7777','Julia'),(8,'Oliver','Jackson','oliver@rsvti.ro','8888','Oliver'),(9,'Gabriel','Johnson','gabriel@rsvti.ro','9999','Gabriel'),(10,'Benjamin','Martinez','benjamin@rsvti.ro','1010','Benjamin'),(11,'Robert','Cooper','robert@rsvti.ro','1110','Robert'),(12,'Alexander','Allen','alexander@rsvti.ro','1212','Alexander'),(13,'Mihnea','Serban','mihnea@rsvti.ro','1313','Mihnea'),(14,'Andrew','Lee','andrew@rsvti.ro','1414','Andrew'),(15,'Mia','Parker','mia@rsvti.ro','1515','Mia'),(16,'Olivia','Moore','olivia@rsvti.ro','1616','Olivia'),(17,'Elizabeth','Carter','elizabeth@rsvti.ro','1717','Elizabeth'),(18,'Thomas','Harris','thomas@rsvti.ro','1818','Thomas');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-11 17:13:51
