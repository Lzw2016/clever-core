/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : clever-core

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-09-05 21:15:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for core_config
-- ----------------------------
DROP TABLE IF EXISTS `core_config`;
CREATE TABLE `core_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(255) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(255) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `config_key` varchar(255) NOT NULL COMMENT '配置键',
  `config_value` varchar(255) NOT NULL COMMENT '配置数据值',
  `config_group` varchar(255) NOT NULL DEFAULT 'default' COMMENT '配置组名称',
  `hot_swap` char(1) NOT NULL COMMENT '是否支持在线配置生效（0：否；1：是）',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序(升序)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `config_key` (`config_key`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8 COMMENT='配置表';

-- ----------------------------
-- Records of core_config
-- ----------------------------
INSERT INTO `core_config` VALUES ('1', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.numTestsPerEvictionRun', '3', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('2', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.deleteInvalidSessions', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('3', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.unauthorizedUrl', '/${base.mvcPath}/error/403.html', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('4', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.jsp.view.suffix', '.jsp', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('5', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.JavaMailSender.username', 'love520lzw1000000@163.com', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('6', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.port', '6379', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('7', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.minEvictableIdleTimeMillis', '300000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('8', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.activeSessionsCacheName', 'shiro-activeSessionCache', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('9', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.JavaMailSender.host', 'smtp.163.com', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('10', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.staticPath', 'static', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('11', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.validateCodeTimeout', '60000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('12', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.passwordParam', 'password', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('13', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.driver', 'com.mysql.jdbc.Driver', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('14', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.connectTimeout', '5000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('15', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.minIdle', '2', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('16', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.maxTotal', '32', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('17', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.mvcPath', 'mvc', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('18', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.authenticationCacheName', 'shiroAuthenticationCache', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('19', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.loginFailedMaxCount', '3', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('20', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.jsp.view.prefix', '/WEB-INF/modules/', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('21', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.page.pageSize', '10', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('22', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FTP.username', 'admin', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('23', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.usernameParam', 'username', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('24', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.modulesPath', 'modules', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('25', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.maxTotal', '200', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('26', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.hashAlgorithmName', 'SHA-1', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('27', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.timeout', '15000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('28', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.authenticationCachingEnabled', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('29', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FTP.host', '127.0.0.1', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('30', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.trackers', '192.168.10.128:22122,192.168.10.128:22122', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('31', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.web.fileStoragePathByFTP', '\\fileStoragePath', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('32', '-1', '2016-12-03 01:02:23', '-1', '2017-07-24 09:45:41', 'fileupload.web.fileStoragePath', 'D:\\fileStoragePath', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('33', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.host', '127.0.0.1', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('34', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.timeBetweenEvictionRunsMillis', '60000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('35', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.loginPage', '/${base.mvcPath}/sys/login/Login.html', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('36', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.authorizationCacheName', 'shiroAuthorizationCache', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('37', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.rememberMeParam', 'rememberMe', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('38', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'ehcache.configFile', 'cache/ehcache-local.xml', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('39', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.maxIdlePerKey', '50', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('40', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.maxLoginCount', '3', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('41', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.cookie.httpOnly', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('42', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.sessionValidationSchedulerEnabled', 'false', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('43', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'Zookeeper.connectionTimeoutMs', '15000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('44', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.cookie.maxAge', '2592000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('45', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.pool.init', '5', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('46', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FTP.password', '123456', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('47', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.password', 'lizhiwei', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('48', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.maxWaitMillis', '15000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('49', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.password', '', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('50', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.soTimeout', '10000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('51', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.successUrl', '/${base.mvcPath}/core/config/Config.html', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('52', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.pool.minIdle', '2', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('53', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'hibernate.show_sql', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('54', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.web.maxUploadSize', '10485760', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('55', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.type', 'mysql', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('56', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'redis.pool.maxIdle', '8', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('57', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.JavaMailSender.password', 'li19930611', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('58', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.kickOutBefore', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('59', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'Zookeeper.connectString', '127.0.0.1:2181', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('60', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'memcached.host1', '127.0.0.1:11211', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('61', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.kickOutUrl', '/${base.mvcPath}/error/KickOut.html', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('62', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.loginUrl', '/${base.mvcPath}/sys/login/userLogin.json', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('63', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.testSql', 'SELECT \'x\' FROM DUAL', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('64', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.pool.maxActive', '10', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('65', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.globalSessionTimeout', '60000000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('66', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.storedCredentialsHexEncoded', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('67', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'base.docPath', 'modules/doc', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('68', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.captchaParam', 'validateCode', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('69', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.url', 'jdbc:mysql://localhost:3306/`clever-core`?useUnicode=true&characterEncoding=utf-8', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('70', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.hashIterations', '1024', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('71', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FTP.port', '2121', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('72', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'fileupload.FastDFS.maxTotalPerKey', '200', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('73', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.sessionValidationInterval', '600000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('74', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'memcached.host1.weight', '1', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('75', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.sessionIdCookieEnabled', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('76', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'database.jdbc.username', 'root', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('77', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.cookie.name', 'rememberMe', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('78', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'shiro.authorizationCachingEnabled', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('79', '-1', '2016-12-03 01:02:23', '-1', '2016-12-03 01:02:23', 'Zookeeper.sessionTimeoutMs', '60000', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('80', '-1', '2016-12-03 21:03:32', '-1', '2016-12-03 21:03:32', 'stencilset', '/activiti/stencilset_zh-CN.json', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('81', '-1', '2016-12-12 23:33:19', '-1', '2016-12-12 23:33:19', 'activiti.jobExecutorActivate', 'false', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('82', '-1', '2016-12-12 23:33:19', '-1', '2016-12-12 23:33:19', 'activiti.activityFontName', '宋体', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('83', '-1', '2016-12-12 23:33:19', '-1', '2016-12-12 23:33:19', 'activiti.databaseSchemaUpdate', 'true', 'default', '0', '', '0');
INSERT INTO `core_config` VALUES ('84', '-1', '2016-12-12 23:33:19', '-1', '2016-12-12 23:33:19', 'activiti.labelFontName', '宋体', 'default', '0', '', '0');

-- ----------------------------
-- Table structure for core_dict
-- ----------------------------
DROP TABLE IF EXISTS `core_dict`;
CREATE TABLE `core_dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(255) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(255) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `dict_key` varchar(100) NOT NULL COMMENT '字典键(显示值)',
  `dict_value` varchar(255) NOT NULL COMMENT '字典数据值(隐藏值)',
  `dict_type` varchar(100) NOT NULL COMMENT '字典分类',
  `description` varchar(500) NOT NULL COMMENT '描述',
  `sort` int(11) NOT NULL COMMENT '排序(升序)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';

