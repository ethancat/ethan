package com.ethanwy.ethan.framework.base.service.impl;

import com.ethanwy.ethan.common.base.BaseServiceImpl;
import com.ethanwy.ethan.framework.base.mapper.BaseOrganizationMapper;
import com.ethanwy.ethan.framework.base.model.AbstractOrganization;
import com.ethanwy.ethan.framework.base.service.BaseOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ethan
 * @date 2018/12/19
 */
@Service
public class BaseOrganizationServiceImpl extends BaseServiceImpl<AbstractOrganization, BaseOrganizationMapper> implements BaseOrganizationService {

    private final BaseOrganizationMapper baseOrganizationMapper;

    @Autowired
    public BaseOrganizationServiceImpl(BaseOrganizationMapper baseOrganizationMapper) {
        this.baseOrganizationMapper = baseOrganizationMapper;
    }

    @Override
    protected BaseOrganizationMapper doGetMapper() {
        return baseOrganizationMapper;
    }
}
