package com.ethanwy.ethan.framework.base.service;

import com.ethanwy.ethan.common.base.BaseService;
import com.ethanwy.ethan.framework.base.mapper.BaseUserMapper;
import com.ethanwy.ethan.framework.base.model.AbstractUser;

/**
 * 用户service
 *
 * @author Ethan
 * @date 2018/12/19
 */
public interface BaseUserService<E extends AbstractUser, M extends BaseUserMapper> extends BaseService{

}