-- ----------------------------
-- Records of core_dict
-- ----------------------------

-- ----------------------------
-- Table structure for core_mdict
-- ----------------------------
DROP TABLE IF EXISTS `core_mdict`;
CREATE TABLE `core_mdict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(255) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(255) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `parent_id` bigint(20) NOT NULL COMMENT '父级编号,根节点的父级编号是：-1',
  `full_path` varchar(255) NOT NULL COMMENT '树结构的全路径用“-”隔开,包含自己的ID',
  `mdict_key` varchar(100) NOT NULL COMMENT '字典名称',
  `mdict_value` varchar(255) NOT NULL COMMENT '字典数据值',
  `mdict_type` varchar(100) NOT NULL COMMENT '字典类型',
  `description` varchar(500) NOT NULL COMMENT '描述',
  `sort` int(11) NOT NULL COMMENT '排序(升序)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `full_path` (`full_path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='多级字典表';

-- ----------------------------
-- Records of core_mdict
-- ----------------------------

-- ----------------------------
-- Table structure for core_qlscript
-- ----------------------------
DROP TABLE IF EXISTS `core_qlscript`;
CREATE TABLE `core_qlscript` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(255) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(255) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `script_type` varchar(10) NOT NULL DEFAULT 'SQL' COMMENT '脚本类型，可取："SQL"、"HQL"',
  `script` varchar(18000) NOT NULL COMMENT '脚本，可以使用模版技术拼接',
  `name` varchar(100) NOT NULL COMMENT '脚本名称，使用包名称+类名+方法名',
  `description` varchar(1000) NOT NULL COMMENT '脚本功能说明',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据库脚本';

-- ----------------------------
-- Records of core_qlscript
-- ----------------------------

-- ----------------------------
-- Table structure for core_template
-- ----------------------------
DROP TABLE IF EXISTS `core_template`;
CREATE TABLE `core_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `create_by` varchar(255) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(255) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `name` varchar(255) NOT NULL COMMENT '模版名称，不能重复',
  `content` mediumtext COMMENT '模版内容',
  `locale` varchar(50) NOT NULL COMMENT '模版语言',
  `description` varchar(1000) NOT NULL COMMENT '模版说明',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模版数据表';

-- ----------------------------
-- Records of core_template
-- ----------------------------
