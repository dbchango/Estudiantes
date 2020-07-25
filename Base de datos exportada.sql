-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         10.1.45-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para trabajo
CREATE DATABASE IF NOT EXISTS `trabajo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `trabajo`;

-- Volcando estructura para tabla trabajo.estudiante
CREATE TABLE IF NOT EXISTS `estudiante` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla trabajo.estudiante: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` (`codigo`, `nombre`, `edad`, `direccion`) VALUES
	(1, 'David', 21, 'Pelileo'),
	(2, 'Erika', 24, 'Latacunga'),
	(3, 'Luis', 34, 'Latacunga'),
	(4, 'Alberto', 34, 'Pillar');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
