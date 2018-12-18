package com.ethanwy.ethan.common.base;

import java.io.Serializable;
import java.util.List;

/**
 * Service基类
 *
 * @author Ethan
 * @date 2018/12/18
 */
public interface BaseService<E,PK extends Serializable> {

    /**
     * 新增
     */
    int insert(E entity);

    /**
     * 批量新增
     */
    int insert(List<E> entities);

    /**
     * 根据ID删除
     */
    int delete(PK id);

    /**
     * 根据ID批量删除
     */
    int delete(List<PK> ids);

    /**
     * 修改
     */
    int update(E entity);

    /**
     * 批量修改
     */
    int update(List<E> entities);

    /**
     * 根据ID查询
     */
    List<E> select(PK id);

    List<E> selectByPage(Integer pageNum, Integer pageSize);
}
