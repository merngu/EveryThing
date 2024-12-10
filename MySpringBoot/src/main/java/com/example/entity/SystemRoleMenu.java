package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色和菜单关联表(SystemRoleMenu)实体类
 *
 * @author makejava
 * @since 2024-10-18 15:35:21
 */
public class SystemRoleMenu implements Serializable {
    private static final long serialVersionUID = -42123416165808689L;
/**
     * 自增编号
     */
    private Long id;
/**
     * 角色ID
     */
    private Long roleId;
/**
     * 菜单ID
     */
    private Long menuId;
/**
     * 创建者
     */
    private String creator;
/**
     * 创建时间
     */
    private Date createTime;
/**
     * 更新者
     */
    private String updater;
/**
     * 更新时间
     */
    private Date updateTime;
/**
     * 是否删除
     */
    private String deleted;
/**
     * 租户编号
     */
    private Long tenantId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

}

