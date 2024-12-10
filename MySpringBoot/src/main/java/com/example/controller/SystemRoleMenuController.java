package com.example.controller;

import com.example.entity.SystemRoleMenu;
import com.example.service.SystemRoleMenuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色和菜单关联表(SystemRoleMenu)表控制层
 *
 * @author makejava
 * @since 2024-10-18 15:34:48
 */
@RestController
@RequestMapping("systemRoleMenu")
public class SystemRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SystemRoleMenuService systemRoleMenuService;

    /**
     * 分页查询
     *
     * @param systemRoleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SystemRoleMenu>> queryByPage(SystemRoleMenu systemRoleMenu, PageRequest pageRequest) {
        return ResponseEntity.ok(this.systemRoleMenuService.queryByPage(systemRoleMenu, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("{id}")
    public ResponseEntity<SystemRoleMenu> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.systemRoleMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param systemRoleMenu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SystemRoleMenu> add(SystemRoleMenu systemRoleMenu) {
        return ResponseEntity.ok(this.systemRoleMenuService.insert(systemRoleMenu));
    }

    /**
     * 编辑数据
     *
     * @param systemRoleMenu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SystemRoleMenu> edit(SystemRoleMenu systemRoleMenu) {
        return ResponseEntity.ok(this.systemRoleMenuService.update(systemRoleMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.systemRoleMenuService.deleteById(id));
    }

}

