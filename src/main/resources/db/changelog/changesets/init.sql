SET FOREIGN_KEY_CHECKS = 0;
CREATE TABLE `car` (
    `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `last_modified_date` timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间',
    `make` varchar(20)  NOT NULL COMMENT '制造商',
    `number_of_seats` int UNSIGNED NULL DEFAULT NULL COMMENT '座位数',
    `type` tinyint UNSIGNED NOT NULL COMMENT '汽车类型： 0：公交车，1：小汽车，2：未知',
    PRIMARY KEY (`id`) ,
    INDEX `type`(`type`)
);


DROP TABLE IF EXISTS `email`;
CREATE TABLE `email` (
      `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
      `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
      `last_modified_date` timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间',
      `account` varchar(20)  NOT NULL COMMENT '昵称',
      `user_id` int UNSIGNED NULL DEFAULT NULL COMMENT '用户id',
      PRIMARY KEY (`id`),
      UNIQUE INDEX `userEmailAccount`(`user_id`, `account`),
      INDEX `account`(`account`)
);

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
     `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
     `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
     `last_modified_date` timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间',
     `name` varchar(20)  NOT NULL COMMENT '名称',
     PRIMARY KEY (`id`) ,
     UNIQUE INDEX `name`(`name`)
);

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
     `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
     `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
     `last_modified_date` timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间',
     `gender` tinyint UNSIGNED NOT NULL COMMENT '性别。0：女，1：男，2：未知',
     `name` varchar(20)  NOT NULL COMMENT '昵称',
     `validated` tinyint UNSIGNED NOT NULL COMMENT '账户是否已经验证',
     PRIMARY KEY (`id`) ,
     UNIQUE INDEX `name`(`name`)
);

CREATE TABLE `user_role` (
      `role_id` int UNSIGNED NOT NULL COMMENT '角色ID',
      `user_id` int UNSIGNED NOT NULL COMMENT '用户ID',
      `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
      `last_modified_date` timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间',
      PRIMARY KEY (`role_id`, `user_id`) ,
      INDEX `roleId`(`role_id`)
)  COMMENT = '用户角色关联';

SET FOREIGN_KEY_CHECKS = 1;
