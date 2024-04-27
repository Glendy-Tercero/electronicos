-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: electronico
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `nit` varchar(10) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Juan Pérez','2345657','juanperez@gmail.com',45673495),(2,'Luisa Ramírez','6759679','luisa12ramirez@gmail.com',35864563),(3,'Kevin Hernández','CF','hernandezkevin@gmail.com',59062451);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL AUTO_INCREMENT,
  `idProveedor` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `fk_compra_proveedor` (`idProveedor`),
  CONSTRAINT `fk_compra_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,1,'2022-11-21 00:00:00',2262.5),(2,1,'2022-12-11 00:00:00',5009.9),(3,2,'2022-05-13 00:00:00',1000),(4,2,'2023-01-17 00:00:00',2379.65),(5,3,'2023-12-25 00:00:00',610),(6,4,'2024-01-22 00:00:00',1357.5);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallecompra`
--

DROP TABLE IF EXISTS `detallecompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallecompra` (
  `idDetalleCompra` int(11) NOT NULL AUTO_INCREMENT,
  `idCompra` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `precioUnitario` double DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idDetalleCompra`),
  KEY `fk_detalleCompra_compra` (`idCompra`),
  KEY `fk_detalleCompra_producto` (`idProducto`),
  CONSTRAINT `fk_detalleCompra_compra` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  CONSTRAINT `fk_detalleCompra_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallecompra`
--

LOCK TABLES `detallecompra` WRITE;
/*!40000 ALTER TABLE `detallecompra` DISABLE KEYS */;
INSERT INTO `detallecompra` VALUES (1,1,1,90.5,25,2262.5),(2,2,2,500.99,10,5009.9),(3,3,3,20,50,1000),(4,4,4,67.99,35,2379.65),(5,5,5,30.5,20,610),(6,6,1,90.5,15,1357.5);
/*!40000 ALTER TABLE `detallecompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleventa`
--

DROP TABLE IF EXISTS `detalleventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalleventa` (
  `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT,
  `idVenta` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `precioUnitario` double DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idDetalleVenta`),
  KEY `fk_detalleVenta_venta` (`idVenta`),
  KEY `fk_detalleVenta_producto` (`idProducto`),
  CONSTRAINT `fk_detalleVenta_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  CONSTRAINT `fk_detalleVenta_venta` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleventa`
--

LOCK TABLES `detalleventa` WRITE;
/*!40000 ALTER TABLE `detalleventa` DISABLE KEYS */;
INSERT INTO `detalleventa` VALUES (1,1,2,500.99,1,500.99),(2,2,1,90.5,1,90.5),(3,3,3,20,2,40),(4,4,4,67.99,1,67.99),(5,5,5,30.5,2,61),(6,6,1,90.5,1,90.5);
/*!40000 ALTER TABLE `detalleventa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `idVenta` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `fk_factura_venta` (`idVenta`),
  CONSTRAINT `fk_factura_venta` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,1,'2023-12-11 00:00:00',500.99),(2,2,'2023-12-11 00:00:00',90.5),(3,3,'2023-05-03 00:00:00',40),(4,4,'2024-01-23 00:00:00',67.99),(5,5,'2024-03-12 00:00:00',61),(6,6,'2024-03-12 00:00:00',90.5);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `existencia` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Luces LED',90.5,35),(2,'Televisión LG',500.99,10),(3,'Cargador USB',20,50),(4,'Ventilador',67.99,35),(5,'Audifonos',30.5,20);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Tecnología','2 Av. Zona 1','tecnologia@gmail.com',45236789),(2,'Electrónica','16 Av. Zona 6','electronica@gmail.com',35893412),(3,'Innovación','20 Av. Zona 18','innovacion@gmail.com',23456789),(4,'Distribuidor','8 Av. Zona 9','distribuidor@gmail.com',54378680);
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedorproducto`
--

DROP TABLE IF EXISTS `proveedorproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedorproducto` (
  `idProveedorProducto` int(11) NOT NULL AUTO_INCREMENT,
  `idProveedor` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProveedorProducto`),
  KEY `fk_proveedorProducto_proveedor` (`idProveedor`),
  KEY `fk_proveedorProducto_producto` (`idProducto`),
  CONSTRAINT `fk_proveedorProducto_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  CONSTRAINT `fk_proveedorProducto_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedorproducto`
--

LOCK TABLES `proveedorproducto` WRITE;
/*!40000 ALTER TABLE `proveedorproducto` DISABLE KEYS */;
INSERT INTO `proveedorproducto` VALUES (1,1,1),(2,1,2),(3,2,3),(4,2,4),(5,3,5),(6,4,1);
/*!40000 ALTER TABLE `proveedorproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_venta_cliente` (`idCliente`),
  CONSTRAINT `fk_venta_cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,1,'2023-12-11 00:00:00',500.99),(2,1,'2023-12-11 00:00:00',90.5),(3,2,'2023-05-03 00:00:00',40),(4,3,'2024-01-23 00:00:00',67.99),(5,3,'2024-03-12 00:00:00',61),(6,3,'2024-03-12 00:00:00',90.5);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-27 16:36:37
