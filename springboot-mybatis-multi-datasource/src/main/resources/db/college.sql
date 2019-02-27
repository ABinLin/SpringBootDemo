/*
Navicat MySQL Data Transfer

Source Server         : 132.232.227.223
Source Server Version : 50643
Source Host           : 132.232.227.223:3306
Source Database       : test_base_1

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-02-27 11:21:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT,
  `college_name` varchar(255) DEFAULT NULL COMMENT '学院名称',
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='学院表';

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES ('1', '计算机技术与工程学院');
INSERT INTO `college` VALUES ('2', '外语学院');
INSERT INTO `college` VALUES ('3', '土木学院');
INSERT INTO `college` VALUES ('4', '电气信息工程学院');
INSERT INTO `college` VALUES ('5', '能源与动力工程学院');
