package com.lanou3g.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.List;

public class MyRealm extends AuthorizingRealm {

    @Override
    public String getName() {
        return "myRealm";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }
    //授权的方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //授权
        //获取当前认证成功的认证信息
        String username = (String) principalCollection.getPrimaryPrincipal();
        //假数据
        List<String> permissions = new ArrayList<>();
        permissions.add("user:create");
        permissions.add("user:query");

        //        授权信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);
        return info;
    }

    //认证的方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户输入的认证信息
        //获取用户名
        String userName = (String) authenticationToken.getPrincipal();

        //那用户输入的用户名 去数据库中做匹配查询
        // ===========>假数据<=============

        if (!"zhangsan".equals(userName)) {
            throw new UnknownAccountException("账号不存在");
        }
        //==============>假数据结束<=================
        //获取用户输入的密码

        String password = new String((char[]) authenticationToken.getCredentials());
        if (!"1234".equals(password)) {
            throw new IncorrectCredentialsException("密码不匹配");
        }
        return new SimpleAuthenticationInfo(userName, password, getName());
    }


}
