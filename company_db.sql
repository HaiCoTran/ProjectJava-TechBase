-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2021 at 08:24 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `company_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `department_tbl`
--

CREATE TABLE `department_tbl` (
  `departmentid` varchar(12) NOT NULL,
  `departmentname` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department_tbl`
--

INSERT INTO `department_tbl` (`departmentid`, `departmentname`) VALUES
('01_DEV', 'DEV'),
('02_TEST', 'TEST'),
('1111', '11111'),
('aa22', '222'),
('aa44', 'co1'),
('abc', 'abc'),
('abcd', 'aa'),
('cc', 'ccc'),
('co', 'co1'),
('hh', 'hh'),
('Ko', 'aaa'),
('ok', 'aaaa'),
('pb1', 'phong ban'),
('Test11', '1bc'),
('testcount', 'co1');

-- --------------------------------------------------------

--
-- Table structure for table `employee_tbl`
--

CREATE TABLE `employee_tbl` (
  `employeeid` varchar(12) NOT NULL,
  `employeename` varchar(50) NOT NULL,
  `departmentid` varchar(12) NOT NULL,
  `teamid` varchar(12) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_tbl`
--

INSERT INTO `employee_tbl` (`employeeid`, `employeename`, `departmentid`, `teamid`, `address`, `phone`) VALUES
('01_NV1', 'Hoa', '01', '02', '!23 Nguyễn Đình Chiểu', 98765432),
('09', 'Co', 'aa22', '01_T', '123 Nguyen Duy', 667890),
('3', 'Vinh', 'Test11', '45A', '123 Nguyen Duy', 1223444),
('34', 'cohn', '02_TEST', '02_T', '123 Hai Ba Trung', 123456789),
('Cotest', 'Co', 'abcd', '45A', '123 Hai Ba Trung', 1234567890),
('KL', 'Co co', '02_TEST', '45A', '123 Nguyen Duy', 833849668),
('teste', 'Co', '01_DEV', '01_T', '123 Nguyen Duy', 666666),
('Vinh_id', 'vinh', '02_TEST', '02_T', 'Quan 7', 833778878);

-- --------------------------------------------------------

--
-- Table structure for table `team_tbl`
--

CREATE TABLE `team_tbl` (
  `teamid` varchar(12) NOT NULL,
  `teamname` varchar(50) NOT NULL,
  `departmentid` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `team_tbl`
--

INSERT INTO `team_tbl` (`teamid`, `teamname`, `departmentid`) VALUES
('01_T', 'Team1', 'abc'),
('02_T', 'Team2', 'abc'),
('03_T', 'Team3', 'abc'),
('45A', 'TeamA', 'aa'),
('67', 'TeamA2', 'aa22'),
('ATest', 'Team A', '02_TEST'),
('rrrr', 'rh', '01_DEV'),
('Team5', 'Du an A', 'aaaa'),
('testpb', 'TeamA', '01_DEV');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department_tbl`
--
ALTER TABLE `department_tbl`
  ADD PRIMARY KEY (`departmentid`);

--
-- Indexes for table `employee_tbl`
--
ALTER TABLE `employee_tbl`
  ADD PRIMARY KEY (`employeeid`);

--
-- Indexes for table `team_tbl`
--
ALTER TABLE `team_tbl`
  ADD PRIMARY KEY (`teamid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
