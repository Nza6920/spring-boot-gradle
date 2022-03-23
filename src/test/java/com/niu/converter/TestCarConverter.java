package com.niu.converter;

import com.niu.BaseTest;
import com.niu.dto.CarDto;
import com.niu.entity.Car;
import com.niu.enums.CarType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * TestCarConverter
 *
 * @author [nza]
 * @version 1.0 [2022/03/22 14:56]
 * @createTime [2022/03/22 14:56]
 */
@Slf4j
public class TestCarConverter extends BaseTest {

    @Test
    public void testConverter() {
        //given
        Car car = new Car(1, "Morris", 5, CarType.BUS, new Date());
        //when
        CarDto carDto = CarConverter.INSTANCE.carToDto(car);
        log.info("carDto: {}", carDto);
    }
}
