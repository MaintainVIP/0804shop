package com.lanou3g.mapper;

import com.lanou3g.bean.TbRoleUser;

public interface TbRoleUserMapper {
    int insert(TbRoleUser record);

    int insertSelective(TbRoleUser record);
}