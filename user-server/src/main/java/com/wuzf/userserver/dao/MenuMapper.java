package com.wuzf.userserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuzf.userserver.entity.po.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
}