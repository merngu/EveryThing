package com.rock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WaterSensor {
    // 水位传感器类型
    public String id;
    // 传感器记录时间戳
    public Long ts;
    // 水位记录
    public Integer vc;
}
