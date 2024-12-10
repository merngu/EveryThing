package com.rock.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * FileName: SysSchedule
 * Date:   20242024/7/17下午9:25
 * Description:
 * <author> maziyu
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule implements Serializable {
    private String sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
