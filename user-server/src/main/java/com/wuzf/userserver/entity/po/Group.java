package com.wuzf.userserver.entity.po;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("groups")
public class Group extends BasePo {
    private String name;
    private String parentId;
    private String description;
    @TableLogic
    private String deleted = "N";
}
