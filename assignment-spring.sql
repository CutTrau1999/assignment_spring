-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2022 at 01:14 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assignment-spring`
--

-- --------------------------------------------------------

--
-- Table structure for table `districts`
--

CREATE TABLE `districts` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `districts`
--

INSERT INTO `districts` (`id`, `name`) VALUES
(1, 'Cau Giay'),
(2, 'Ba dinh'),
(3, 'Long Bien'),
(4, 'Hoang Mai'),
(5, 'Hai Ba Trung');

-- --------------------------------------------------------

--
-- Table structure for table `streets`
--

CREATE TABLE `streets` (
  `id` int(11) NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `district_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `streets`
--

INSERT INTO `streets` (`id`, `date`, `description`, `name`, `status`, `district_id`) VALUES
(1, '2009', 'Des', 'Tran Cung', 'Dang hoat dong', 1),
(2, '2018', 'Des', 'Doc Ngu', 'Dang sua chua', 2),
(3, '2018', 'Des', 'Giai Phong', 'Dang sua chua', 4),
(4, '2018', 'Des', 'Ton Duc Thang', 'Dang sua chua', 5),
(5, '2018', 'Des', 'Hoang Quoc Viet', 'Dang sua chua', 1),
(6, '2018', 'Des', 'Tran Quy Kien', 'Dang sua chua', 1),
(7, '2018', 'Des', 'Nguyen Khanh Toan', 'Dang sua chua', 1),
(8, '2018', 'Des', 'Kim Nguu', 'Dang hoat dong', 5),
(9, '2018', 'Des', 'Nguyen Van Cu', 'Dang thi cong', 3),
(10, '2018', 'Des', 'Quynh Mai', 'Dang thi cong', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `districts`
--
ALTER TABLE `districts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `streets`
--
ALTER TABLE `streets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK51kinwuua6bbmqx9jhbgukrjd` (`district_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `streets`
--
ALTER TABLE `streets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `streets`
--
ALTER TABLE `streets`
  ADD CONSTRAINT `FK51kinwuua6bbmqx9jhbgukrjd` FOREIGN KEY (`district_id`) REFERENCES `districts` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
