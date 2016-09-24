/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : graduation

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-09-20 15:15:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '班级id',
  `class_name` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `major_id` int(11) DEFAULT NULL COMMENT '专业id',
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `class_major_id` (`major_id`),
  CONSTRAINT `class_major_id` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int(11) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  `college_introduce` varchar(255) DEFAULT NULL,
  `grade_id` int(11) DEFAULT NULL,
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`college_id`),
  KEY `college_grade_id` (`grade_id`),
  CONSTRAINT `college_grade_id` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '年级id',
  `grade_name` varchar(255) DEFAULT NULL COMMENT '年级名称',
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`grade_id`),
  KEY `grade_id` (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业id',
  `major_name` varchar(255) DEFAULT NULL COMMENT '专业名称',
  `college_id` int(11) DEFAULT NULL COMMENT '学院id',
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`major_id`),
  KEY `major_college_id` (`college_id`),
  CONSTRAINT `major_college_id` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '论文编号',
  `paper_title` varchar(255) DEFAULT NULL COMMENT '论文题目',
  `paper_introduce` varchar(1000) DEFAULT NULL COMMENT '论文简介',
  `paper_agree` int(255) DEFAULT NULL COMMENT '审核是否通过',
  `paper_file` varchar(255) DEFAULT NULL,
  `stu_id` varchar(255) DEFAULT NULL COMMENT '选题学生',
  `tea_id` varchar(255) DEFAULT NULL COMMENT '指导老师',
  `paper_start` date DEFAULT NULL COMMENT '论文选题开始时间',
  `paper_end` date DEFAULT NULL COMMENT '论文选题结束时间',
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  `back_4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`paper_id`),
  KEY `paper_stu_id` (`stu_id`),
  KEY `paper_tea_id` (`tea_id`),
  CONSTRAINT `paper_stu_id` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `paper_tea_id` FOREIGN KEY (`tea_id`) REFERENCES `teacher` (`tea_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` varchar(255) NOT NULL COMMENT '学生id',
  `stu_name` varchar(255) DEFAULT NULL COMMENT '学生姓名',
  `stu_sex` int(11) DEFAULT NULL COMMENT '学生性别',
  `tea_id` varchar(255) DEFAULT NULL COMMENT '指导教师id',
  `grade_id` int(255) DEFAULT NULL COMMENT '年级id',
  `college_id` int(11) DEFAULT NULL COMMENT '学院id',
  `major_id` int(11) DEFAULT NULL COMMENT '专业id',
  `class_id` int(11) DEFAULT NULL COMMENT '班级id',
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `student_major_id` (`major_id`),
  KEY `student_class_id` (`class_id`),
  KEY `student_grade_id` (`grade_id`),
  KEY `student_tea_id` (`tea_id`),
  KEY `student_college_id` (`college_id`),
  CONSTRAINT `student_class_id` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `student_college_id` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `student_grade_id` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `student_major_id` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `student_stu_id` FOREIGN KEY (`stu_id`) REFERENCES `user` (`user_id`) ON UPDATE CASCADE,
  CONSTRAINT `student_tea_id` FOREIGN KEY (`tea_id`) REFERENCES `teacher` (`tea_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tea_id` varchar(255) NOT NULL COMMENT '教师id',
  `tea_name` varchar(255) DEFAULT NULL COMMENT '教师名称',
  `tea_sex` int(11) DEFAULT NULL COMMENT '教师性别',
  `paper_now` int(11) unsigned zerofill DEFAULT NULL COMMENT '论文发布数',
  `paper_limit` int(11) DEFAULT NULL COMMENT '论文发布上线',
  `grade_id` int(11) DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  `major_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tea_id`),
  KEY `teacher_grade_id` (`grade_id`),
  KEY `teacher_college_id` (`college_id`),
  KEY `teacher_major_id` (`major_id`),
  KEY `teacher_class_id` (`class_id`),
  CONSTRAINT `teacher_class_id` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `teacher_college_id` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `teacher_grade_id` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `teacher_major_id` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `teacher_tea_id` FOREIGN KEY (`tea_id`) REFERENCES `user` (`user_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_type` int(11) NOT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `back_1` varchar(255) DEFAULT NULL,
  `back_2` varchar(255) DEFAULT NULL,
  `back_3` varchar(255) DEFAULT NULL,
  `back_4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
