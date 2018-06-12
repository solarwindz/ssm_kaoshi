/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50636
Source Host           : localhost:3306
Source Database       : kaoshi

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2017-09-08 20:24:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for k_dept
-- ----------------------------
DROP TABLE IF EXISTS `k_dept`;
CREATE TABLE `k_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of k_dept
-- ----------------------------
INSERT INTO `k_dept` VALUES ('1', '张三', '56', '2017-08-07');
INSERT INTO `k_dept` VALUES ('2', '李四', '47', '2017-09-04');
INSERT INTO `k_dept` VALUES ('3', '王五', '36', '2017-09-05');
