package com.niu.entity;

import com.niu.enums.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 用户表
 *
 * @author [nza]
 * @version 1.0 [2021/05/09 19:24]
 * @createTime [2021/05/09 19:24]
 */
@Entity
@Table(name = "user", indexes = {
        @Index(name = "name", columnList = "name", unique = true)
})
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    /**
     * 用户ID
     */
    @Id
    @Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(columnDefinition = "VARCHAR(20) COMMENT '昵称'", nullable = false)
    private String name;

    /**
     * 性别
     */
    @Column(columnDefinition = "TINYINT(1) unsigned COMMENT '性别。0：女，1：男，2：未知'", nullable = false)
    private Gender gender;

    /**
     * 账户是否已经验证
     */
    @Column(columnDefinition = "TINYINT(1) unsigned COMMENT '账户是否已经验证'", nullable = false)
    private Boolean validated;
}



