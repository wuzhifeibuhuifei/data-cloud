package com.wuzf.userserver.controller;


import com.wuzf.userserver.entity.po.Position;
import com.wuzf.userserver.entity.po.SysUser;
import com.wuzf.userserver.entity.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 获取用户信息
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/user/{name}")
    public Result<SysUser> loadSysUserByName(@PathVariable String name) {
        return Result.success();
    }
}
