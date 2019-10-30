package com.example.authenticationserver.provider;


import com.example.authenticationserver.entity.Result;
import com.example.authenticationserver.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-server", fallback = ResourceProviderFallback.class)
public interface ResourceProvider {

    /**
     * 通过名称获取用户信息
     * @return
     */
    @GetMapping(value = "/user/{name}")
    Result<SysUser> loadSysUserByName(@PathVariable String name);
}
