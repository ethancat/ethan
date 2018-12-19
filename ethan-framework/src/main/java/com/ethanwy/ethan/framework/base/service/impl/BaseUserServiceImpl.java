package com.ethanwy.ethan.framework.base.service.impl;

import com.ethanwy.ethan.common.base.BaseServiceImpl;
import com.ethanwy.ethan.framework.base.mapper.BaseUserMapper;
import com.ethanwy.ethan.framework.base.model.AbstractUser;
import com.ethanwy.ethan.framework.base.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ethan
 * @date 2018/12/19
 */
@Service
public class BaseUserServiceImpl extends BaseServiceImpl<AbstractUser, BaseUserMapper> implements BaseUserService {

    private final BaseUserMapper baseUserMapper;

    @Autowired
    public BaseUserServiceImpl(BaseUserMapper baseUserMapper) {
        this.baseUserMapper = baseUserMapper;
    }

    @Override
    protected BaseUserMapper doGetMapper() {
        return baseUserMapper;
    }
}
