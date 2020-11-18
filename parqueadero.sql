-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2020 a las 16:52:06
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `parqueadero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `dni` varchar(10) NOT NULL,
  `tipo_documento` int(11) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_factura`
--

CREATE TABLE `tbl_factura` (
  `numero` varchar(200) NOT NULL,
  `fecha_emision` date DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `tbl_ticket_codigo` decimal(10,2) NOT NULL,
  `tbl_cliente_dni` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ticket`
--

CREATE TABLE `tbl_ticket` (
  `codigo` decimal(10,2) NOT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `tiempo` decimal(10,0) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `fecha_crea` date DEFAULT NULL,
  `usua_crea` varchar(200) DEFAULT NULL,
  `tbl_vehiculo_placa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vehiculo`
--

CREATE TABLE `tbl_vehiculo` (
  `placa` varchar(200) NOT NULL,
  `marca` varchar(200) DEFAULT NULL,
  `color` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `tbl_factura`
--
ALTER TABLE `tbl_factura`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `tbl_factura_tbl_cliente_fk` (`tbl_cliente_dni`),
  ADD KEY `tbl_factura_tbl_ticket_fk` (`tbl_ticket_codigo`);

--
-- Indices de la tabla `tbl_ticket`
--
ALTER TABLE `tbl_ticket`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `tbl_ticket_tbl_vehiculo_fk` (`tbl_vehiculo_placa`);

--
-- Indices de la tabla `tbl_vehiculo`
--
ALTER TABLE `tbl_vehiculo`
  ADD PRIMARY KEY (`placa`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_factura`
--
ALTER TABLE `tbl_factura`
  ADD CONSTRAINT `tbl_factura_tbl_cliente_fk` FOREIGN KEY (`tbl_cliente_dni`) REFERENCES `tbl_cliente` (`dni`),
  ADD CONSTRAINT `tbl_factura_tbl_ticket_fk` FOREIGN KEY (`tbl_ticket_codigo`) REFERENCES `tbl_ticket` (`codigo`);

--
-- Filtros para la tabla `tbl_ticket`
--
ALTER TABLE `tbl_ticket`
  ADD CONSTRAINT `tbl_ticket_tbl_vehiculo_fk` FOREIGN KEY (`tbl_vehiculo_placa`) REFERENCES `tbl_vehiculo` (`placa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
