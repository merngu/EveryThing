package com.example.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * FileName: BaseDO
 * Author: bai
 * Date:   20242024/5/10下午4:18
 * Description:基础实体对象
 * <author> maziyu
 */

@Data
public class BaseDO implements Serializable {

    @TableField(fill = FieldFill.INSERT)
    private LocalDate date;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDate updateDate;

    @TableField(fill = FieldFill.INSERT,jdbcType = JdbcType.VARCHAR)
    private String creator;

    @TableField(fill = FieldFill.INSERT_UPDATE,jdbcType = JdbcType.VARCHAR)
    private String updater;

    @TableLogic
    private Boolean deleted;
}
