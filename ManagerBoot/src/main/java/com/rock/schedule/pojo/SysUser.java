package com.rock.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

/**
 * FileName: SysUser
 * Date:   20242024/7/17下午8:57
 * Description:
 * <author> maziyu
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private String uId;
    private String username;
    private String userPwd;
}
