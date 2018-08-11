/*
 Navicat Premium Data Transfer

 Source Server         : lhm
 Source Server Type    : MySQL
 Source Server Version : 50143
 Source Host           : localhost:3306
 Source Schema         : tongxunlu

 Target Server Type    : MySQL
 Target Server Version : 50143
 File Encoding         : 65001

 Date: 11/08/2018 08:48:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `性别` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `生日` datetime DEFAULT NULL,
  `移动电话` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `固定电话` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `公司地址` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `EMail` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `家庭地址` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `组别` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `备注` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `MSNQQ` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`姓名`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('11', '男', '1905-05-30 00:00:00', '11111', '11', '', '', '', '无', '', '');
INSERT INTO `address` VALUES ('三毛', '男', '1905-05-31 00:00:00', '1359695664', '564698454', '吉林长春', '', '吉林长春', '同事', '看书', '');
INSERT INTO `address` VALUES ('宋六', '女', '1905-05-24 00:00:00', '135668580', '123132213', '吉林长春', '', '吉林长春', '网友', '看书', '');
INSERT INTO `address` VALUES ('张三', '女', '1995-06-03 00:00:00', '135800000', '0431000256', '吉林', '', '吉林', '好友', '', '');
INSERT INTO `address` VALUES ('李三', '男', '1995-06-12 00:00:00', '213213424', '2342424', '吉林', '', '吉林', '亲戚', '爱喝酒', '');
INSERT INTO `address` VALUES ('江三', '男', '2002-05-08 00:00:00', '135693562', '05582563652', '阜阳', NULL, '阜阳', '朋友', '看书', NULL);
INSERT INTO `address` VALUES ('王红', '女', '1996-12-08 00:00:00', '135624865', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '姓名',
  `telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '手机',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
  `email` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'email',
  `qq` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'qq号',
  `weiChat` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '微信号',
  `weibo` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '微博',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, '张三', '2512145', '13588659547', '安徽阜阳市清河西路1号13楼1单元101', 'zhangsan@126.com', '25145114', 'zhangsanfuy', 'zhangsanweibo');
INSERT INTO `userinfo` VALUES (2, '刘备', '1251466', '12545845121', '吉林', 'iu@123.com', '2244551', 'liubei', 'liubeiweibo');
INSERT INTO `userinfo` VALUES (3, '张飞', '54455112', '15484584521', '河南郑州', 'zhangfei@126.com', '54211545', 'zhangfeiweixin', 'zhangfeiweibo');
INSERT INTO `userinfo` VALUES (4, '赵云', '542122545', '15452456521', '安徽淮南', 'zhaoyun@sina.com', '2545555', 'zhaoyunwei', 'zhaoyun1224');
INSERT INTO `userinfo` VALUES (5, '诸葛亮', '332665', '12546521241', '合肥市', 'zhuge@126.com', '554555', 'weiklkkjj', 'zhuge23');
INSERT INTO `userinfo` VALUES (6, '黄忠', '215426552', '15155866952', '南京市', 'huangzhong@163.com', '5445221155', 'huangzhongwei', 'zhuangwekk');
INSERT INTO `userinfo` VALUES (8, '孟获', '2511652', '13855695874', '芜湖市', 'menghuo@123.com', '545544121', 'menghuo3', 'menghuo555');
INSERT INTO `userinfo` VALUES (9, '曹操', '2154652', '15265245214', '亳州', '2323@123.com', '1212312', 'weijlj', 'weriwsfjl');
INSERT INTO `userinfo` VALUES (10, '赵六', '23322323', '12652545845', '天津', '25455415@qq.com', '54455445', 'zhaoliuwei', 'zhaoliuweibo');
INSERT INTO `userinfo` VALUES (11, '李四', '23232323', '15236524587', '兰州市', '2245541@qq.com', '545125544', 'lisiweixin', 'lisiweibo');
INSERT INTO `userinfo` VALUES (12, '王胜', '25465124', '13588465210', '上海市', 'wangs@163.com', '5455121', 'wangshengwei', 'wangshengweibo');

-- ----------------------------
-- Table structure for userpass
-- ----------------------------
DROP TABLE IF EXISTS `userpass`;
CREATE TABLE `userpass`  (
  `用户名` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `密码` int(11) DEFAULT NULL,
  PRIMARY KEY (`用户名`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userpass
-- ----------------------------
INSERT INTO `userpass` VALUES ('lhm', 123);

SET FOREIGN_KEY_CHECKS = 1;
