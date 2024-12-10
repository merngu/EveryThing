package com.example.service;

import com.example.entity.SystemRoleMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 角色和菜单关联表(SystemRoleMenu)表服务接口
 *
 * @author makejava
 * @since 2024-10-18 15:35:33
 */
public interface SystemRoleMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemRoleMenu queryById(Long id);

    /**
     * 分页查询
     *
     * @param systemRoleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SystemRoleMenu> queryByPage(SystemRoleMenu systemRoleMenu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param systemRoleMenu 实例对象
     * @return 实例对象
     */
    SystemRoleMenu insert(SystemRoleMenu systemRoleMenu);

    /**
     * 修改数据
     *
     * @param systemRoleMenu 实例对象
     * @return 实例对象
     */
    SystemRoleMenu update(SystemRoleMenu systemRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
