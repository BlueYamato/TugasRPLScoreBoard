-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2017 at 02:48 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `weightlifting`
--

-- --------------------------------------------------------

--
-- Table structure for table `athlete`
--

CREATE TABLE `athlete` (
  `noUrut` int(11) NOT NULL,
  `weight` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  `name` text NOT NULL,
  `nationality` text NOT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `idClass` int(11) NOT NULL,
  `className` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `decision`
--

CREATE TABLE `decision` (
  `matchId` int(11) NOT NULL,
  `juri1` tinyint(1) NOT NULL,
  `juri2` tinyint(1) NOT NULL,
  `juri3` tinyint(1) NOT NULL,
  `ref1` tinyint(1) NOT NULL,
  `ref2` tinyint(1) NOT NULL,
  `ref3` tinyint(1) NOT NULL,
  `ref4` tinyint(1) NOT NULL,
  `ref5` tinyint(1) NOT NULL,
  `finalDecision` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertandingan`
--

CREATE TABLE `pertandingan` (
  `matchId` int(11) NOT NULL,
  `idAtlet` int(11) NOT NULL,
  `idKategori` int(11) NOT NULL,
  `snatch1` int(11) NOT NULL,
  `snatch2` int(11) NOT NULL,
  `snatch3` int(11) NOT NULL,
  `cj1` int(11) NOT NULL,
  `cj2` int(11) NOT NULL,
  `cj3` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `athlete`
--
ALTER TABLE `athlete`
  ADD PRIMARY KEY (`noUrut`),
  ADD KEY `idClass` (`idClass`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`idClass`);

--
-- Indexes for table `pertandingan`
--
ALTER TABLE `pertandingan`
  ADD PRIMARY KEY (`matchId`),
  ADD KEY `idAtlet` (`idAtlet`),
  ADD KEY `idKategori` (`idKategori`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `athlete`
--
ALTER TABLE `athlete`
  ADD CONSTRAINT `athlete_ibfk_1` FOREIGN KEY (`idClass`) REFERENCES `category` (`idClass`);

--
-- Constraints for table `pertandingan`
--
ALTER TABLE `pertandingan`
  ADD CONSTRAINT `pertandingan_ibfk_1` FOREIGN KEY (`idAtlet`) REFERENCES `athlete` (`noUrut`),
  ADD CONSTRAINT `pertandingan_ibfk_2` FOREIGN KEY (`idKategori`) REFERENCES `category` (`idClass`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
