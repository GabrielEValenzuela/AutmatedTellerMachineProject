-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: Javabank
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cardTable`
--

DROP TABLE IF EXISTS `cardTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardTable` (
  `cardId` int(6) NOT NULL,
  `bankAssociated` varchar(15) NOT NULL,
  `customerAssociated` int(7) NOT NULL,
  `currentStatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`cardId`),
  UNIQUE KEY `customerAssociated` (`customerAssociated`),
  CONSTRAINT `cardTable_ibfk_1` FOREIGN KEY (`customerAssociated`) REFERENCES `customerTable` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardTable`
--

LOCK TABLES `cardTable` WRITE;
/*!40000 ALTER TABLE `cardTable` DISABLE KEYS */;
INSERT INTO `cardTable` VALUES (524711,'BANCOR',11,1),(524722,'NACION',111,0);
/*!40000 ALTER TABLE `cardTable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customerTable`
--

DROP TABLE IF EXISTS `customerTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customerTable` (
  `customerId` int(7) NOT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `balance` float DEFAULT NULL,
  `PIN` int(4) DEFAULT NULL,
  `doubleCheck` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerTable`
--

LOCK TABLES `customerTable` WRITE;
/*!40000 ALTER TABLE `customerTable` DISABLE KEYS */;
INSERT INTO `customerTable` VALUES (11,'Homero','Simpson','amantedelacomida53@yahoo.com',2500,808,0),(111,'Marge','Simpson','marge.s@gmail.com',500,707,1);
/*!40000 ALTER TABLE `customerTable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logTable`
--

DROP TABLE IF EXISTS `logTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logTable` (
  `atmId` int(7) DEFAULT NULL,
  `cards` int(7) NOT NULL,
  `modificationDate` date DEFAULT NULL,
  `modificationDescription` text,
  PRIMARY KEY (`cards`),
  CONSTRAINT `logTable_ibfk_1` FOREIGN KEY (`cards`) REFERENCES `cardTable` (`cardId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logTable`
--

LOCK TABLES `logTable` WRITE;
/*!40000 ALTER TABLE `logTable` DISABLE KEYS */;
/*!40000 ALTER TABLE `logTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-16  0:14:46
