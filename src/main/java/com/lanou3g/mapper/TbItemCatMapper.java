package com.lanou3g.mapper;

import com.lanou3g.bean.TbItemCat;

public interface TbItemCatMapper {
    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);
}