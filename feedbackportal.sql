-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 05:57 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `feedbackportal`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`id`, `email`, `name`, `password`) VALUES
(1, 'shikhishukla123@gmail.com', 'Shikhi Shukla', 'shikhishukla123');

-- --------------------------------------------------------

--
-- Table structure for table `admin_entity`
--

CREATE TABLE `admin_entity` (
  `id` bigint(20) NOT NULL,
  `questions` varchar(255) DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `option5` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_entity`
--

INSERT INTO `admin_entity` (`id`, `questions`, `option1`, `option2`, `option3`, `option4`, `option5`) VALUES
(1, 'You are satisfied with the quality of layout and content (courseware)', '1', '2', '3', '4', '5'),
(2, 'You are satisfied with the binding & printing of courseware', '1', '2', '3', '4', '5'),
(3, 'You are satisfied with the timely receipt of courseware', '1', '2', '3', '4', '5'),
(4, 'You are able to follow instructions for lab/ exercises with ease.', '1', '2', '3', '4', '5'),
(5, 'Your faculty is able to draw participation from the class by asking questions', '1', '2', '3', '4', '5'),
(6, 'Your sessions begin and end on time.', '1', '2', '3', '4', '5'),
(7, 'Your sessions are held as per the Module milestones as communicated to you', '1', '2', '3', '4', '5'),
(8, 'Your faculty demonstrated a thorough knowledge of the content covered', '1', '2', '3', '4', '5'),
(9, 'Your faculty handled your queries during Class and Labs time', '1', '2', '3', '4', '5'),
(10, 'You are satisfied with the completion of the stated objectives of the module', '1', '2', '3', '4', '5'),
(11, 'You are satisfied with the BTES services on – \r\n•	Soft-Skill Sessions\r\n•	Aptitude Sessions\r\n•	Mac Sessions\r\n•	Linux sessions\r\n', '1', '2', '3', '4', '5'),
(12, 'You are satisfied with quality of Machine Practice exercises and their relevance to your sessions.', '1', '2', '3', '4', '5'),
(13, 'You are able to complete all Practical exercises on time.', '1', '2', '3', '4', '5'),
(14, 'You are satisfied with the availability of working computers inside the Labs', '1', '2', '3', '4', '5'),
(15, 'You are satisfied with the availability of software and tools required to perform exercises during the lab sessions.', '1', '2', '3', '4', '5'),
(16, 'You are satisfied with the support and guidance provided during Machine Room session', '1', '2', '3', '4', '5'),
(17, 'You are satisfied with the action taken by BTES on the earlier feedback shared by you', '1', '2', '3', '4', '5'),
(18, 'Your queries regarding various services due to you at the center are handled properly \r\n•	Fee Payments/Plans\r\n•	ID Card\r\n•	Access Cards\r\n•	Timely courseware material\r\n', '1', '2', '3', '4', '5'),
(19, 'You are satisfied with the hygiene and provision of basic amenities\r\n•	Cleanliness \r\n•	Drinking water\r\n•	Air-conditioning/ Fans\r\n•	Chairs \r\n•	Light\r\n•	Overall Ambience of the Centre\r\n', '1', '2', '3', '4', '5'),
(20, 'Your centre informs you timely about the class rescheduling.', '1', '2', '3', '4', '5');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(27);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `ids` int(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `password` varchar(20) NOT NULL,
  `cpass` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`ids`, `firstname`, `lastname`, `password`, `cpass`, `email`) VALUES
(1, 'Damanjeet', 'kaur', 'daman9910', 'daman9910', 'damanjeetkaur6774@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `id` varchar(255) NOT NULL,
  `question1` varchar(255) NOT NULL,
  `question2` varchar(255) NOT NULL,
  `question3` varchar(255) NOT NULL,
  `question4` varchar(255) NOT NULL,
  `question5` varchar(255) NOT NULL,
  `question6` varchar(255) NOT NULL,
  `question7` varchar(255) NOT NULL,
  `question8` varchar(255) NOT NULL,
  `question9` varchar(255) NOT NULL,
  `question10` varchar(255) NOT NULL,
  `question11` varchar(255) NOT NULL,
  `question12` varchar(255) NOT NULL,
  `question13` varchar(255) NOT NULL,
  `question14` varchar(255) NOT NULL,
  `question15` varchar(255) NOT NULL,
  `question16` varchar(255) NOT NULL,
  `question17` varchar(255) NOT NULL,
  `question18` varchar(255) NOT NULL,
  `question19` varchar(255) NOT NULL,
  `question20` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`id`, `question1`, `question2`, `question3`, `question4`, `question5`, `question6`, `question7`, `question8`, `question9`, `question10`, `question11`, `question12`, `question13`, `question14`, `question15`, `question16`, `question17`, `question18`, `question19`, `question20`) VALUES
('1', 'Very Good', 'Outstanding', 'Very Good', 'Outstanding', 'Outstanding', 'Outstanding', 'Good', 'Outstanding', 'Outstanding', 'Outstanding', 'Outstanding', 'Outstanding', 'Outstanding', 'Outstanding', 'Very Good', 'Outstanding', 'Outstanding', 'Very Good', 'Outstanding', 'Outstanding');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(200) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `batch` varchar(255) DEFAULT NULL,
  `technology` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `name`, `password`, `batch`, `technology`) VALUES
('RCH01190266', 'anmolkaur4554@gmail.com', 'Anmolpreet Kaur', 'anmolkaur123', 'Java/0102', 'Java'),
('RCH01190236', 'baljindersingh123@gmail.com', 'Baljinder Singh', 'baljinder123', 'Java/0102', 'Java'),
('RCH01190265', 'damanjeetkaur6774@gmail.com', 'Damanjeet Kaur', 'daman123', 'java/0102', 'Java'),
('RCH01190235', 'gagan1230@gmail.com', 'Gagandeep Kaur', 'gaggu123', 'java/0102', 'Java'),
('RCH01190234', 'kashveerr453@gmail.com', 'Kashveer Randhawa', 'kashveer123', 'Java/0102', 'Java'),
('RCH01190354', 'priyanka654@gmail.com', 'Priyanka ', 'priyanka2345', 'java/0102', 'Java'),
('RCH0911234', 'rndpkaur.12@gmail.com', 'Randeep Kaur', '', 'Java/0102', 'Java');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `admin_entity`
--
ALTER TABLE `admin_entity`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`ids`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `ids` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
