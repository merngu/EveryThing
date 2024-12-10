package com.example.mapstructdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName: CarDto
 * Date:   20242024/10/18上午9:22
 * Description:
 * <author> maziyu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
}
