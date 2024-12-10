package com.example.mapstructdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName: Car
 * Date:   20242024/10/18上午9:20
 * Description:
 * <author> maziyu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;
}
