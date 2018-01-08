package com.lanou3g.mapper;

import com.lanou3g.bean.TbContent;

public interface TbContentMapper {
    int insert(TbContent record);

    int insertSelective(TbContent record);
}