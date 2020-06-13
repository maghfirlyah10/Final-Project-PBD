-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2020 at 04:05 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_taufikjuice`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_datajuice`
--

CREATE TABLE `tb_datajuice` (
  `idjuice` int(11) NOT NULL,
  `kode_juice` varchar(15) NOT NULL,
  `nama_juice` varchar(30) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `harga` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_datajuice`
--

INSERT INTO `tb_datajuice` (`idjuice`, `kode_juice`, `nama_juice`, `satuan`, `harga`) VALUES
(1, 'A-1', 'Jambu', '1', 5000),
(4, 'A-3', 'Melon', '1', 5000),
(5, 'A-4', 'Apel', '1', 7000),
(7, 'A-5', 'Jeruk', '1', 5000),
(8, 'A-6', 'Nanas', '1', 5000),
(9, 'A-7', 'Belimbing', '1', 5000),
(10, 'A-8', 'Mangga', '1', 7000),
(11, 'A-9', 'Alpukat', '1', 9000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_datajuice`
--
ALTER TABLE `tb_datajuice`
  ADD PRIMARY KEY (`idjuice`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_datajuice`
--
ALTER TABLE `tb_datajuice`
  MODIFY `idjuice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
