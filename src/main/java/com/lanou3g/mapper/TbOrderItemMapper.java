package com.lanou3g.mapper;

import com.lanou3g.bean.TbOrderItem;

public interface TbOrderItemMapper {
    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);
}