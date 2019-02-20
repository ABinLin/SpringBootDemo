/*
Navicat MySQL Data Transfer

Source Server         : 测试
Source Server Version : 50643
Source Host           : 132.232.227.223:3306
Source Database       : test_base_1

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-02-04 16:54:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王昭君', '18');
INSERT INTO `user` VALUES ('2', '刘诗诗', '20');
INSERT INTO `user` VALUES ('3', '西施', '20');
INSERT INTO `user` VALUES ('4', '貂蝉', '18');
