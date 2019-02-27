/*
Navicat MySQL Data Transfer

Source Server         : 132.232.227.223
Source Server Version : 50643
Source Host           : 132.232.227.223:3306
Source Database       : test_user_1

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-02-27 11:21:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_login
-- ----------------------------
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录验证表';

-- ----------------------------
-- Records of user_login
-- ----------------------------
INSERT INTO `user_login` VALUES ('1', '1', '1');
DROP TRIGGER IF EXISTS `user_login_to_2`;
DELIMITER ;;
CREATE TRIGGER `user_login_to_2` AFTER INSERT ON `user_login` FOR EACH ROW BEGIN
  INSERT INTO test_user_2.user_login (user_id, username,pwd) 
  VALUES
    (NEW.user_id,NEW.username,NEW.pwd);
END
;;
DELIMITER ;
