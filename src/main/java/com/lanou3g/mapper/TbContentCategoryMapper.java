package com.lanou3g.mapper;

import com.lanou3g.bean.TbContentCategory;

public interface TbContentCategoryMapper {
    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);
}