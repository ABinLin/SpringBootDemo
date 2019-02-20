/*
Navicat MySQL Data Transfer

Source Server         : 测试
Source Server Version : 50643
Source Host           : 132.232.227.223:3306
Source Database       : test_base_1

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-02-04 16:54:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for political_status
-- ----------------------------
DROP TABLE IF EXISTS `political_status`;
CREATE TABLE `political_status` (
  `political_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `political_status_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`political_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='政治面貌表';

-- ----------------------------
-- Records of political_status
-- ----------------------------
INSERT INTO `political_status` VALUES ('1', '中共党员');
INSERT INTO `political_status` VALUES ('2', '团员');
INSERT INTO `political_status` VALUES ('3', '群众');
INSERT INTO `political_status` VALUES ('4', '国民党员');
INSERT INTO `political_status` VALUES ('5', '测试数据');
