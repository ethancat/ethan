package com.ethanwy.ethan.framework.shiro.realm;

import com.ethanwy.ethan.framework.base.service.BaseDepartmentService;
import com.ethanwy.ethan.framework.base.service.BaseOrganizationService;
import com.ethanwy.ethan.framework.base.service.BaseUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 处理登录认证、权限认证
 *
 * @author Ethan
 * @date 2018/12/19
 */
@Component
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private BaseUserService baseUserService;
    @Autowired
    private BaseDepartmentService baseDepartmentService;
    @Autowired
    private BaseOrganizationService baseOrganizationService;


    /**
     * 权限认证
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 登录认证
     *
     * @param AToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken AToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) AToken;
        String userName = token.getUsername();
        return null;
    }
}
