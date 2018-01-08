package com.lanou3g.mapper;

import com.lanou3g.bean.TbItem;

public interface TbItemMapper {
    int insert(TbItem record);

    int insertSelective(TbItem record);
}