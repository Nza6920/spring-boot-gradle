package com.niu.enums;

/**
 * CarType
 *
 * @author [nza]
 * @version 1.0 [2022/03/22 14:29]
 * @createTime [2022/03/22 14:29]
 */
public enum CarType {

    /**
     * 枚举值
     */
    BUS(0, "公交车"),
    CAR(1, "小汽车");

    CarType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 编号
     */
    private final Integer code;

    /**
     * 枚举描述
     */
    private final String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
