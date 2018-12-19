package com.ethanwy.ethan.framework.base.service.impl;

import com.ethanwy.ethan.common.base.BaseServiceImpl;
import com.ethanwy.ethan.framework.base.mapper.BaseDepartmentMapper;
import com.ethanwy.ethan.framework.base.model.AbstractDepartment;
import com.ethanwy.ethan.framework.base.service.BaseDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ethan
 * @date 2018/12/19
 */
@Service
public class BaseDepartmentServiceImpl extends BaseServiceImpl<AbstractDepartment, BaseDepartmentMapper> implements BaseDepartmentService {

    private final BaseDepartmentMapper baseDepartmentMapper;

    @Autowired
    public BaseDepartmentServiceImpl(BaseDepartmentMapper baseDepartmentMapper) {
        this.baseDepartmentMapper = baseDepartmentMapper;
    }

    @Override
    protected BaseDepartmentMapper doGetMapper() {
        return baseDepartmentMapper;
    }
}
