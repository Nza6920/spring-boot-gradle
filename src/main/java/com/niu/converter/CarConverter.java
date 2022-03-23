package com.niu.converter;

import com.niu.dto.CarDto;
import com.niu.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * 转换器
 *
 * @author [nza]
 * @version 1.0 [2022/03/22 14:40]
 * @createTime [2022/03/22 14:40]
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarConverter {

    CarConverter INSTANCE = Mappers.getMapper(CarConverter.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToDto(Car car);
}
