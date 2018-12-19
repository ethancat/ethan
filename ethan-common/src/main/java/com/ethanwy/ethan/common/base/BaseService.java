package com.ethanwy.ethan.common.base;

import com.ethanwy.ethan.common.exception.MapperException;

import java.util.List;

/**
 * Service基类
 *
 * @author Ethan
 * @date 2018/12/18
 */
public interface BaseService<E extends AbstractEntity, M extends BaseMapper<?, ?>> {

    /**
     * 新增
     *
     * @param entity
     * @return
     */
    int insert(E entity);

    /**
     * 批量新增
     *
     * @param entities
     * @return
     */
    int insert(List<E> entities);

    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 根据主键列表删除
     *
     * @param ids
     * @return
     */
    int deleteByIds(List<Long> ids);

    /**
     * 删除
     *
     * @param entity
     * @return
     */
    int delete(E entity);

    /**
     * 批量删除
     *
     * @param entities
     * @return
     */
    int delete(List<E> entities);

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    int update(E entity);

    /**
     * 批量更新
     *
     * @param entities
     * @return
     */
    int update(List<E> entities);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    E select(Long id);

    /**
     * 根据属性查询
     *
     * @param entity
     * @return
     */
    List<E> select(E entity);

    /**
     * 查询所有
     *
     * @return
     */
    List<E> select();

    /**
     * 获取Mapper
     *
     * @return mapper
     */
    M getMapper();

}
