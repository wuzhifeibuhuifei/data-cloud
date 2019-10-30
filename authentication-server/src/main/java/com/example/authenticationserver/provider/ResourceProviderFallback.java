package com.example.authenticationserver.provider;

import com.example.authenticationserver.entity.Result;
import com.example.authenticationserver.entity.SysUser;
import org.springframework.web.bind.annotation.PathVariable;

public class ResourceProviderFallback implements ResourceProvider {

    @Override
    public Result<SysUser> loadSysUserByName(@PathVariable String name) {
        return Result.fail();
    }

}
