package com.ethanwy.ethan.common.base;

import java.util.ArrayList;
import java.util.List;

/**
 * service抽象实现类
 *
 * @author Ethan
 * @date 2018/12/18
 */
public abstract class BaseServiceImpl<E extends AbstractEntity, M extends BaseMapper<E, M>>
        implements BaseService<E, M> {

    /**
     * 获取mapper
     *
     * @return
     */
    public abstract BaseMapper<E, M> getMapper();

    @Override
    public int insert(E entity) {
        return getMapper().insertRecord(entity);
    }

    @Override
    public int insert(List<E> entities) {
        return getMapper().insertRecords(entities);
    }

    @Override
    public int deleteById(Long id) {
        return getMapper().deleteById(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        return getMapper().deleteByIds(ids);
    }

    @Override
    public int delete(E entity) {
        return deleteById(entity.getId());
    }

    @Override
    public int delete(List<E> entities) {
        List<Long> ids = new ArrayList<>();
        for (E entity : entities) {
            ids.add(entity.getId());
        }
        return deleteByIds(ids);
    }

    @Override
    public int update(E entity) {
        return getMapper().updateRecord(entity);
    }

    @Override
    public int update(List<E> entities) {
        return getMapper().updateRecords(entities);
    }

    @Override
    public E select(Long id) {
        return getMapper().selectById(id);
    }

    @Override
    public List<E> select(E entity) {
        return getMapper().selectByAttribute(entity);
    }

    @Override
    public List<E> select() {
        return getMapper().selectAll();
    }
}
