package com.niu.entity;

import com.niu.enums.CarType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 汽车
 *
 * @author [nza]
 * @version 1.0 [2022/03/22 14:28]
 * @createTime [2022/03/22 14:28]
 */
@Entity
@Table(name = "car", indexes = {
        @Index(name = "type", columnList = "type")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseEntity {

    /**
     * 主键
     */
    @Id
    @Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 制造商
     */
    @Column(columnDefinition = "VARCHAR(20) COMMENT '制造商'", nullable = false)
    private String make;

    /**
     * 座位数
     */
    @Column(name = "number_of_seats", columnDefinition = "INT(11) UNSIGNED COMMENT '座位数'")
    private int numberOfSeats;

    /**
     * 汽车类型
     */
    @Column(columnDefinition = "TINYINT(1) unsigned COMMENT '汽车类型： 0：公交车，1：小汽车，2：未知'", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CarType type;

    /**
     * 上次年审时间
     */
    private Date lastAuditTime;
}
