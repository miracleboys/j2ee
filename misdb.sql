/*
 Navicat Premium Data Transfer

 Source Server         : My
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : misdb

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 16/11/2022 09:24:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_coderole
-- ----------------------------
DROP TABLE IF EXISTS `t_coderole`;
CREATE TABLE `t_coderole`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `caption` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_coderole
-- ----------------------------
INSERT INTO `t_coderole` VALUES (1, '00', '管理员');
INSERT INTO `t_coderole` VALUES (2, '01', '超级会员');
INSERT INTO `t_coderole` VALUES (3, '02', '普通会员');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `caption` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (3, 'wangsan', '王三', '135665');
INSERT INTO `t_user` VALUES (4, 'zhangli', '张力', '55556');

-- ----------------------------
-- Table structure for t_userrole
-- ----------------------------
DROP TABLE IF EXISTS `t_userrole`;
CREATE TABLE `t_userrole`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `roleCode` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`, `roleCode`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_userrole
-- ----------------------------
INSERT INTO `t_userrole` VALUES (1, 'wangsan', '00');
INSERT INTO `t_userrole` VALUES (2, 'zhangli', '01');

SET FOREIGN_KEY_CHECKS = 1;
