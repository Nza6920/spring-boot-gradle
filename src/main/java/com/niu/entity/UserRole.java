package com.niu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户角色关联实体类
 *
 * @version 1.0 [2021/05/09 19:39]
 * @author [nza]
 * @createTime [2021/05/09 19:39]
 */
@Entity
@Table(name = "user_role", indexes = {
        @Index(name = "roleId", columnList = "role_id"),
})
@org.hibernate.annotations.Table(appliesTo = "user_role", comment = "用户角色关联")
@IdClass(UserRole.Id.class)
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class UserRole extends BaseEntity{

    /**
     * 用户ID
     */
    @Column(name = "user_id", columnDefinition = "INT(11) UNSIGNED COMMENT '用户ID'", nullable = false)
    @javax.persistence.Id
    private Integer userId;

    @javax.persistence.Id
    @Column(name = "role_id", columnDefinition = "INT(11) UNSIGNED COMMENT '角色ID'", nullable = false)
    private Integer roleId;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Id implements Serializable {

        private Integer userId;

        private Integer roleId;

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
            result = prime * result + ((userId == null) ? 0 : userId.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null) {
                return false;
            }

            if (getClass() != obj.getClass()) {
                return false;
            }

            Id other = (Id) obj;
            if (roleId == null) {
                if (other.roleId != null) {
                    return false;
                }
            } else if (!roleId.equals(other.roleId)) {
                return false;
            }

            if (userId == null) {
                if (other.userId != null) {
                    return false;
                }
            } else if (!userId.equals(other.userId)) {
                return false;
            }

            return true;
        }
    }
}
