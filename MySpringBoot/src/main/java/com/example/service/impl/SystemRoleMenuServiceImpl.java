package com.example.service.impl;

import com.example.entity.SystemRoleMenu;
import com.example.dao.SystemRoleMenuDao;
import com.example.service.SystemRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 角色和菜单关联表(SystemRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2024-10-18 15:35:55
 */
@Service("systemRoleMenuService")
public class SystemRoleMenuServiceImpl implements SystemRoleMenuService {
    @Resource
    private SystemRoleMenuDao systemRoleMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SystemRoleMenu queryById(Long id) {
        return this.systemRoleMenuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param systemRoleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SystemRoleMenu> queryByPage(SystemRoleMenu systemRoleMenu, PageRequest pageRequest) {
        long total = this.systemRoleMenuDao.count(systemRoleMenu);
        return new PageImpl<>(this.systemRoleMenuDao.queryAllByLimit(systemRoleMenu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param systemRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SystemRoleMenu insert(SystemRoleMenu systemRoleMenu) {
        this.systemRoleMenuDao.insert(systemRoleMenu);
        return systemRoleMenu;
    }

    /**
     * 修改数据
     *
     * @param systemRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SystemRoleMenu update(SystemRoleMenu systemRoleMenu) {
        this.systemRoleMenuDao.update(systemRoleMenu);
        return this.queryById(systemRoleMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.systemRoleMenuDao.deleteById(id) > 0;
    }
}
