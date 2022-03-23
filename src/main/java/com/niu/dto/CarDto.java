package com.niu.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CarDto
 *
 * @author [nza]
 * @version 1.0 [2022/03/22 14:39]
 * @createTime [2022/03/22 14:39]
 */
@Data
@NoArgsConstructor
public class CarDto {

    private Integer id;

    private String make;

    private int seatCount;

    private String type;
}
