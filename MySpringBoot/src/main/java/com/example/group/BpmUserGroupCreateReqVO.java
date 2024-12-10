package com.example.group;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * FileName: BpmUserGroupCreateReqVO
 * Author: bai
 * Date:   20242024/5/14下午5:24
 * Description:test
 * <author> maziyu
 */

@Schema(description = "管理后台 - 用户组创建 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BpmUserGroupCreateReqVO extends BpmUserGroupBaseVO {

}
