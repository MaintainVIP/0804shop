package com.lanou3g.mapper;

import com.lanou3g.bean.TbUser;

public interface TbUserMapper {
    int insert(TbUser record);

    int insertSelective(TbUser record);
}