package com.wuzf.userserver.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class SysUser {

    /**
     * 用户ID
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    private String name;

    private String mobile;

    private String description;

    private String deleted;

    private boolean enabled;

    private boolean accountNonExpired;

    private boolean credentialsNonExpired;

    private boolean accountNonLocked;

    private Date createdTime;

    private Date updatedTime;

    private String createdBy;

    private String updatedBy;


}
