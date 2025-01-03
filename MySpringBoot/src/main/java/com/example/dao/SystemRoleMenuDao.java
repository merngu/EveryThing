package com.example.dao;

import com.example.entity.SystemRoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 角色和菜单关联表(SystemRoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2024-10-18 15:35:04
 */
@Mapper
public interface SystemRoleMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemRoleMenu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param systemRoleMenu 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SystemRoleMenu> queryAllByLimit(SystemRoleMenu systemRoleMenu, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param systemRoleMenu 查询条件
     * @return 总行数
     */
    long count(SystemRoleMenu systemRoleMenu);

    /**
     * 新增数据
     *
     * @param systemRoleMenu 实例对象
     * @return 影响行数
     */
    int insert(SystemRoleMenu systemRoleMenu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SystemRoleMenu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SystemRoleMenu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SystemRoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SystemRoleMenu> entities);

    /**
     * 修改数据
     *
     * @param systemRoleMenu 实例对象
     * @return 影响行数
     */
    int update(SystemRoleMenu systemRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

