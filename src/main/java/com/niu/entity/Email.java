package com.niu.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 用户邮箱实体类
 *
 * @version 1.0 [2021/05/09 19:32]
 * @author [nza]
 * @createTime [2021/05/09 19:32]
 */
@Entity
@Table(name = "email", indexes = {
        @Index(name = "userEmailAccount", columnList = "user_id,account", unique = true),
        @Index(name = "account", columnList = "account")
})
@Data
@EqualsAndHashCode(callSuper = true)
public class Email extends BaseEntity{

    /**
     * 主键
     */
    @Id
    @Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id", columnDefinition = "INT(11) UNSIGNED COMMENT '用户id'")
    private Integer userId;

    /**
     * 邮箱账户
     */
    @Column(name = "account", columnDefinition = "VARCHAR(20) COMMENT '昵称'", nullable = false)
    private String account;
}
