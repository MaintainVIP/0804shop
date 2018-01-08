package com.lanou3g.mapper;

import com.lanou3g.bean.TbItemParam;

public interface TbItemParamMapper {
    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);
}