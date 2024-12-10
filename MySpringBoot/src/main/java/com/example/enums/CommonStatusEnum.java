package com.example.enums;

import com.example.core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * FileName: CommonStatusEnu
 * Author: bai
 * Date:   20242024/5/10下午3:43
 * Description:通用状态枚举
 * <author> maziyu
 */

public enum CommonStatusEnum implements IntArrayValuable {

    ENABLE(0,"开启"),
    DISABLE(1,"关闭");



    private final int value;
    private final String name;

    CommonStatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(CommonStatusEnum::getValue).toArray();


    @Override
    public int[] array() {
        return ARRAYS;
    }
}
