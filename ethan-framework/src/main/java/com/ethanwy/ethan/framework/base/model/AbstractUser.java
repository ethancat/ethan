package com.ethanwy.ethan.framework.base.model;

import com.ethanwy.ethan.common.base.AbstractEntity;

/**
 * 用户抽象类
 *
 * @author Ethan
 * @date 2018/12/19
 */
public abstract class AbstractUser extends AbstractEntity {
    private static final long serialVersionUID = 6843700726751101974L;

    private String code;

    private String loginName;

    private String userName;

    private String phoneNumber;

    private String email;

    private String password;

    private String sex;


}
