package com.wuzf.userserver.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("role_resource_relation")
public class RoleResource extends BasePo {
    private String roleId;
    private String resourceId;
}
