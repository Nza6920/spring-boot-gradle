package com.niu.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础实体类
 *
 * @author [nza]
 * @version 1.0 [2021/05/09 19:20]
 * @createTime [2021/05/09 19:20]
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'", nullable = false)
    private LocalDateTime createDate;

    /**
     * 最后修改时间
     */
    @Column(columnDefinition = "timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间'")
    private LocalDateTime lastModifiedDate;
}
