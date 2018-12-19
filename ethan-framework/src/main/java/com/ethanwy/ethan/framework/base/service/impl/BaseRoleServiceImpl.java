package com.ethanwy.ethan.framework.base.service.impl;

import com.ethanwy.ethan.common.base.BaseServiceImpl;
import com.ethanwy.ethan.framework.base.mapper.BaseRoleMapper;
import com.ethanwy.ethan.framework.base.model.AbstractRole;
import com.ethanwy.ethan.framework.base.service.BaseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ethan
 * @date 2018/12/19
 */
@Service
public class BaseRoleServiceImpl extends BaseServiceImpl<AbstractRole, BaseRoleMapper> implements BaseRoleService {

    private final BaseRoleMapper baseRoleMapper;

    @Autowired
    public BaseRoleServiceImpl(BaseRoleMapper baseRoleMapper) {
        this.baseRoleMapper = baseRoleMapper;
    }

    @Override
    protected BaseRoleMapper doGetMapper() {
        return baseRoleMapper;
    }
}
