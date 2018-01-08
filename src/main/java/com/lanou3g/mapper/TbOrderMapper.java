package com.lanou3g.mapper;

import com.lanou3g.bean.TbOrder;

public interface TbOrderMapper {
    int insert(TbOrder record);

    int insertSelective(TbOrder record);
}