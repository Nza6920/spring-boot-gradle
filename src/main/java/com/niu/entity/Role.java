package com.niu.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 角色实体类
 *
 * @version 1.0 [2021/05/09 19:37]
 * @author [nza]
 * @createTime [2021/05/09 19:37]
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "role", indexes = {
        @Index(name = "name", columnList = "name", unique = true),
})
public class Role extends BaseEntity {

    /**
     * ID
     */
    @Id
    @Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(columnDefinition = "VARCHAR(20) COMMENT '名称'", nullable = false)
    private String name;
}
