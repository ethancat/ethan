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
public abstract class BaseUserServiceImpl<E extends AbstractUser, M extends BaseUserMapper> extends BaseServiceImpl implements BaseUserService {

}
