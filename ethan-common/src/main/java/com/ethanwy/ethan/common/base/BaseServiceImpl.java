package com.ethanwy.ethan.common.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ethan
 * @date 2018/12/18
 */
public abstract class BaseServiceImpl<Mapper,E,PK extends Serializable> implements BaseService {

    private Mapper mapper;


    @Override
    public int insert(Object entity) {

        return 0;
    }

    @Override
    public int delete(Serializable id) {
        return 0;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }

    @Override
    public List select(Serializable id) {
        return null;
    }
}
