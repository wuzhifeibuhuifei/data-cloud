package com.example.authenticationserver.security.service;

import com.example.authenticationserver.entity.Result;
import com.example.authenticationserver.entity.SysUser;
import com.example.authenticationserver.provider.ResourceProvider;
import com.example.authenticationserver.security.entity.SelfUserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * SpringSecurity用户的业务实现
 *
 * @Author Sans
 * @CreateTime 2019/10/1 17:21
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {

    @Autowired
    private ResourceProvider resourceProvider;

    /**
     * 查询用户信息
     *
     * @Author Sans
     * @CreateTime 2019/9/13 17:23
     * @Param username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public SelfUserEntity loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        Result<SysUser> sysUserResult = resourceProvider.loadSysUserByName(username);
        if (Result.SUCCESSFUL_CODE.equals(sysUserResult.getCode())
                && sysUserResult.getData() != null) {
            // 组装参数
            SelfUserEntity selfUserEntity = new SelfUserEntity();
            BeanUtils.copyProperties(sysUserResult.getData(), selfUserEntity);
            return selfUserEntity;
        }
        return null;
    }
}