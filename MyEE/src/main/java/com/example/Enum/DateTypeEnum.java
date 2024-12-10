package com.example.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * FileName: DateTypeEnum
 * Date:   20242024/11/5下午5:34
 * Description:
 * <author> maziyu
 */


public enum DateTypeEnum {
    /** 日 */
    DAY("day"),
    /** 周 */
    WEEK("week"),
    /** 月 */
    MONTH("month");

    /**
     * 性别
     */
    private final String type;

    DateTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
