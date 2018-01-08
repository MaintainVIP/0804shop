package com.lanou3g.mapper;

import com.lanou3g.bean.TbRole;

public interface TbRoleMapper {
    int insert(TbRole record);

    int insertSelective(TbRole record);
}